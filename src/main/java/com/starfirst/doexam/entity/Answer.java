package com.starfirst.doexam.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "answers")
public class Answer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "sort")
    private int sort;
    @Basic
    @Column(name = "text")
    private String text;
    @Basic
    @Column(name = "question_id")
    private Integer questionId;
    @Column(name = "author_id")
    int authorId;
}
