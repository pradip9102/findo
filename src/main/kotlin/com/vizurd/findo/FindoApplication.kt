package com.vizurd.findo

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration(exclude = [JacksonAutoConfiguration::class])
class FindoApplication {
    companion object {
        internal val logger = KotlinLogging.logger { }
    }
}

fun main(args: Array<String>) {
    runApplication<FindoApplication>(*args)
    FindoApplication.logger.debug { "findo is ready to find companions..." }
}
