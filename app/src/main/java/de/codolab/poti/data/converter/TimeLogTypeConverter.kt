package de.codolab.poti.data.converter

import android.arch.persistence.room.TypeConverter
import de.codolab.poti.data.TimeLogType

class TimeLogTypeConverter {

    @TypeConverter
    fun toString(value: TimeLogType): String {
        return value.toString()
    }

    @TypeConverter
    fun fromString(value: String): TimeLogType {
        return TimeLogType.valueOf(value)
    }
}