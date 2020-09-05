package test.java.cn.sj.test.test;
//1.利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
// 60-89分之间的用B表示，60分以下的用C表示。
//2.输入两个正整数m和n，求其最大公约数和最小公倍数。
//3.输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
//4.求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。
// 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；
//5.一个数如果恰好等于它的因子之和，这个数就称为”完数”。
// 例如6=1＋2＋3.编程找出1000以内的所有完数。
//6.一球从100米高度自由落下，每次落地后反跳回原高度的一半；
// n次落地经过路线总长度和下次反弹的高度。


import java.util.Scanner;


public class third_day_test {
    //1.利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
    // 60-89分之间的用B表示，60分以下的用C表示。
    public class ss{}
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入分数");
//        int num = sc.nextInt();
//        System.out.println((num>=90? "A":(num>=60? "B":"C")));

        //2.输入两个正整数m和n，求其最大公约数和最小公倍数。
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入2个数:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int a1[] = yiz(a);
//        int b1[] = yiz(b);
//        yueshu(a1,b1);

//        3.输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一行字符:");
//        String sum = sc.nextLine();
//        geshu(sum);

        //求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入值和个数：");
//        int num = sc.nextInt();
//        int nub = sc.nextInt();
//        add1(num,nub);

        //5.一个数如果恰好等于它的因子之和，这个数就称为”完数”。例如6=1＋2＋3.编程找出1000以内的所有完数。
//        int a = 1;
//        int b = 1000;
//        wanshu(a,b);

        //6.一球从100米高度自由落下，每次落地后反跳回原高度的一半；n次落地经过路线总长度和下次反弹的高度
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第几次：");
//        int n = sc.nextInt();
//        jishuan(n);


                int num = 2147483647 ;
                num += 2L ;
                System.out.println(num) ;


    }

//    private static void jishuan(int n) {
//        double hight = 100;
//        double sum = 0;
//        for(int i=0;i<n;i++){
//            sum = sum + hight +hight/2.0;
//            hight = hight/2.0;
//        }
//        System.out.println(n+"次落地后总长为："+sum+",下次反弹高度"+hight/2.0);
//    }

//    private static void wanshu(int a,int b) {
//        int sum = 0;
//        System.out.println("1~1000的完数为：");
//        for(int i = a ; i <= b ; i++ ){
//            for(int j = 1; j <= i ; j++ ){
//                while (i%j==0){
//                    if(j!=i) {
//                        sum = sum + j;
//                    }
//                    break;
//                }
//            }
//            if(sum==i){
//                System.out.print(i+" ");
//            }
//            sum = 0;
//        }
//    }

//    private static void add1(int num, int nub) {
//        int sum = num;
//        int count = num;
//        System.out.print(num+"+");
//        for(int i=1;i<nub;i++){
//            sum =  sum + (num*(int)Math.pow(10,i));
//            count += sum;
//            System.out.print(sum);
//            if(i+1!=nub) {
//                System.out.print("+");
//            }
//        }
//        System.out.println("和为"+count);
//    }


//    private static void geshu(String sum) {
//        char a[] = sum.toCharArray();
//        int zm = 0;
//        int kg = 0;
//        int nub = 0 ;
//        int qita = 0;
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]);
//            if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z')){
//                zm++;
//            }else if(a[i]==' '){
//                kg++;
//            }else if(a[i]>='0'&&a[i]<='9'){
//                nub++;
//            }else {
//                qita++;
//            }
//        }
//        System.out.println("字母有："+zm+"\n空格有:"+kg+"\n数字有:"+nub+"\n其他字符有:"+qita);
//    }


//    private static void yueshu(int[] a1, int[] b1) {
//        int ys = 1;
//        for(int i=0;i<a1.length;i++){
//            for(int j = 0; j< b1.length;j++){
//                if(a1[i]==b1[j]){
//                    b1[j]=1;
//                    ys=ys*a1[i];
//                }
//            }
//        }
//        int count = 1;
//        for(int i=0;i<a1.length;i++){
//            count = count * a1[i];
//        }
//        for(int j = 0; j< b1.length;j++) {
//            count = count * b1[j];
//        }
//        System.out.println("最大公约数:"+ys);
//        System.out.println("最小公倍数:"+count);
//    }
//
//    public static int[] yiz(int a){
//        int j=0;
//        int b[] = new int[getCount(a)];
//        for(int i=2;i<a;i++){
//            while (a%i == 0){
//                b[j]=i;
//                a = a/i;
//                j++;
//            }
//        }
//        if (a>1){
//            b[j]=a;
//        }
//        for(int i=0 ; i<b.length;i++){
//            System.out.print(b[i]+" ");
//        }
//        System.out.println();
//        return b;
//    }
//    public static int getCount(int a){
//        int b=0;
//        for(int i=2;i<a;i++){
//            while (a%i == 0){
//                b++;
//                a = a/i;
//            }
//        }
//        b++;
//        if (a>1){
//        }
//        return b;
//    }
}
