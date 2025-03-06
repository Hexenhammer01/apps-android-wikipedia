package org.wikipedia.homeworks.homework10

import com.kaspersky.components.kautomator.component.common.views.UiView
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen


object OnbordingUiScreen: UiScreen<OnbordingUiScreen>() {
    override val packageName: String = "org.wikipedia.alpha"

    val image = UiView{
        withId(this@OnbordingUiScreen.packageName, "imageViewCentered")

    }
    val title = UiTextView{
        withId(this@OnbordingUiScreen.packageName,"primaryTextView")
    }
    val underTitle = UiTextView{
        containsText("We’ve found the following on your device:")

    }
    val addLanguage = UiButton{
        containsText("Add or edit languages")
    }
    val skipButton = UiButton{
        containsText("Skip")
    }
    val continueButton = UiButton{
        containsText("Continue")
    }
    val secTitle = UiTextView{
        containsText("New ways to explore")
    }
    val underSecTitle = UiTextView{
        withId(this@OnbordingUiScreen.packageName,"secondaryTextView")
    }
}