package com.example.myapplication;


import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdditionTest {
private String ergb;
        @Rule
    ActivityTestRule<MainActivity> activityActivityTestRule =
                    new ActivityTestRule<>(MainActivity.class);


    @Before
    public void validString(){
            ergb = "Ergebnis: 10.0.";
    }
    
    @Test
    public void addTest(){
        onView(withId(R.id.editText)).perform(typeText("5"), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText("10"), closeSoftKeyboard());

        onView(withId(R.id.addi)).perform(click());

    }

    @After
    public void assertat(){
        onView(withId(R.string.ergebnis)).check(matches(withText(ergb)));
    }
}
