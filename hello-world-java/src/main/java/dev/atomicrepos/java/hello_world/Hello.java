package dev.atomicrepos.java.hello_world;

public class Hello {
    public static void main(String[] args) {
        System.out.println(new Hello().sayHello());
    }

    public String sayHello() {
        return "Hello, World!";
    }
}
