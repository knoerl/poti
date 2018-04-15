package de.codolab.poti.data.converter

import de.codolab.poti.data.TimeLogType
import org.junit.jupiter.api.Test

class TimeLogTypeConverterTest {
    @Test
    fun `Should return correct string for enum value IN`() {
        // GIVEN
        val type = TimeLogType.IN

        // WHEN
        val string = TimeLogTypeConverter().toString(type)

        // THEN
        assert(string == "IN")
    }

    @Test
    fun `Should return correct string for enum value OUT`() {
        // GIVEN
        val type = TimeLogType.OUT

        // WHEN
        val string = TimeLogTypeConverter().toString(type)

        // THEN
        assert(string == "OUT")
    }

    @Test
    fun `Should return correct enum value for string IN`() {
        // GIVEN
        val string = "IN"

        // WHEN
        val type = TimeLogTypeConverter().fromString(string)

        // THEN
        assert(type == TimeLogType.IN)
    }

    @Test
    fun `Should return correct enum value for string OUT`() {
        // GIVEN
        val string = "OUT"

        // WHEN
        val type = TimeLogTypeConverter().fromString(string)

        // THEN
        assert(type == TimeLogType.OUT)
    }
}
