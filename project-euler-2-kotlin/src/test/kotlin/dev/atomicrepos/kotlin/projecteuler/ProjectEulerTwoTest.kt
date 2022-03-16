package dev.atomicrepos.kotlin.projecteuler

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ProjectEulerTwoTest {

    @Test
    fun shouldCalculateEvenFibonacciSum() {
       assertThat(evenFibonacciSum(4_000_000)).isEqualTo(4_613_732)
    }

}
