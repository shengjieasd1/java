package cn.sj.test.test;

//class MyMath{
//    public static int div(int x,int y) throws Exception{
//        return x/y;
//    }
//}

//class MyMath{
//    public static int div(int x,int y) throws Exception{
//        int result = 0;
//        System.out.println("计算开始");
//        try {
//            result = x/y;
//        } finally {
//            System.out.println("计算结束");
//        }
//        return result;
//    }
//}

class AddException extends Exception{
    public AddException(String msg){
        super(msg);
    }
}

public class eleven_day {
    public static void main(String[] args) {
        int num = 20;
        try{
            if(num >10){
                throw new AddException("数值传递的过大");
            }
        }catch (Exception e){
            e.printStackTrace();
        }



//        try{
//            System.out.println(MyMath.div(10,0));
//        }catch (Exception e){
//            e.printStackTrace();
//        }




//        try {
//            throw new Exception("aaaa");
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        try {
//            System.out.println(MyMath.div(10,2));
//        }catch (Exception e){
//            e.printStackTrace();
//        }


    }
}
