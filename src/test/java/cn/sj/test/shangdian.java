package test.java.cn.sj.test;
class Item{
    private int iid;
    private String name;
    private String note;

    private Subitem subitem [];
    private Product product [] ;


    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Subitem[] getSubitem() {
        return subitem;
    }

    public void setSubitem(Subitem[] subitem) {
        this.subitem = subitem;
    }

    public Item(int iid, String name, String note) {
        this.iid = iid;
        this.name = name;
        this.note = note;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

class Subitem{
    private int sid;
    private String name;
    private String note;

    private Item item;
    private Product product [];

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Subitem(int sid, String name, String note) {
        this.sid = sid;
        this.name = name;
        this.note = note;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

class Product{
    private int pid;
    private String name;
    private double pirce;

    private Item item;
    private Subitem subitem;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Subitem getSubitem() {
        return subitem;
    }

    public void setSubitem(Subitem subitem) {
        this.subitem = subitem;
    }

    public Product(int pid, String name, double pirce) {
        this.pid = pid;
        this.name = name;
        this.pirce = pirce;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPirce() {
        return pirce;
    }

    public void setPirce(double pirce) {
        this.pirce = pirce;
    }
}



public class shangdian {
    public static void main(String[] args) {
        Item item = new Item(1,"sss","-");
        Subitem suba = new Subitem(1001,"a","-");
        Subitem subb = new Subitem(1002,"b","-");
        Subitem subc = new Subitem(1003,"c","-");
        Subitem subd = new Subitem(1004,"d","-");
        Product proA = new Product(90001,"A",10000.1);
        Product proB = new Product(90001,"A",10000.1);
        Product proC = new Product(90001,"A",10000.1);
        Product proD = new Product(90001,"A",10000.1);
        Product proE = new Product(90001,"A",10000.1);
    }
}
