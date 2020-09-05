package test.java.cn.sj.test;

public class String_class {
    public static void main(String[] args) {
        String str = "sfewfewf1234```  sfgrtgt34AFGAGE";
        char cr[] = {'1','2','3','4','5','g','h'};
        String str1 = new String(cr);
        String str2 = new String(cr,1,3);
        System.out.println(str1);
        System.out.println(str2);
        str.charAt(0);
        char [] data = str.toCharArray();

        for(int x = 0;x<data.length;x++){
            System.out.println(data[x]);
        }
    }

}
