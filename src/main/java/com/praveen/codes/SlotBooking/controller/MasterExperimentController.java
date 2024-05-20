package com.praveen.codes.SlotBooking.controller;


import com.praveen.codes.SlotBooking.model.MasterExperiment;
import com.praveen.codes.SlotBooking.service.MasterExperimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/master_experiment")
@CrossOrigin
public class MasterExperimentController {
    @Autowired
    MasterExperimentService masterExperimentService;

    @PostMapping("/addExperiment")
    public  String addExperiment(@RequestBody MasterExperiment masterExperiment){
        masterExperimentService.saveMasterExperiment(masterExperiment);
        return "Experiment Added Successful";
    }

    @GetMapping("/getAllExperiment")
    public List<MasterExperiment> getAllMasterExperiment(){
        return masterExperimentService.getAllMasterExperiment();
    }

    @GetMapping("/getExperimentByCourseId")
    public List<MasterExperiment> getExperimentsByCourseId(@RequestParam int courseId) {
        return masterExperimentService.getExperimentsByCourseId(courseId);
    }


}
