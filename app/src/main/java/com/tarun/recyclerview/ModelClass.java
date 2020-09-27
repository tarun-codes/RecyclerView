package com.tarun.recyclerview;

public class ModelClass {

   private int imgResource;
   private String username;
   private String name;

    ModelClass(int imgResource, String username, String name){
        this.imgResource = imgResource;
        this.username = username;
        this.name = name;
    }

    public int getImgResource() {
        return imgResource;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
