package org.wikipedia.homeworks.homework21

import android.view.View
import android.widget.ImageView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.ViewAssertion
import io.github.kakaocup.kakao.image.KImageView


class CustomHasAnyDrawable : ViewAssertion {
    override fun check(view: View?, noViewFoundException: NoMatchingViewException?) {
        if (noViewFoundException != null) {
            throw noViewFoundException
        }

        val imageView = view as? ImageView
            ?: throw AssertionError("View is not an ImageView")

        if (imageView.drawable == null) {
            throw AssertionError("ImageView has no drawable")
        }
    }
}