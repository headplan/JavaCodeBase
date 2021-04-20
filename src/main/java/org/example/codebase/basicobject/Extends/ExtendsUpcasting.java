package org.example.codebase.basicobject.Extends;

public class ExtendsUpcasting {
    public static void main(String[] args) {
        StudentTwo s = new StudentTwo("小明", 18, 100);
        PersonTwo p = s; //upcasting,ok
        Object o1 = p; // upcasting,ok
        Object o2 = s; // upcasting,ok
        System.out.println(s);
        System.out.println(p);
        System.out.println(o1);
        System.out.println(o2);
    }
}

class PersonTwo {
    protected String name;
    protected int age;

    public PersonTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentTwo extends PersonTwo {
    protected int score;

    public StudentTwo(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public void getAll() {
        System.out.printf("%s今年%d岁了,考试成绩是:%d", this.name, this.age, this.score);
    }
}