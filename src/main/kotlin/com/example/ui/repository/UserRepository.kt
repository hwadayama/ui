package com.example.ui.repository

import com.example.ui.interfase.request.UserListRequest
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate

@Repository
class UserRepository(
        val restTemplate: RestTemplate) {

    fun getUserList(request: UserListRequest): ResponseEntity<String>? {
        val url = "http://localhost:8082/userApi/userList"
        val res = getAPICall(url,request)
        return res
    }

    fun getAPICall(url:String,request: UserListRequest): ResponseEntity<String> {
        return restTemplate.postForEntity(url, request, String::class.java)
    }

}