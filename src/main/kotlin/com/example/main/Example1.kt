package com.example.main

import com.example.beans.Vehicle
import com.example.config.ProjectConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val vehicle = Vehicle()
    vehicle.name = "Honda City"
    println("Vehicle name from non-spring-context is ${vehicle.name}")

    //Creation of IoC Application Context Container
    val context =  AnnotationConfigApplicationContext(ProjectConfig::class.java)
    val vehicle2:Vehicle = context.getBean(Vehicle::class.java)
    println("Vehicle name from spring-context is ${vehicle2.name}")
    val hello = context.getBean(String::class.java)
    println("String value from spring-context is $hello")
    val num = context.getBean(Integer::class.java)
    println("Integer value from spring-context is $num")
}
