package test.java.cn.sj.test.test;


//enum Color{
//    RED,GREEN,BLUE;
//    RED("红色"){
//        @Override
//        public String getTitle() {
//            return "自己"+this;
//        }
//    },GREEN("绿色"){
//        @Override
//        public String getTitle() {
//            return "自己"+this;
//        }
//    },BLUE("蓝色"){
//        @Override
//        public String getTitle() {
//            return "自己"+this;
//        }
//    };
//    private String title;
//    private Color(String title){
//        this.title = title;
//    }
//    public String toString(){
//        return this.title;
//    }
//
//    public abstract String getTitle();
//}

//class Color{
//    private String title;
//    private static final Color RED = new Color("红色");
//    private static final Color GREEN = new Color("绿色");
//    private static final Color BLUE = new Color("蓝色");
//
//    public static Color getInstance(int ch){
//        switch (ch){
//            case 1:
//                return RED;
//            case 2:
//                return GREEN;
//            case 3:
//                return BLUE;
//            default:
//                return null;
//        }
//    }
//
//    public Color(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return "Color{" +
//                "title='" + title + '\'' +
//                '}';
//    }
//}

//enum Sex{
//    MALE("男"),FEMALE("女");
//    private String title;
//
//    Sex(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return "Sex{" +
//                "title='" + title + '\'' +
//                '}';
//    }
//}
//
//class Person{
//    private String name;
//    private int age;
//    private Sex sex;
//
//    public Person(String name, int age, Sex sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", sex=" + sex +
//                '}';
//    }
//}

class Book4<T>{
    private T title;

    public void setTitle(T title) {
        this.title = title;
    }
}

public class thirteen_day {
    public static void main(String[] args) {
        Book4 book3 = new Book4();
        book3.setTitle("");

//        System.out.println(new Person("aa",23,Sex.MALE));


//        Color c = Color.RED;
//        switch (c){
//            case RED:
//                System.out.println("这是红色");
//                break;
//            case GREEN:
//                System.out.println("这是绿色");
//                break;
//            case BLUE:
//                System.out.println("这是蓝色");
//                break;
//        }


//        for(Color c : Color.values()){
//            System.out.println(c);//直接输出toString()
//        }

//        Color red = Color.getInstance(1);
//        System.out.println(red);

//        color c = color.blue;
//        System.out.println(c);
    }
}
