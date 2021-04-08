package org.example.codebase.basicgrammar;

public class OperationDouble {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println(x);
        System.out.println(y);
        DoubleCompare(x, y);
        TypePromote();
        DoubleOverflow();
        DoubleConversionInt();
        DoubleRound();
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        OperationDoubleMath(a, b, c);
    }

    private static void DoubleCompare(double x, double y) {
        double r = Math.abs(x - y);
        if (r < 0.00001) {
            System.out.println("可以认为相等");
        } else {
            System.out.println("不相等");
        }
    }

    private static void TypePromote() {
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        double e = 1.2 + 24 / 5; // 5.2
        System.out.println(d);
        System.out.println(e);
    }

    private static void DoubleOverflow() {
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    private static void DoubleConversionInt() {
        int n1 = (int) 12.3; // 12
        int n2 = (int) 12.7; // 12
        int n3 = (int) -12.7; // -12
        int n4 = (int) (12.7 + 0.5); // 13
        int n5 = (int) 1.2e20; // 2147483647
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }

    private static void DoubleRound() {
        double d = 2.6;
        int n = (int) (d + 0.5);
        System.out.println(n);
    }

    private static void OperationDoubleMath(double a, double b, double c) {
        // 求平方根可用 Math.sqrt
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        // 计算方程的两个根
        double r1 = (-b + sqrt) / (2 * a);
        double r2 = (-b - sqrt) / (2 * a);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}

