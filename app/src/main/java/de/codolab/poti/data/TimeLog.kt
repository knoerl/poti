package de.codolab.poti.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "timeLog")
data class TimeLog(@PrimaryKey(autoGenerate = true) var id: Long = 0,
                   @ColumnInfo(name = "time") var timestamp: Timestamp = Timestamp(System.currentTimeMillis()),
                   @ColumnInfo(name = "type") var type: TimeLogType
)