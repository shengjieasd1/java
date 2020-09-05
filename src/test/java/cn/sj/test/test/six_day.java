package test.java.cn.sj.test.test;

import java.util.Objects;

class Link{
   private class Node{
       private Object data;
       private Node next;
       public Node(Object data){
           this.data = data;
       }

       public void addNode(Node newNode){
           if(this.next ==null){
               this.next = newNode;
           }else {
               this.next.addNode(newNode);
           }
       }

       public boolean containsNode(Object data){
            if(data.equals(this.data)){
                return true;
            }else {
                if(this.next!=null){
                    return this.next.containsNode(data);
                }else {
                    return false;
                }
            }
       }
       public void setNode(int index,Object data){
           if(Link.this.foot++==index){
               this.data=data;
           }else {
               this.next.setNode(index,data);
           }
       }


       public Object getNode(int index){
           if(Link.this.foot ++ == index){
               return this.data;
           }else {
               return this.next.getNode(index);
           }
       }

       public void removeNode(Node previous,Object data){
           if(data.equals(this.data)){
               previous.next = this.next;
           }else {
               this.next.removeNode(this,data);
           }
       }
       public void toArrayNode(){
           Link.this.retArray[Link.this.foot ++]=this.data;
           if(this.next!=null){
               this.next.toArrayNode();
           }
       }


   }
   //======================以上为内部类=========================
   private Node root;
   private int count =0;
   private int foot = 0;
   private Object[] retArray;
   public void add(Object data){
       if(data == null){
           return;
       }
       Node newNode = new Node(data);
       if(this.root == null){
           this.root = newNode;
       }else {
           this.root.addNode(newNode);
       }
       this.count++;
   }

   public int size(){
        return this.count;
   }

   public boolean isEmpty(){
       return this.count ==0;
   }

   public Object  get(int index){
       if(index > this.count){
           return null;
       }
       this.foot = 0;
       return this.root.getNode(index);
   }

   public boolean contains(Object data){
       if(data==null || this.root == null){
           return false;
       }
       return this.root.containsNode(data);
   }

   public void set(int index,Object data){
       if(index>this.count){
           return;
       }
       this.foot = 0;
       this.root.setNode(index,data);
   }

   public Object[] toArray(){
       if(this.root == null){
           return null;
       }
       this.foot = 0;
       this.retArray = new Object[this.count];
       this.root.toArrayNode();
       return this.retArray;
   }

   public void remove(Object data){
       if(this.contains(data)){
           if(data.equals(this.root.data)){
               this.root = this.root.next;
           }
       }
   }

}


//interface Pet{
//    public String getName();
//    public int getAge();
//
//}
//
//class PetShop{
//    private Link pets = new Link();
//    public void add(Pet pet){
//        this.pets.add(pet);
//    }
//    public void delete(Pet pet){
//        this.pets.remove(pet);
//    }
//    public Link search(String keyWord){
//        Link result = new Link();
//        Object obj[] = this.pets.toArray();
//        for(int x = 0 ;x<obj.length;x++){
//            Pet p = (Pet) obj[x];
//            if(p.getName().contains(keyWord)){
//                result.add(p);
//            }
//        }
//        return result;
//    }
//}
//class Cat implements Pet{
//    private String name;
//    private int age;
//
//    public Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        if(!(obj instanceof Cat)){
//            return false;
//        }
//        Cat c = (Cat) obj;
//        if(this.name.equals(c.name)&& this.age == c.age){
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}class Dog implements Pet{
//    private String name;
//    private int age;
//
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        if(!(obj instanceof Dog)){
//            return false;
//        }
//        Dog c = (Dog) obj;
//        if(this.name.equals(c.name)&& this.age == c.age){
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}

interface Pet{  //定义宠物的标准
    public String getName();
    public int getAge();
}

class PetShop{
    private Link pets = new Link();
    public void add (Pet pet){
        this.pets.add(pet);
    }
    public void delete(Pet pet){
        this.pets.remove(pet);
    }
    public Link search(String keyWord){
        Link result = new Link();
        Object obj[] = this.pets.toArray();
        for(int x=0;x<obj.length;x++){
            Pet p = (Pet) obj[x];
            if(p.getName().contains(keyWord)){
                result.add(p);
            }
        }
        return result;
    }
}

class Cat implements Pet{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class six_day {
    public static void main(String[] args) {
//        PetShop shop = new PetShop();
//        shop.add(new Cat("aa",12));
//        shop.add(new Cat("ab",14));
//        shop.add(new Cat("ac",13));
//        shop.add(new Dog("ba",12));
//        shop.add(new Dog("bb",15));
//        shop.add(new Dog("bc",12));
//        shop.delete(new Dog("ba",12));
//        Link all = shop.search("c");
//        Object obj[] = all.toArray();
//        for(int i = 0; i<obj.length;i++){
//            System.out.println(obj[i]);
//        }


//       all.remove("NIHAO");
//       System.out.println(all.size());
//       System.out.println(all.get(2));


       // System.out.println(all.contains("Hello"));
        //System.out.println(all.contains("ayou"));


       //all.add(null);
       //System.out.println(all.size());
       //System.out.println(all.isEmpty());
    }
}
