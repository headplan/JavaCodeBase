package org.example.codebase.basicobject.Overload;

class OverloadHello {
    public static void main(String[] args) {
        HelloTest h = new HelloTest();
        h.hello();
        h.hello("小明");
        h.hello("小明", 17);
    }
}

class HelloTest {
    public void hello() {
        System.out.println("Hello, world!");
    }

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}