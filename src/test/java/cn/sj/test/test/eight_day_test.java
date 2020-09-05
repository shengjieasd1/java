package test.java.cn.sj.test.test;

//1某汽车租赁公司有多种汽车可以出租，计算汽车租金
//Vehicle是所有车的父类，属性：品牌、车牌号，有返回总租金的方法：public double getSumRent(int days){}
//小轿车类Car是Vehicle的子类，属性：车型（两厢、三厢、越野），两厢每天300，三厢每天350，越野每天500。
//多座汽车类Bus是Vehicle的子类，属性：座位数，座位数<=16的每天400，座位数>16的每天600。
//编写测试类，根据用户选择不同的汽车，计算总租金。
class Vehicle{
    String pp,cp;

    public Vehicle() {
    }

    public double getSumRent(int days){
        return 0;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}

class Car extends Vehicle{
    String cx;

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    @Override
    public double getSumRent(int days) {
        if("两厢".equals(cx)){
            return 300*days;
        }else if("三厢".equals(cx)){
            return 350*days;
        }else if ("越野".equals(cx)){
            return 500*days;
        }
        return 0;
    }
}
//
//class Bus extends Vehicle{
//    int zw;
//
//    public int getZw() {
//        return zw;
//    }
//
//    public void setZw(int zw) {
//        this.zw = zw;
//    }
//
//    @Override
//    public double getSumRent(int days) {
//        if(zw<=16){
//            return 400*days;
//        }else {
//            return 600*days;
//        }
//    }
//}

public class eight_day_test {
    public static void main(String[] args) {


//        Car c = new Car();
//        c.setPp("宝马");
//        c.setCp("京A 88888");
//        c.setCx("三厢");
//        System.out.println("品牌：" + c.getPp() + "，车牌号：" + c.getCp() + "，10天总租金：" + c.getSumRent(10));
//
//        Bus b = new Bus();
//        b.setPp("海格");
//        b.setCp("京B 88888");
//        b.setZw(60);
//        System.out.println("品牌：" + b.getPp() + "，车牌号：" + b.getCp() + "，10天总租金：" + b.getSumRent(10));

        //2、定义“人”类，“人”类包括这些属性：姓名、性别、年龄等。使用封装的方式编写程序，要求对年龄进行安全控制，合法的年龄范围为[0~100]，其他值表示不合法。
//        People p = new People();
//        p.setName("张三");
//        p.setAge(20);
//        p.setSex("男");
//
//        System.out.println("姓名 = " + p.getName());
//        System.out.println("性别 = " + (p.getSex().equals("男") ? "男" : "女"));
//        System.out.println("年龄 = " + p.getAge());
//
//        p.setAge(-100);

        //定义猴子类，猴子有名字和性别等属性，并且定义猴子说话的方法，定义人类，人有名字和性别等属性，
        // 并且定义人说话的方法。使用继承，让代码具有复用性。
//        monkey monkey = new monkey();
//        monkey.setName("猴子");
//
//        people people = new people();
//        people.setName("sj");
//
//        monkey.speak();
//        people.speak();

        //4. 定义动物类，动物有名字属性，并且定义动物移动的方法，
        // 定义鱼类，鱼有名字属性，有颜色属性，并且定义鱼移动的方法。使用继承，让代码具有复用性。
//        fish fish = new fish();
//        fish.setName("鲤鱼");
//        fish.setColor("红色");
//
//        fish.walk();

        //5、实现愤怒的小鸟
        // 我们有很多种小鸟，每种小鸟都有飞的行为，还有一个弹弓，弹弓有一个弹射的行为，弹射时把小鸟弹出去，之后小鸟使用自己飞行的行为飞向小猪（不要求编写小猪的代码）。不同种类的小鸟有不同飞行的方式：
        // 红火：红色小鸟，飞行方式：正常
        // 蓝冰：蓝色小鸟，飞行方式：分成3个
        // 黄风：黄色小鸟，飞行方式：加速。
//            Bird red = new redBird();
//            Bird blue = new blue_Bird();
//            Bird yellow = new Yellow_Bird();
//            dangong dg = new dangong();
//            dg.dg(red);
//            dg.dg(blue);
//            dg.dg(yellow);

        //6计算不同类型的员工薪资
        // 定义员工类Employee，员工包含姓名name、出生月份birthMonth两个属性，
        // 员工有获取指定月份工资的方法（getSalary(int month)），如果该月员工生日，公司补助250元。
        // 定义有固定工资的员工类SalariedEmployee，有月薪monthlySalary属性。
        // 定义小时工类HourlyEmployee，包含工作小时数hours和每小时的工资hourlySalary属性，
        // 如果每月工作超过160小时，超过的部分按1.5倍工资发放。
        // 定义销售人员类SalesEmployee，包含月销售额sales和提成比例comm属性。
//        SalariedEmployee e1 = new SalariedEmployee();
//        e1.setName("张三");
//        e1.setBirthMonth(2);
//        e1.setMonthlySalary(5000.0);
//        System.out.println(e1.getName() + "的2月份工资是" + e1.getSalary(2));
//        HourlyEmployee e2 = new HourlyEmployee();
//        e2.setName("李四");
//        e2.setBirthMonth(2);
//        e2.setMonthlySalary(50);
//        e2.setHours(170);
//        System.out.println(e2.getName() + "的2月份工资是" + e2.getSalary(2));
//        SalesEmployee e3 = new SalesEmployee();
//        e3.setName("王五");
//        e3.setBirthMonth(2);
//        e3.setSales(10000.0);
//        e3.setComm(0.5);
//        System.out.println(e3.getName() + "的2月份工资是" + e3.getSalary(2));


        //5.给定两个大小为 m 和 n 的有序数组nums1 和nums2。
        //请你找出这两个有序数组的中位数，
        //你可以假设nums1和nums2不会同时为空
//        int[] a = new int[]{1,2,3,4,5};
//        int[] b = new int[]{1,2,3,7};
//        System.out.print("a数组的内容为:");
//        for(int i =0;i<a.length;i++){
//            System.out.print(a[i]+"  ");
//        }
//        System.out.println();
//        System.out.print("b数组的内容为:");
//        for(int i =0;i<b.length;i++){
//            System.out.print(b[i]+"  ");
//        }
//        rum5(a,b);

        //6.判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        //考虑负数
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个整数:");
//        decide(sc.nextInt());


        //2、定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
        //1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，
        //再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法，
        //该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。
        //2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外），
        //并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。
        //同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法，
        //并提供一个final sing()方法。
        //3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle"
        //在main()方法中制造Manager和Employee对象,并测试这些对象的方法。
//        Employee e = new Employee("张三", 27, true, 3000,1);
//        e.play();
//        e.sing();
//        Manager m = new Manager("李四", 29, false, 4000, 2, "");
//        m.play();
//        m.sing();
//        System.out.println("坐车"+m.vehicle);

        // 8、创建一个Vehicle类并将它声明为抽象类。在Vehicle类中声明一个NoOfWheels方法，
        // 使它返回一个字符串值。创建两个类Car和Motorbike从Vehicle类继承，
        // 并在这两个类中实现NoOfWheels方法。在Car类中，应当显示“四轮车”信息；
        // 而在Motorbike类中，应当显示“双轮车”信息。创建另一个带main方法的类，
        // 在该类中创建Car和Motorbike的实例，并在控制台中显示消息。
//        Car car = new Car();
//        System.out.println(car.NoOfWheels());
//        Motorbike mot = new Motorbike();
//        System.out.println(mot.NoOfWheels());

        //抽象类习题。
        //1）定义抽象类Bank：含：
        //类成员常量oneYearRate(一年定期利率)=0.0178，常量interestRate(年活期利率)=0.0078
        //抽象方法：count()计算一年后总金额（本金+利息，不考虑利息税）
        //show()显示总金额。
        //2）定义一年定期子类OneYearFixed：含：
        //成员变量：saving(本金),sum(一年后总金额)
        //带参构造方法：设置本金，计算sum（可调用count）
        //成员方法：count()，show()的实现。
        //3）定义一年活期子类OneYear：含：
        //成员变量：saving(本金),sum(一年后总金额)
        //带参构造方法：设置本金，计算sum（可调用count）
        //成员方法：count()，show()的实现。
        //4）定义Test类。含main()方法：分别创建OneYearFixed类和OneYear类对象。通过show()查看它们的sum。
//        OneYear one = new OneYear(10000);
//        one.show();
//        OneYearFixed one1 = new OneYearFixed(10000);
//        one1.show();

        //定义一个抽象基类Shape，它包含三个抽象方法center()、diameter()、
        //getArea(),从 Shape类派生出Square和Circle类，这两个类都用center()计算对象的中
        //心坐标，diameter()计算对象周长，getArea()方法计算对象的面积。编写应用程序使用
        //Rectangle 类和 Circle 类。
//        Circle cir = new Circle(4,4,3);
//        cir.center();
//        cir.diameter();
//        cir.getArea();
//
//        Square sq = new Square(4,4,3);
//        sq.center();
//        sq.diameter();
//        sq.getArea();

        //11利用接口做参数，写个计算器，能完成加减乘除运算。
        //（1）定义一个接口Compute含有一个方法int computer(int n, int m)。
        //（2）设计四个类分别实现此接口，完成加减乘除运算。
        //（3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，
        // 此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
        //（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
//        UseCompute fun=new UseCompute();
//        fun.UseCom(new jia(),8,2);
//        fun.UseCom(new jian(),8,2);
//        fun.UseCom(new cheng(),8,2);
//        fun.UseCom(new chu(),8,2);

        //（1）定义接口X，里面包含值为3.14的常量PI和抽象方法void area()求面积。
        //（2）定义接口Y，里面包含抽象方法void setColor(String z)上色。
        //（3）定义接口Z，该接口继承了接口X和Y，里面包含抽象方法void volume()求体积。
        //（4）定义圆柱体类Cylinder实现接口Z，该类中包含三个成员变量：底圆半径radius、
        //圆柱体的高height、颜色color。
        //（5）创建主类来测试类Cylinder。
//        Cylinder a = new Cylinder(2,2,"red");
//        a.volume();
//        a.area();
//        a.setColor();



    }
}

//class Cylinder implements Z{
//    double radius;
//    double height;
//    String color;
//
//    public Cylinder(int radius, int height, String color) {
//        this.radius = radius;
//        this.height = height;
//        this.color = color;
//    }
//
//    @Override
//    public void volume() {
//        System.out.println("体积为:"+(radius*PI*radius*height));
//    }
//
//    @Override
//    public void area() {
//        System.out.println("面积为:"+(2*radius*PI*radius+(2*PI*radius*height)));
//    }
//
//    @Override
//    public void setColor() {
//        System.out.println("颜色为:"+color);
//    }
//}
//
//interface Z extends X,Y{
//    void volume();
//}
//
//interface X{
//    public final double PI = 3.14;
//    public abstract void area();
//}
//
//interface Y{
//    void setColor();
//}

//class UseCompute{
//    private int n;
//    private int m;
//
//    public void UseCom(Compute com,int one,int two){
//        this.n = one;
//        this.m = two;
//        com.computer(n,m);
//    }
//}
//
//class chu implements Compute{
//
//    @Override
//    public int computer(int n, int m) {
//        System.out.println("n/m="+(n/m));
//        return n/m;
//    }
//}
//
//class cheng implements Compute{
//
//    @Override
//    public int computer(int n, int m) {
//        System.out.println("n*m="+(n*m));
//        return n*m;
//    }
//}
//
//class jian implements Compute{
//
//    @Override
//    public int computer(int n, int m) {
//        System.out.println("n-m="+(n-m));
//        return n-m;
//    }
//}
//
//class jia implements Compute{
//
//    @Override
//    public int computer(int n, int m) {
//        System.out.println("n+m="+(n+m));
//        return n+m;
//    }
//}
//
//interface Compute{
//    int computer(int n, int m);
//}

//class Circle extends Shape{
//    int width;
//    int height;
//    int length;
//
//    public Circle(int width,int height,int length) {
//        this.width = width;
//        this.height = height;
//        this.length = length;
//    }
//
//    @Override
//    public void center() {
//        System.out.println("圆的中心坐标为:"+width+","+height);
//    }
//
//    @Override
//    public void diameter() {
//        System.out.println("圆的周长为:"+(2*3.14*length));
//    }
//
//    @Override
//    public void getArea() {
//        System.out.println("圆的面积为:"+3.14*length*length);
//    }
//}
//
//class Square extends Shape{
//    int width;
//    int height;
//    int length;
//
//    public Square(int width, int height, int length) {
//        this.width = width;
//        this.height = height;
//        this.length = length;
//    }
//
//    @Override
//    public void center() {
//        System.out.println("正方形的中心坐标为:"+width+","+height);
//    }
//
//    @Override
//    public void diameter() {
//        System.out.println("正方形的周长为:"+2*(length+length));
//    }
//
//    @Override
//    public void getArea() {
//        System.out.println("正方形的周长为:"+(length*length));
//    }
//}
//
//abstract class Shape{
//    public abstract void center();
//    public abstract void diameter();
//    public abstract void getArea();
//
//}



//3）定义一年活期子类OneYear：含：
//成员变量：saving(本金),sum(一年后总金额)
//带参构造方法：设置本金，计算sum（可调用count）
//成员方法：count()，show()的实现。
//class OneYear extends Bank{
//    double saving;
//    double sum;
//
//    public OneYear(double saving) {
//        this.saving = saving;
//    }
//
//    @Override
//    public double count() {
//        sum = saving*(1+interestRate);
//        return sum;
//    }
//
//    public void show(){
//        System.out.println("本金为："+saving+"存一年活期为:"+count());
//    }
//}
//
////2）定义一年定期子类OneYearFixed：含：
////成员变量：saving(本金),sum(一年后总金额)
////带参构造方法：设置本金，计算sum（可调用count）
////成员方法：count()，show()的实现。
//class OneYearFixed extends Bank{
//    double saving;
//    double sum;
//
//    public OneYearFixed(double saving) {
//        this.saving = saving;
//    }
//
//
//    @Override
//    public double count() {
//        sum = saving * (1+oneYearRate);
//        return sum;
//    }
//
//    public void show(){
//        System.out.println("本金为："+saving+"存一年定期为:"+count());
//    }
//}
//
////1）定义抽象类Bank：含：
////类成员常量oneYearRate(一年定期利率)=0.0178，常量interestRate(年活期利率)=0.0078
////抽象方法：count()计算一年后总金额（本金+利息，不考虑利息税）
//abstract class Bank{
//    final static double oneYearRate =  0.0178;
//    final static double interestRate =  0.0078;
//    public abstract double count();
//}


//class Motorbike extends Vehicle{
//
//    @Override
//    public String NoOfWheels() {
//        return "双轮车";
//    }
//}
//
//class Car extends Vehicle{
//
//    @Override
//    public String NoOfWheels() {
//        return "四轮车";
//    }
//}
//
//abstract class Vehicle{
//    public abstract String NoOfWheels();
//}


//class Manager extends Employee{
//    final String vehicle;
//
//    public Manager(String name, int age, boolean sex, double salary, int ID, String vehicle) {
//        super(name, age, sex, salary, ID);
//        this.vehicle = "法拉利";
//    }
//}
//
//class Employee extends Role{
//    private double salary;
//    private static int ID;
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public static int getID() {
//        return ID;
//    }
//
//    public static void setID(int ID) {
//        Employee.ID = ID;
//    }
//
//    public Employee() {
//    }
//
//    public Employee(String name, int age, boolean sex, double salary, int ID) {
//        super(name, age, sex);
//        this.salary = salary;
//        this.ID = ID;
//    }
//
//    @Override
//    public void play() {
//        System.out.println("员工编号"+this.getID());
//    }
//
//    final void sing(){
//        System.out.println("员工姓名"+this.getName()+"员工性别"+this.isSex()
//                +"员工年龄"+this.getAge()+"员工工资"+this.getSalary());
//
//    }
//}
//
//abstract class Role{
//    private String name;
//    private int age;
//    private boolean sex;
//
//    public abstract void play();
//
//    public Role() {
//    }
//
//    public Role(String name, int age, boolean sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public boolean isSex() {
//        return sex;
//    }
//
//    public void setSex(boolean sex) {
//        this.sex = sex;
//    }
//}


//    private static void decide(int x) {
//        boolean zheng = true;
//        if(x>0){
//            zheng =true;
//        }else if (x<0){
//            zheng = false;
//        }
//        if(zheng==false) {
//            x = -x;
//        }
//        String a = String.valueOf(x);
//        char[] b = a.toCharArray();
//        int j = b.length-1;
//        boolean yes = true;
//        for(int i = 0; i<b.length/2;i++){
//            if(b[i] == b[j]){
//                yes = true;
//                j--;
//            }else {
//                yes = false;
//                break;
//            }
//        }
//        if(yes){
//            if(zheng==false){
//                x= -x;
//            }
//            System.out.println(x+"是回文");
//        }else {
//            if(zheng==false){
//                x= -x;
//            }
//            System.out.println(x +"不是回文");
//        }
//
//    }
//}


//    private static void rum5(int[] a, int[] b) {
//        int[] c = new int[a.length+b.length];
//        int d=0,f=0;
//        for (int i=0;i<c.length;i++){
//            if(d==a.length||f == b.length){
//                break;
//            }
//            if(a[d]>=b[f]){
//                c[i] = b[f];
//                f++;
//            }else {
//                c[i] = a[d];
//                d++;
//            }
//        }
//        if(d==a.length){
//            for(int i =d+f;i<c.length;i++){
//                c[i] = b[f];
//                f++;
//            }
//        } else if (f == b.length) {
//            for(int i =d+f;i<c.length;i++){
//                c[i] = b[d];
//                d++;
//            }
//        }
//        int x = (c.length/2)+1;
//        System.out.println();
//        System.out.print("组合后的数组为:");
//        for(int i =0;i<c.length;i++){
//            System.out.print(c[i]+"  ");
//        }
//        System.out.println();
//        System.out.println("中位数为:"+c[x]);
//
//    }
//}

//class SalesEmployee extends Employee{
//    double sales;
//    double comm;
//
//    public double getSales() {
//        return sales;
//    }
//
//    public void setSales(double sales) {
//        this.sales = sales;
//    }
//
//    public double getComm() {
//        return comm;
//    }
//
//    public void setComm(double comm) {
//        this.comm = comm;
//    }
//    @Override
//    public double getSalary(int month) {
//        if(month == this.birthMonth){
//            return comm*sales + 250;
//        }else {
//            return comm*sales;
//        }
//    }
//}
//
//class SalariedEmployee extends Employee{
//    double monthlySalary;
//
//    public double getMonthlySalary() {
//        return monthlySalary;
//    }
//
//    public void setMonthlySalary(double monthlySalary) {
//        this.monthlySalary = monthlySalary;
//    }
//
//    @Override
//    public double getSalary(int month) {
//        if(month == this.birthMonth){
//            return monthlySalary+250;
//        }else {
//            return monthlySalary;
//        }
//    }
//}
//
//class HourlyEmployee extends Employee{
//    int hours;
//    int monthlySalary;
//
//    public int getHours() {
//        return hours;
//    }
//
//    public void setHours(int hours) {
//        this.hours = hours;
//    }
//
//    public int getMonthlySalary() {
//        return monthlySalary;
//    }
//
//    public void setMonthlySalary(int monthlySalary) {
//        this.monthlySalary = monthlySalary;
//    }
//
//    @Override
//    public double getSalary(int month) {
//        double money =0.0;
//        if (hours>160){
//            money = ((hours-160)*1.5 +160)*this.monthlySalary;
//        }else {
//            money = hours*this.monthlySalary;
//        }
//
//        if(month == this.birthMonth){
//            money = money +250;
//        }
//        return money;
//    }
//}
//
//class Employee{
//    String name;
//    int birthMonth;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getBirthMonth() {
//        return birthMonth;
//    }
//
//    public void setBirthMonth(int birthMonth) {
//        this.birthMonth = birthMonth;
//    }
//
//    public double getSalary(int month){
//        return 0;
//    }
//}


//class dangong{
//    public  void dg(Bird bird){
//        bird.fly();
//    }
//}
//
//class Bird{
//    public void fly(){
//    }
//}
//
//class redBird extends Bird{
//    @Override
//    public void fly() {
//        System.out.println("正常飞行");
//    }
//}
//
//class blue_Bird extends Bird{
//    @Override
//    public void fly() {
//        System.out.println("分成3个飞行");
//    }
//}
//
//class Yellow_Bird extends Bird{
//    @Override
//    public void fly() {
//        System.out.println("加速飞行");
//    }
//}

//class animal{
//    String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void walk(){
//    }
//}
//
//class fish extends animal{
//    String color;
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public void walk() {
//        System.out.println(this.name+"是"+this.color+"在水里游啊游");
//    }
//}


//class monkey{
//    String name;
//    boolean sex;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isSex() {
//        return sex;
//    }
//
//    public void setSex(boolean sex) {
//        this.sex = sex;
//    }
//
//    public void speak(){
//        System.out.println(name + "呀呀呀");
//    }
//}
//
//class people extends monkey{
//    @Override
//    public void speak() {
//        System.out.println(name + "我说的是。。。");
//    }
//}

//class People{
//    private String name;
//    private String sex;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if(age>100 || age<0){
//            System.out.println("年龄不合法");
//        }else {
//            this.age = age;
//        }
//    }
//}