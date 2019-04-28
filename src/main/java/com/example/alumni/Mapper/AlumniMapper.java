package com.example.alumni.Mapper;

import com.example.alumni.Entity.Alumni;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface AlumniMapper {

    public Integer add(Alumni alumni);

    public ArrayList<Alumni> getAllAlumni();

    public ArrayList<Alumni> searchAlumniByName(String name);

    public boolean update(Alumni alumni);

    public boolean delete(Integer id);

}
