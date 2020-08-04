package class0729.Homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @time: 2020/7/31 18:11
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: getProperties.class
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
public class GetProperties {
    private String file_path = "src/test/java/class0729/Homework/config.properties";

    public String getProperties(String option) throws IOException {
        Properties properties = new Properties();
        File file = new File(file_path);
        FileInputStream fis = new FileInputStream(file);
        assert false;
        properties.load(fis);
//        System.out.println("USERNAME:"+properties.getProperty("USERNAME"));
//        System.out.println("PASSWORD:"+properties.getProperty("PASSWORD"));
        fis.close();
        return properties.getProperty(option);
    }

    public static void main(String[] args) throws IOException {
        GetProperties getProperties = new GetProperties();
        String res = getProperties.getProperties("USERNAME");
        System.out.println(res);
    }
}
