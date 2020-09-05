package cn.sj.test.test;




//6.题目：输出9*9口诀。
//8.题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
//9.题目：打印出如下图案（菱形）。
//      *
//    ***
//   *****
//  *******
//   *****
//    ***
//     *
//10.题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
//11.题目：求1+2!+3!+...+20!的和。


import java.util.Scanner;

public class four_day_test {
    public static void main(String[] args) {
        //1题目：有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。
        //upNumber();

        //2.题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
        // 高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，
        // 可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数？
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入当月利润:");
//        double number = sc.nextDouble();
//        run7(number);

        //3.题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
//        run6();

        //4.题目：输入某年某月某日，判断这一天是这一年的第几天？
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入日期(例2020-8-13）:");
//        String str = sc.next();
//        run5(str);

        //5.题目：输入三个整数x,y,z，请把这三个数由小到大输出。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入3个整数用空格分开：");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        run4(x,y,z);

        //run3();
        //7.题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
        // 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下
        // 的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
        //run2(1);

        //8.题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
        // 有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
        //run1();

        //9.题目：打印出如下图案（菱形）。
        //     *
        //    ***
        //   *****
        //  *******
        //   *****
        //    ***
        //     *
        //run8(4);
        //10.题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
//        double db = run9(20);
//        System.out.println("2/1，3/2，5/3，8/5，13/8，21/13...前20项之和为:"+db);

        //11.题目：求1+2!+3!+...+20!的和。
        run10();
        String sa = "aa";
        sa.equals("d");
    }
    private static void run10() {
        long sum=0;

        for(int i=1;i<21;i++){
            long sum1 = 1;
            for(int j=1;j<=i;j++){
                sum1 = sum1*j;
            }
            sum= sum + sum1;
        }
        System.out.println("1+2!+3!+...+20!的和:"+sum);
    }

//    private static double run9(int i) {
//        double sum=0.0;
//        double b=1.0,c=2.0,d=0.0;
//        for(int a=0;a<i;a++){
//            sum = sum + (c/b);
//            d=c+b;
//            b=c;
//            c=d;
//        }
//        return sum;
//    }
    
//    private static void run8(int i) {
//        for(int a=1;a<=i;a++){
//            for(int b=i-1;b>a-1;b--){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for(int c=1;c<a;c++){
//                System.out.print("**");
//            }
//            System.out.println();
//        }
//        for(int a=1;a<i;a++){
//            for(int b=0;b<a;b++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for(int c=i-1;c>a;c--){
//                System.out.print("**");
//            }
//            System.out.println();
//        }
//
//    }
//    private static void run1() {
//        String zhuhe[][] = new String[sum1()][3];
//        String sum[] = new String[sum1()];
//        int ji = 0;
//        for(int j=0;j<3;j++){
//            for(int k=0;k<3;k++){
//                for(int l=0;l<3;l++){
//                    if(j!=k&&j!=l&&k!=l){
//                        boolean bo = true;
//                        while (bo) {
//                            if(ji>=sum1()){
//                                break;
//                            }
//                            sum [ji]="" + j + k + l;
//                            ji++;
//                            bo=false;
//                        }
//                    }
//                }
//            }
//        }
//        for(int i=0;i<sum1();i++){
//            for (int e = 0; e < 3; e++) {
//                zhuhe[i][e] = String.valueOf(sum[i].charAt(e));
//                if (zhuhe[i][e].equals("0")) {
//                    zhuhe[i][e] = "x";
//                } else if ("1".equals(zhuhe[i][e])) {
//                    zhuhe[i][e] = "y";
//                } else if ("2".equals(zhuhe[i][e])) {
//                    zhuhe[i][e] = "z";
//                }
//            }
//        }
//
//        for (int i=0;i<sum1();i++){
//            if((!"x".equals(zhuhe[i][0]))&&(!"x".equals(zhuhe[i][2]))&&(!"z".equals(zhuhe[i][2]))){
//                System.out.println("a和" + zhuhe[i][0] + "比");
//                System.out.println("b和" + zhuhe[i][1] + "比");
//                System.out.println("c和" + zhuhe[i][2] + "比");
//                break;
//            }
//        }
//    }
//
//    private static int sum1() {
//        int i=0;
//        for(int j=0;j<3;j++) {
//            for (int k = 0; k < 3; k++) {
//                for (int l = 0; l < 3; l++) {
//                    if(j!=k&&j!=l&&k!=l) {
//                        i++;
//                    }
//                }
//            }
//        }
//        return i;
//    }

//    private static void run2(int i) {
//        for(int j=10;j>1;j--){
//            i=(i+1)*2;
//        }
//        System.out.println("第一天摘了："+i);
//    }

//    private static void run3() {
//        for(int i=1;i<10;i++){
//            for (int j=1;j<i+1;j++){
//                System.out.print(j+"x"+i+"="+i*j);
//                if(i*j>=10){
//                    System.out.print("   ");
//                }else {
//                    System.out.print("    ");
//                }
//            }
//            System.out.println();
//        }
//    }

//    private static void run4(int x, int y, int z) {
//        if(x>=y){
//            if(x>=z){
//                if(y>=z){
//                    System.out.println(""+z+" "+y+" "+x);
//                }else {
//                    System.out.println(""+y+" "+z+" "+x);
//                }
//            }else {
//                System.out.println(""+y+" "+x+" "+z);
//            }
//        }else if(y>x){
//            if(y>=z){
//                if(x>=z){
//                    System.out.println(""+z+" "+x+" "+y);
//                }else {
//                    System.out.println(""+x+" "+z+" "+y);
//                }
//            }else {
//                System.out.println(""+x+" "+y+" "+z);
//            }
//        }
//    }

//    private static void run5(String str) {
//        String str1[] = str.split("-");
//        int n = Integer.parseInt(str1[0]);
//        int m = Integer.parseInt(str1[1]);
//        int l = Integer.parseInt(str1[2]);
//        int day = 0;
//        if(n%4==0&&n%100!=0){
//            if(m>2) {
//                day = sum(m) + l - 1;
//            }else if(m==1){
//                day = l;
//            }else if (m==2){
//                day = sum(m)+l;
//            }
//        }else {
//            if(m>2) {
//                day = sum(m) + l - 2;
//            }else if(m==1){
//                day = l;
//            }else if (m==2){
//                day = sum(m)+l;
//            }
//        }
//        System.out.println(n+"年的第"+day+"天");
//    }
//
//    private static int sum(int i){
//        int day = 0;
//        switch (i){
//            case 1: day=0;break;
//            case 2: day = sum(1)+31;break;
//            case 3: day = sum(2)+30;break;
//            case 4: day = sum(3)+31;break;
//            case 5: day = sum(4)+30;break;
//            case 6: day = sum(5)+31;break;
//            case 7: day = sum(6)+30;break;
//            case 8: day = sum(7)+31;break;
//            case 9: day = sum(8)+31;break;
//            case 10: day = sum(9)+30;break;
//            case 11: day = sum(10)+31;break;
//            case 12: day = sum(11)+30;break;
//        }
//        return day;
//    }

//    private static void run6() {
//        int a=1;
//        boolean c = false;
//        while (true){
//            int j =1;
//            while (true){
//                if((j*j-a*a)>168){
//                    a++;
//                    break;
//                }
//                if((j*j-a*a)==168&&(a*a-100)>0){
//                    int d = a*a-100;
//                    System.out.println("这个数是"+d);
//                    c=true;
//                    break;
//                }
//                j++;
//            }
//            if (c){
//                break;
//            }
//
//        }
//    }

//    private static void run7(double number) {
//        if(number<=100000){
//            System.out.println("奖金为:"+number*0.1);
//        }else if(number<=200000){
//            double num = 100000*0.1+(number - 100000)*0.075;
//            System.out.println("奖金为:"+num);
//        }else if(number<=400000){
//            double num = 100000*0.1+100000*0.075+(number - 200000)*0.05;
//            System.out.println("奖金为:"+num);
//        }else if(number<=600000){
//            double num = 100000*0.1+100000*0.075+200000*0.05+(number - 400000)*0.03;
//            System.out.println("奖金为:"+num);
//        }else if(number<=1000000){
//            double num = 100000*0.1+100000*0.075+200000*0.05+200000*0.03+(number - 600000)*0.015;
//            System.out.println("奖金为:"+num);
//        }else{
//            double num = 100000*0.1+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(number - 1000000)*0.01;
//            System.out.println("奖金为:"+num);
//        }
//    }

//    private static void upNumber() {
//        for(int i=1;i<=4;i++){
//            for (int j=1;j<=4;j++){
//                for(int k=1;k<=4;k++){
//                    if(i!=j&&i!=k&&j!=k){
//                        System.out.println("1、2、3、4四个数字有:"+i+j+k);
//                    }
//                }
//            }
//        }
//    }

}
