package cn.sj.test;

public class second {
    public static void main(String[] args) {
        Message message = new Message(30);
        fun(message);
        System.out.println(message.getNum());
    }
    private static void fun(Message message) {
        message.setNum(100);
    }

}
class Message{
    private int num = 10;

    public Message(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
