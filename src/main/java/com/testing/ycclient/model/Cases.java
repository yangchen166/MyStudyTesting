package com.testing.ycclient.model;

public class Cases {

    private String id;
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
//        Object o=new Object();
//        o.toString();
        return id+":"+name;
    }
}
