package com.ludus.lms.entity;

import com.ludus.lms.entity.Course;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SubCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Course course;
    private IntroVideo introVideo;
    private LectureVideo lectureVideo;
    private ExpertVideo expertVideo;
    private Reading reading;

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

    public ExpertVideo getExpertVideo() {
        return expertVideo;
    }

    public void setExpertVideo(ExpertVideo expertVideo) {
        this.expertVideo = expertVideo;
    }

    public Reading getReading() {
        return reading;
    }

    public void setReading(Reading reading) {
        this.reading = reading;
    }
}
