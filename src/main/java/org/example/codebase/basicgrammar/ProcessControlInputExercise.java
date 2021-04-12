package org.example.codebase.basicgrammar;

import java.util.Scanner;

public class ProcessControlInputExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入上次考试成绩:");
        int r1 = scanner.nextInt();
        System.out.println("输入本次考试成绩:");
        int r2 = scanner.nextInt();
        double r = (double) (r2-r1)/100 * 100;
        System.out.printf("成绩提高的百分比:%.2f%%", r);
    }
}