package org.wikipedia.homeworks.homework13

import androidx.test.espresso.matcher.ViewMatchers.withId
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.web.KWebView
import org.wikipedia.R

object BSheet:KScreen<BSheet>() {
    override val layoutId= null
    override val viewClass=null

    val titleText = KTextView{
        withId(R.id.reference_title_text)
    }
    val refId = KTextView{
        withId(R.id.reference_id)
    }
}