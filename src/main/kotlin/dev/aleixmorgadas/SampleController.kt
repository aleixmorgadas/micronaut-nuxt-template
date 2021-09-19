package dev.aleixmorgadas

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

data class SampleData(val name: String, val value: Double)

@Controller("/sample")
class SampleController {

    @Get()
    fun sample() = SampleData("Micronaut + Nuxt", 10.0)
}