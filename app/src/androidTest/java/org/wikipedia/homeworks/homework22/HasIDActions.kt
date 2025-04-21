package org.wikipedia.homeworks.homework22

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher

class HasIDActions(private val nameID: Int) : ViewAction {
    private var result: Boolean = false
    override fun getConstraints(): Matcher<View> {
        return ViewMatchers.isAssignableFrom(View::class.java)
    }

    override fun getDescription(): String {
        return "Сдержит элемент с id"
    }

    override fun perform(uiController: UiController?, view: View?) {
        if (view == null) {
            throw RuntimeException("Не содержит элемента")
        }
        if (view.id == nameID) {
            result = true
        } else {
            val foundView = view.findViewById<View>(nameID)
            result = foundView != null

        }
    }
    fun getResults() = result
}