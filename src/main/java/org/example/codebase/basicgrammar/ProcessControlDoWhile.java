package org.example.codebase.basicgrammar;

public class ProcessControlDoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        do {
            sum = sum + n;
            n++;
        } while (n <= 100);
        System.out.println(sum);

        DoWhileMN();
    }

    private static void DoWhileMN() {
        int sum = 0;
        int m = 20;
        int n = 100;
        do {
            sum += m++;
        } while (m <= n);
        System.out.println(sum);
    }
}
