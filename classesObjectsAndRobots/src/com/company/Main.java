package com.company;

public class Main {

    public static void main(String[] args) {

//        Robot r1 = new Robot();
//        r1.name = "Tom";
//        r1.color = "red";
//        r1.weight = 30;
//
//        Robot r2 = new Robot();
//        r2.name = "Jerry";
//        r2.color = "blue";
//        r2.weight = 40;

        Robot r1 = new Robot("Tom", "red", 30);
        Robot r2 = new Robot("Jerry", "blue", 40);

        r1.introduceSelf();
        r2.introduceSelf();

        r1.lookingAt = r2;
        r2.lookingAt = r1;

        Person p1 = new Person("Alice", "aggresive", false);
        Person p2 = new Person("Becky", "talkative", true);

        p1.robotOwned = r2;
        p2.robotOwned = r1;

        p1.robotOwned.introduceSelf();
        p2.robotOwned.introduceSelf();

    }
}
