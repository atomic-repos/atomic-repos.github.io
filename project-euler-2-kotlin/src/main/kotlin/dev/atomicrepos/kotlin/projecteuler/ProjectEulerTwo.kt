package dev.atomicrepos.kotlin.projecteuler

fun evenFibonacciSum(upperBound: Int) =
    generateSequence(Pair(0, 1)) {
        Pair(it.second, it.first + it.second)
    }
        .map { it.first }
        .takeWhile { it < upperBound }
        .filter { it % 2 == 0 }
        .sum()
