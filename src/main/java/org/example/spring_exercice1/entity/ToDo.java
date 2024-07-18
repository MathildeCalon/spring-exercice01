package org.example.spring_exercice1.entity;

public class ToDo {
    private String name;
    private String description;
    private boolean isDone;

    public ToDo(String name, String description, boolean isDone) {
        this.name = name;
        this.description = description;
        this.isDone = isDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setState(boolean isDone) {
        this.isDone = isDone;
    }
}
