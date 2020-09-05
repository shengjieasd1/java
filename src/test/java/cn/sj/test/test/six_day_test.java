package test.java.cn.sj.test.test;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

//1题目：输入3个数a,b,c，按大小顺序输出。
//2题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
//3题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数。
//4题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
//5题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
public class six_day_test {
    public static void main(String[] args) {
        //1题目：输入3个数a,b,c，按大小顺序输出。
//        System.out.println("请输入三个数（用空格分开）：");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        arr(a,b,c);

        //2题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
//        int a[] = {1,2,3,4,5,6,7,8,9,10,12};
//        run1(a);

        //3题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数。
//        int a[] = {1,5,7,8,9,0,3,5,7,8,9};
//        System.out.print("请输入后移数:");
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        run2(a,m);

        //4题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
//        System.out.print("请输入人数:");
//        Scanner sc = new Scanner(System.in);
//        run3(sc.nextInt());

        //5题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
        System.out.println("请输入字符串长度:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        run4(str);
    }

    private static void run4(String str) {
        char[] a = str.toCharArray();
        System.out.println("字符串长度为:"+a.length);
    }

//    private static void run3(int nextInt) {
//        int a[] = new int[nextInt];
//        boolean c = false;
//        int b = 0;
//        int i=1,j=nextInt;
//        while (true){
//            if(a[b]!=3) {
//                if(j==b){
//                    c = true;
//                    break;
//                }
//                a[b] = i;
//                i++;
//                if(i==4){
//                    i=1;
//                }
//                j=b;
//            }
//            b++;
//            if(c){
//                break;
//            }
//            if(b==nextInt){
//                b=0;
//            }
//        }
//        b=b+1;
//        System.out.println("第"+b+"位为最后一人");
//    }

//    private static void run2(int[] a, int m) {
//        for(int i =a.length-m;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//
//        for(int i =0;i<a.length-m;i++){
//            System.out.println(a[i]);
//        }
//    }

//    private static void run1(int[] a) {
//        int max=0,min=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>a[max]){
//                max = i;
//            }
//        }
//        int c = 0;
//        c = a[0];
//        a[0]= a[max];
//        a[max]= c;
//        for(int i=0;i<a.length;i++) {
//            if(a[i]<a[min]){
//                min = i;
//            }
//        }
//        c = a[a.length-1];
//        a[a.length-1]=a[min];
//        a[min] = c;
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]+"");
//        }
//    }

//    private static void arr(int a, int b, int c) {
//        if(a>b){
//            if(a>c){
//                if(b>c){
//                    System.out.println(""+a+" "+b+" "+c);
//                }else {
//                    System.out.println(""+a+" "+c+" "+b);
//                }
//            }else {
//                System.out.println(""+c+" "+a+" "+b);
//            }
//        }else {
//            if(a>c){
//                System.out.println(""+b+" "+a+" "+c);
//            }else{
//                if(b>c){
//                    System.out.println(""+b+" "+c+" "+a);
//                }else {
//                    System.out.println(""+c+" "+b+" "+a);
//                }
//            }
//        }
//    }

}
