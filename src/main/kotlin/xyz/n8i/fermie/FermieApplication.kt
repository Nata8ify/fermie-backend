package xyz.n8i.fermie

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FermieApplication

fun main(args: Array<String>) {
    runApplication<FermieApplication>(*args)
}
