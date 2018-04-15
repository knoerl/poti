package de.codolab.poti.data.converter

import android.arch.persistence.room.TypeConverter
import java.util.*

class DateConverter {

    @TypeConverter
    fun toLong(value: Date): Long {
        return value.time
    }

    @TypeConverter
    fun fromLong(value: Long): Date {
        return Date(value)
    }
}