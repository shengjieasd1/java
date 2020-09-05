package cn.sj.test.test;

//class Info{
//    private String title;
//    private String content;
//    private boolean flag = true;
//    public synchronized void set(String title, String content) {
//        if(this.flag == false){
//            try {
//                super.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.title = title;
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.content = content;
//        this.flag = false;
//        super.notify();
//    }
//
//    public synchronized void get(){
//        if(this.flag == true){
//            try {
//                super.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(this.title+" - " + this.content);
//        this.flag = true;
//        super.notify();
//    }
//}
//
//class Productor implements Runnable{
//    private Info info;
//
//    public Productor(Info info) {
//        this.info = info;
//    }
//
//    @Override
//    public void run() {
//        for(int i = 0;i<100;i++){
//            if (i%2 ==0 ){
//                this.info.set("a","aaaa");
//
//            }else {
//                this.info.set("b","bbbb");
//            }
//
//        }
//    }
//}
//
//class Customer implements Runnable{
//    private Info info;
//
//    public Customer(Info info) {
//        this.info = info;
//    }
//
//    @Override
//    public void run() {
//        for(int i = 0;i<200;i++){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            this.info.get();
//        }
//    }
//}

class MyThread implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            this.sale();
        }
    }

    private synchronized void sale() {
        if (this.ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票,ticket = " + this.ticket--);
        }
    }
//    @Override
//    public void run() {
//        for(int i=0;i<20;i++){
//            synchronized(this) {
//                if (this.ticket > 0) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "卖票,ticket = " + this.ticket--);
//                }
//            }
//        }
//    }


//    @Override
//    public void run() {
//        for(int i = 0;i< 20;i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+",x="+i);
//        }
//    }
//
//    @Override
//    public void run() {
//        for(int i = 0;i< 10000;i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+",x="+i);
//        }
//    }
}



public class sixteen_day {
    public static void main(String[] args) throws Exception {
        StringBuffer buf = new StringBuffer("Hello");

       // buf.insert(0,"aaaaa").insert(0,"123");
        System.out.println(buf.delete(0,2));

//        System.out.println(buf.reverse());




//        Info info = new Info();
//        new Thread(new Productor(info)).start();
//        new Thread(new Customer(info)).start();

//        MyThread mt = new MyThread();
//        new Thread(mt,"票贩子A").start();
//        new Thread(mt,"票贩子B").start();
//        new Thread(mt,"票贩子C").start();
//        new Thread(mt,"票贩子D").start();




//        MyThread mt = new MyThread();
//        Thread t1 = new Thread(mt,"自己的线程A");
//        Thread t2 = new Thread(mt,"自己的线程B");
//        Thread t3 = new Thread(mt,"自己的线程C");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();

//        MyThread mt = new MyThread();
//        new Thread(mt,"自己的线程A").start();
//        new Thread(mt,"自己的线程B").start();
//        new Thread(mt,"自己的线程C").start();
//        new Thread(mt,"自己的线程D").start();
//        new Thread(mt,"自己的线程E").start();
    }
}
