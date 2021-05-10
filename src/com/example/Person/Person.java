package com.example.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private String gender;
    private List<String> interests = new ArrayList<>();


    public Person(String nm, int ag, String gen, List<String> intrst){
        this.name = nm;
        this.age = ag;
        this.gender = gen;
        this.interests = intrst;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getInterests() {
        return interests;
    }


    private  String hello(){
        String interestList = interests.get(0);
        int count = interests.toArray().length;
        for(int i = 1; i < count;i++){
            if(i == count - 1){
                interestList = interestList + " and " +  interests.get(i);
            }
            else {
                interestList = interestList + ", " + interests.get(i);
            }
        }
        return ("Hello, my name is " + name + " and I am "+ age +" years old. My interests are " + interestList +".");
    }

    public static void main(String[] args){
        Person person = new Person( "Ryan",30,"male",Arrays.asList(new String[]{"being a hardarse", "agile", "ssd hard drives", "Video Games", "Sports"}));
        String greeting = person.hello();
        System.out.println(greeting);

    }


}
