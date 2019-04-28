package com.example.alumni.Service;

import com.example.alumni.Mapper.InsertlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/4/10 18:05
 */
@Service
public class InsertlogService {
    @Autowired
    private InsertlogMapper insertlogMapper;

    public void insert(String alumniname){
        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        insertlogMapper.insert(alumniname,timestamp);
    }
}
