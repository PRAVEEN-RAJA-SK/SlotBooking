package com.praveen.codes.SlotBooking.controller;

import com.praveen.codes.SlotBooking.model.MasterStudent;
import com.praveen.codes.SlotBooking.service.MasterStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/master_student")
@CrossOrigin
public class MasterStudentController {
      @Autowired
      private MasterStudentService masterStudentService;
      @PostMapping("/addStudent")
      public  String addStudent(@RequestBody MasterStudent masterStudent){
          masterStudentService.saveMasterStudent(masterStudent);
          return "New Stdudent is added";
      }
      @GetMapping("/getAllStudent")
          public List<MasterStudent> getMasterStudent() {
          return masterStudentService.getAllMasterStudent();
      }
}
