package com.rodrigopeleias.ecommerce.customer

import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/customer")
class CustomerController (
    private val service: CustomerService
){

    @PostMapping
    fun createCustomer(@RequestBody @Valid request: CustomerRequest): ResponseEntity<String> {
        return ResponseEntity.ok(service.createCustomer(request));
    }
}