package com.pluralsight.models;

public class Film {
    private int id;
    private String title;

    // No-argument constructor
    public Film() {
    }

    // Constructor with arguments
    public Film(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}