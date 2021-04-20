package org.example.codebase.basicobject.Method;

public class ClassMethod {
    public static void main(String[] args) {
        PersonOne ming = new PersonOne();
        ming.setName("小明");
        ming.setAge(18);
        System.out.printf("%s今年%d岁了", ming.getName(), ming.getAge());
    }
}

class PersonOne {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); // 去掉首尾空格
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}