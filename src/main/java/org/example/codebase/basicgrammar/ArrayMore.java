package org.example.codebase.basicgrammar;

import java.util.Arrays;

public class ArrayMore {
    public static void main(String[] args) {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(ns.length);
        ArrayPrint();
        ArrayFuncPrint();
        ArrayAvgScore();
    }

    private static void ArrayPrint() {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.println(n);
            }
        }
    }

    private static void ArrayFuncPrint() {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(ns));
    }

    private static void ArrayAvgScore() {
        int[][] scores = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85},
        };
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            int[] ns = scores[i];
            for (int j = 0; j < ns.length; j++) {
                int x = ns[j];
                sum += x;
            }
        }
        double average = 0;
        average = sum / (scores[0].length * scores.length);
        System.out.println(average);

        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
