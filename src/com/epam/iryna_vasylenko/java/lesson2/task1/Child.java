package com.epam.iryna_vasylenko.java.lesson2.task1;

public class Child {
    String name;
    protected int age;
    String ageGroup;

    public Child(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void ageDistribution(){

        if(age > 1 && age < 3){
            ageGroup = "Small child";
        }
        else if(age >= 3 && age < 6){
            ageGroup = "Middle child";
        }
        else if(age >=6 && age < 10){
            ageGroup = "Big child ";
        }
        else{
            ageGroup = "Unknown";
        }
    }



    @Override
    public String toString() {
        return "Name: " + name + "   Age: " + age + "   Group: " + ageGroup;
    }
}