package org.wikipedia.homeworks.homework21

import android.view.View
import android.widget.Checkable
import android.widget.ImageView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher

class CheckbleAction : ViewAction {
    override fun getConstraints(): Matcher<View> {
        return ViewMatchers.isAssignableFrom(View::class.java)
    }

    override fun getDescription(): String {
        return "Switch Check box"
    }

    override fun perform(uiController: UiController?, view: View?) {
        if (view is Checkable){
            !view.isChecked
        }
        else{
            throw AssertionError("ImageView has no drawable")
    }}
}