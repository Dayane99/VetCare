package br.com.vetcare

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<VetcareApplication>().with(TestcontainersConfiguration::class).run(*args)
}
