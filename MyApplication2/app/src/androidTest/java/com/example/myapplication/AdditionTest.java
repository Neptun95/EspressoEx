package com.example.myapplication;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.filters.LargeTest;

import java.lang.annotation.Repeatable;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdditionTest {
    private String ergebnis;

    @Rule
    public ActivityScenarioRule<MainActivity> activityTestRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void initValidString(){
        ergebnis = "Ergebnis: 10.0.";
    }

    @Test
    @Repeat(10)
    public void firstToShow(){
        onView(withId(R.id.editText)).perform(typeText("5"), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText("5"), closeSoftKeyboard());

        onView(withId(R.id.addi)).perform(click());
    }

    @After
    public void assertat(){

        onView(withId(R.id.textView)).check(matches(withText(ergebnis)));

    }


}
