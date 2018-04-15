package de.codolab.poti.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "timeLog")
data class TimeLog(@ColumnInfo(name = "type") var type: TimeLogType,
                   @ColumnInfo(name = "date") var date: Date = Date(),
                   @PrimaryKey(autoGenerate = true) var id: Long = 0
)