package com.rodrigopeleias.ecommerce.customer

import com.rodrigopeleias.ecommerce.customer.customer.Address
import jakarta.validation.constraints.NotNull

data class CustomerRequest (
    val Id: String? = null,

    @NotNull
    val firstname: String,

    val lastname: String,

    val email: String,

    val address: Address
)
