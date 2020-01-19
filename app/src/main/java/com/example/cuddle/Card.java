package com.example.cuddle;

public class Card {

    private String userId;
    private String name;

    public Card(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userID) {
        this.userId = userId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

