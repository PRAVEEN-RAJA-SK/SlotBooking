package com.praveen.codes.SlotBooking.repository;

import com.praveen.codes.SlotBooking.model.MasterExperiment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterExperimentRepository extends JpaRepository<MasterExperiment,Integer> {
    List<MasterExperiment> findByCourseId(int courseId);
}
