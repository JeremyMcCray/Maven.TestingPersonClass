package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private Boolean zipCoder;

    public Person(String name, int age, int height, int weight, Boolean zipCoder){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.zipCoder =zipCoder;

    }

    public Person() {
        age=Integer.MAX_VALUE;
        name ="";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name=name;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getWeight(){
        return weight;

    }

    public Boolean getZipCoder() {
        return zipCoder;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setZipCoder(Boolean zipCoder) {
        this.zipCoder = zipCoder;
    }
}
