package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.feed.view.CardHeaderView

class TopReadCardView(matcher: Matcher<View>) : KRecyclerItem<CardHeaderView>(matcher) {
    val viewCardHeaderTitle = KTextView(matcher){
        withId(R.id.view_card_header_title)
    }
    val viewListCardHeaderSecondaryIcon = KImageView(matcher){
        withId(R.id.view_list_card_header_secondary_icon)
    }
    val viewListCardHeaderMenu = KImageView(matcher){
        withId(R.id.view_list_card_header_menu)
    }
    val cardListContainerItems = KRecyclerView(
        builder = {
            withId(R.id.view_list_card_list_container)
        },
        itemTypeBuilder = {
            itemType(::ListCardList)
        }
    )
    val footerActionButton = KTextView(matcher){
        withId(R.id.footerActionButton)
    }
}
