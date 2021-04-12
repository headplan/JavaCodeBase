package org.example.codebase.basicgrammar;

public class ProcessControlFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        ForArrayInt();
        ForArrayIntRadix();
        ForEachArrayInt();
        ForClass1();
        ForClass2();
        ForClass3();
    }

    private static void ForArrayInt() {
        int[] ns = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int i = 0; i < ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum += ns[i];
        }
        System.out.println(sum);
    }

    private static void ForArrayIntRadix() {
        int[] ns = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int i = 1; i < ns.length; i = i + 2) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum += ns[i];
        }
        System.out.println(sum);
    }

    private static void ForEachArrayInt() {
        int[] ns = {1, 4, 9, 16, 25};
        for (int n : ns) {
            System.out.println(n);
        }
    }

    private static void ForClass1() {
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = ns.length - 1; i >= 0; i--) {
            System.out.println(ns[i]);
        }
    }

    private static void ForClass2() {
        int[] ns = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int n : ns) {
            sum += n;
        }
        System.out.println(sum);
    }

    private static void ForClass3() {
        double pi = 0;
        int flag = 1;
        for (int i = 1; i < 10000000; i = i + 2) {
            pi = pi + flag * (1.0 / i);
            flag = -flag;
        }
        pi = 4 * pi;
        System.out.println(pi);
    }
}
