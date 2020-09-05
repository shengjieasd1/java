package cn.sj.test.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class Book14{
//    private String title;
//    private double price;
//
//    @Override
//    public String toString() {
//        return "Book14{" +
//                "title='" + title + '\'' +
//                ", price=" + price +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book14 book14 = (Book14) o;
//        return Double.compare(book14.price, price) == 0 &&
//                Objects.equals(title, book14.title);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, price);
//    }
//
//    public Book14(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//
//
//}

public class fourteen_day_leiji {
    public static void main(String[] args) throws Exception {

        List<String> all = new ArrayList<>();
        all.add("Hello");
        all.add("Hello1");
        all.add("Hello12");
        all.add("Hello12");
        all.add("Hello12");
        Stream<String> stream = all.stream(); //取得Stream类的对象
        List<String> newAll = stream.distinct().map((x) -> x.toLowerCase()).skip(2).limit(2).collect(Collectors.toList());
        newAll.forEach(System.out :: println);

//        System.out.println(stream.distinct().count()); //取得数据个数


//        all.forEach(System.out :: println);

//        Collections.addAll(all,"A","B","C");
//        Collections.reverse(all);
//        System.out.println(all);

//        Properties pro = new Properties();
//        pro.load(new FileInputStream(new File("E:"+File.separator+"area.properties")));
//        System.out.println(pro.getProperty("bj"));



//        Map<String,Integer> map = new Hashtable<>();
//        map.put("一",1);
//        map.put("二",2);
//        map.put("三",3);
//        Set<Map.Entry<String,Integer>> set = map.entrySet();
//        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
//        while (iter.hasNext()){
//            Map.Entry<String,Integer> me = iter.next();
//            System.out.println(me.getKey()+"="+me.getValue());
//        }



//        List<Book14> all = new ArrayList<>();
//        all.add(new Book14("java",76.7));
//        all.add(new Book14("jsp",26.7));
//        all.add(new Book14("oracle",36.7));
//        all.remove(new Book14("oracle",36.7));
//        System.out.println(all);
//        System.out.println(all.size() +""+ all.isEmpty());
//        all.add("1234");
//        all.add("1234");
//        all.add("1234");
//        all.add("1234");
//        all.add("1234");
//        for (int i=0;i<all.size();i++){
//            String str = all.get(i);
//            System.out.println(str);
//        }
    }
}
