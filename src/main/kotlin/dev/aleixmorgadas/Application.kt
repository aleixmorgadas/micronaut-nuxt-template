package dev.aleixmorgadas

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("dev.aleixmorgadas")
        .start()
}

