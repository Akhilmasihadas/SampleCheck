package com.orgname.testing.sampleprograms;

public class Main {
  String name;
  int age;

    public Main (String name, int age) {
        this.name = name;
        this.age = age;
        }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}