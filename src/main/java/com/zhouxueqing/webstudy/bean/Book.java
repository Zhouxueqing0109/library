package com.zhouxueqing.webstudy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private String author;
    private String sort;
    private String description;

    public Book(String name, String author, String description) {

    }
}