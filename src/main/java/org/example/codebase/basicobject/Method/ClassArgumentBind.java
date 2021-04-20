package org.example.codebase.basicobject.Method;

public class ClassArgumentBind {
    public static void main(String[] args) {
        PersonBind p = new PersonBind();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 还是15

        String[] fullName = new String[] { "Homer", "Simpson" };
        p.setName(fullName); // 传入fullName数组
        System.out.println(p.getName()); // "Homer Simpson"
        fullName[0] = "Bart"; // fullName数组的第一个元素修改为"Bart"
        System.out.println(p.getName()); // "Homer Simpson"还是"Bart Simpson"?

        String bob = "Bob";
        p.setSmallName(bob); // 传入bob变量
        System.out.println(p.getSmallName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p.getSmallName()); // "Bob"还是"Alice"?
    }
}

class PersonBind {
    private int age;
    private String[] name;
    private String smallName;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String getSmallName() {
        return smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }
}