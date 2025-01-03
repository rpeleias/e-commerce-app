package com.rodrigopeleias.ecommerce.customer.customer

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Customer(
    val Id: String? = null,

    val firstname: String,

    val lastname: String,

    val email: String,

    val address: Address
)
