package com.example.alumni.AOP;

import com.example.alumni.Entity.Admin;
import com.example.alumni.Entity.Alumni;
import com.example.alumni.Service.InsertlogService;
import com.example.alumni.Service.UserlogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/4/10 11:29
 */

@Aspect
@Component
public class MyAop {

    @Autowired
    private UserlogService userlogService;

    @Autowired
    private InsertlogService insertlogService;

    @Pointcut(value = "execution(* com.example.alumni.Controller.AdminController.login(*))")
    public void loginAOP(){

    }

    @Pointcut(value = "execution(* com.example.alumni.Controller.AdminController.logout(*))")
    public void logoutAOP(){

    }

    @Pointcut(value = "execution(* com.example.alumni.Controller.AlumniController.createAlumni(*))")
    public void insertAOP(){

    }

    @Before("loginAOP()")
    public void beforelogin(JoinPoint joinPoint){
        Admin admin=(Admin) joinPoint.getArgs()[0];
        userlogService.login(admin.getUsername());
    }

    @Before("logoutAOP()")
    public void beforelogout(JoinPoint joinPoint){
        String username=String.valueOf(joinPoint.getArgs()[0]);
        userlogService.logout(username);
    }

    @Before("insertAOP()")
    public void beforeinsert(JoinPoint joinPoint){
        Alumni alumni=(Alumni)joinPoint.getArgs()[0];
        insertlogService.insert(alumni.getName());
    }

}
