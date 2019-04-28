package com.example.alumni.Mapper;

import com.example.alumni.Entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface AdminMapper {

    public ArrayList<Admin> login(Admin admin);

}
