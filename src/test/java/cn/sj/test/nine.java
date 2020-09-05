package test.java.cn.sj.test;

public class nine {
    public static void main(String[] args) {
//        for(int i=1;i<10;i++){
//            for(int a=1;a<=(10-i);a++){
//                System.out.print(a+"x"+(10-i)+"="+a*(10-i));
//                if(a*(10-i)>=10) {
//                    System.out.print("    ");
//                }else{
//                    System.out.print("     ");
//                }
//
//            }
//        System.out.println();
//        }
        int i = 1;
        while (i<10){
            int a = 1;
            while(a<=i){
                System.out.print(a+"x"+i+"="+a*i);
                if(a*i>=10){
                    System.out.print("    ");
                }else{
                    System.out.print("     ");
                }
                a++;
            }
            System.out.println();
            i++;
        }
    }
}
