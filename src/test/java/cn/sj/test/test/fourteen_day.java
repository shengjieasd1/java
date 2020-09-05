package cn.sj.test.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class Bool{
//    private String title;
//    private double price;
//
//    public Bool(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bool bool = (Bool) o;
//        return Double.compare(bool.price, price) == 0 &&
//                Objects.equals(title, bool.title);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, price);
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Bool{" +
//                "title='" + title + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}

//class Book{
//    private String title;
//    private double price;
//
//    public Book(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    public Book(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return Double.compare(book.price, price) == 0 &&
//                Objects.equals(title, book.title);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, price);
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", price=" + price +
//                '}';
//    }
//
//}


//interface  fr{
//
//}

//class A{
//    public void ss(){
//        System.out.println("aaaaa");
//    }
//}
//
//class B extends A{
//    public void ss(){
//        System.out.println("bbbb");
//    }
//}

class ShopCar{
    private String pname;
    private double price;
    private int amount;

    public ShopCar(String pname, double price, int amount) {
        this.pname = pname;
        this.price = price;
        this.amount = amount;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}


public class fourteen_day {
    public static void main(String[] args) throws Exception {






        List<ShopCar> all = new ArrayList<>();
        all.add(new ShopCar("a",3231,23));
        all.add(new ShopCar("b",2211,13));
        all.add(new ShopCar("b",1123,1));
        DoubleSummaryStatistics dss = all.stream().mapToDouble((sc) -> sc.getAmount()*sc.getPrice()).summaryStatistics();
        System.out.println("商品个数:"+dss.getCount());
        System.out.println("总花费:"+dss.getSum());
        System.out.println("平均花费:"+dss.getAverage());
        System.out.println("最高花费:"+dss.getMax());
        System.out.println("最低花费:"+dss.getMin());


        double sum = all.stream().map((x) -> x.getAmount() * x.getPrice()).reduce((a,m) -> a + m).get();
        System.out.println("花费总金额为:"+sum);

        all.stream().map((x) -> x.getAmount() * x.getPrice()).forEach(System.out :: println);

//
//        List<String> all = new ArrayList<String>();
//        all.add("Android");
//        all.add("java");
//        all.add("mysql");
//        all.add("spring");
//        all.add("ios");
//        all.add("ios");
//        all.add("php");
//        //Stream<String> stream = all.stream();//取得Stream类的对象
//       // System.out.println(stream.distinct().count()); //取得数据个数
//        //去除掉所有的重复数据后形成新的集合数据，里面是不包括重复内容的集合。
//        //List<String> newAll = stream.distinct().collect(Collectors.toList());
//        //newAll.forEach(System.out :: println);
//
//        Predicate<String> p1 = (x) -> x.contains("java");
//        Predicate<String> p2 = (x) -> x.contains("ios");
//        Stream<String> stream = all.stream();//取得了Stream类的对象
//        if(stream.anyMatch(p1.or(p2))){
//            System.out.println("数据存在!");
//        }


//        if(stream.anyMatch((x) -> x.contains("jsp"))){
//            System.out.println("数据存在!");
//        }


        //System.out.println(stream.count()); //取得数据个数
        //System.out.println(stream.distinct().count()); //取得数据个数
        //去除掉所有的重复数据后形成新的集合数据，里面是不包括重复内容的集合。
        //List<String> newAll = stream.distinct().filter((x) -> x.contains("a")).collect(Collectors.toList());
        //List<String> newAll = stream.distinct().map((x) -> x.toLowerCase()).filter((x) -> x.contains("a")).collect(Collectors.toList());
//        if(stream.anyMatch((x) -> x.contains("jsp"))){
//            System.out.println("yes");
//        }

        //List<String> newAll = stream.distinct().map((x) -> x.toLowerCase()).skip(2).limit(2).collect(Collectors.toList());


        //List<String> newAll = stream.distinct().collect(Collectors.toList());
        //newAll.forEach(System.out :: println);


//        all.forEach(System.out :: println);

//        Stack<String> all = new Stack<String>();
//        all.push("A");
//        all.push("B");
//        all.push("C");
//        System.out.println(all.pop());
//        System.out.println(all.pop());
//        System.out.println(all.pop());




//        List<String> all = new ArrayList<>();
//        all.add("bbb");
//        Collections.addAll(all,"A");
//        Collections.reverse(all);
//        System.out.println(all);



//        A a =  new B();
//        if(a instanceof B){
//            B b =(B) a;
//        }

//        Properties pro = new Properties();
////        pro.setProperty("bj","aa");
////        pro.setProperty("tj","bb");
//        pro.load(new FileInputStream(new File("D:"+File.separator+"area.property")));
//        System.out.println(pro.getProperty("bj"));
        //pro.store(new FileOutputStream(new File("D:"+File.separator+"area.property")),"comments");
//        System.out.println(pro.getProperty("bj"));



//        Map<String, Book> map = new HashMap<>();
//        map.put(new String("java"),new Book("java"));
//        System.out.println(map.get(new String("java")));



//        Map<String,Integer> map = new HashMap<>();
//        map.put("一",1);
//        map.put("二",2);
//        map.put("三",3);
//        map.put("四",4);
//        Set<Map.Entry<String,Integer>> set = map.entrySet();
//        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
//        while (iter.hasNext()){
//            Map.Entry<String,Integer> me = iter.next();
//            System.out.println(me.getKey()+"="+me.getValue());
//        }



////        System.out.println(map);
//        Set<String> set = map.keySet();
//        Iterator<String> iter = set.iterator();




//        Vector<String> all = new Vector<>();
//        all.add("A");
//        all.add("B");
//        all.add("C");
//       Enumeration<String> enu = all.elements();
//       while (enu.hasMoreElements()){
//           String str = enu.nextElement();
//           System.out.println(str);
//       }




//        System.out.println("由前向后输出");
//        ListIterator<String> iter = all.listIterator();
//        while (iter.hasNext()){
//            String str = iter.next();
//            System.out.println(str+"、");
//        }
//        System.out.println("\n由后向前输出");
//        while (iter.hasPrevious()){
//            System.out.println(iter.previous() + "、");
//        }



//        Set<Book> all = new HashSet<>();
//        all.add(new Book("java",76.6));
//        all.add(new Book("java",76.6));
//        all.add(new Book("mysql",134.6));
//        all.add(new Book("spring",124.1));
//        all.add(new Book("springboot",142.3));
//        System.out.println(all);



//        Set<String> all = new TreeSet<>();
//        all.add("X");
//        all.add("B");
//        all.add("B");
//        all.add("A");
//        System.out.println(all);



//        List<Book> all = new ArrayList<>();
//        all.add(new Book("java",77.4));
//        all.add(new Book("sql",71.4));
//        all.add(new Book("spring",23.4));
//        all.remove(new Book("spring",23.4));
//        System.out.println(all);



//        //设置泛型，从而保证集合中所有的数据类型都一致
//        Collection<String> all = new ArrayList<>();
//        all.add("Hello");
//        all.add("Hello");
//        all.add("Hello");
//        all.add("world");
//        Object obj [] = all.toArray();//变为对象数组取得
//        for(int i = 0;i <obj.length;i++){
//            System.out.println(obj[i]);
//        }


//        Set<Bool> all = new HashSet<Bool>();
//        String a = "a";
//        System.out.println(all.size()  +"" + all.isEmpty());
//        all.add(new Bool("a",76.6));
//        all.add(new Bool("b",71.6));
//        all.add(new Bool("c",43.6));
//        all.add(new Bool("c",43.6));
//        //all.remove(new Bool("c",43.6));
//        System.out.println(all);
    }
}
