package org.example.codebase.basicobject.Overload;

public class OverloadTest {
    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("XiaoMing");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + lastName;
    }
}
