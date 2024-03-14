package com.example.config

import com.example.beans.Vehicle
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
open class ProjectConfig {
    @Primary // in case of multiple bean of same type
    // we can make a bean to return by default using @Primary annotation thus avoiding exception
    @Bean
    open fun vehicle(): Vehicle {
        val obj = Vehicle()
        obj.name = "Primary Vehicle"
        return obj
    }

    @Bean
    open fun vehicle2(): Vehicle { //Multiple Bean of Same Type
        val obj = Vehicle()
        obj.name = "Audi"
        return obj
    }

    @Bean("vehicle3")
    open fun getVehicle3(): Vehicle { //Multiple Bean of Same Type
        val obj = Vehicle()
        obj.name = "Maruthi 800"
        return obj
    }
    @Bean
    open fun hello(): String = "Hello World"
    @Bean
    open fun number(): Int = 43
}