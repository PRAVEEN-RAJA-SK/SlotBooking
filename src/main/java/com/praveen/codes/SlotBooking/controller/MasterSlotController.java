package com.praveen.codes.SlotBooking.controller;


import com.praveen.codes.SlotBooking.model.MasterSlot;
import com.praveen.codes.SlotBooking.service.MasterSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/master_slot")
@CrossOrigin
public class MasterSlotController {
    @Autowired
    private MasterSlotService masterSlotService;
    @PostMapping("/addSlot")
    public String addSlot(@RequestBody MasterSlot masterSlot) {
        masterSlotService.saveMasterSlot(masterSlot);
        return "new Slot is added";
    }
    @GetMapping("/getAllSlot")
    public List<MasterSlot> getAllMasterSlot() {
        return masterSlotService.getAllMasterSlot();
    }

    @GetMapping("/getAvailableSlots")
    public List<MasterSlot> getAvailableSlotsByCourseId(@RequestParam String courseId) {
        return masterSlotService.getAvailableSlotsByCourseId(courseId);
    }

}