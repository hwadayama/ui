package com.example.ui.usecase

import com.example.ui.interfase.request.UserListRequest
import com.example.ui.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component

@Component
class UserUsecase(val service: UserService) {

    fun getUserList(request: UserListRequest): ResponseEntity<String>?{
        return service.getUserList(request)
    }

}