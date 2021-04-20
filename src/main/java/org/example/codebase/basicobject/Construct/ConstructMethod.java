package org.example.codebase.basicobject.Construct;

public class ConstructMethod {
    public static void main(String[] args) {
        Person p = new Person("小明", 18);
        System.out.printf("%s今年已经%d岁了!", p.getName(), p.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}