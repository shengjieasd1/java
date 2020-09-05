package cn.sj.test.test;
//class Book extends Object{
//    private String title;
//    private double price;
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", price=" + price +
//                '}';
//    }
//
//    public boolean equals(Object obj){
//        if (this == obj){
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        if(!(obj instanceof Book)){
//            return false;
//        }
//        Book book = (Book) obj;
//        if(this.title.equals(book.title)&&this.price == book.price){
//            return true;
//        }
//        return false;
//    }
//
//
//    public Book(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//}
interface A{
    public void fun();
}

interface D{
    public void fun();
}

interface C extends A,D {
    public void fun();
}

class B extends Object implements A{

    @Override
    public void fun() {
        System.out.println("Hello world!!!");
    }
}
//interface Message{
//    public void print();
//}
//
//class MyInt {
//    private int num;
//
//    public MyInt(int num) {
//        this.num = num;
//    }
//    public  int inValue(){
//        return this.num;
//    }
//}
//}
//interface Message {
//    public void print();
//}


public class nine_day {
//    public static void fun(Message msg){
//        msg.print();
//    }
    public static void main(String[] args) {
//        Integer obj = new Integer(10);
//        int temp = obj.intValue();


//        fun(new Message() {
//            @Override
//            public void print() {
//                System.out.println("Hello world");
//            }
//        });



//        fun(new Message(){
//            @Override
//            public void print() {
//                System.out.println("hello");
//            }
//        });
//        point<Integer> a = new point<>();
//        String str = "123";
//        int temp = Integer.parseInt(str);
//        System.out.println(temp*2);

//        Boolean obj = new Boolean(true);
//        boolean temp = obj.booleanValue();
//        System.out.println(temp);

//        String str = "123";
//        int a = Integer.parseInt(str);
        String str = "true";
        boolean a = Boolean.parseBoolean(str);


//        Integer obja = 10;
//        Integer objb = 10;
//        Integer objc = new Integer(10);
//        System.out.println(obja == objb); //true
//        System.out.println(obja == objc); //false
//        System.out.println(objb == objc); //false


//        A a = new B();
//        Object obj = a;
//        A t = (A) obj;
//        t.fun();


//        Object obj = new int [] {1,2,3};
//        System.out.println(obj);
//        if(obj instanceof int[]){
//            int data [] = (int[]) obj;
//            for(int x =0;x<data.length;x++){
//                System.out.println(data[x]);
//            }
//        }

//        Book b =new Book("aaaaa",124324);
//        System.out.println(b.toString());
    }
}
