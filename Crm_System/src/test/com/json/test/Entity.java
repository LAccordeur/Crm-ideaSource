package com.json.test;

/**
 * Created by HeathHose on 2016/8/4.
 */
public class Entity {
    int id;
    String name;

//    @Override
//    public String toString() {
//        return "com.json.test.Entity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
