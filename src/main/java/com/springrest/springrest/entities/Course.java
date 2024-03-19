package com.springrest.springrest.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @jakarta.persistence.Id
    private  long Id;
    private  String title;
    private  String description;

    public Course(long id, String title, String description) {
        this.Id = id;
        this.title = title;
        this.description = description;
    }

    public Course() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + Id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
