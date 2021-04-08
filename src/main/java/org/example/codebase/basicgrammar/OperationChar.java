package org.example.codebase.basicgrammar;

public class OperationChar {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);
        int n1 = 'A';
        int n2 = '中';
        System.out.println(n1);
        System.out.println(n2);
        char c3 = '\u0041';
        char c4 = '\u4e2d';
        System.out.println(c3);
        System.out.println(c4);

        String s = ""; // 空字符串,包含0个字符
        String s1 = "A"; // 包含一个字符
        String s2 = "ABC"; // 包含3个字符
        String s3 = "中文 ABC"; // 包含6个字符,其中有一个空格
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String v1 = "abc\"xyz"; // 包含7个字符
        String v2 = "abc\\xyz"; // 包含7个字符
        String v3 = "ABC\n\u4e2d\u6587"; // 包含6个字符
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        StringJoin();
        StringJoinOtherType();
        StringNull();
        StringUnicode();
    }

    private static void StringJoin() {
        String s1 = "Hello";
        String s2 = "world";
        String s = s1 + " " + s2 + "!";
        System.out.println(s);
    }

    private static void StringJoinOtherType() {
        int age = 25;
        String s = "age is " + age;
        System.out.println(s);
    }

    private static void StringNull() {
        String s1 = null; // s1是null
        String s2 = s1; // s2也是null
        String s3 = ""; // s3指向空字符串,不是null

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("=====");
    }

    private static void StringUnicode() {
        int a = 72;
        int b = 105;
        int c = 65281;
        String s = "" + (char) a + (char) b + (char) c;
        System.out.println(s);
    }
}
