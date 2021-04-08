package org.example.codebase.basicgrammar;

public class OperationBool {
    public static void main(String[] args) {
        boolean isGreater = 5 > 3; // true
        int age = 12;
        boolean isZero = age == 0; // false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age >6 && age <18; // true
        System.out.println(isGreater);
        System.out.println(isZero);
        System.out.println(isNonZero);
        System.out.println(isAdult);
        System.out.println(isTeenager);
        ShortOperation();
        TernaryOperator();
        AgeBool();
    }

    private static void ShortOperation() {
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);
    }

    private static void TernaryOperator() {
        int n = -100;
        int x = n >= 0 ? n : -n;
        System.out.println(x);
    }

    private static void AgeBool() {
        int age = 7;
        boolean isPrimaryStudent = age >= 6 && age <= 12 ? true : false;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
