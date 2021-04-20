package org.example.codebase.basicobject.Extends;

public class ExtendsDowncasting {
    public static void main(String[] args) {
        Object obj = "hello";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }

//        Object obj = "hello";
//        if (obj instanceof String s) {
//            // 可以直接使用变量s:
//            System.out.println(s.toUpperCase());
//        }
    }
}
