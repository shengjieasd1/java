package test.java.cn.sj.test;
class Oook{
    private String title;
    private double price;
    static String  pub = "qh";

    public Oook(String title, double price) {
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

    public static String getPub() {
        return pub;
    }

    public static void setPub(String pub) {
        Oook.pub = pub;
    }

    @Override
    public String toString() {
        return "Oook{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", pub='" + pub + '\'' +
                '}';
    }
}

public class fifth_day {
    public static void main(String[] args) {
        Oook ba = new Oook("java开发",10.2);
        Oook bb = new Oook("an开发",11.2);
        Oook bc = new Oook("or开发",12.2);
        ba.pub = "bjcbs";
        System.out.println(ba.toString());
        System.out.println(bb.toString());
        System.out.println(bc.toString());
    }
}
