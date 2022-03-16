package dev.atomicrepos.kotlin.projecteuler

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ProjectEulerOneTest {

    @Test
    fun shouldCalculateSumOfMultiples() {
        assertThat(sumOfMultiples(1000, 3, 5)).isEqualTo(233168)
    }

}
