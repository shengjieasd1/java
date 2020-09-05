package cn.sj.test.test;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class tweleve_day_test {
    public static void main(String[] args) {
        //1、多分支结构
        //商场根据会员积分打折，
        //2000分以内打9折，
        //4000分以内打8折
        //8000分以内打7.5折，
        //8000分以上打7折，
        //使用if-else-if结构，实现手动输入购物金额和积分，计算出应缴金额

//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入金额:");
//        double je = sc.nextDouble();
//        System.out.print("请输入积分:");
//        double jf = sc.nextDouble();
//        double sum = 0;
//        if(jf<=2000){
//            sum = je*0.9;
//        }else if(jf<=4000){
//            sum = je * 0.8;
//        }else if(jf<=8000){
//            sum = je * 0.75;
//        }else {
//            sum = je * 0.7;
//        }
//        System.out.println("应缴:"+sum+"元");


        //2、机票价格按照淡季旺季、头等舱和经济舱收费、
        //输入机票原价、月份和头等舱或经济舱，
        //其中旺季（5-10月）头等舱9折，经济舱85折，
        //淡季（11月到来年4月）头等舱7折，经济舱65折，
        //最终输出机票价格
//        Scanner sc =new Scanner(System.in);
//        System.out.print("请输入机票原价:");
//        double jp = sc.nextDouble();
//        System.out.print("请输入月份:");
//        int month = sc.nextInt();
//        System.out.print("请输入坐什么舱:");
//        String chang = sc.next();
//
//        if(month<=10&&month>=5){
//            if("头等舱".equals(chang)){
//                jp = jp *0.9;
//            }else {
//                jp = jp * 0.85;
//            }
//        }else {
//            if("头等舱".equals(chang)){
//                jp = jp *0.7;
//            }else {
//                jp = jp * 0.65;
//            }
//        }
//        System.out.println("机票价格为:"+jp);

        //3、选择一个形状（1长方形、2正方形、3三角形、4圆形）
        //根据不同的选择让用户输入不同的信息，
        //长方形有长和宽、
        //正方形有边长、
        //三角形有底和高、
        //圆形有半径，
        //计算输出指定形状的面积
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入形状:");
//        String str = sc.next();
//        switch (str){
//            case "长方形":
//                System.out.print("请输入长方形的长和宽:");
//                double c = sc.nextDouble();
//                double k = sc.nextDouble();
//                BigDecimal c1 = BigDecimal.valueOf(c);
//                BigDecimal k1 = BigDecimal.valueOf(k);
//                System.out.println("面积为:"+(c1.multiply(k1).doubleValue()));
//                break;
//            case "正方形":
//                System.out.print("请输入正方形的边长:");
//                double b = sc.nextDouble();
//                BigDecimal b1 = BigDecimal.valueOf(b);
//                System.out.println("面积为:"+(b1.multiply(b1).doubleValue()));
//                break;
//            case "三角形":
//                System.out.print("请输入长方形的底和高:");
//                double d = sc.nextDouble();
//                double g = sc.nextDouble();
//                BigDecimal d1 = BigDecimal.valueOf(d);
//                BigDecimal g1 = BigDecimal.valueOf(g);
//                System.out.println("面积为:"+((d1.multiply(g1).doubleValue())/2));
//                break;
//            case "圆形":
//                System.out.print("请输入圆形的半径:");
//                double bj = sc.nextDouble();
//                BigDecimal bj1 = BigDecimal.valueOf(bj);
//                System.out.println("面积为:"+(3.14*bj1.multiply(bj1).doubleValue()));
//                break;
//        }

        //4、输入年份和月份，输出这个月应该有多少天（使用switch结构）
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入年份：");
//        int nian = sc.nextInt();
//        System.out.print("请输入月份");
//        String yue = sc.next();
//        System.out.print("有");
//        switch (yue){
//            case "一":
//            case "三":
//            case "五":
//            case "七":
//            case "八":
//            case "十":
//            case "十二":
//                System.out.println("31天");
//                break;
//            case "二":
//                if(nian%4==0 && nian%100!=0){
//                    System.out.println("29天");
//                }else {
//                    System.out.println("28天");
//                }
//
//                break;
//            case "四":
//            case "九":
//            case "六":
//            case "十一":
//                System.out.println("30天");
//                break;
//        }


        //5、随机生成一个1-100之间的数字num，循环让用户输入猜这个数，
        //如果用户输入的数字大于num提示输入的数字比较大，
        //如果用户输入的数字小于num提示输入的数字比较小，
        //直到用户输入的数字和num相等为止，然后输出用户猜数的总次数
//        System.out.print("请输入一个数：");
//        V v = new V();
//        v.guess();

        //6、打印出1-100之间所有不是7的倍数和不包含7的数字，并求和
//        int sum = 0;
//        int num = 0;
//        for(int i=1;i<100;i++){
//            if(i%7!=0){
//                String a = String.valueOf(i);
//                if(!a.contains("7")){
//                    System.out.print(i+" ");
//                    sum+=i;
//                    num++;
//                    if(num==20){
//                        System.out.println();
//                        num=0;
//                    }
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("和为:"+sum);



        //7、循环输入5个数，输完后显示这些数中有没有负数
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入5个数:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//        if(a<0||b<0||c<0||d<0||e<0){
//            System.out.println("有负数");
//        }else {
//            System.out.println("没有负数");
//
//        }



        //8、有一个有钱的神经病，他往银行里存钱，
        //第一天存1元,以后每天比前一天多存50%，完成下列计算任务
        //1)他存到第几天，当天存的钱会超过10元
        //一个月（30天）后，他总共存了多少钱
//        ajj ajj = new ajj();
//        ajj.add(1);

        //9、有一个400米一圈的操场，一个人要跑10000米，
        //第一圈50秒，其后每一圈都比前一圈慢1秒，
        //按照这个规则计算跑完10000米需要多少秒
//        int time = 50;
//        int sum = 0;
//        for(int i = 1;i<=25;i++){
//            sum += time++;
//        }
//        System.out.println("总共需要花费:"+sum+"秒");

        //
        //10、用户输入任意一个整数，求各位数字之和
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入任意一个整数");
//        int a = sc.nextInt();
//        int sum = 0;
//        while (true){
//            if(a==0){
//                break;
//            }
//            sum += (a%10);
//            a = a/10;
//        }
//        System.out.println("和为:"+sum);

        //11、井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
        //计算蜗牛需要多少天才能从井底到爬出来
//        double c = 56.7;
//        double w = 0;
//        int a = 0;
//        while (true){
//            a++;
//            w = w+ 5;
//            if(w>c){
//                break;
//            }
//            w=w-3.5;
//        }
//        System.out.println("需要"+a+"天");

        //12、求1~1000以内质数列表
        //PS：质数是只能被1和自身整除的整数
//        boolean b = true;
//        int a = 0;
//        for(int i=2;i<1000;i++){
//            for(int j=2;j<i;j++){
//                if(i%j==0){
//                    b=false;
//                    break;
//                }
//
//            }
//
//            if(b){
//                System.out.print(i+" ");
//                a++;
//            }
//            if(a>30){
//                System.out.println();
//                a = 0;
//            }
//            b=true;
//        }



        //13、定义一个数组int[] nums={8,7,3,9,5,4,1}
        //输出数组中的最大值和最大值所在的下标
//        int[] nums={8,7,3,9,5,4,1};
//        int a = nums[0];
//        int b = 0;
//        for(int i = 0;i<nums.length;i++){
//            if(a<nums[i]){
//                a = nums[i];
//                b = i;
//            }
//        }
//        System.out.println("最大值为:"+a+"下标为:"+b);

    }


}
//class ajj{
//    double sum = 1;
//    boolean bo = true;
//    public void add(double a){
//        double b = a;
//        for(int i = 2; i<31;i++){
//
//            BigDecimal b1 = BigDecimal.valueOf(b);
//            BigDecimal b2 = BigDecimal.valueOf(1.5);
//            b = b1.multiply(b2).doubleValue() ;
//            sum += b;
//            if (bo){
//                if(b>10){
//                    System.out.println("在第"+i+"天时他存了"+b+"元。");
//                    bo = false;
//                }
//            }
//        }
//        System.out.println("总共存了："+sum+"元");
//    }
//
//}

//class V{
//    int v = 100;
//    int i = 1;
//    Random b = new Random();
//    int num =  b.nextInt(100);
//    public void guess(){
//        Scanner sc = new Scanner(System.in);
//        int  a = sc.nextInt();
//        if(a>num){
//            System.out.println("太大了");
//            System.out.print("请重新输入一个数：");
//            i++;
//            guess();
//        }else if(a<num){
//            System.out.println("太小了");
//            System.out.print("请重新输入一个数：");
//            i++;
//            guess();
//        }else{
//            System.out.println("恭喜输入正确,总共输入了"+i+"次");
//        }
//    }
//}