package de.codolab.poti.data

import org.junit.jupiter.api.Test
import java.util.*

class TimeLogTest {
    @Test
    fun `Should return correct ID`() {
        // GIVEN
        val date = Date()
        val timeLog = TimeLog(TimeLogType.IN, date, 123L)

        // WHEN

        // THEN
        assert(timeLog.id == 123L)
    }

    @Test
    fun `Should return correct time log type`() {
        // GIVEN
        val timeLog = TimeLog(TimeLogType.OUT)

        // WHEN

        // THEN
        assert(timeLog.type == TimeLogType.OUT)
    }

    @Test
    fun `Should return correct date`() {
        // GIVEN
        val date = Date()
        val timeLog = TimeLog(TimeLogType.OUT, date)

        // WHEN

        // THEN
        assert(timeLog.date == date)
    }
}
