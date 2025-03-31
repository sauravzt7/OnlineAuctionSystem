package com.machinecoding.models;

public abstract class User {

    private String id;

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

}
