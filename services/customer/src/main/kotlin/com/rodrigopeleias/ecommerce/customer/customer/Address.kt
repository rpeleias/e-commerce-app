package com.rodrigopeleias.ecommerce.customer.customer

import org.springframework.validation.annotation.Validated

@Validated
data class Address (
    val street: String,

    val houseNumber: String,

    val zipCode: String
)