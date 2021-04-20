package org.example.codebase.basicobject.Extends;

public class ExtendsClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("小明");
        s.setAge(18);
        s.setScore(100);
        System.out.printf("%s今年%d岁了.考试成绩是:%d",s.getName(),s.getAge(),s.getScore());
    }
}

class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}