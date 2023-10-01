package com.driver;
//comment
public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "Khalid";
        //error - The field RWOnly.name is not visibleJava(33554503)

        obj.setName("Khalid");
        System.out.println(obj.getName());
    }

}