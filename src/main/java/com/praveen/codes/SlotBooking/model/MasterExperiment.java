package com.praveen.codes.SlotBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MasterExperiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int courseId;
    private int experimentNumber;
    private String experimentTitle;
    private String experimentDescription;
    private String materialLink;

    public MasterExperiment() {

    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getExperimentNumber() {
        return experimentNumber;
    }

    public void setExperimentNumber(int experimentNumber) {
        this.experimentNumber = experimentNumber;
    }

    public String getExperimentTitle() {
        return experimentTitle;
    }

    public void setExperimentTitle(String experimentTitle) {
        this.experimentTitle = experimentTitle;
    }

    public String getExperimentDescription() {
        return experimentDescription;
    }

    public void setExperimentDescription(String experimentDescription) {
        this.experimentDescription = experimentDescription;
    }

    public String getMaterialLink() {
        return materialLink;
    }
    public void setMaterialLink(String materialLink) {
        this.materialLink = materialLink;
    }
}
