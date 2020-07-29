package com.ludus.lms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class SubCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Course course;
    private IntroVideo introVideo;
    private LectureVideo lectureVideo;
    private List<ExpertVideo> expertVideos;
    private List<ExternalReading> externalReadings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public IntroVideo getIntroVideo() {
        return introVideo;
    }

    public void setIntroVideo(IntroVideo introVideo) {
        this.introVideo = introVideo;
    }

    public LectureVideo getLectureVideo() {
        return lectureVideo;
    }

    public void setLectureVideo(LectureVideo lectureVideo) {
        this.lectureVideo = lectureVideo;
    }

    public List<ExpertVideo> getExpertVideos() {
        return expertVideos;
    }

    public void setExpertVideos(List<ExpertVideo> expertVideos) {
        this.expertVideos = expertVideos;
    }

    public List<ExternalReading> getExternalReadings() {
        return externalReadings;
    }

    public void setExternalReadings(List<ExternalReading> externalReadings) {
        this.externalReadings = externalReadings;
    }

}
