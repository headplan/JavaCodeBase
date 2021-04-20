package org.example.codebase.basicobject.Method;

public class ClassThisObject {
    public static void main(String[] args) {
        PersonThis personThis = new PersonThis();
        personThis.setName();
        personThis.setAge();
        System.out.println(personThis.name);
        System.out.println(personThis.age);
    }
}

class PersonThis {
    public String name;
    public int age;

    public void setName() {
        name = "小明";
    }

    public void setAge() {
        this.age = 18;
    }
}