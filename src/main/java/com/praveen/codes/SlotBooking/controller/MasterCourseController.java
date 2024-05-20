package com.praveen.codes.SlotBooking.controller;

import com.praveen.codes.SlotBooking.model.MasterCourse;
import com.praveen.codes.SlotBooking.service.MasterCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/master_course")
@CrossOrigin
public class MasterCourseController {
    @Autowired
    private MasterCourseService masterCourseService;
    @PostMapping("/add")
    public String add(@RequestBody MasterCourse masterCourse){
        masterCourseService.saveMasterCourse(masterCourse);
        return "new course is added";
    }
    @GetMapping("/getAll")
    public List<MasterCourse> getAllMasterCourse(){
        return masterCourseService.getAllMasterCourse();
    }
}
