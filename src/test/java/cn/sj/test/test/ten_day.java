package test.java.cn.sj.test.test;
//class Singleton{
//    private static Singleton instance;
//    private Singleton(){}//构造方法私有化，
//
//    public static Singleton getInstance() {
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//    public void print(){
//        System.out.println("HELLO world");
//    }
//}


//class Sex{
//    private String title;
//    private static final Sex MALE = new Sex("男");
//    private static final Sex FEMALE = new Sex("女");
//    private Sex(String title){
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return "Sex{" +
//                "title='" + title + '\'' +
//                '}';
//    }
//    public static Sex getInstance(String ch){
//        switch (ch){
//            case "男":return MALE;
//            case "女":return FEMALE;
//            default:return null;
//        }
//    }
//}
//class MyMath{
//    public static int div(int x,int y) throws Exception{
//        int result = 0;
//        System.out.println("aaaaaaaa");
//        try {
//            result = x/y;
//        }catch (Exception e){
//            throw e;
//        }finally {
//            System.out.println("bbbbbbbbb");
//        }
//        return result;
//    }
//}

class AddException extends Exception{
    public AddException(String msg){
        super(msg);
    }
}


public class ten_day {

    public static void main(String[] args) {
        int num = 10;
        try{
            if(num >10){
                throw new AddException("数值传递的过大");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
//        try {
//            System.out.println(MyMath.div(10,0));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
