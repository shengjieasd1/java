package test.java.cn.sj.test;
class A{
    private B b;
    public A(){//2.执行A类的构造
        //3 .为B类对象b实例化,并创建有参构造
        this.b = new B(this);//4.this就是temp
        this.b.get();   //7.调用B类的get()方法
    }
    public void print(){ //10.调用print()输出
        System.out.println("Hello World!");
    }
}

class B{
    private A a;
    public B(A a){ //5 参数 a= temp
        this.a = a;  //6.保存a对象（保存temp)
    }
    public void get(){ //8.调用此方法
        this.a.print(); //9.this.a = temp
    }
}

public class xcv {
    public static void main(String[] args) {
        //1.实例化A类对象，要调用A类的无参构造
        A temp = new A();
    }
}
