package cn.sj.test.test;


//class Member{
//    public Member(){
//        System.out.println("aaaa");
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("bbbbbbbb");
//        throw new Exception("ddddddd");
//    }
//}

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//class Book2 implements Cloneable{
//    private String title;
//    private double price;
//
//    public Book2(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    @Override
//    public String toString() {
//        return "Book2{" +
//                "title='" + title + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}


public class seventeen_day {
    public static void main(String[] args) throws Exception {
//        String str = "2020-12-11 12:54:03.232";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str = sdf.format(date);
        System.out.println(str);
        //        Date date = sdf.parse(str);
//        System.out.println(date);
//        Book2 booka =new Book2("aaaa",12);
//        Book2 bookb = (Book2) booka.clone();
//        System.out.println(booka);
//        System.out.println(bookb);


//        Member me = new Member();
//        me = null;
//        System.gc();



//        long start = System.currentTimeMillis();
//        String str = "";
//        for(int i=0;i<30000;i++){
//            str +=i;
//        }
//        long a = System.currentTimeMillis();
//        System.out.println(a - start);
    }
}
