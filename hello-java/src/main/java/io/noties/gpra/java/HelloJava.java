package io.noties.gpra.java;

public abstract class HelloJava {

    public static void saySomething() {
        System.out.printf("Hello %s!%n", "Java");
    }

    private HelloJava() {
    }
}