package com.company;

import java.util.Objects;

public class Book {
    private int id;
    private static int nextId = 1;
    private String name;
    private String author;

    public Book() {
        id = nextId;
        nextId++;
    }

    public Book(String name, String author) {
        this();
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
