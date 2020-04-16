package com.example.myapplication;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.filters.LargeTest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoExample {
    private String ergebnis;

    @Rule
    public ActivityScenarioRule<MainActivity> activityTestRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void initValidString(){
        ergebnis = "Ergebnis: 1.0.";
    }

    @Test
    public void firstToShow(){
        onView(withId(R.id.editText)).perform(typeText("5"), closeSoftKeyboard());
        onView(withId(R.id.editText2)).perform(typeText("5"), closeSoftKeyboard());

        onView(withId(R.id.division)).perform(click());
    }

    @After
    public void assertat(){

        onView(withId(R.id.textView)).check(matches(withText(ergebnis)));

    }


}
