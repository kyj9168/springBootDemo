package com.example.demo.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDto {
    private int id;
    private String title;
    private String contents;
    private String writer;
    private LocalDateTime created_date;
    private LocalDateTime update_date;
}
