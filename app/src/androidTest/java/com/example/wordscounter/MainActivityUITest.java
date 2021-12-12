package com.example.wordscounter;

import androidx.test.filters.MediumTest;
import org.junit.Test;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@MediumTest
public class MainActivityUITest {
    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void StringForTxtEnteredText() {
        final String givenString = "one two three four five six";
        final String expectedResult = "6";

        onView(withId(R.id.txtEnteredText)).perform(typeText(givenString));
        onView(withId(R.id.btnCountText)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenEmptyStringIsEnteredToTxtMain() {
        final String givenString = "";
        final String expectedResult = "0";

        onView(withId(R.id.txtEnteredText)).perform(typeText(givenString));
        onView(withId(R.id.btnCountText)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumbersAreEnteredToTxtMain() {
        final String givenString = "5858 3939 23";
        final String expectedResult = "Error";

        onView(withId(R.id.txtEnteredText)).perform(typeText(givenString));
        onView(withId(R.id.btnCountText)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }
}
