package com.example.alumni.Controller;

import com.example.alumni.Entity.Alumni;
import com.example.alumni.Service.AlumniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@RestController
@RequestMapping("/alumni")
public class AlumniController {

    @Autowired
    private AlumniService alumniService;

    /**
     * 新增校友
     * @param alumni
     */
    @PostMapping("")
    public Integer createAlumni(@RequestBody Alumni alumni){
        return alumniService.createAlumni(alumni);
    }

    /**
     * 根据名字查找校友
     * @param name
     */
    @GetMapping("/search")
    public ArrayList<Alumni> searchAlumniByName(String name){
        return alumniService.searchAlumniByName(name);
    }

    /**
     * 随机生成1000个校友
     */
    @GetMapping("/generate")
    public boolean randomGeneration(){
       
        return alumniService.randomGeneration();
    }

    /**
     * 更新校友信息
     * @param alumni
     */
    @PutMapping("")
    public boolean updateAlumni(@RequestBody Alumni alumni){
        return alumniService.updateAlumni(alumni);
    }

    /**
     * 删除校友
     * @param id
     */
    @DeleteMapping("/{id}")
    public boolean deleteAlumni(@PathVariable String id){
        return alumniService.deleteAlumni(Integer.parseInt(id));
    }

}
