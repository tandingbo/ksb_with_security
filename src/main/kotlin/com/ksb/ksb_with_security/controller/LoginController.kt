package com.ksb.ksb_with_security.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpServletRequest

@Controller
class LoginController {

    @GetMapping("/login")
    fun login(request: HttpServletRequest): String {
        return "login"
    }


}
