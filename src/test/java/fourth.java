public class fourth {
    public static void main(String[] args) {
        Message message = new Message("Hello");
        fun(message);
        System.out.println(message.getInfo());
    }

    private static void fun(Message message) {
        message.setInfo("World");
    }
}
class Message{
    private String info="nihao";

    public Message(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}