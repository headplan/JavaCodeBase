package org.example.codebase.basicobject.Extends;

public class ExtendsSuper {
    public static void main(String[] args) {
        StudentOne s = new StudentOne("小明", 12, 89);
        s.getAll();
    }
}

class PersonOne {
    protected String name;
    protected int age;

    public PersonOne(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentOne extends PersonOne {
    protected int score;

    public StudentOne(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public void getAll() {
        System.out.printf("%s今年%d岁了,考试成绩是:%d", this.name, this.age, this.score);
    }
}