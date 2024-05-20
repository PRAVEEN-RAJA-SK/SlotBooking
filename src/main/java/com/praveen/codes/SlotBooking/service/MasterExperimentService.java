package com.praveen.codes.SlotBooking.service;

import com.praveen.codes.SlotBooking.model.MasterExperiment;

import java.util.List;

public interface MasterExperimentService {
    public MasterExperiment saveMasterExperiment(MasterExperiment masterExperiment);

    public List<MasterExperiment> getAllMasterExperiment();

    public List<MasterExperiment> getExperimentsByCourseId(int courseId);
}
