package cn.sj.test.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class ninteen_day {
//    public static void print(File file){
//        if(file.isDirectory()){
//            File result[] = file.listFiles();
//            if(result!=null) {
//                for (int i = 0; i < result.length; i++) {
//                    print(result[i]);
//                }
//            }
//        }
//        System.out.println(file);
//    }
    public static void main(String[] args) throws Exception {
        File file = new File("D:"+File.separator+ "demo"+File.separator+"my.txt");
        if(file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file,true);
        String str ="xxxaaaabbbbccccddd \r\n";
        byte data[] = str.getBytes();
        output.write(data);
//        for(int i=0;i<data.length;i++) {
//            output.write(data[i]);
//        }
        output.close();

//        File file = new File("D:"+File.separator+"demo");
//        print(file);
        Scanner sc = new Scanner(System.in);


//        File file = new File("D:"+File.separator+"app");
//        if(file.isDirectory()){
//            File result[] = file.listFiles();
//            for(int x = 0;x<result.length;x++){
//                System.out.println(result[x].getName() + "\t\t"+ (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(result[x].lastModified()))
//                        +"\t\t"+(result[x].isDirectory()?"文件夹":"文件")
//                        +"\t\t"+(result[x].isFile()?(new BigDecimal(result[x].length()/1024.0).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP)+"k"):""));
//            }
//        }



//        File file = new File("D:"+File.separator+"spring3.jpg");
//        if(file.exists()){
//            System.out.println("文件？"+ file.isFile());
//            System.out.println("目录？"+ file.isDirectory());
//            System.out.println("文件大小"+new BigDecimal(file.length()/1024.0)
//                    .divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP)+"k");
//            System.out.println("上次修改时间"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//                    .format(file.lastModified()));
//        }


        //        File file = new File("D:"+File.separator+"demo"+File.separator+"demo"+File.separator+"test.txt");
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//
//        if(file.exists()){
//            file.delete();
//        }else {
//            System.out.println(file.createNewFile());
//        }
    }
}
