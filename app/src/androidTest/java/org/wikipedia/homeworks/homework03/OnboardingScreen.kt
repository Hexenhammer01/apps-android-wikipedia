package org.wikipedia.homeworks.homework03

import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import org.wikipedia.R
import org.wikipedia.views.AppTextView


val wikiImage = listOf(
    ImageView::class.java,
    "imageViewCentered"
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

val skipButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_skip_button",
    "onboarding_skip"
)

val paginationButton = listOf(
    TabLayout::class.java,
    "view_onboarding_page_indicator"
)

val continueButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_forward_button"
)




