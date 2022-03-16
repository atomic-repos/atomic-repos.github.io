package dev.atomicrepos.kotlin.projecteuler

val naturalNumbers = generateSequence(1) { it + 1}

fun sumOfMultiples(upperBound: Int, vararg factors: Int) =
    factors
        .asSequence()
        .map { factor ->
            naturalNumbers
                .map { it * factor }
                .takeWhile { it < upperBound }
        }
        .flatten()
        .distinct()
        .sum()
