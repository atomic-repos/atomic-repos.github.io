package dev.atomicrepos.kotlin.mfr

import java.time.*
import java.time.temporal.ChronoUnit

data class Employee(
    val firstName: String,
    val lastName: String,
    val jobTitle: JobTitle,
    val startDate: LocalDate,
    val separationDate: LocalDate? = null
)

enum class JobTitle {
    MANAGER, SOFTWARE_ENGINEER, DISTRICT_MANAGER, DBA, WEB_DEVELOPER
}

fun findByLastNameLike(match: String) =
    employees.filter { it.lastName.contains(match) }

fun findByPosition(match: JobTitle) =
    employees.filter { it.jobTitle == match }

fun findTerminatedSince(match: LocalDate) =
    employees.filter { it.separationDate?.isAfter(match) ?: false }

fun getAverageServiceTime() =
    employees
        .map(Employee::startDate)
        .map { it.until(dateOfTest, ChronoUnit.DAYS) }
        .average()

fun getAverageServiceTimeByJobTitle(match: JobTitle) =
    employees.filter { it.jobTitle == match }
        .map(Employee::startDate)
        .map { it.until(dateOfTest, ChronoUnit.DAYS) }
        .average()

/**
 * Fixed Date of March 15, 2022. Used for date-based math.
 */
val dateOfTest: LocalDate =
    LocalDate.ofInstant(
        Clock.fixed(
            Instant.parse("2022-03-15T00:00:00.00Z"),
            ZoneId.of("America/Chicago")
        ).instant(),
        ZoneId.of("America/Chicago")
    )

val employees = listOf(
    Employee(
        firstName = "Matt",
        lastName = "Stine",
        jobTitle = JobTitle.SOFTWARE_ENGINEER,
        startDate = LocalDate.of(
            2001,
            Month.JANUARY,
            12
        ) // 7731 days of service
    ),
    Employee(
        firstName = "Peter",
        lastName = "Gibbons",
        jobTitle = JobTitle.MANAGER,
        startDate = LocalDate.of(
            1995,
            Month.SEPTEMBER,
            15
        ) // 9677 days of service
    ),
    Employee(
        firstName = "Michael",
        lastName = "Bolton",
        jobTitle = JobTitle.WEB_DEVELOPER,
        startDate = LocalDate.of(
            1999,
            Month.FEBRUARY,
            19
        ), // 8424 days of service
        separationDate = LocalDate.of(
            2022,
            Month.JANUARY,
            15
        )
    ),
    Employee(
        firstName = "Samir",
        lastName = "Nagheenanajar",
        jobTitle = JobTitle.WEB_DEVELOPER,
        startDate = LocalDate.of(
            1999,
            Month.FEBRUARY,
            19
        ), // 8424 days of service
        separationDate = LocalDate.of(
            2022,
            Month.JANUARY,
            15
        )
    ),
    Employee(
        firstName = "Bill",
        lastName = "Lumbergh",
        jobTitle = JobTitle.DISTRICT_MANAGER,
        startDate = LocalDate.of(
            1975,
            Month.APRIL,
            4
        ) // 17146 days of service
    )
)
