package com.example.alumni.Service;

import com.example.alumni.Entity.Alumni;
import com.example.alumni.Mapper.AlumniMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class AlumniService {

    @Autowired
    private AlumniMapper alumniMapper;

    public Integer createAlumni(Alumni alumni) {
        alumniMapper.add(alumni);
        return alumni.getId();
    }

    public ArrayList<Alumni> searchAlumniByName(String name){
        if(name.equals("")){
            return alumniMapper.getAllAlumni();
        }
        else{
            return alumniMapper.searchAlumniByName('%'+name+'%');
        }
    }

    public boolean randomGeneration(){
        for(int i=0;i<100;i++){
            Alumni alumni = new Alumni();
            alumni.setName("欧阳建国"+i);
            Date date = new Date();
            alumni.setBirthday(date);
            alumni.setSex(i%3==0?"男":"女");
            alumni.setAdmission(2000+i%20);
            alumni.setGraduation(2000+i%20+i%10);
            alumni.setCity("厦门");
            alumni.setWorkplace("厦门大学");
            alumni.setTelephone("189"+i%90+""+i%70+""+i%80+""+i%60);
            alumni.setEmail(i+"@qq.com");
            alumni.setWechat(alumni.getName());
            alumni.setJob("学生");
            createAlumni(alumni);
        }
        return true;
    }

    public boolean updateAlumni(Alumni alumni) {
        return alumniMapper.update(alumni);
    }

    public boolean deleteAlumni(Integer id) {
        return alumniMapper.delete(id);
    }
}
