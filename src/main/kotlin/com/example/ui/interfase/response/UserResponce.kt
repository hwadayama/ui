package com.example.ui.interfase.response

import java.time.LocalDateTime

data class UserResponce(
        var userid: String,
        var name: String,
        var password: String,
        var mailaddress: String?,
        var zipcode: String?,
        var address1: String?,
        var address2: String?,
        var address3: String?,
        var telno: String?,
        var authority: String?,
        var insdate: LocalDateTime,
        var upddate: LocalDateTime
)
