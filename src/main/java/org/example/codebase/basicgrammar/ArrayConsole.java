package org.example.codebase.basicgrammar;

public class ArrayConsole {
    public static void main(String[] args) {
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v1.0");
                break;
            }
        }
    }
}