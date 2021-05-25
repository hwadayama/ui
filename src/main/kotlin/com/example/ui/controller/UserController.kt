package com.example.ui.controller

import com.example.ui.interfase.request.UserListRequest
import com.example.ui.interfase.response.UserResponce
import com.example.ui.usecase.UserUsecase
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/test")
class UserController(val usecase: UserUsecase) {

    @GetMapping("/userList")
    fun getUserList(model: Model):String{
        val request = UserListRequest(100,0)
        val response = usecase.getUserList(request)
        if (response != null) {
            if (response.statusCode==HttpStatus.OK){
                val mapper = ObjectMapper()
                val userlist = mutableListOf<UserResponce>()
                val userListResponse = mapper.readValue(response.body, userlist::class.java)
                model.addAttribute("title","ユーザリスト")
                model.addAttribute("userList",userListResponse)
            }
        }
        return "user/userList"

    }

}