package class0717.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
/**
 * @time: 2020/7/19 22:20
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: PropDemo.class
 * @desc: ┏┓　　　┏┓+ +
 * 　　　┏┛┻━━━┛┻┓ + +
 * 　　　┃　　　　　　　┃
 * 　　　┃　　　━　　　┃ ++ + + +
 * 　　 ████━████ ┃+
 * 　　　┃　　　　　　　┃ +
 * 　　　┃　　　┻　　　┃
 * 　　　┃　　　　　　　┃ + +
 * 　　　┗━┓　　　┏━┛
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃ + + + +
 * 　　　　　┃　　　┃　　　　Codes are far away from bugs with the animal protecting
 * 　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃　　+
 * 　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　┃ 　　　　　　　┣┓
 * 　　　　　┃ 　　　　　　　┏┛
 * 　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　┃┫┫　┃┫┫
 * 　　　　　　┗┻┛　┗┻┛+ + + +
 */
public class PropDemo {
    public static void main(String[] args) throws Exception {
        //使用Properties一般不适用Map接口的方法,Properties没有泛型，默认String，String
        Properties prop = new Properties();
//        prop.setProperty("USERNAME","ZHANGSAN"); //put
//        prop.setProperty("PASSWORD","123456"); //put
////        System.out.println(prop.getProperty("USERNAME")); //get
////        System.out.println(prop.getProperty("PASSWORD")); //get
//        FileOutputStream fos = new FileOutputStream("src/test/resources/config.properties");
////        prop.store(fos,"注释");
//        fos.close();
//        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
//        prop.load(fis);
//        System.out.println(prop);
//        fis.close();

        method();
    }


    public static void method()  {

        try {
            //可能会出现异常的代码
            String a = "a";
//            String a = "a";
//            String a = "a";
//            String a = "a";
//            String a = "a";
            FileOutputStream fos = new FileOutputStream("src/test/resources/config.properties");
        } catch (Exception e) {
            //捕获异常，出现异常的解决方案。
            e.printStackTrace();
        } finally {
            //释放资源
            //无论是否出现异常，一定会执行的代码
        }
        //
        //继续运行
    }
}
