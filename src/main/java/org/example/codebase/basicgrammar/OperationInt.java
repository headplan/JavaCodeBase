package org.example.codebase.basicgrammar;

public class OperationInt {
    public static void main(String[] args) {
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);
        int x = 167776589; // 00001010 00000000 00010001 01001101
        int y = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(x & y); // 167776512
        IntOverflow();
        LongOverflow();
        OperationSimple();
        OperationIncDec();
        OperationDispLeft();
        OperationDispRight();
        OperationDispRightMinus();
        OperationDispRightInvariant();
        OperationBitwiseAnd();
        OperationBitwiseOr();
        OperationBitwiseNot();
        OperationBitwiseXor();
        TypeConversion();
        TypeConversionMust();
        OperationIntMath(100);
    }

    private static void IntOverflow() {
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
    }

    private static void LongOverflow() {
        long x = 2147483640;
        long y = 15;
        long sum = x + y;
        System.out.println(sum);
    }

    private static void OperationSimple() {
        int x = 100;
        x += 100;
        int y = 100;
        y -= 100;
        System.out.println(x);
        System.out.println(y);
    }

    private static void OperationIncDec() {
        int n = 3000;
        n++;
        n--;
        int y = 100 + (++n);
        System.out.println(y);
    }

    private static void OperationDispLeft() {
        int n = 7;
        int a = n << 1;
        int b = n << 2;
        int c = n << 28;
        int d = n << 29;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    private static void OperationDispRight() {
        int n = 7;
        int a = n >> 1;
        int b = n >> 2;
        int c = n >> 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void OperationDispRightMinus() {
        int n = -536870912;
        int a = n >> 1;
        int b = n >> 2;
        int c = n >> 28;
        int d = n >> 29;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    private static void OperationDispRightInvariant() {
        int n = -536870912;
        int a = n >>> 1;
        int b = n >>> 2;
        int c = n >>> 29;
        int d = n >>> 31;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    private static void OperationBitwiseAnd() {
        int n = 0 & 0; // 0
        System.out.println(n);
        n = 0 & 1; // 0
        System.out.println(n);
        n = 1 & 0; // 0
        System.out.println(n);
        n = 1 & 1; // 1
        System.out.println(n);
    }

    private static void OperationBitwiseOr() {
        int n = 0 | 0; // 0
        System.out.println(n);
        n = 0 | 1; // 1
        System.out.println(n);
        n = 1 | 0; // 1
        System.out.println(n);
        n = 1 | 1; // 1
        System.out.println(n);
    }

    private static void OperationBitwiseNot() {
        int t = ~-2; // 1
        System.out.println(t);
        int n = ~-1; // 0
        System.out.println(n);
    }

    private static void OperationBitwiseXor() {
        int n = 0 ^ 0; // 0
        System.out.println(n);
        n = 0 ^ 1; // 1
        System.out.println(n);
        n = 1 ^ 0; // 1
        System.out.println(n);
        n = 1 ^ 1; // 0
        System.out.println(n);
    }

    private static void TypeConversion() {
        short s = 1234;
        int i = 123456;
        int x = s + i; // s自动转型为int
        short y = (short) (s + i);
        System.out.println(x);
        System.out.println(y);
    }

    private static void TypeConversionMust() {
        int i1 = 1234567;
        short s1 = (short) i1; // -10617
        System.out.println(s1);
        int i2 = 12345678;
        short s2 = (short) i2; // 24910
        System.out.println(s2);
    }

    private static void OperationIntMath(int n) {
        int sum = ((1 + n) * n) / 2;
        System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }
}