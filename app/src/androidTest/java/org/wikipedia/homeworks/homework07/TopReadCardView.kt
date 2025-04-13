package org.wikipedia.homeworks.homework07

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.feed.view.CardHeaderView
import org.wikipedia.homeworks.homework20.setName
import org.wikipedia.homeworks.homework20.withParent

class TopReadCardView(matcher: Matcher<View>) : KRecyclerItem<CardHeaderView>(matcher) {
    val viewCardHeaderTitle by lazy {
        KTextView(matcher) {
            withId(R.id.view_card_header_title)
        }.setName(withParent("Заголовок"))
    }
    val viewListCardHeaderSecondaryIcon = KImageView(matcher) {
        withId(R.id.view_list_card_header_secondary_icon)
    }
    val viewListCardHeaderMenu = KImageView(matcher) {
        withId(R.id.view_list_card_header_menu)
    }
    val cardListContainerItems = KRecyclerView(
        parent = matcher,
        builder = {
            withId(R.id.view_list_card_list)
        },
        itemTypeBuilder = {
            itemType(::ListCardList)
        }
    )
    val footerActionButton = KTextView(matcher) {
        withId(R.id.footerActionButton)
    }
}
