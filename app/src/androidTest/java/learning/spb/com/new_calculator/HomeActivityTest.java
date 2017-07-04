package learning.spb.com.new_calculator;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by shelly.pritchard on 30/06/17.
 */

public class HomeActivityTest {

    @Rule
    public ActivityTestRule<HomeActivity> mActivityTest = new ActivityTestRule<HomeActivity>(HomeActivity.class);

    @Test
    public void testButtonClick () {
        onView(withId(R.id.one)).perform(click());
        onView(withId(R.id.zero)).perform(click());
        onView(withId(R.id.zero)).perform(click());

        onView(withId(R.id.add)).perform(click());

        onView(withId(R.id.two)).perform(click());
        onView(withId(R.id.zero)).perform(click());
        onView(withId(R.id.zero)).perform(click());

        onView(withId(R.id.equal)).perform(click());

        onView(withId(R.id.setting)).perform(click());
        onView(withId(R.id.back)).perform(click());


    }
}
