package org.example.codebase.basicgrammar;

public class ProcessControlOutput {
    public static void main(String[] args) {
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意,两个%占位符必须传入两个数
    }
}
