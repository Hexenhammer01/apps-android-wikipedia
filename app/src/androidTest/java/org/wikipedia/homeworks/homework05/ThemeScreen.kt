package org.wikipedia.homeworks.homework05

import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.switch.KSwitch
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R


val windowTextView = KTextView {
    withId(R.id.textSettingsCategory)
}

val windowPercentage = KTextView {
    withId(R.id.text_size_percent)
}

val textSizeBar = KView {
    withId(R.id.text_size_seek_bar)
}

val buttonSanSerif = KButton {
    withId(R.id.button_font_family_sans_serif)
}

val buttonSerif = KButton {
    withId(R.id.button_font_family_serif)
}

val focusTextSwitch = KTextView {
    withId(R.id.theme_chooser_reading_focus_mode_description)
}

val focusModeSwitcher = KSwitch {
    withId(R.id.theme_chooser_reading_focus_mode_switch)
}

val themeLightButton = KButton {
    withId(R.id.button_theme_light)
}

val themeSepiaButton = KButton {
    withId(R.id.button_theme_sepia)
}

val themeDarkButton = KButton {
    withId(R.id.button_theme_dark)
}

val themeBlackButton = KButton {
    withId(R.id.button_theme_black)
}

val systemThemeSwitch = KSwitch {
    withId(R.id.theme_chooser_match_system_theme_switch)
}

val imageDimming = KSwitch {
    withId(R.id.theme_chooser_dark_mode_dim_images_switch)
}

