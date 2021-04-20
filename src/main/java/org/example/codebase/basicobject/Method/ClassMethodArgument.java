package org.example.codebase.basicobject.Method;

public class ClassMethodArgument {
    public static void main(String[] args) {
        PersonArgument personArgument = new PersonArgument();
        personArgument.setNameAndAge("小明", 18);
        personArgument.getNameAndAge();
    }
}

class PersonArgument {
    private String name;
    private int age;

    public void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getNameAndAge() {
        System.out.printf("%s今年%d岁了", this.name, this.age);
    }
}