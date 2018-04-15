package de.codolab.poti.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import de.codolab.poti.data.converter.CalendarConverter
import de.codolab.poti.data.converter.TimeLogTypeConverter

@Database(entities = [(TimeLog::class)], version = 1, exportSchema = false)
@TypeConverters(TimeLogTypeConverter::class, CalendarConverter::class)
abstract class PitoDatabase : RoomDatabase() {
    abstract fun timeLogDao(): TimeLogDao
}