package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class ListCardList(matcher: Matcher<View>) : KRecyclerItem<ListCardList>(matcher) {
    val viewListCardNumber = KView(matcher){
        withId(R.id.view_list_card_number)
    }
    val viewListCardItemTitle = KTextView(matcher){
        withId(R.id.view_list_card_item_title)
    }
    val viewListCardItemSubtitle = KTextView(matcher){
        withId(R.id.view_list_card_item_subtitle)
    }
    val viewListCardItemGraph = KView(matcher){
        withId(R.id.view_list_card_item_graph)
    }
    val viewListCardItemPageviews = KTextView(matcher){
        withId(R.id.view_list_card_item_pageviews)
    }
    val viewListCardItemImage = KImageView(matcher){
        withId(R.id.view_list_card_item_image)
    }

}