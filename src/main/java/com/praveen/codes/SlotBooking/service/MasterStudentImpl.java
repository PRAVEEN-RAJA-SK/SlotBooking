package com.praveen.codes.SlotBooking.service;

import com.praveen.codes.SlotBooking.model.MasterStudent;
import com.praveen.codes.SlotBooking.repository.MasterStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterStudentImpl implements  MasterStudentService{

    @Autowired
   private MasterStudentRepository masterStudentRepository;

    @Override
    public List<MasterStudent> getAllMasterStudent() {
        return  masterStudentRepository.findAll();
    }
    @Override
    public MasterStudent saveMasterStudent(MasterStudent masterStudent) {
        return masterStudentRepository.save(masterStudent);
    }
}
