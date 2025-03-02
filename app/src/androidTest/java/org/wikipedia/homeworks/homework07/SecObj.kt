package org.wikipedia.homeworks.homework07

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object SecObj : KScreen <SecObj>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val title = KTextView {
        withId(R.id.articleTitle)
    }
    val page = KView {
        withId(R.id.page_web_view)
    }

}