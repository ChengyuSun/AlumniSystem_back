package com.example.alumni.Service;

import com.example.alumni.Entity.Admin;
import com.example.alumni.Mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public boolean login(Admin admin) {
        ArrayList<Admin> result = adminMapper.login(admin);
        return result.size()==1?true:false;
    }
}
