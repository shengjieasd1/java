package test.java.cn.sj.test.test;

import java.util.Random;
import java.util.Scanner;


//1题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
//2题目：计算字符串中子串出现的次数 。
//3题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，把原有的数据和计算出的平均分数存放在磁盘文件 "stud "中。
//4给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
//5.给出两个非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//您可以假设除了数字 0 之外，这两个数都不会以 0开头。
//6.给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
//7.给定两个大小为 m 和 n 的有序数组nums1 和nums2。
//请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为O(log(m + n))。
//你可以假设nums1和nums2不会同时为空
public class seven_day_test {

    public static void main(String[] args) {
        //1题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n。
//        System.out.print("请输入一个数：");
//        Scanner sc = new Scanner(System.in);
//        sum1(sc.nextInt());

        ////2题目：字符串排序。
//        String a[] = {"adfa","sfrefe","aaaaa","saadewd","vfverf","ddeeqqre"};
//        arr(a);

        //3题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
        // 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，
        // 拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
        //run1();

        //4题目：809*??=800*??+9*??+1
        //其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果
        //run2();

        //5题目：求0—7所能组成的奇数个数。
        //run3();

        //6题目：一个偶数总能表示为两个素数之和。
//        System.out.println("请输入一个偶数:");
//        Scanner sc = new Scanner(System.in);
//        run4(sc.nextInt());

        //7题目：判断一个素数能被几个9整除。
//        System.out.print("请输入一个素数:");
//        Scanner sc =new Scanner(System.in);
//        int a = sc.nextInt();
//        if(yushu(a)){
//            System.out.println("是素数");
//            run5(a);
//        }else {
//            System.out.println("不是素数");
//        }

        //1题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
        // 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
//        Random ra = new Random();
//        int a = ra.nextInt(10000-1000)+1000;
//        System.out.println("需要转换的数为:"+a);
//        run1(a);

        //2题目：计算字符串中子串出现的次数 。
        //1.先把字符串转为char数组，然后一个个查询，
        //2.通过indexof查询字符串的，然后统计
//        String a = "Cannot use Arrays.copyOf because of class initialization order issues";
//        System.out.println("字符串为"+a);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入需要计算的字符串:");
//        select(a,sc.next());

        //4给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
//        int[] b = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        for(int i=0;i<b.length;i++){
//            System.out.print(b[i]+"  ");
//        }
//        System.out.println();
//        int[] a = {1,2,3,4,5,6,7,8,9,32,12,11,15,75,32,21};
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+"  ");
//        }
//        System.out.println();
//        System.out.print("请输入任意上面两个数的和：");
//        Scanner sc =new Scanner(System.in);
//        run3(a,sc.nextInt());

        //5.给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
        String str = "Cannot use Arrays.copyOf because of class initialization order issues";
        System.out.println(str);
        run5(str);
    }

    private static void run5(String str) {
        char[] cr =str.toCharArray();
        int a=0;
        for(int i=0;i<cr.length;i++){

        }
    }

//    private static void run3(int[] a, int nextInt) {
//        for(int i=0;i<a.length;i++){
//            if(nextInt>a[i]){
//                for(int j=i+1;j<a.length;j++){
//                    if(nextInt == (a[i]+a[j])){
//                        System.out.println("下标为"+i+"和"+j);
//                    }
//                }
//            }
//        }
//    }

//    private static void select(String a, String next) {
//        char[] cr = a.toCharArray();
//        char[] cr1 = next.toCharArray();
//        boolean bo = false;
//        int c = 0;
//        for(int i = 0 ;i<cr.length;i++){
//            if(cr1[0]==cr[i]){
//                for(int j=0;j<cr1.length;j++){
//                    if((j+i)>=cr.length){
//                        bo=false;
//                        break;
//                    }
//                    if(cr[j+i]!=cr1[j]){
//                        bo = false;
//                        break;
//                    }else {
//                        bo = true;
//                    }
//                }
//            }
//            if(bo){
//                c++;
//                bo = false;
//            }
//        }
//        System.out.println("一共有"+c+"个字符串和"+next+"相同");
//    }

//    private static void run1(int a) {
//        int x[] = new int[4];
//        x[0] = a/1000;
//        x[1] = (a/100)%10;
//        x[2] = (a/10)%10;
//        x[3] = a%10;
//        for(int i=0;i<4;i++){
//            x[i] = (x[i]+5)%10;
//        }
//        int y = 0;
//        y=x[0];
//        x[0]=x[3];
//        x[3]=y;
//
//        y=x[1];
//        x[1]=x[2];
//        x[2]=y;
//        for(int i=0;i<4;i++){
//            System.out.print(x[i]);
//        }
//
//    }
//    private static void run5(int a) {
//        for(int i=1;i<=a;i++){
//            if((9*i)%a==0){
//                System.out.println(a+"可以被"+i+"个9整除");
//            }
//        }
//    }

    //    private static void run4(int nextInt) {
//        for(int i=2;i<nextInt/2;i++){
//            if(yushu(i)){
//                if(yushu(nextInt-i)){
//                    System.out.println(nextInt+"是"+i+"和"+(nextInt-i)+"组成");
//                }
//            }
//        }
//    }
//
    private static boolean yushu(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

//    private static void run3() {
//        int i[] = {0,1,2,3,4,5,6,7};
//        int count=0;
//        for(int a=0;a<i.length-1;a++){
//            for(int b=1;b<i.length-1;b++){
//                for (int c=2;c<i.length-1;c++){
//                    for (int d=3;d<i.length-1;d++){
//                        for (int e=4;e<i.length-1;e++){
//                            for (int f=5;f<i.length-1;f++){
//                                for (int g=6;g<i.length-1;g++){
//                                    count++;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("0~7可以组合成："+(count*4)+"个奇数");
//
//    }

//    private static void run2() {
//        int  A=0;
//        for(int i=10;i<100;i++){
//            if(8*i<100&&(9*i>=100)){
//                if(809*i == (800*i + 9*i)){
//                    A=i;
//                    System.out.println("??为:"+i);
//                    break;
//                }
//            }
//        }
//        System.out.println("809*??="+809*A);
//    }

//    private static void run1() {
//        double sum = 4,a;
//        boolean bo = false;
//        System.out.println("假设最少只剩下了4个桃子，而且得保证都为整数");
//        while (true) {
//            a =sum;
//            for (int i = 0; i < 5; i++) {
//                if((a*(5 / 4.0))%1==0 ){
//                    bo = true;
//                }else {
//                    bo = false;
//                    break;
//                }
//                a = (a * (5 / 4.0)) + 1;
//            }
//            if(bo){
//                break;
//            }
//            sum++;
//        }
//
//        System.out.println("原来最少有"+(int)a+"个");
//
//    }

//    private static void arr(String[] a) {
//        System.out.print("原字符串为：");
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]+"   ");
//        }
//        String b=a[0];
//        for(int i=0;i<a.length;i++){
//            for(int j=i;j<a.length;j++){
//                if(a[i].compareTo(a[j])>0){
//                    b = a[i];
//                    a[i] = a[j];
//                    a[j] = b;
//                }
//            }
//        }
//        System.out.println();
//        System.out.print("重新排序后为:");
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]+"   ");
//        }
//    }

//    private static void sum1(int nextInt) {
//        double sum=0 ;
//        double a;
//        if(nextInt%2==1){
//            a = 1.0;
//        }else {
//            a = 2.0;
//        }
//        for(int i =1;i<=(nextInt/2.0);i++){
//            sum = sum + 1/(a*i);
//        }
//        if(nextInt%2==1){
//            sum = sum + 1/(nextInt*1.0);
//        }
//        System.out.println("和为:"+sum);
//
//
//    }
}
