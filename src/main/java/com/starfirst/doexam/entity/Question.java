package com.starfirst.doexam.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "title")
    String title;
    @Column(name = "category_id")
    int categoryId;
    @Column(name = "author_id")
    int authorId;
}
