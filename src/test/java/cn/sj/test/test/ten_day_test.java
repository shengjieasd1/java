package cn.sj.test.test;

import java.math.BigDecimal;

public class ten_day_test {
    public static void main(String[] args) {
        //get方法和set方法 定义一个类该类有一个私有成员变量通过构造方法
        // 将其进行赋初值并提供该成员的getXXX()和setXXX()方法
        // 提示假设有private String name;则有

        //构造方法与重载 为“无名的粉”写一个类class WuMingFen
        // 要求： 1.有三个属性 面码:String theMa 粉的分量(两) int quantity
        // 是否带汤 boolean likeSoup
        // 2.写一个构造方法 以便于简化初始化过程
        // 如 WuMingFen f1 = new WuMingFen(“牛肉”,3,true);
        // 3.重载构造方法 使得初始化过程可以多样化
        // WuMingFen f2 = new WuMingFen(“牛肉”,2);
        // 4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的
        // WuMingFen f3 = new WuMingFen();
        // 5.写一个普通方法 check() 用于查看粉是否符合要求。
        // 即 将对象的三个属性打印在控制台上
//        WuMingFen f1 = new WuMingFen("牛肉",3,true);
//        f1.check();
//        WuMingFen f2 = new WuMingFen("牛肉",2);
//        f2.check();
//        WuMingFen f3 = new WuMingFen();
//        f3.check();


        //构造方法的重载 定义一个名为Vehicles 交通工具 的基类
        // 该类中应包含String类型的成员属性brand 商标 和color 颜色
        // 还应包含成员方法run 行驶 在控制台显示“我已经开动了” 和showInfo 显示信息
        // 在控制台显示商标和颜色 并编写构造方法初始化其成员属性。
        // 编写Car 小汽车 类继承于Vehicles类 增加int型成员属性seats 座位
        // 还应增加成员方法showCar 在控制台显示小汽车的信息 并编写构造方法。
        // 编写Truck 卡车 类继承于Vehicles类 增加float型成员属性load 载重
        // 还应增加成员方法showTruck 在控制台显示卡车的信息 并编写构造方法。
        // 在main方法中测试以上各类。
//        Truck truck = new Truck("大众","蓝色",10000);
//        truck.showTruck();
//        truck.run();
//        Car car = new Car("哈佛","棕色",6);
//        car.showCar();
//        car.run();
//        Vehicles vehicles = new Vehicles("宝马","白色");
//        vehicles.showInfo();
//        vehicles.run();

        //构造方法与重载 定义一个网络用户类 要处理的信息有用户ID、用户密码、email地址。
        // 在建立类的实例时 把以上三个信息都作为构造函数的参数输入 其中用户ID和用户密码时必须的
        // 缺省的email地址是用户ID加上字符串”@gameschool.com"
//        yonghu yh = new yonghu("sj","sssss");
//        System.out.println(yh.toString());


        //构造方法与重载、包 编写Addition类 该类中应包含一组实现两数相加运算的重载方法。
        // 实现加法运算的方法 应接受两个参数 即加数和被加数 方法将两个参数进行加法运算后
        // 返回相加结果。考虑可能针对不同的数据类型进行计算 重载一组方法
        // 包括整型、长整型、浮点型、双精度浮点型、还有字符串。
        // 在main方法中创建Addition类的实例 分别调用重载方法测试其效果。
//        int a = 10,b = 10;
//        long c = 111,d = 111;
//        float e = 12.4f,f = 12.3f;
//        double g = 13.1,h = 13.2;
//        String i = "14",j = "14";
//        Addition addition = new Addition();
//        addition.add(a,b);
//        addition.add(c,d);
//        addition.add(e,f);
//        addition.add(g,h);
//        addition.add(i,j);

        //构造方法与重载 建立一个汽车类 包括轮胎个数 汽车颜色 车身重量等属性。
        // 并通过不同的构造方法创建事例。 至少要求 汽车能够加速 减速 停车。
        // 要求 命名规范 代码体现层次 有友好的操作提示。
//        Car car = new Car(4,"蓝",43.2);
//        car.qidong();
//        car.jiasu();
//        car.jianshu();
//        car.tingche();

        //构造方法与重载 创建一个类 为该类定义三个构造函数 分别执行下列操作
        // 1、传递两个整数值并找出其中较大的一个值
        // 2、传递三个double值并求出其乘积
        // 3、传递两个字符串值并检查其是否相同
        // 4、在main方法中测试构造函数的调用
//        da da = new da(12,14);
//        da da1 = new da(12.1,11.2,14.2);
//        da da2 = new da("aaaa","aaaa");

        //Static关键字与普通变量的区别 创建一个名称为StaticDemo的类
        // 并声明一个静态变量和一个普通变量。对变量分别赋予10和5的初始值。
        // 在main()方法中输出变量值。
//        System.out.println(StaticDemo.a);
//        StaticDemo b = new StaticDemo();
//        System.out.println(b.getB());

        //继承 创建一个名称为MainPackage的包 使它包含MainClass和MainSubClass类。
        // MainClass类应当包含变量声明 其值从构造函数中输出。
        // MainSubClass类从MainClass派生而来。试执行下列操作
        // 创建一个名称为SamePackage的类 使它导入上述包 并创建一个MainSubClass类的对象。


        //给定一个包括n 个整数的数组nums和 一个目标值target。找出nums中的三个整数，
        // 使得它们的和与target最接近。返回这三个数的和。
        //假定每组输入只存在唯一答案。

    }
}
//class StaticDemo{
//    static int a= 10;
//    int b= 5;
//
//    public int getB() {
//        return b;
//    }
//}

//class da{
//    public da(int a, int b){
//        if(a>b) {
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//    }
//    public da(double a,double b,double c){
//        BigDecimal b1 = new BigDecimal(String.valueOf(a));
//        BigDecimal b2 = new BigDecimal(String.valueOf(b));
//        BigDecimal b3 = new BigDecimal(String.valueOf(c));
//        System.out.println(b1.multiply(b2.multiply(b3)));
//
//    }
//    public da(String a,String b){
//        if(a.equals(b)){
//            System.out.println("相同的");
//        }else {
//            System.out.println("不相同的");
//        }
//    }
//
//}

//class Car{
//    int lt;
//    String color;
//    double zhong;
//
//    public Car(int lt, String color, double zhong) {
//        this.lt = lt;
//        this.color = color;
//        this.zhong = zhong;
//    }
//
//    public void qidong(){
//        System.out.println("汽车启动");
//    }
//
//    public void jiasu(){
//        System.out.println("汽车加速");
//    }
//
//    public void jianshu(){
//        System.out.println("汽车减速");
//    }
//
//    public void tingche(){
//        System.out.println("汽车停车");
//    }
//}

//class Addition{
//    public void add(int a,int b){
//        System.out.println(a+"+"+b+"="+(a+b));
//    }
//    public void add(long a,long b){
//        System.out.println(a+"+"+b+"="+(a+b));
//    }
//    public void add(double a,double b){
//        BigDecimal b1 = new BigDecimal(String.valueOf(a));
//        BigDecimal b2 = new BigDecimal(String.valueOf(b));
//        System.out.println(b1);
//        System.out.println(a+"+"+b+"="+(b1.add(b2)));
//    }
//    public void add(float a,float b){
//        System.out.println(a+"+"+b+"="+(a+b));
//    }
//    public void add(String a,String b){
//        int x = Integer.parseInt(a);
//        int y = Integer.parseInt(b);
//        System.out.println(a+"+"+b+"="+(x+y));
//    }
//}


//class yonghu{
//    String id;
//    String password;
//    String email;
//
//    public yonghu(String id, String password, String email) {
//        this.id = id;
//        this.password = password;
//        this.email = email;
//    }
//
//    public yonghu(String id, String password) {
//        this.id = id;
//        this.password = password;
//        this.email = id+"@gameschool.com";
//    }
//
//    @Override
//    public String toString() {
//        return "yonghu{" +
//                "id='" + id + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}


//class Truck extends Vehicles{
//    float load;
//    public void showTruck(){
//        System.out.println(brand+"的颜色为："+color+"有"+load+"的载重");
//    }
//
//    public Truck(String brand, String color, float load) {
//        super(brand, color);
//        this.load = load;
//    }
//}
//
//class Car extends Vehicles{
//    int seats;
//
//    public void showCar(){
//        System.out.println(brand+"的颜色为："+color+"有"+seats+"个座位");
//    }
//
//    public Car(String brand, String color, int seats) {
//        super(brand, color);
//        this.seats = seats;
//    }
//}
//
//class Vehicles{
//    String brand;
//    String color;
//    public void run(){
//        System.out.println("我已经开动了");
//    }
//    public void showInfo(){
//        System.out.println(brand+"的颜色为："+color);
//    }
//
//    public Vehicles(String brand, String color) {
//        this.brand = brand;
//        this.color = color;
//    }
//}


//class WuMingFen{
//    String theMa;
//    int quantity;
//    boolean likeSoup;
//
//    public WuMingFen() {
//        this.theMa="酸辣";
//        this.quantity = 2;
//        this.likeSoup = true;
//    }
//
//    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
//        this.theMa = theMa;
//        this.quantity = quantity;
//        this.likeSoup = likeSoup;
//    }
//
//    public void check(){
//
//        System.out.println(""+this.theMa+"面,"+this.quantity+"两，是否带汤:"+this.likeSoup);
//    }
//
//    public WuMingFen(String theMa, int quantity) {
//        this.theMa = theMa;
//        this.quantity = quantity;
//    }
//}





//class X{
//    private String name;
//
//    public X(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
