package com.ludus.lms.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Video {
    private String title;
    private String url;
    private String completionRatio;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCompletionRatio() {
        return completionRatio;
    }

    public void setCompletionRatio(String completionRatio) {
        this.completionRatio = completionRatio;
    }
}
