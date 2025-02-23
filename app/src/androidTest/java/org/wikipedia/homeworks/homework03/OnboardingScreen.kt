package org.wikipedia.homeworks.homework03

import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.R
import org.wikipedia.views.AppTextView

object OnboardingScreen :KScreen<OnboardingScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null


    val wikiImage = listOf(
        AppCompatImageView::class.java,
        "imageViewCentered",
        R.drawable.illustration_onboarding_explore
    )

    val primaryOnbordingText = listOf(
        AppTextView::class.java,
        "primaryTextView",
        "onboarding_welcome_title_v2"
    )

    val secondaryOnbordingText = listOf(
        AppTextView::class.java,
        "secondaryTextView",
        "onboarding_multilingual_secondary_text"
    )

    val addLanguageFrame = listOf(
        MaterialButton::class.java,
        "addLanguageButton",
        "onboarding_multilingual_add_language_text"
    )

    val skipButton = KButton {
        withId(R.id.fragment_onboarding_skip_button)
    }

    val paginationButton = listOf(
        TabLayout::class.java,
        "view_onboarding_page_indicator"
    )

    val continueButton = listOf(
        MaterialButton::class.java,
        "fragment_onboarding_forward_button",
        "onboarding_get_started"
    )

    val secondScreen = listOf(
        ImageView::class.java,
        "imageViewCentered",
        R.drawable.illustration_onboarding_explore
    )

}

