package org.example.codebase.basicgrammar;

public class DefineActionScope {
    public static void main(String[] args) {
        {
            int i = 0; // 变量i从这里开始定义
            {
                int x = 1; // 变量x从这里开始定义
                {
                    String s = "hello"; // 变量s从这里开始定义
                    System.out.println(s);
                } // 变量s作用域到此结束
                // 注意，这是一个新的变量s，它和上面的变量同名，
                // 但是因为作用域不同，它们是两个不同的变量:
                String s = "hi";
                System.out.println(s);
                System.out.println(x);
            } // 变量x和s作用域到此结束
            System.out.println(i);
        } // 变量i作用域到此结束
    }
}