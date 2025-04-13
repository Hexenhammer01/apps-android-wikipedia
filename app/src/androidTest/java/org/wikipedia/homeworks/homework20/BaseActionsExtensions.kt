package org.wikipedia.homeworks.homework20

import io.github.kakaocup.kakao.common.actions.BaseActions

private val names = mutableMapOf<BaseActions,HierarchyClass>()

fun <T:BaseActions> T.setName(hierarchyClass: HierarchyClass):T{
    names[this] = hierarchyClass
    return this
}

fun BaseActions.getName():HierarchyClass{
    return names[this] ?: throw RuntimeException("Укажи имя")
}

fun BaseActions.withParent(elementName:String) = getName().withParent(elementName)