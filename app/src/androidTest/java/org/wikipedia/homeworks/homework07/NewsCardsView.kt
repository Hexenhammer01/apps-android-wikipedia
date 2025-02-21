package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R


class NewsCardsView(matcher: Matcher<View>) : KRecyclerItem<NewsCardsView>(matcher) {
    val viewCardHeaderTitle = KTextView(matcher){
        withId(R.id.view_card_header_title)
    }
    val viewListCardHeaderLangCode = KView(matcher){
        withId(R.id.view_list_card_header_lang_code)
    }
    val viewListCardHeaderSecondaryIcon = KImageView(matcher){
        withId(R.id.view_list_card_header_secondary_icon)
    }
    val viewListCardHeaderMenu = KImageView(matcher){
        withId(R.id.view_list_card_header_menu)
    }
    val newsCardviewRecyclerViewItems = KRecyclerView(
        builder = {
            withId(R.id.news_cardview_recycler_view)
        },
        itemTypeBuilder = {
            itemType (::NewsItemViewsItem)

        }
    )
}