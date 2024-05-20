package com.praveen.codes.SlotBooking.service;

import com.praveen.codes.SlotBooking.model.MasterStudent;

import java.util.List;

public interface MasterStudentService {
    public MasterStudent saveMasterStudent(MasterStudent masterStudent);
    public List<MasterStudent> getAllMasterStudent();
}
