package com.example.alumni.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/4/10 15:29
 */

@Mapper
@Repository
public interface UserlogMapper {
    Integer login(@Param("username") String username, @Param("time") Timestamp time,@Param("operation") Integer operation);
    Integer logout(@Param("username") String username, @Param("time") Timestamp time,@Param("operation") Integer operation);
}
