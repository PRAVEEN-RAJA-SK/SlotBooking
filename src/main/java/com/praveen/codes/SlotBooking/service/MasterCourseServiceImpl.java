package com.praveen.codes.SlotBooking.service;

import com.praveen.codes.SlotBooking.model.MasterCourse;
import com.praveen.codes.SlotBooking.repository.MasterCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterCourseServiceImpl implements  MasterCourseService{

    @Autowired
    private  MasterCourseRepository masterCourseRepository;
    @Override
    public MasterCourse saveMasterCourse(MasterCourse masterCourse) {
      return  masterCourseRepository.save(masterCourse);
    }

    @Override
    public List<MasterCourse> getAllMasterCourse() {
        return masterCourseRepository.findAll();
    }
}
