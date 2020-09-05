package cn.sj.test.test;

import java.util.*;

public class thirteen_day_test {
    public static void main(String[] args) {
        //22、向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
        //1)升序输出、降序输出
        //2)输出总和、平均数
//        Random random = new Random();
//        int[] a = new int[10];
//        for(int i = 0;i<10;i++){
//            a[i] = random.nextInt(10);
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//        Arrays.sort(a);
//        for(int i = 0;i<10;i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        Integer b[] = new Integer[10];
//        for(int i = 0;i<10;i++){
//            b[i] = a[i];
//        }
//        Arrays.sort(b, Collections.reverseOrder());
//        for(int i = 0;i<10;i++){
//            System.out.print(b[i]+" ");
//        }
//        int sum = 0;
//        for(int i = 0;i<10;i++){
//            sum += a[i];
//        }
//        System.out.println();
//        System.out.println(sum);
//        System.out.println(sum/10.0);


        //23、向一个长度为5的整型数组中随机生成5个1-10的随机整数
        //要求生成的数字中没有重复数
//        Random random = new Random();
//        int a[] = new int[5];
//        int foot = 0;
//        while (foot<5){
//            int b = random.nextInt(10);
//            if(pd(a,b)){
//                a[foot ++]=b;
//            }
//        }
//        for(int i=0;i<a.length;i++) {
//            System.out.print(a[i]+" ");
//        }


        //24、向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
        //1)统计每个数字出现了多少次
        //2)输出出现次数最多的数字
        //3)输出只出现一次的数字中最小的数字
//        int a[] = new int[10];
//        Random random = new Random();
//        for(int i=0;i<a.length;i++){
//            a[i] = random.nextInt(9);
//        }
//        int js[] = new int[10];
//        for(int i=0;i<10;i++){
//            switch (a[i]){
//                case 0:
//                    js[0]++;
//                    break;
//                case 1:
//                    js[1]++;
//                    break;
//                case 2:
//                    js[2]++;
//                    break;
//                case 3:
//                    js[3]++;
//                    break;
//                case 4:
//                    js[4]++;
//                    break;
//                case 5:
//                    js[5]++;
//                    break;
//                case 6:
//                    js[6]++;
//                    break;
//                case 7:
//                    js[7]++;
//                    break;
//                case 8:
//                    js[8]++;
//                    break;
//                case 9:
//                    js[9]++;
//                    break;
//            }
//        }
//        int max = 0;
//        int maxj = 0;
//        for(int i=0;i<10;i++){
//            System.out.println(i+"出现了:"+js[i]+"次");
//            if(js[i]>max){
//                max = js[i];
//                maxj = i;
//            }
//        }
//        System.out.println(maxj+"出现的最多为:"+max+"次");
//
//        for(int i=0;i<10;i++){
//            if(js[i]==1){
//                System.out.println(i+"为出现1次并且是最小的数");
//                break;
//            }
//        }
        //1给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//        System.out.println(kh(4));


        //8给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//        int[] a = {1,2,3,3,3,4,5,5,6,7,8,9,11,11,23};
//        Set<Integer> i = new TreeSet<>();
//        for(int x=0;x<a.length;x++){
//            i.add(a[x]);
//        }
//        System.out.println(i.size());


        //9、给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点?(i,?ai) 。
        // 在坐标内画 n 条垂直线，垂直线 i?的两个端点分别为?(i,?ai) 和 (i, 0)。
        // 找出其中的两条线，使得它们与?x?轴共同构成的容器可以容纳最多的水。
        //说明：你不能倾斜容器，且?n?的值至少为 2。
//        Random random = new Random();
//        random.nextInt();
//        int a[] = new int[10];
//        int b =0 ;
//        boolean c = true;
//        System.out.print("分别为:");
//        for(int i=0;i<a.length;i++){
//            while (c) {
//                b = random.nextInt(20);
//                if(b!=0){
//                    c=false;
//                }
//            }
//            a[i]=b;
//            System.out.print(b+" ");
//            c=true;
//        }
//        int maxx=0;
//        int max = 0;
//        int mianji=0;
//        for(int i=0;i<a.length;i++){
//            for(int j = i+1;j<a.length;j++){
//                mianji = (Math.abs(a[j]-a[i])*(j-i));
//                if(mianji>max){
//                    max=mianji;
//                }
//            }
//        }
//
//        System.out.println();
//        System.out.println("最大面积为:"+max);
//    }

        //3阿拉伯数字转罗马数字，罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
        Scanner sc = new Scanner(System.in);
        List<String> ss = new ArrayList<>();
        int a = sc.nextInt();//1990 == MCMXC
        int b = a;
        int i = 1;
        while (b>0){
            int tmp = b%10;
            if(i == 1){
                if(tmp>0&&tmp<4){
                    for(int x=1;x<4;x++) {
                        ss.add("I");
                    }
                }else if(tmp == 4){
                    ss.add("IV");
                }else if(tmp >5 && tmp<9){
                    for(int x=1;x<tmp-4;x++){
                        ss.add("I");
                    }
                    ss.add("V");
                }else if (tmp == 9){
                    ss.add("IX");
                }
            }else if(i == 10){
                if(tmp>0&&tmp<4){
                    for(int x=1;x<4;x++) {
                        ss.add("X");
                    }
                }else if(tmp == 4){
                    ss.add("XL");
                }else if(tmp >5 && tmp<9){
                    for(int x=1;x<tmp-4;x++){
                        ss.add("X");
                    }
                    ss.add("L");
                }else if (tmp == 9){
                    ss.add("XC");
                }
            }else if(i == 100){
                if(tmp>0&&tmp<4){
                    for(int x=1;x<4;x++) {
                        ss.add("C");
                    }
                }else if(tmp == 4){
                    ss.add("CD");
                }else if(tmp >5 && tmp<9){
                    for(int x=1;x<tmp-4;x++){
                        ss.add("C");
                    }
                    ss.add("D");
                }else if (tmp == 9){
                    ss.add("CM");
                }
            }else {
                for(int x=0;x<tmp;x++){
                    ss.add("M");
                }
            }
            i=i*10;
            b=b/10;
        }
        Collections.reverse(ss);
        for (i=0;i<ss.size();i++){
            System.out.print(ss.get(i));
        }



    }
//    private static List<String> kh(int i) {
//        if(i == 1){
//            List<String> list = new ArrayList<>();
//            list.add("()");
//            return list;
//        }else{
//            List<String> list = kh(i-1);
//            int size = list.size();
//            List<String> newList = new ArrayList<>();
//            for(int a=0;a<size;a++){
//                String tmp = list.get(a);
//                char[] arr = tmp.toCharArray();
//                for(int j=0;j<arr.length;j++){
//                    String tmp0 = tmp.substring(0,j);
//                    String tmp1 = tmp.substring(j,tmp.length());
//                    String tmp2 = tmp0+"()"+tmp1;
//                    if(!newList.contains(tmp2)){
//                        newList.add(tmp2);
//                    }
//                }
//            }
//            return newList;
//        }
//    }
//    public static boolean pd(int a[],int pd){
//        if(pd ==0 ){
//            return false;
//        }
//        for(int i = 0;i<a.length;i++){
//            if(a[i] == pd){
//                return false;
//            }
//        }
//        return true;
//    }
}
