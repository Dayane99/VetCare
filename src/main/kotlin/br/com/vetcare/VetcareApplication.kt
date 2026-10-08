package br.com.vetcare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VetcareApplication

fun main(args: Array<String>) {
	runApplication<VetcareApplication>(*args)
}
