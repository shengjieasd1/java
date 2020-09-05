package test.java.cn.sj.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2、编写一个方法，判断该年份是平年还是闰年。
//3、编写一个方法，输出大于200的最小的质数。
public class funnian {
    public static void main(String[] args) {
//        int i = 2020;
//        if(i%4==0&&i%100!=0){
//            System.out.println("是闰年");
//        }else{
//            System.out.println("不是闰年");
//        }

//        int a = 200;
//
//        for(;;a++){
//            boolean b = true;
//            for(int c=2;c<a-1;c++){
//                if(a%c==0){
//                    b=false;
//                }
//            }
//            if(b==true){
//                break;
//            }
//        }
//        System.out.println(a);

//        int a[] = {3,2,1,5,7};
//        int b;
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]>a[j]){
//                    b=a[i];
//                    a[i]=a[j];
//                    a[j]=b;
//                }
//            }
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        /*
        5.分析以下需求，并用代码实现(每个小需求都需要封装成方法)
            1.求两个整数之和
            2.求两个小数之和
            3.判断两个整数是否相等
            4.判断两个小数是否相等
            5.获取两个整数中较大的值
            6.获取两个小数中较大的值
            7.获取两个整数中较小的值
            8.获取两个小数中较小的值
            9.用一个方法获取两个整数中较大的值或较小的值
         */
//        int a = 10;
//        int b = 20;
//        double c = 10.23;
//        double d = 10.24;
//        String e = "大";
//        System.out.println(a+"+"+b+"="+add(a,b));
//        System.out.println(c+"+"+d+"="+addx(c,d));
//        System.out.println(a+"与"+b+"是否相等？"+eq(a,b));
//        System.out.println(c+"与"+d+"是否相等？"+eqx(a,b));
//        System.out.println(a+"与"+b+"哪个更大？"+comparemore(a,b));
//        System.out.println(c+"与"+d+"哪个更大？"+comparemorex(c,d));
//        System.out.println(a+"与"+b+"哪个更小？"+comparesmore(a,b));
//        System.out.println(c+"与"+d+"哪个更小？"+comparesmorex(c,d));
//        System.out.println(a+"与"+b+"哪个更"+e+"?"+comparesmore(a,b,e));
        //定义一个方法getNumSum，功能是计算1到100所有整数和，并打印输出。在main方法中调用getNumSum方法。（无参数无返回值）
//        int i = 100;
//        getNumSum(i);
        //int i = 100;
        //System.out.println("和为："+jiadd(i));


        //定义一个无返回值的方法，传入一个int类型数组，求出该数组中的最大值、最小值和平均值并输出。
//        int i[]={8, 3, 6, 9, 14};
//        panduan(i);



        //定义方法public static int getAvg(int[] arr)，获取数组中的平均数并返回；
        //(2) 在main方法内，定义长度为10的int数组，使用随机数赋值，并调用getAvg方法获取平均分。然后遍历数组，统计高于平均分的分数有多少个。
        //打印结果：高于平均分：80 的个数有 5 个
//        int arr[] = new int[10];
//        Random random = new Random();
//        for(int i=0;i<arr.length;i++){
//            arr[i]= random.nextInt(100);
//            System.out.print(arr[i]+"  ");
//        }
//        System.out.println();
//        System.out.println("平均数为:"+getAvg(arr));
//        Double average=getAvg(arr);
//        int add = 0;
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]>average){
//                add++;
//            }
//        }
//        System.out.println("平均数为:"+getAvg(arr)+","+"高于平均数的有"+add+"个.");


//        现有整数数组包含如下元素：{ 1 , 22 , 33 , 22 , 11 }，获取一个键盘录入的整数num，
//        判断num在数组中最后出现的角标位置并在控制台打印输出，如元素在数组中不存在，也输出对应提示信息，演示格式如下：
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个整数");
//        int i = sc.nextInt();
//        int arr[] = { 1 , 22 , 33 , 22 , 11 };
//        int sy = -1;
//        for(int a=0;a<arr.length;a++){
//            if(arr[a]==i){
//                sy=a;
//            }
//        }
//        if(sy==-1) {
//            System.out.println(i+"的角标不存在。");
//        }else{
//                System.out.println(i+"的角标为："+sy);
//        }

        //定义方法public static boolean isSXH(int num)，功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false。
        //(2) 定义方法public static int getCount(),功能：借助isSXH方法，获取100到999以内水仙花个数，
        //(3) 定义方法public static int[] getArr(int count)，根据参数值创建int数组，借助isSXH方法，获取100到999以内水仙花数，存入到数组并返回。
        //(4) 在main方法中调用getCount方法，获取水仙花的个数，然后调用getArr方法，将水仙花的个数作为参数传递，获取到返回值后遍历打印数组。
//        int num=153;
//        if(isSXH(num)){
//            System.out.println("是水仙花数");
//        }else{
//            System.out.println("不是水仙花数");
//        }
        //System.out.println("100~999内水仙花的个数为:"+getCount());
//        StringBuffer s = new StringBuffer("aa");
//        s.append("ddd");
//
//
//        int[] a = getArr();
//        System.out.print("100~999内水仙花的数为:");
//        for(int i=0;i<getCount();i++){
//            System.out.print(a[i]+"  ");
//        }
        //古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
        // * 分析 一月 1对， 2月 1对，3月 2对，4月 3对，5月5对，6月8对，7月13对，8月 21只
//        Scanner sc = new Scanner(System.in);
//        System.out.print("输入月份:");
//        int month =  sc.nextInt();
//        int num = giveRabbit(month);
//        System.out.println(month+"月应产出："+num+"对兔子");


//        15.判断101-200之间有多少个素数，并输出所有素数。
//        素数，指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
//        int a = 101;
//        int b = 200;
//        System.out.print("素数有：");
//        ss(a,b);

//        将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个正数：");
//        int num = sc.nextInt();
        int a[] = new int[]{124132,5,4,2,3};
        java.util.Arrays.sort(a);
        System.out.println(a[0]+" "+a[1]);
        //chu(num);
    }
    private static void chu(int num) {
        System.out.print("因子为：");
        for(int i = 2; i<num;i++){
            while (num%i==0){
                System.out.print(i+"*");
                num=num/i;
            }
        }
        if(num > 1){
            System.out.println(num);
        }
    }


//    private static void ss(int a, int b) {
//        for(;a<=b;a++){
//            boolean d = true;
//            for(int i=2;i<a;i++){
//                if(a%i==0){
//                    d=false;
//                    break;
//                }
//            }
//            if(d){
//                System.out.print(a+"  ");
//            }
//        }
//    }
//    public static int giveRabbit(int month) {
//        if (month == 1 || month == 2) {
//            return 1;
//        }
//        return giveRabbit(month-1)+giveRabbit(month-2);
//    }


//        int num1=1;
//        int num2=1;
//        int sum = 0;
//        if(month == 1|| month==2){
//            return 1;
//        }
//        for(int i=2;i<month;i++){
//            sum = num1 + num2;
//            num1 = num2;
//            num2 = sum;
//        }

//    public static int[] getArr(){
//        int i=100;
//        int[] a = new int[getCount()] ;
//        int j = 0;
//        for(;i<1000;i++){
//            if(isSXH(i)){
//                a[j] = i;
//                j++;
//            }
//        }
//        return a;
//    }
//    public static int getCount(){
//        int i = 100;
//        int num = 0;
//        for(;i<1000;i++){
//            if(isSXH(i)){
//                num++;
//            }
//        }
//        return num;
//    }
//    public static boolean isSXH(int num){
//        int ge = num%10;
//        int shi = (num%100)/10;
//        int bai = num/100;
//        int sum = (int)Math.pow(ge,3)+(int)Math.pow(shi,3)+(int)Math.pow(bai,3);
//        //System.out.println(num+"的"+bai+"^3+"+shi+"^3+"+ge+"^3和为"+sum);
//        if(sum==num){
//            return true;
//        }else {
//            return false;
//        }
//    }

//    public static double getAvg(int[] arr){
//        int sum = 0;
//        double average;
//        for(int i = 0;i<arr.length;i++){
//            sum += arr[i];
//        }
//        average = sum/(double)arr.length;
//        return average;
//    }





//    public static void panduan(int i[]){
//        int max=i[0],min=i[0],sum = 0,average=0;
//        for(int a = 0;a<i.length;a++){
//            if(max<i[a]){
//                max=i[a];
//            }
//            if(min>i[a]){
//                min = i[a];
//            }
//            sum +=i[a];
//        }
//        System.out.println("最大值为:"+max);
//        System.out.println("最小值为:"+min);
//        System.out.println("平均数为:"+sum/(double)i.length);
//    }

//    private static int jiadd(int t) {
//        int i = 100;
//        int sum = 0;
//        for(;i>0;i--){
//            if(i%2!=1){
//                continue;
//            }
//            sum += i;
//        }
//       return sum;
//    }

//    public static void getNumSum(int i){
//        int sum=0;
//        for(;i>0;i--){
//            sum+=i;
//        }
//        System.out.println("和为"+sum);
//    }
//    public static int add(int a, int b){
//        return a+b;
//    }
//    public static double addx(double a,double b){
//        return a+b;
//    }
//    public static boolean eq(int a,int b){
//        return a == b;
//    }
//    public static boolean eqx(double a,double b){
//        return a == b;
//    }
//    public static int comparemore(int a,int b){
//        if(a>=b){
//            return a;
//        }
//        return b;
//    }
//
//    public static double comparemorex(double a,double b){
//        if(a>=b){
//            return a;
//        }
//        return b;
//    }
//
//    public static int comparesmore (int a,int b){
//        if(a<=b){
//            return a;
//        }
//        return b;
//    }
//    public static double comparesmorex(double a,double b){
//        if(a<=b){
//            return a;
//        }
//        return b;
//    }
//    public static int comparesmore(int a,int b,String c){
//        switch (c){
//            case "大":
//                if(a>=b){
//                    return a;
//                }
//                return b;
//            case "小":
//                if(a<=b){
//                    return a;
//                }
//                return b;
//        }
//        return 0;
//    }
}
