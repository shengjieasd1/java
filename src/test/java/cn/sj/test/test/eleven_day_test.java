package cn.sj.test.test;

import java.util.Scanner;

public class eleven_day_test {
    public static void main(String[] args) {
        //练习题1给定一个包括n 个整数的数组nums和 一个目标值target。
        // 找出nums中的三个整数，使得它们的和与target最接近。返回这三个数的和。
        //假定每组输入只存在唯一答案。
//        int n[]= {1,2,3,4,5,6};
//        int target = 3;
//        int n1[]= new int[n.length];
//        for(int i=0;i<n.length;i++){
//            n1[i] = n[i]  - target;
//            if (n1[i]<0){
//                n1[i] = -n1[i];
//            }
//        }
//        int max=0;
//        for(int i = 0;i<n.length;i++){
//            if (max<n[i]){
//                max = n[i];
//            }
//        }
//
//        int min = n1[0];
//        int minx = 0;
//        for(int i=0;i<n.length;i++){
//            if(min>n1[i]){
//                min = n1[i];
//                minx = i;
//            }
//        }
//        int min1 = max;
//        int minx1 = 0;
//        for(int i=0;i<n.length;i++){
//            if(i != min){
//                if(min1>n1[i]){
//                    min1 = n1[i];
//                    minx1 = i;
//                }
//            }
//        }
//        int min2 = max;
//        int minx2 = 0;
//        for(int i=0;i<n.length;i++){
//            if (i!= min ||i!=min1){
//                if(min2>n1[i]){
//                    min2 = n1[i];
//                    minx2 = i;
//                }
//            }
//
//        }
//        System.out.println(n[minx]+n[minx1]+n[minx2]);


        //给定一个包含n 个整数的数组nums和一个目标值target，
        // 判断nums中是否存在四个元素 a，b，c和 d，使得a + b + c + d的值与target相等？
        //找出所有满足条件且不重复的四元组。
        /*int a[] = {1,2,3,4,5,0,-1,-4,7};
        int target = 10;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k = j+1;k<a.length;k++){
                    for(int l=k+1;l<a.length;l++){
                        if(a[i]+a[j]+a[k]+a[l] == target){
                            System.out.println(a[i]+"+"+a[j]+"+"+a[k]+"+"+a[l]+"="+target);
                        }
                    }
                }
            }
        }*/

        // 3、手动输入一个学生的成绩，对这个成绩进行一次加分，加当前成绩的20%，输出加分后成绩
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入成绩:");
//        double a = sc.nextDouble();
//        System.out.println("成绩为:"+a*1.2);

        //4、商场举行店庆，抽几折打几折，
        //先手动输入消费金额，再输入，抽到的折扣，计算出折后价格
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入金额：");
//        double pri = sc.nextDouble();
//        System.out.print("请输入抽到的折扣：");
//        int zk = sc.nextInt();
//        System.out.print("折后价为:"+(pri*(zk/10.0)));



        //5、手动输入一个4位数，求各位数字之和
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个4位数:");
//        int sum=0,a = sc.nextInt();
//        while (a!=0){
//            sum = sum+a%10;
//            a=a/10;
//        }
//        System.out.println("和为"+sum);



        //6、商场消费返利活动，手动输入顾客消费金额，
        //如果金额打8折后仍然满1000元，用户就获得200元代金券一张（不考虑多张）
//        Scanner sc = new Scanner(System.in);
//        System.out.print("输入消费金额:");
//        int a = sc.nextInt();
//        if(a*0.8>=1000){
//            System.out.println("恭喜您获得200元代金券一张！！");
//        }

        //7、手动输入一个整型会员号，
        //如果用户输入的是4位数字，
        //输出登录成功，
        //如果用户输入的不是4位数字,
        //输出“您输入的会员号有误”
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入会员号:");
//        int a = sc.nextInt();
//        if(((a+"").length())==4){
//            System.out.println("登录成功");
//        }else {
//            System.out.println("您输入的会员号有误");
//        }


        //8、手动输入a，b，c三个变量的数值，
        //要求通过数值交换，
        //把输入的数值从小到大
        //排序放入a,b,c中，并输出
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入三个数");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int x,y;
//        if(a>b){
//            x = a;
//            a = b;
//            b = x;
//        }
//        if(a>c){
//            x = a;
//            a = c;
//            c = x;
//        }
//        if(b>c){
//            x = b;
//            b = c;
//            c = x;
//        }
//        System.out.println(a+","+b+","+c);
    }
}
