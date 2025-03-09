package org.wikipedia.homeworks.homework11

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R
import org.wikipedia.feed.offline.OfflineCardView

object OfflineCardViewItem : KScreen<OfflineCardViewItem>() {
    override val layoutId = R.layout.fragment_feed
    override val viewClass = null

    val offlineText = KTextView{
        withText(R.id.view_offline_card_text)
    }
    val retryButton = KButton{
        withId(R.id.view_card_offline_button_retry)
    }
}