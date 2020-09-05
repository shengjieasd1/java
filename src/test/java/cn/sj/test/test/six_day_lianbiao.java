package cn.sj.test.test;
class Node implements Cloneable{
    private String data;
     Node next;
    public Node(String data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void addNode(Node newNode){
        if(this.next == null){
            this.next = newNode;
        }else {
            this.next.addNode(newNode);
        }
    }

    public void printNode() {
        System.out.println(this.data);
        if(this.next != null){
            this.next.printNode();
        }
    }

    public void fz(){
        int i=0;
        String a;
//        System.out.println(this.data+i);
//        System.out.println(this.next.data+i);
        if(this.data!=null){
            if(this.next!=null) {
                a = this.data;
                this.data = this.next.data;
                this.next.data = a;
                this.next.next.fz();
            }
        }
    }


}

class Link1{
    private Node root;
    public void add(String data){
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        }else {
            this.root.addNode(newNode);
        }
    }
    public void print(){
        if(this.root != null){
            this.root.printNode();
        }
    }
    public void add1(Link1 link1){
        this.root.addNode(link1.root);
    }
    public void fz(){
        this.root.fz();
    }
}


public class six_day_lianbiao {
    public static void main(String[] args) {
        //准备数据
//        Node root = new Node("火车头");
//        Node n1 = new Node("A");
//        Node n2 = new Node("A");
        Link1 link1 = new Link1();
        link1.add("aaa");
        link1.add("bbb");
        link1.add("ccc");
        link1.add("ddd");
        link1.add("eee");
        link1.fz();
        link1.print();


//        link2.print();

//        Link1 link3 = new Link1();
//        link3.add("eee");
//        link3.add("fff");
//        link3.print();

//        link1.add1(link2);
//        link2.add1(link3);
//        link1.print();

//        root.setNext(n1);;
//        n1.setNext(n2);
//        print(root);
//        Node currentNode = root;
//        while (currentNode != null){
//            System.out.println(currentNode.getData());
//            currentNode = currentNode.getNext();
//        }

    }

//    public static void print(Node current){
//        if(current == null){
//            return;
//        }
//        System.out.println(current.getData());
//        print(current.getNext());
//    }
}
