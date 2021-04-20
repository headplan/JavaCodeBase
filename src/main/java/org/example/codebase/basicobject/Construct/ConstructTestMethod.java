package org.example.codebase.basicobject.Construct;

public class ConstructTestMethod {
    public static void main(String[] args) {
        PersonTest ming = new PersonTest("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}

class PersonTest {
    private String name;
    private int age;

    public PersonTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}