package test.java.cn.sj.test;

class Info{
    private String msg="Hello";
    public void print(){
        System.out.println("msg="+msg);
    }

    public void fun(Info temp){
        temp.msg="修改内容";
    }
}

public class sixth {
    public static void main(String[] args) {
        Info x = new Info();
        x.fun(x);
        x.print();
    }
}

