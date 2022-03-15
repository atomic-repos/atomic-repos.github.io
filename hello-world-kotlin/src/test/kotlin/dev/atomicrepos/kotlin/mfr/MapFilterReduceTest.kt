package dev.atomicrepos.kotlin.mfr

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.time.LocalDate
import java.time.Month

class MapFilterReduceTest {

    @Test
    fun canFindByLastNameLike() {
        assertThat(
            findByLastNameLike("Na")
                .firstOrNull()
                ?.lastName
        ).isEqualTo("Nagheenanajar")
    }

    @Test
    fun missingLastNameMatchReturnsNull() {
        assertThat(
            findByLastNameLike("Waddams")
                .firstOrNull()
        ).isNull()
    }

    @Test
    fun canFindByPosition() {
        assertThat(
            findByPosition(JobTitle.WEB_DEVELOPER)
                .firstOrNull()
                ?.lastName
        ).isEqualTo("Bolton")
    }

    @Test
    fun canFindEmployeesTerminatedSince() {
        assertThat(
            findTerminatedSince(LocalDate.of(2022, Month.JANUARY, 1))
        ).size().isEqualTo(2)
    }

    @Test
    fun canGetAverageServiceTime() {
        assertThat(getAverageServiceTime()).isEqualTo(10280.4)
    }

    @Test
    fun canGetAverageServiceTimeByJobTitle() {
        assertThat(getAverageServiceTimeByJobTitle(JobTitle.WEB_DEVELOPER)).isEqualTo(8424.0)
    }

}
