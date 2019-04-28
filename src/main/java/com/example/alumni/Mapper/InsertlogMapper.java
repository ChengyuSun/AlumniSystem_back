package com.example.alumni.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/4/10 18:01
 */
@Mapper
@Repository
public interface InsertlogMapper {
    Integer insert(@Param("alumniname")String alumniname, @Param("time")Timestamp timestamp);
}
