package com.example.magicalgirls.model;

public class MagicalGirl {

    private Long id;
    private String name;
    private String power;

    public MagicalGirl(Long id, String name, String power) {
        this.id = id;
        this.name = name;
        this.power = power;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }
}
