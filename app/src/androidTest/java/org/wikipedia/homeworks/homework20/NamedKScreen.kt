package org.wikipedia.homeworks.homework20

import com.kaspersky.kaspresso.screens.KScreen

abstract class NamedKScreen<out T : KScreen<T>> : KScreen<T>() {
    abstract val screenName: String
    val hierarchyClass by lazy { HierarchyClass(screenName) }
    fun withParent(elementName:String):HierarchyClass{
        return hierarchyClass.withParent(elementName)
    }
}