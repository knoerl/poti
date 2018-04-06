package de.codolab.poti.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(TimeLog::class), version = 1, exportSchema = false)
abstract class PitoDatabase : RoomDatabase() {
    abstract fun timeLogDao(): TimeLogDao
}