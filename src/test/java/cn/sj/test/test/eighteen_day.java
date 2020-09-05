package cn.sj.test.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class eighteen_day {
    public static void main(String[] args) throws Exception {
//        String fieldName = "title";
        Class<?> cls = Class.forName("cn.sj.test.bao.eight_day_book");
        Object obj = cls.newInstance();
        Field titleField = cls.getDeclaredField("title");
        titleField.setAccessible(true);
        titleField.set(obj,"java");
        System.out.println(titleField.get(obj));




//        Method setMet = cls.getMethod("set"+initcap(fieldName),String.class);
//        Method getMet = cls.getMethod("get"+initcap(fieldName));
//        setMet.invoke(obj,"java开发");
//        System.out.println(getMet.invoke(obj));
//    }
//    public static String initcap(String str){
//        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
