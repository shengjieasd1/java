package cn.sj.test.test;

import java.util.Arrays;
import java.util.Comparator;

class Book{
    private String title;
    private double price;

    public Book() {
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

class BookComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() < o2.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
}

public class eighteen_day_comparator {
    public static void main(String[] args) {
        Book books [] = new Book[]{
                new Book("java",81.3),
                new Book("jsp",71.6),
                new Book("oracle",73.1),
                new Book("android",51.9),
        };
        Arrays.sort(books,new BookComparator());
        System.out.println(Arrays.toString(books));
    }
}


