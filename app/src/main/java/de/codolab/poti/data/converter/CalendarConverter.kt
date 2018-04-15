package de.codolab.poti.data.converter

import android.arch.persistence.room.TypeConverter
import java.util.*

class CalendarConverter {

    @TypeConverter
    fun toLong(value: Calendar): Long {
        return value.timeInMillis
    }

    @TypeConverter
    fun fromLong(value: Long): Calendar {
        val date = Calendar.getInstance()
        date.timeInMillis = value
        return date
    }
}