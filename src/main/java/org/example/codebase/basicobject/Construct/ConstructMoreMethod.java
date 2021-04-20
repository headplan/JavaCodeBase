package org.example.codebase.basicobject.Construct;

public class ConstructMoreMethod {
    public static void main(String[] args) {
        PersonMore p = new PersonMore();
        System.out.println(p.getName());
        System.out.println(p.getAge());

        PersonMore p1 = new PersonMore("小明");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        PersonMore p2 = new PersonMore("小红", 18);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }
}

class PersonMore {
    private String name;
    private int age;

    public PersonMore(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonMore(String name) {
        this.name = name;
        this.age = 12;
    }

    public PersonMore() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
