package org.wikipedia.homeworks.homework22

import org.wikipedia.feed.view.CardHeaderView
import org.wikipedia.R
import org.wikipedia.homeworks.homework07.AnnouncementViewItem
import org.wikipedia.homeworks.homework07.SerchCardViewItem
import org.wikipedia.homeworks.homework20.ExploreScreenNew

fun ExploreScreenNew.searchCard(
    targetIndex: Int,
    function: SerchCardViewItem() -> Unit)
val invokeByID = ExploreScreenNew.items.invokeByID<SerchCardViewItem>(
    targetIndex = targetIndex,
    targetID = R.id.voice_search_button,
    blockName = "Search Card",
    limiter = ExploreScreenNew.items.getSize()
) {
    setName(ExploreScreenNew.items.getName().withParent("Блок поиска"))
    function()
}


fun ExploreScreenNew.getSearchCard(): SerchCardViewItem {
    return ExploreScreenNew.items.findByID<SerchCardViewItem>(
        targetIndex = 1,
        targetID = R.id.voice_search_button,
        blockName = "Search Card",
        limiter = ExploreScreenNew.items.getSize()
    ).apply {
        setName(ExploreScreenNew.items.getName().withParent("Блок поиска"))
    }
}

fun ExploreScreenNew.announcementCard(
    targetIndex: Int,
    function: AnnouncementCardViewItem.() -> Unit) {
    ExploreScreenNew.items.invokeByID<AnnouncementCardViewItem>(
        targetIndex = targetIndex,
        targetID = R.id.view_announcement_header_image,
        blockName = "Announcement Card",
        limiter = ExploreScreenNew.items.getSize()
    ) {
        setName(ExploreScreenNew.items.getName().withParent("Блок объявления"))
        function()
    }
}

fun ExploreScreenNew.getAnnouncementCard(): AnnouncementViewItem {
    return ExploreScreenNew.items.findByID<AnnouncementViewItem>(
        targetIndex = 1,
        targetID = R.id.view_announcement_header_image,
        blockName = "Announcement Card",
        limiter = ExploreScreenNew.items.getSize()
    ).apply {
        setName(ExploreScreenNew.items.getName().withParent("Блок объявления"))
    }
}

fun ExploreScreenNew.searchCardAlone(block: SerchCardViewItem.() -> Unit) {
    getSearchCard().apply(block)
}

fun ExploreScreenNew.announcementCardAlone(block: AnnouncementViewItem.() -> Unit) {
    getAnnouncementCard().apply(block)
}

fun ExploreScreenNew.NewsCard(
    targetIndex: Int,
    function: NewsCardItem.() -> Unit) {
    ExploreScreenNew.items.invokeByID<NewsCardItem>(
        targetIndex = targetIndex,
        targetID = R.id.news_cardview_recycler_view,
        blockName = "News Card",
        limiter = ExploreScreenNew.items.getSize()
    ) {
        setName(ExploreScreenNew.items.getName().withParent("Блок новостей"))
        function()
    }
}

fun ExploreScreenNew.getNewInTheNewsCard(targetIndex: Int): NewsCardItem {
    return ExploreScreenNew.items.findByID<NewsCardItem>(
        targetIndex = targetIndex,
        targetID = R.id.news_cardview_recycler_view,
        blockName = "News Card",
        limiter = ExploreScreenNew.items.getSize()
    ).apply {
        setName(ExploreScreenNew.items.getName().withParent("Блок новостей"))
    }
}