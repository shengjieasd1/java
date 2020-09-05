package cn.sj.test.test;

//

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class nine_day_test {
    public static void main(String[] args) {
        //中国特色社会主义的体制中有这样的现象：地方省政府要坚持党的领导和按
        //照国务院的指示进行安全生产。请编写一个java应用程序描述上述的体制现象。
        //要求如下：
        //（1）该应用程序中有一个“党中央”接口：CentralPartyCommittee，该接口中
        //有个“坚持党的领导”方法：void partyLeader()
        //（2）该应用程序中有一个“国务院”抽象类：StateCouncil，该抽象类中有个“安
        //全生产”的抽象方法：abstract void safetyInProduction()
        //（3）该应用程序中有一个“省政府”类：Province，该类继承StateCouncil抽象
        //类并且实现CentralPartyCommittee接口；在实现partyLeader()方法时输出“我们
        //各省人民一定坚持党的领导！”；在重写safetyInProduction()方法时输出“我们各
        //省人民一定按照国务院的指示进行安全生产！”。
        //（4）该应用程序中有一个主类E，在主类E的main方法中创建Province类的对
        //象，来测试Province类的功能。
//        Province pro = new Province();
//        pro.partyLeader();
//        pro.safetyInProduction();

        //创建一个名称为Vehicle的接口，在接口中添加两个带有一个参数的方法start()和stop()。
        // 在两个名称分别为Bike和Bus的类中实现Vehicle接口。创建一个名称为interfaceDemo的类，
        // 在interfaceDemo的main()方法中创建Bike和Bus对象，并访问start()和stop()方法。

//        Bike a = new Bike();
//        Bus b = new Bus();
//        a.start();
//        b.start();
//        a.stop();
//        b.stop();

        //一个类A有两个成员变量v、num，v有一个初值100。
        //定义一个方法guess，对A类的成员变量v，用num进行猜。
        //如果大了则提示大了，小了则提示小了。等于则提示猜测成功。
//        System.out.print("请输入一个数：");
//        A a = new A();
//        a.guess();

        //请定义一个交通工具(Vehicle)的类，其中有:
        //属性：速度(speed)，车的类型(type)等等
        //方法：移动(move())，设置速度(setSpeed(double s))，加速speedUp(double s),减速speedDown(double s)等等.
        //最后在测试类Vehicle中的main()中实例化一个交通工具对象，
        //并通过构造方法给它初始化speed,type的值，并且打印出来。另外，调用加速，减速的方法对速度进行改变。
//        Vehicle ve = new Vehicle(20,"宝马");
//        ve.move();
//        ve.speedUp(50.3);
//        ve.move();
//        ve.speedDown(10.2);
//        ve.move();

        //类的成员变量与方法、构造方法 在程序中经常要对时间进行操作但是并没有时间类型的数据。
        // 那么我们可以自己实现一个时间类来满足程序中的需要。
        // 定义名为MyTime的类其中应有三个整型成员时hour分minute秒second为了保证数据的安全性这三个成员变量应声明为私有。
        // 为MyTime类定义构造方法以方便创建对象时初始化成员变量。 再定义diaplay方法用于将时间信息打印出来。
        // 为MyTime类添加以下方法 addSecond(int sec) addMinute(int min) addHour(int hou)
        // subSecond(int sec) subMinute(int min) subHour(int hou) 分别对时、分、秒进行加减运算。
        /*MyTime my = new MyTime(6,20,4);
        my.diaplay();
        my.addHour(1);
        my.addMinute(2);
        my.addSecond(30);
        my.diaplay();
        my.subHour(3);
        my.subMinute(13);
        my.subSecond(13);
        my.diaplay();*/


        //构造方法 编写Java程序模拟简单的计算器。
        // 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
        // 编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、
        // 除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。
        // 在main方法中创建Number类的对象调用各个方法并显示计算结果。
       /* Number number = new Number(2,1);
        number.addition();
        number.subtration();
        number.multiplication();
        number.division();*/

        //构造方法 编写Java程序用于显示人的姓名和年龄。
        // 定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
        // 定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。
        // 在main方法中创建人类的实例然后将信息显示。
        Person person = new Person("sj",22);
        person.display();
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名为："+name+"年龄为:"+age);
    }

}

//class Number{
//    private int n1;
//    private int n2;
//
//    public Number(int n1, int n2) {
//        this.n1 = n1;
//        this.n2 = n2;
//    }
//
//    public void addition(){
//        System.out.println(n1+"+"+n2+"="+(n1+n2));
//    }
//
//    public void subtration(){
//        System.out.println(n1+"-"+n2+"="+(n1-n2));
//    }
//
//    public void multiplication(){
//        System.out.println(n1+"*"+n2+"="+(n1*n2));
//    }
//
//    public void division(){
//        System.out.println(n1+"/"+n2+"="+(n1/n2));
//    }
//}

//class MyTime{
//    private int hour;
//    private int minute;
//    private int second;
//
//    public void addSecond(int sec){
//        System.out.println("加"+sec+"秒");
//        second = second + sec;
//    }
//
//    public void addMinute(int min){
//        System.out.println("加"+min+"分");
//        minute = minute + min;
//    }
//
//    public void addHour(int hou){
//        System.out.println("加"+hou+"小时");
//        hour = hour + hou;
//    }
//
//    public void subSecond(int sec){
//        System.out.println("减"+sec+"秒");
//        second = second - sec;
//    }
//
//    public void subMinute(int min){
//        System.out.println("减"+min+"秒");
//        minute = minute - min;
//    }
//
//    public void subHour(int hou){
//        System.out.println("减"+hou+"秒");
//        hour = hour - hou;
//    }
//
//
//
//    public MyTime(int hour, int minute, int second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }
//
//    public void diaplay(){
//        System.out.println(hour+"点"+minute+"分"+second+"秒");
//    }
//}

//class Vehicle{
//    double speed;
//    String type;
//
//    public Vehicle(double speed, String type) {
//        this.speed = speed;
//        this.type = type;
//    }
//
//    public void move(){
//        System.out.println(type+"以"+speed+"马的速度在移动");
//
//    }
//
//
//    public void setSpeed(double speed) {
//        this.speed = speed;
//    }
//
//    public void speedUp(double s){
//        System.out.println("加速了");
//        speed += s;
//    }
//
//    public void speedDown(double s){
//        System.out.println("减速了");
//        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(speed));
//        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(s));
//        speed =bigDecimal1.subtract(bigDecimal2).doubleValue();
//    }
//}

//class A{
//    int v = 100;
//    Random b = new Random();
//    int num =  b.nextInt(100);
//    public void guess(){
//        Scanner sc = new Scanner(System.in);
//        int  a = sc.nextInt();
//        if(a>num){
//            System.out.println("太大了");
//            System.out.print("请重新输入一个数：");
//            guess();
//        }else if(a<num){
//            System.out.println("太小了");
//            System.out.print("请重新输入一个数：");
//            guess();
//        }else if (a== num){
//            System.out.println("恭喜输入正确");
//        }
//    }
//}

//class Bus implements Vehicle{
//
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//}
//
//class Bike implements Vehicle{
//
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//}
//
//interface Vehicle{
//    void start();
//    void stop();
//}




//class Province extends StateCouncil implements CentralPartyCommittee{
//
//    @Override
//    void safetyInProduction() {
//        System.out.println("我们各省人民一定按照国务院的指示进行安全生产！");
//    }
//
//    @Override
//    public void partyLeader() {
//        System.out.println("我们各省人民一定坚持党的领导！");
//    }
//}
//
//
//abstract class StateCouncil{
//    abstract void safetyInProduction();
//}
//
//interface CentralPartyCommittee{
//    void partyLeader();
//}
