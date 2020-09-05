package cn.sj.test;

public class first {
    public static void main(String[] args) {
        a a = new a("java基础",12);
//        a.setC("java基础");
//        a.setB(12);
        a.show();


    }
}

class a{
    private String c;
    private int b;

    public a(String c, int b) {
        this.c = c;
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void show(){
        System.out.println("名字"+c+"价格"+b);
    }
}