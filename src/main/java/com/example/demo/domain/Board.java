package com.example.demo.domain;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "title")
    private String title;
    @Column(name = "contents")
    private String contents;
    @Column(name = "writer")
    private String writer;
    @Column(name = "created_date")
    private LocalDateTime created_date;
    @Column(name = "update_date")
    private LocalDateTime update_date;
}
