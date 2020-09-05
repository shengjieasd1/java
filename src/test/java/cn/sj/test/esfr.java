package test.java.cn.sj.test;

class Province{
    private int pid;
    private String name;
    private City cities[];

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public Province(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public String getInfo(){
        return "编号"+this.pid+",名称"+this.name;
    }
}

class City{
    private int cid;
    private String name;
    private Province province;

    public City(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getInfo(){
        return "编号："+this.cid+",名称:"+this.name;
    }
}

public class esfr {
    public static void main(String[] args) {
        Province pro = new Province(1,"河北");
        City c1 = new City(1001,"唐山");
        City c2 = new City(1002,"秦皇岛");
        City c3 = new City(1003,"石家庄");
        c1.setProvince(pro);
        c2.setProvince(pro);
        c3.setProvince(pro);
        pro.setCities(new City[]{c1,c2,c3});

        System.out.println(c2.getProvince().getInfo());

        for(int x=0;x<pro.getCities().length;x++){
            System.out.println("\t|-"+pro.getCities()[x].getInfo());
        }
    }

}
