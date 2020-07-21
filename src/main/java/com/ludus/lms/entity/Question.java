package com.ludus.lms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int points;
    @Enumerated(EnumType.STRING)
    private QuestionType questionType;

    private String moduleName;
    private int numberOfBlank;

    @ElementCollection
    @CollectionTable(name= "question_correctAnswer",
    joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "correctAnswer")
    private List<String> correctAnswers = new ArrayList<>();
    @ElementCollection
    @CollectionTable(name= "question_incorrectAnswer",
            joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "incorrectAnswer")
    private List<String> incorrectAnswers = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getNumberOfBlank() {
        return numberOfBlank;
    }

    public void setNumberOfBlank(int numberOfBlank) {
        this.numberOfBlank = numberOfBlank;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(List<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }
}
