package test.java.cn.sj.test;
class a{
    static int b=10;

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        a.b = b;
    }
}


public class eight {
    public static void main(String[] args) {
        a.setB(20);
        System.out.println(a.b);
    }

}
