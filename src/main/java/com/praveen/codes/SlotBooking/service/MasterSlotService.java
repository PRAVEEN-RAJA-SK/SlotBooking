package com.praveen.codes.SlotBooking.service;
import java.util.List;
import com.praveen.codes.SlotBooking.model.MasterSlot;

public  interface MasterSlotService  {
    public MasterSlot saveMasterSlot(MasterSlot masterSlot);
    public  List<MasterSlot> getAllMasterSlot();
    List<MasterSlot> getAvailableSlots();
    List<MasterSlot> getAvailableSlotsByCourseId(String courseId);
}

