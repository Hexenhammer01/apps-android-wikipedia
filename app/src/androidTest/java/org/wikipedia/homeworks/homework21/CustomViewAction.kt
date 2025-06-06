package org.wikipedia.homeworks.homework21

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import org.hamcrest.Matcher

class CustomViewAction: ViewAction{
    override fun getConstraints(): Matcher<View> {
        return ViewMatchers.isAssignableFrom(View::class.java)
    }

    override fun getDescription(): String {
        return "Perform click"
    }

    override fun perform(uiController: UiController?, view: View?) {
        view?.performClick() ?:throw IllegalStateException()

    }
}