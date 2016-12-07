package com.example.guest.myrestaurants;

import android.support.test.rule.ActivityTestRule;

import com.example.guest.myrestaurants.ui.MainActivity;

import org.junit.Rule;


/**
 * Created by Caleb and Elysia on 11/14/16.
 */
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

//    @Test
//    public void validateEditText() {
//        onView(withId(R.id.locationEditText)).perform(typeText("Portland"))
//                .check(matches(withText("Portland")));
//    }
//
//    @Test
//    public void locationIsSentToRestaurantsActivity() {
//        String location = "Portland";
//        onView(withId(R.id.locationEditText)).perform(typeText(location));
//        onView(withId(R.id.findRestaurantsButton)).perform(click());
//        onView(withId(R.id.locationTextView)).check(matches
//                (withText("Here are all the restaurants near: " + location)));
//    }
}
