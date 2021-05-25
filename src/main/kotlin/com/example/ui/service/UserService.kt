package com.example.ui.service

import com.example.ui.interfase.request.UserListRequest
import com.example.ui.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class UserService(val repository: UserRepository) {

    fun getUserList(request: UserListRequest): ResponseEntity<String>?{
        return repository.getUserList(request)
    }
}