package com.praveen.codes.SlotBooking.repository;

import com.praveen.codes.SlotBooking.model.MasterCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterCourseRepository extends JpaRepository<MasterCourse,Integer> {
}
