package com.example.alumni.Service;

import com.example.alumni.Mapper.UserlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/4/10 15:54
 */
@Service
public class UserlogService {

    @Autowired
    private UserlogMapper userlogMapper;

    public Integer login(String username){
        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        return userlogMapper.login(username,timestamp,1);
    }

    public Integer logout(String username){
        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        return userlogMapper.logout(username,timestamp,0);
    }
}
