package de.codolab.poti.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query

@Dao
interface TimeLogDao {
    @Query("SELECT * from timeLog")
    fun getAll(): List<TimeLog>

    @Insert(onConflict = REPLACE)
    fun insert(timeLog: TimeLog)

    @Query("DELETE from timeLog")
    fun deleteAll()
}