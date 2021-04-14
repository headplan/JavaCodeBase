package org.example.codebase.basicgrammar;

import java.util.Arrays;

public class ArrayHandleForEach {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = 0; i < ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }
        ArrayForEach();
        ArrayToString();
        ArrayForDesc();
    }

    private static void ArrayForEach() {
        int[] ns = {1, 4, 9, 16, 25};
        for (int n : ns) {
            System.out.println(n);
        }
    }

    private static void ArrayToString() {
        int[] ns = {1, 1, 2, 3, 5, 8};
        System.out.println(Arrays.toString(ns));
    }

    private static void ArrayForDesc() {
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = ns.length - 1; i >= 0; i--) {
            System.out.println(ns[i]);
        }
    }
}
