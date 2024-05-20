package com.praveen.codes.SlotBooking.service;

import com.praveen.codes.SlotBooking.model.MasterExperiment;
import com.praveen.codes.SlotBooking.repository.MasterExperimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterExperimentImpl implements  MasterExperimentService{
    @Autowired
    private MasterExperimentRepository masterExperimentRepository;
    @Override
    public MasterExperiment saveMasterExperiment(MasterExperiment masterExperiment) {
       return masterExperimentRepository.save(masterExperiment);
    }
    @Override
    public List<MasterExperiment> getAllMasterExperiment() {
        return masterExperimentRepository.findAll();
    }

    @Override
    public List<MasterExperiment> getExperimentsByCourseId(int courseId) {
        return masterExperimentRepository.findByCourseId(courseId);
    }
}
