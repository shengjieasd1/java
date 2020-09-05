package cn.sj.test;
class Member{
    private int mid;
    private String name;
    private Car car;

    public Member(int mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public String getInfo(){
        return "编号"+this.mid+"姓名"+this.name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

class Car{
    private Member member;
    private String pname;

    public Car(String pname) {
        this.pname = pname;
    }

    public String getInfo(){
        return "车的名字:"+this.pname;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}

public class fifth {
    public static void main(String[] args) {
        Member m = new Member(1,"sj");
        Car car = new Car("QQ");
        m.setCar(car);
        car.setMember(m);
        System.out.println(m.getCar().getInfo());
        System.out.println(car.getMember().getInfo());
    }


}


