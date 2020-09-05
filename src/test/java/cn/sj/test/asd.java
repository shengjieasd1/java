package test.java.cn.sj.test;

class sum1{
    private int age;
    private String name;

    public sum1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class asd {
    public static void main(String[] args) {
        sum1 sum1 = new sum1(2,"盛杰");
        sum1 sum2 = new sum1(2,"盛杰");


        if(sum1==sum2){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }

        System.out.println(sum1 == sum2);
        System.out.println(sum1.equals(sum2));


        String s1 = "aaa";
        String s2 = new String("aaa"); //new创建的是形参
        String s7 = new String("aaa");
        String s3 = "aaa";
        String s4 = "aaa,bbb,ccc,ddd";
        String d4 = "aaa,ddd,bbb,ccc";
        String e4 = "aaa,bbb,ccc,ddd";
        System.out.println(s2 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s7));
        System.out.println(s1.hashCode());
        String s5[] = s4.split(",");
        String d5[] = d4.split(",");
        String e5[] = e4.split(",");
        String g5[] = s4.split(",");
        System.out.println(s5.hashCode());
        System.out.println(d5.hashCode());
        System.out.println(e5.hashCode());
        System.out.println(g5.hashCode());
        int d = 0 ;
        for(int i=0;i<s5.length;i++) {
            d += s5[i].hashCode();
            System.out.println(s5[i]);
        }
        System.out.println(d);



    }
}
