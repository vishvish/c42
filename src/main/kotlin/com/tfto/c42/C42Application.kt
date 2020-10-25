package com.tfto.c42

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
open class C42Application

fun main(args: Array<String>) {
	runApplication<C42Application>(*args)
}
