package org.example.codebase.basicobject.Extends;

public class ExtendsTest {
    public static void main(String[] args) {
        PersonTest p = new PersonTest("小明", 12);
        StudentTest s = new StudentTest("小红", 20, 99);
        // TODO:定义PrimaryStudent,从Student继承,新增grade字段
        StudentTest ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
    }
}

class PersonTest {
    protected String name;
    protected int age;

    public PersonTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class StudentTest extends PersonTest {
    protected int score;

    public StudentTest(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

class PrimaryStudent extends StudentTest {
    protected int grade;

    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }
}