package com.mahmutsat.model;

public class Staff {
    private String name;

    public void greeting(String message){
        System.out.println("Greeting : " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
