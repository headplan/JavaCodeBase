package org.example.codebase.basicobject;

public class ClassAndInstance {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.name = "小明";
        ming.age = 18;
        System.out.printf("%s今年%d岁了\n", ming.name, ming.age);
        Person hong = new Person();
        hong.name = "小红";
        hong.age = 17;
        System.out.printf("%s今年%d岁了\n", hong.name, hong.age);

        CityPrint();
    }

    private static void CityPrint() {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
    }
}

class Person {
    public String name;
    public int age;
}

class City {
    public String name;
    public double latitude;
    public double longitude;
}