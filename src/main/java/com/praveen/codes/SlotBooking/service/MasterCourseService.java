package com.praveen.codes.SlotBooking.service;

import com.praveen.codes.SlotBooking.model.MasterCourse;

import java.util.List;

public interface MasterCourseService {
    public MasterCourse saveMasterCourse(MasterCourse masterCourse);
    public List<MasterCourse> getAllMasterCourse();
}
