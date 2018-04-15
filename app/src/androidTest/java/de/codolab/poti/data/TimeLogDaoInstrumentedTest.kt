package de.codolab.poti.data

import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TimeLogDaoInstrumentedTest {

    private lateinit var pitoDatabase: PitoDatabase
    private lateinit var timeLogDao: TimeLogDao

    @Before
    fun createDatabase() {
        val context = InstrumentationRegistry.getTargetContext()
        pitoDatabase = Room.inMemoryDatabaseBuilder(context, PitoDatabase::class.java).build()
        timeLogDao = pitoDatabase.timeLogDao()
    }

    @After
    @Throws(Exception::class)
    fun closeDatabase() {
        pitoDatabase.close()
    }

    @Test
    fun should_create_the_correct_number_of_entries() {
        // GIVEN
        val timeLogs = arrayOf(
                TimeLog(TimeLogType.IN),
                TimeLog(TimeLogType.OUT),
                TimeLog(TimeLogType.IN),
                TimeLog(TimeLogType.OUT)
        )

        // WHEN
        timeLogs.forEach {
            timeLogDao.insert(it)
        }

        // THAT
        val items = timeLogDao.getAll()
        assert(items.size == 4)
    }

    @Test
    fun should_delete_all_entries() {
        // GIVEN
        val timeLogs = arrayOf(
                TimeLog(TimeLogType.IN),
                TimeLog(TimeLogType.OUT),
                TimeLog(TimeLogType.IN),
                TimeLog(TimeLogType.OUT)
        )

        // WHEN
        timeLogs.forEach {
            timeLogDao.insert(it)
        }

        timeLogDao.deleteAll()

        // THAT
        val items = timeLogDao.getAll()
        assert(items.isEmpty())
    }
}
