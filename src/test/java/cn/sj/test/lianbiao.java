package test.java.cn.sj.test;
class asde{

    class asdef{
        public void dd1(int a){
            int f;
            f=a;
            System.out.println(f);
        }
    }
}

public class lianbiao {
    public static void main(String[] args) {
        asde a = new asde();
        asde.asdef b = a.new asdef();
        b.dd1(1);
    }
}







