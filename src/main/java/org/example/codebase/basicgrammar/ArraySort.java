package org.example.codebase.basicgrammar;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
        ArrayFuncSort();
        ArrayFuncSortDesc();
    }

    private static void ArrayFuncSort() {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }

    private static void ArrayFuncSortDesc() {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println(Arrays.toString(ns));
        for (int i = ns.length; i > 0; i--) {
            for (int j = ns.length - i; j > 0; j--) {
                if (ns[j] > ns[j - 1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j - 1];
                    ns[j - 1] = tmp;
                }
            }
        }
        // 排序后
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
