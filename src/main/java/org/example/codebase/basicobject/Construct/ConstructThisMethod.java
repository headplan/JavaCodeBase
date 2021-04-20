package org.example.codebase.basicobject.Construct;

public class ConstructThisMethod {
    public static void main(String[] args) {
        PersonThis p = new PersonThis();
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class PersonThis {
    private String name;
    private int age;

    public PersonThis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonThis(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public PersonThis() {
        this("小明", 18); // 调用另一个构造方法Person(String)
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}