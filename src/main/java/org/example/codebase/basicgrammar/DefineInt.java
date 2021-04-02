package org.example.codebase.basicgrammar;

public class DefineInt {
    public static void main(String[] args) {
        byte b1 = 0b1111111;
        byte b2 = -128;
        short s1 = 32767;
        short s2 = -32768;
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i3);
        System.out.println(i5);
        System.out.println(l);
    }
}