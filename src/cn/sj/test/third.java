package cn.sj.test;

public class third {
    public static void main(String[] args) {
        String msg = "Hello";
        fun(msg);
        System.out.println(msg);
    }

    private static void fun(String msg) {
        msg = "World";
    }
}
