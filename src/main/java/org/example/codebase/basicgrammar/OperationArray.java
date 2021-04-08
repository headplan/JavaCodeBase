package org.example.codebase.basicgrammar;

import java.util.Arrays;

public class OperationArray {
    public static void main(String[] args) {
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println(Arrays.toString(ns));
        ArrayLength();
        ArrayInit();
        ArrayInitSimple();
        ArrayString();
        ArrayStringValue();
    }

    private static void ArrayLength() {
        int[] ns = new int[5];
        System.out.println(ns.length);
    }

    private static void ArrayInit() {
        int[] ns = new int[]{68, 79, 91, 85, 62};
        System.out.println(ns.length);
    }

    private static void ArrayInitSimple() {
        int[] ns = {68, 79, 91, 85, 62};
        System.out.println(ns.length);
    }

    private static void ArrayString() {
        String[] names = {
                "ABC", "XYZ", "zoo"
        };
        System.out.println(Arrays.toString(names));
    }

    private static void ArrayStringValue() {
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"
    }
}