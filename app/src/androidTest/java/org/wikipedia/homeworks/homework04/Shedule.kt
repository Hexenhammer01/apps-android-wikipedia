package org.wikipedia.homeworks.homework04

import java.time.LocalTime
import java.time.format.DateTimeFormatter

data class ScheduleEntity(val lesson: String, val startTime: LocalTime, val endTime: LocalTime)


class Schedule {


    private val scheduleOfWeek = mutableMapOf<Days, MutableList<ScheduleEntity>>()
    private val timeFormatter = DateTimeFormatter.ofPattern("HH:mm")


    fun addSchedule(day: Days, scheduleEntity: ScheduleEntity) {
        scheduleOfWeek.getOrPut(day) { mutableListOf() }.add(scheduleEntity)
    }

    private var day: Days? = null

    private fun scheduleDay(day: Days, function: () -> Unit) {
        this.day = day
        function()
        this.day = null
    }


    operator fun invoke (function: Schedule.() -> Unit){
        function(this)
    }

    fun monday(function: () -> Unit){
        scheduleDay(Days.MONDAY,function)
    }

    fun tuesday(function: () -> Unit){
        scheduleDay(Days.TUESDAY,function)
    }

    fun wednesday(function: () -> Unit){
        scheduleDay(Days.WEDNESDAY,function)
    }

    fun thursday(function: () -> Unit){
        scheduleDay(Days.THURSDAY,function)
    }

    fun friday(function: () -> Unit){
        scheduleDay(Days.FRIDAY,function)
    }

    fun saturday(function: () -> Unit){
        scheduleDay(Days.SATURDAY,function)
    }

    fun sunday(function: () -> Unit){
        scheduleDay(Days.SUNDAY,function)
    }

    override fun toString(): String {
        return scheduleOfWeek.toSortedMap()
            .map { (day, list) ->
                list.sortedBy { it.startTime }
                    .joinToString("\n") {
                        "%-15s${it.startTime.format(timeFormatter)} - ${
                            it.endTime.format(
                                timeFormatter
                            )
                        }".format("\t${it.lesson}:")
                    }.let {
                        "${day.name.lowercase().replaceFirstChar { day.name[0].uppercase() }}:\n$it"
                    }
            }.joinToString("\n\n")
    }
}