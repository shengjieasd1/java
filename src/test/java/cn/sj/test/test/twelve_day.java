package cn.sj.test.test;


//import static java.lang.Math.*;

class Point<T>{ // T只表示一个标记，在使用时需要设置具体的类型
    private T x; //T由Point动态使用。
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}

//class Message<T>{
//    private T msg;
//
//    public T getMsg() {
//        return msg;
//    }
//
//    public void setMsg(T msg) {
//        this.msg = msg;
//    }
//}

//interface IMessage<T>{
//    public void print(T t);
//}

//class MessageImpl implements IMessage<String>{
//
//    @Override
//    public void print(String t) {
//        System.out.println(t);
//    }
//}

public class twelve_day {
    public static <T> T fun(T t){
        return t;
    }


    public static void main(String[] args) {
        String str = fun("Hello");









//        IMessage<String> msg = new MessageImpl();
//        msg.print("Hello world!");


//        Message<String> m = new Message<>();
//        Message<Integer> a = new Message<>();
//        m.setMsg("Hello world");
//        a.setMsg(11);
//        fun(m);







        Point<Integer> p = new Point<Integer>();
        p.setX(10);
        p.setY(20);
        int x = p.getX();
        int y = p.getY();
        System.out.println("x为："+x+"y为："+y);
        Point<Double> p1 = new Point<Double>();
        p1.setX(10.1);
        p1.setY(20.2);
        Double x1 = p1.getX();
        Double y1 = p1.getY();
        System.out.println("x为："+x1+"y为："+y1);
        Point<String> p2 = new Point<>();
        p2.setX("东京10");
        p2.setY("北纬20");
        String x2 = p2.getX();
        String y2 = p2.getY();
        System.out.println("x为："+x2+"y为："+y2);


//        System.out.println(add(new int[]{1,2,3}));
//        System.out.println(add(new int[]{10,20}));
//        int data [] =new int [] {1,2,3,4,5};
//        for(int i : data){
//            System.out.println(data[i]);
//        }

//        System.out.println("jia"+addExact(10,20));
//        System.out.println("chu"+floorDiv(20,10));

    }
    //    public static void fun(Message<?> temp){
//        System.out.println(temp.getMsg());
//    }


//    public static int add(int ... data){
//        int sum = 0;
//        for(int x =0;x<data.length;x++){
//            sum+=data[x];
//        }
//        return sum;
//    }
}
