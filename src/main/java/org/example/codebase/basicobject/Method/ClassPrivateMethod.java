package org.example.codebase.basicobject.Method;

public class ClassPrivateMethod {
    public static void main(String[] args) {
        PersonTwo ming = new PersonTwo();
        ming.setBirth(2003);
        System.out.println(ming.getAge());
    }
}

class PersonTwo {
    private String name;
    private int birth;

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2021); // 调用private方法
    }

    // private方法
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}