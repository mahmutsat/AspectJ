package com.mahmutsat.model;

public class Staff {
    private String name;

    public String greeting(String message){
        System.out.println("Greeting : " + message);
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
