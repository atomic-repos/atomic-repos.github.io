package dev.atomicrepos.kotlin.mfr

import org.assertj.core.api.Assertions
import org.junit.Test
import java.time.LocalDate
import java.time.Month

class EmployeeListTest {
    @Test
    fun listOfEmployeesExists() {
        Assertions.assertThat(employees).size().isEqualTo(5)
        Assertions.assertThat(employees).allMatch { it is Employee }
    }

    @Test
    fun listOfEmployeesContains() {
        Assertions.assertThat(employees).containsOnlyOnce(
            Employee(
                firstName = "Matt",
                lastName = "Stine",
                jobTitle = JobTitle.SOFTWARE_ENGINEER,
                startDate = LocalDate.of(
                    2001,
                    Month.JANUARY,
                    12
                )
            )
        )
        Assertions.assertThat(employees).containsOnlyOnce(
            Employee(
                firstName = "Peter",
                lastName = "Gibbons",
                jobTitle = JobTitle.MANAGER,
                startDate = LocalDate.of(
                    1995,
                    Month.SEPTEMBER,
                    15
                )
            )
        )
        Assertions.assertThat(employees).containsOnlyOnce(
            Employee(
                firstName = "Michael",
                lastName = "Bolton",
                jobTitle = JobTitle.WEB_DEVELOPER,
                startDate = LocalDate.of(
                    1999,
                    Month.FEBRUARY,
                    19
                ),
                separationDate = LocalDate.of(
                    2022,
                    Month.JANUARY,
                    15
                )
            )
        )
        Assertions.assertThat(employees).containsOnlyOnce(
            Employee(
                firstName = "Samir",
                lastName = "Nagheenanajar",
                jobTitle = JobTitle.WEB_DEVELOPER,
                startDate = LocalDate.of(
                    1999,
                    Month.FEBRUARY,
                    19
                ),
                separationDate = LocalDate.of(
                    2022,
                    Month.JANUARY,
                    15
                )
            )
        )
        Assertions.assertThat(employees).containsOnlyOnce(
            Employee(
                firstName = "Bill",
                lastName = "Lumbergh",
                jobTitle = JobTitle.DISTRICT_MANAGER,
                startDate = LocalDate.of(
                    1975,
                    Month.APRIL,
                    4
                )
            )
        )
    }
}