package org.example.codebase.basicgrammar;

import java.util.Scanner;

public class ProcessControlIf {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 60) {
            System.out.println("及格了");
            System.out.println("恭喜你");
        }
        System.out.println("END");
        SimpleIf();
        ElseIf();
        ElseIfElse();
        IfBorder();
        IfReferenceObject();
        IfEqualsReferenceObject();
        IfEqualsReferenceObjectNullPointerException();
        IfBMI();
    }

    private static void SimpleIf() {
        int n = 70;
        if (n >= 60)
            System.out.println("及格了");
        System.out.println("END");
    }

    private static void ElseIf() {
        int n = 70;
        if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
    }

    private static void ElseIfElse() {
        int n = 70;
        if (n >= 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
    }

    private static void IfBorder() {
        double x = 1 - 9.0 / 10;
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }
    }

    private static void IfReferenceObject() {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
    }

    private static void IfEqualsReferenceObject() {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }

    private static void IfEqualsReferenceObjectNullPointerException() {
        String s1 = null;
        if (s1 != null && s1.equals("hello")) {
            System.out.println("hello");
        }
    }

    /**
     * BMI = 体重(kg)除以身高(m)的平方
     */
    private static void IfBMI() {
        String[] t = {
                "过轻：低于18.5",
                "正常：18.5-25",
                "过重：25-28",
                "肥胖：28-32",
                "非常肥胖：高于32"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("您的体重是(kg):");
        double w = scanner.nextDouble();
        System.out.println("您的身高是(m):");
        double h = scanner.nextDouble();
        double BMI = w / (h * h);
        int k = 0;
        if (BMI < 18.5) {
            k = 0;
        } else if (BMI < 25) {
            k = 1;
        } else if (BMI < 28) {
            k = 2;
        } else if (BMI < 32) {
            k = 3;
        } else {
            k = 4;
        }
        System.out.println(t[k]);
    }
}
