package cn.sj.test.test;

class a {
    public static final int  EA = 133;
    static int b = 10;

}

//abstract class A{
//    public A(){
//        this.print();
//    }
//    public abstract void print();
//}
//
//class B extends A {
//    private int num = 100;
//    public B(int num){
//        this.num = num;
//    }
//    public void print(){
//        System.out.println("num = " +num);
//    }
//}


//abstract class Action{
//    public static final int EAT = 1;
//    public static final int SLEEP = 5;
//    public static final int WORK = 7;
//
//    public void command(int flag){
//        switch (flag){
//            case EAT:
//                this.eat();
//                break;
//            case SLEEP:
//                this.sleep();
//                break;
//            case WORK:
//                this.work();
//                break;
//            case EAT + WORK:
//                this.eat();
//                this.work();
//                break;
//        }
//    }
//    public abstract void eat();
//    public abstract void sleep();
//    public abstract void work();
//}
//
//class Robot extends Action{
//
//    @Override
//    public void eat() {
//        System.out.println("补充能量");
//    }
//
//    @Override
//    public void sleep() {
//
//    }
//
//    @Override
//    public void work() {
//        System.out.println("机器人正在工作");
//    }
//}
//
//class People extends Action{
//
//    @Override
//    public void eat() {
//        System.out.println("人正在吃饭");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("人正在睡觉");
//    }
//
//    @Override
//    public void work() {
//        System.out.println("人正在工作");
//    }
//}
//
//class Pig extends Action{
//
//    @Override
//    public void eat() {
//        System.out.println("猪正在吃饭");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("猪正在睡觉");
//    }
//
//    @Override
//    public void work() {
//
//    }
//}


//interface USB{
//    public void start();
//    public void stop();
//}
//class Computer{
//    public void plugin(USB usb){
//        usb.start();
//        usb.stop();
//    }
//}



//class Flash implements USB{
//
//    @Override
//    public void start() {
//        System.out.println("U盘开始使用");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("U盘停止使用");
//    }
//}
//
//class Print implements USB{
//
//    @Override
//    public void start() {
//        System.out.println("打印机开始");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("打印机停止");
//    }
//}
//interface Fruit{
//    public abstract void eat();
//}
//class Apple implements Fruit{
//    public void eat(){
//        System.out.println("apple");
//    }
//}class Orange implements Fruit{
//    public void eat(){
//        System.out.println("orange");
//    }
//}
//
//class Factory{
//    public static Fruit getInstance(String className){
//        if("apple".equals(className)){
//            return new Apple();
//        }else if ("orange".equals(className)){
//            return new Orange();
//        }else {
//            return null;
//        }
//    }
//}
//interface Subject{
//    public void make();
//}
//class RealSubject implements Subject{
//    public void make(){
//        System.out.println("皇上正在洗澡");
//    }
//}
//
//class ProxySubject implements Subject{
//
//    private Subject subject;
//    public ProxySubject(Subject subject){
//        this.subject = subject;
//    }
//    public void prepare(){
//        System.out.println("1.准备");
//    }
//
//    @Override
//    public void make() {
//        this.prepare();
//        this.subject.make();
//        this.destroy();
//    }
//
//    public void destroy(){
//        System.out.println("搬走");
//    }
//}


//abstract class A{
//    public abstract void print();
//    private static class B extends A{
//        @Override
//        public void print() {
//            System.out.println("Hello world!");
//        }
//    }
//
//    public static A getInstance(){
//        return new B();
//    }
//
//}




public class eight_day {

    public static void main(String[] args) {
//        A a = A.getInstance();
//        a.print();
       // System.out.println(a.b);



//        Subject subject = new ProxySubject(new RealSubject());
//        subject.make();





//        Fruit f = Factory.getInstance("apple");
//        f.eat();
//        Computer computer = new Computer();
//        computer.plugin(new Flash());
//        computer.plugin(new Print());

//        new B(30);
//        new B(30).print();
//        fun(new Robot());
//        fun(new People());
//        fun(new Pig());

    }

//    public static void fun(Action act){
//        act.command(Action.EAT);
//        act.command(Action.SLEEP);
//        act.command(Action.WORK);
//
//    }
}
