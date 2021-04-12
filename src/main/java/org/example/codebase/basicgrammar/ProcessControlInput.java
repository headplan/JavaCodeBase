package org.example.codebase.basicgrammar;

import java.util.Scanner;

public class ProcessControlInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi%s,你今年%d了\n", name, age); // 格式化输出
    }
}
