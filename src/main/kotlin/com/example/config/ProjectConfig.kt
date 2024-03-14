package com.example.config

import com.example.beans.Vehicle
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ProjectConfig {
    open val vehicle: Vehicle
    @Bean
    get() {
        val obj = Vehicle()
        obj.name = "Vehicle By Spring"
        return obj
    }

    @Bean
    open fun hello(): String = "Hello World"

    @Bean
    open fun number(): Int = 43
}