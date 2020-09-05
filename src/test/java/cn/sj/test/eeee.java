package test.java.cn.sj.test;

class Province1{
    private int pid;
    private String name;

    private City1 cities[];

    public Province1(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public City1[] getCities() {
        return cities;
    }

    public void setCities(City1[] cities) {
        this.cities = cities;
    }

    public String getInfo(){
        return "sfbh:"+this.name+"ss"+this.pid;
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
}

class City1{
    private int cid;
    private String name;

    private Province1 province;

    public City1(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    public Province1 getProvince() {
        return province;
    }

    public void setProvince(Province1 province) {
        this.province = province;
    }

    public String getInfo(){
        return "aa"+this.cid+"sdd"+this.name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class eeee {
    public static void main(String[] args) {
        Province1 pro = new Province1(1,"aaa");
    }


}
