package cn.sj.test.test;

//10题目：将一个数组逆序输出。
//11题目：取一个整数a从右端开始的4～7位。
//12题目：打印出杨辉三角形。（要求打印出10行如下图）




import java.util.Random;
import java.util.Scanner;

public class five_day_test {
    public static void main(String[] args) {
        //1题目：利用递归方法求5!。
        // sum(5);

        //2题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
        // 问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。
        // 问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
        //age(5);

        //3题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("给一个不多于5位的正整数:");
//        int  a = sc.nextInt();
//        run1(a);

        //4题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("给一个5位的正整数:");
//        String  a = sc.next();
//        run2(a);

        //5题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入星期几:");
//        String str = sc.next();
//        run3(str);
//    }
//
//    private static void run3(String str) {
//        char cr[] = str.toCharArray();
//        System.out.print("今天是");
//        if(cr[0]=='m'){
//            System.out.println("星期一");
//        }else if(cr[0]=='w'){
//            System.out.println("星期三");
//        }else if(cr[0]=='f'){
//            System.out.println("星期五");
//        }else if(cr[0]=='s'){
//            if(cr[1]=='u'){
//                System.out.println("星期天");
//            }else {
//                System.out.println("星期六");
//            }
//        }else if(cr[0]=='t'){
//            if(cr[1]=='u'){
//                System.out.println("星期二");
//            }else {
//                System.out.println("星期五");
//            }
//        }
//    }


        //6题目：求100之内的素数。
        //run4(100);

        //7题目：对10个数进行排序。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入10个数:");
//        int a[]=new int[10];
//        for(int i=0;i<10;i++){
//            a[i] = sc.nextInt();
//        }
//        run5(a);

        //8题目：求一个3*3矩阵对角线元素之和。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入3*3矩阵:");
//        int [][] a = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                a[i][j]=sc.nextInt();
//            }
//        }
//        run6(a);

        //9题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("输入一个数:");
//        int a = sc.nextInt();
//        run7(a);

        //10题目：将一个数组逆序输出。
        //run8();

        //11题目：取一个整数a从右端开始的4～7位。
        //run9();
        //12题目：打印出杨辉三角形。（要求打印出10行如下图）
        run10();
    }

    private static void run10() {
        int a[] [] = new int[10][10];
        for(int i =0;i<10;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    a[i][j]=1;
                }else if(i==j){
                    a[i][j]=1;
                }else if(i!=j){
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        for(int i =0;i<10;i++){
            for(int j=9;j>i;j--) {
                System.out.print("   ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(a[i][j]);
                if(a[i][j]>=100) {
                    System.out.print("   ");
                }else if(a[i][j]>=10){
                    System.out.print("    ");
                }else{
                    System.out.print("     ");
                }
            }
            System.out.println();
        }

    }


//    private static void run9() {
//        Random r1 = new Random();
//        int a = r1.nextInt(1000000000);
//        System.out.println(a);
//        for(int i=1;i<4;i++){
//            a = a/10;
//        }
//        for (int i=0;i<4;i++){
//            System.out.print(a%10);
//            a=a/10;
//        }
//    }

//    private static void run8() {
//        int a[] ={1,2,3,4,5,6,8,76,5,10};
//        for(int i=9;i>-1;i--){
//            System.out.print(a[i]+" ");
//        }
//
//    }

//    private static void run7(int a) {
//        int i[] = {1,2,3,4,5,6,7,8,9,10};
//        int j[] = new int[11];
//        int x=0;
//        for(int z=0;z<11;z++){
//            if(i[z]>a){
//                x=z;
//                break;
//            }
//        }
//        for(int z=0;z<x;z++){
//            j[z]=i[z];
//
//        }
//        j[x]=a;
//        for(int z=x+1;z<11;z++){
//            j[z]=i[z-1];
//
//        }
//        for(int z=0;z<11;z++){
//            System.out.print(j[z]+"  ");
//        }
//    }

//    private static void run6(int[][] a) {
//        System.out.println("对角线之和为："+(a[0][0]+a[1][1]+a[2][2]));
//        System.out.println("对角线之和为："+(a[0][2]+a[1][1]+a[2][0]));
//    }

//    private static void run5(int[] a) {
//        int chun=a[0];
//        for(int i=0;i<10;i++){
//            for(int j=0;j<10;j++){
//                if(a[i]>a[j]){
//                    chun = a[i];
//                    a[i]=a[j];
//                    a[j]=chun;
//                }
//            }
//        }
//        for(int i=0;i<10;i++){
//            System.out.print(a[i]+"   ");
//        }
//    }

//    private static void run4(int i) {
//        boolean q = true;
//        for(int a=2;a<i;a++){
//            for(int b=2;b<=a;b++){
//                if(a%b==0&&a!=b){
//                    q=false;
//                    break;
//                }
//            }
//            if(q){
//                System.out.print(a+" ");
//            }
//            q=true;
//        }
//    }

//    private static void run2(String a) {
//        char cr[] = a.toCharArray();
//        if(cr[0] == cr[4]&&cr[1] == cr[3]){
//            System.out.println("它是回文");
//        }else {
//            System.out.println("它不是回文");
//        }
//
//    }

//    private static void run1(int a) {
//        boolean c = true;
//        int i=0;
//        System.out.print("倒序为");
//        while (c){
//            if(a!=0){
//                i++;
//                System.out.print(a%10);
//                a=a/10;
//            }else {
//                c=false;
//            }
//        }
//        System.out.println();
//        System.out.println("它是"+i+"位数");
//    }
//    private static void age(int i) {
//        int b = 10;
//        for(int a=1;a<5;a++){
//            b=b+2;
//        }
//        System.out.println("第五个人"+b);
//    }

//    private static void sum(int i) {
//        int sum = 1;
//        sum = add(i);
//        System.out.println("5!="+sum);
//    }
//
//    private static int add(int i) {
//        if(i == 1){
//            return 1;
//        }
//        return add(i-1)*i;
//    }

}
