package org.wikipedia.homeworks.homework20

import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import org.wikipedia.R
import org.wikipedia.feed.view.FeedView
import org.wikipedia.homeworks.homework07.AnnouncementViewItem
import org.wikipedia.homeworks.homework07.DayHeaderCardView
import org.wikipedia.homeworks.homework07.NewsCardsView
import org.wikipedia.homeworks.homework07.NewsItemViewsItem
import org.wikipedia.homeworks.homework07.SerchCardViewItem
import org.wikipedia.homeworks.homework07.TopReadCardView
import org.wikipedia.homeworks.homework20.ExploreScreenNew.hierarchyClass


object ExploreScreenNew : NamedKScreen<ExploreScreenNew>() {
    override val screenName = "Главный экран"
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val toolbarTitle: KImageView by lazy {
        KImageView { withId(R.id.main_toolbar_wordmark) }
            .setName(withParent("Заголовок"))
    }

    val items = KRecyclerView(
        builder = {
            withId(R.id.feed_view)
        },
        itemTypeBuilder = {
            itemType(::SerchCardViewItem)
            itemType(::AnnouncementViewItem)
            itemType(::DayHeaderCardView)
            itemType(::TopReadCardView)
            itemType(::NewsCardsView)
            itemType(::NewsItemViewsItem)
        }


    ).setName(withParent("Список блоков"))

    fun topReadItem(index: Int, function: TopReadCardView.() -> Unit) {
        items.invokeAtIndex(index,function)
    }

    fun topReadItem(): TopReadCardView {
        return items.childWith<TopReadCardView> {
            withDescendant {
                withText("Top read")
            }
        }.setName(items.getName().withParent("Top read"))
    }

}
