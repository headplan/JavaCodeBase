package org.example.codebase.basicgrammar;

public class DefineVar {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hi");
        var sb2 = new StringBuilder("Hi");
        System.out.println(sb1);
        System.out.println(sb2);
    }
}