package com.example.TestAuth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthController {

    @PreAuthorize("hasPermission(#request, 'buildingService.addBuilding')")
    @GetMapping("/test")
    //@PreAuthorize("#test()")
    public String getAuth(HttpServletRequest request) {
        System.out.println(request.getHeader("user-role").toString());
        System.out.println("Called!!!");
        return "Success";
    }

    public void test(){
        System.out.println("Test Method Called");
    }
}
