package class0724;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @time: 2020/7/26 23:17
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: TestNGDataProvider.class
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
public class TestNGDataProvider2 {
    @Test(dataProvider = "datas")
    public void f(Student s ){
        System.out.println("s = " + s);
    }

    @DataProvider(name = "datas")
    //当TEST方法只有一个参数时，DataProvider方法的返回值可以是Object[] Iterator
    public Object[] datas(){
        Student s1 = new Student("zhangsan","123456");
        Student s2 = new Student("lisi","123456");
        Student s3 = new Student("wangwu","123456");
        Object[] datas = {s1, s2, s3};
        return datas;
    }

    
}













