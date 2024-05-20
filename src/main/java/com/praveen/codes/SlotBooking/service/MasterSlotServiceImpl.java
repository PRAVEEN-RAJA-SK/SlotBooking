package com.praveen.codes.SlotBooking.service;

import com.praveen.codes.SlotBooking.model.MasterSlot;
import com.praveen.codes.SlotBooking.repository.MasterSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MasterSlotServiceImpl implements  MasterSlotService{
    @Autowired
    private MasterSlotRepository masterSlotRepository;


    @Override
    public MasterSlot saveMasterSlot(MasterSlot masterSlot) {
        return masterSlotRepository.save(masterSlot);
    }
    @Override
    public List<MasterSlot> getAllMasterSlot() {
        return masterSlotRepository.findAll();
    }
    @Override
    public List<MasterSlot> getAvailableSlots() {
        // Assuming you have a method in your repository to fetch available slots
        return masterSlotRepository.findByAvailable(true);
    }
    @Override
    public List<MasterSlot> getAvailableSlotsByCourseId(String courseId) {
        return masterSlotRepository.findByCourseIdAndAvailable(courseId, true);
    }

}
