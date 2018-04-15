package de.codolab.poti.data.converter

import org.junit.jupiter.api.Test
import java.util.*

class CalendarConverterTest {
    @Test
    fun `Should return correct long for calendar`() {
        // GIVEN
        val date = Calendar.getInstance()

        // WHEN
        val timeInMillis = CalendarConverter().toLong(date)

        // THEN
        assert(timeInMillis == date.timeInMillis)
    }

    @Test
    fun `Should return correct calendar for long`() {
        // GIVEN
        val timeInMillis = Calendar.getInstance().timeInMillis

        // WHEN
        val date = CalendarConverter().fromLong(timeInMillis)

        // THEN
        assert(date.timeInMillis == timeInMillis)
    }
}
