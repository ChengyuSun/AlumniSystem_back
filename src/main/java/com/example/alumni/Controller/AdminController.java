package com.example.alumni.Controller;

import com.example.alumni.Entity.Admin;
import com.example.alumni.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public boolean login(@RequestBody Admin admin){
        return adminService.login(admin);
    }

    @GetMapping("/logout/{userName}")
    public void logout(@PathVariable String userName){

    }

}
