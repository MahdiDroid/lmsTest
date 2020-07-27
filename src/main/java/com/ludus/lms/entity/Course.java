package com.ludus.lms.entity;

import javax.persistence.Column;

public class Course {

    private String name ;
    @Column(unique = true)
    private int order;
    private int score ;
    private SubCourse subCourse;

}
