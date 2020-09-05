package cn.sj.test.test;

//interface A{
//    public int add(int a,int b);
//}

//@FunctionalInterface
//interface IMessage<C>{
//    public C create(String p1,double p2);
//}
//
//class Book{
//    private String title;
//    private double price;
//
//    public Book(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//class MyDemo{
//    public void print(String str){
//        System.out.println(str);
//    }
//}



//class MyThread implements Callable {
//    private int ticket = 10;
//
//
//    @Override
//    public Object call() throws Exception {
//        for(int i = 0;i<100;i++){
//            if (this.ticket > 0 ){
//                System.out.println("买票.ticket = " + this.ticket--);
//            }
//        }
//        return "mg";
//    }
//}

//class MyThread implements Runnable{
//    private int ticket = 10;
//
//    public void run(){
//        for(int i = 0;i<200;i++){
//            if (this.ticket > 0 ){
//                System.out.println("买票.ticket = " + this.ticket--);
//            }
//        }
//    }
//}

public class fifteen_day {
    public static void main(String[] args) throws Exception {
//       MyThread mt1 = new MyThread();
//       new Thread(mt1).start();
//       new Thread(mt1).start();
//       new Thread(mt1).start();

//       MyThread mt2 = new MyThread();
//       FutureTask<String> task1 = new FutureTask<String>(mt1); //目的是为了取得call()返回结构
//       FutureTask<String> task2 = new FutureTask<String>(mt2);
//       //FutureTask是Runnable接口子类，所以可以使用Thread类的构造来接收task对象
//       new Thread(task1).start();
//       new Thread(task2).start();
//       //多线程执行完毕后可以取得内容，依靠FutureTask的父类接口Future中的get()方法完成
//        System.out.println("A返回"+task1.get());
//        System.out.println("b返回"+task2.get());




//        MyThread mt1 = new MyThread("线程A");
//        MyThread mt2 = new MyThread("线程B");
//        MyThread mt3 = new MyThread("线程C");
//        mt1.start();
//        mt2.start();
//        mt3.start();











//        Predicate<String> pre = "hello" :: equalsIgnoreCase;
//        System.out.println(pre.test("HELLO"));




//        IMessage<Book> msg = Book::new;//引用构造方法
//        //调用的虽然是create(),但是这个方法引用的是Book类的构造
//        Book book = msg.create("java",11);
//        System.out.println(book);


        //String类的toUpperCase()定义：public String tpUpperCase()
        //这个方法没有参数，但是有返回值，并且这个方法一定要在有实例化对象的情况下才可以调用
        //hello字符串是String类的实例化对象，所以可以直接调用toUpperCse()方法
        //将toUpperCase()函数的应用交给了IMessage接口

//        IMessage<String> msg = "Hello" :: toUpperCase;
//        String str = msg.upper();    //相当于调用 "Hello".toUpperCase();
//        System.out.println(str);



        //fun((s1,s2) -> {return s1+s2 ;});
    }
//    public static void fun(A a){
//        System.out.println(a.add(10,20));
//    }
}
