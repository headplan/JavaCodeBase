package org.example.codebase.basicgrammar;

public class ProcessControlWhile {
    public static void main(String[] args) {
        int sum = 0; // 累加的和,初始化为0
        int n = 1;
        while (n <= 100) { // 循环条件是n <= 100
            sum = sum + n; // 把n累加到sum中
            n++; // n自身加1
        }
        System.out.println(sum); // 5050
        While2Plus();
        WhileDie();
        WhileMN();
    }

    private static void While2Plus() {
        int sum = 0;
        int n = 0;
        while (n <= 100) {
            n++;
            sum = sum + n;
        }
        System.out.println(sum);
    }

    private static void WhileDie() {
        int sum = 0;
        int n = 1;
        while (n > 0) {
            sum = sum + n;
            n++;
        }
        System.out.println(n); // -2147483648
        System.out.println(sum);
    }

    private static void WhileMN() {
        int sum = 0;
        int m = 20;
        int n = 100;
        while (m <= n) {
            sum += m++;
        }
        System.out.println(m);
        System.out.println(sum);
    }
}
