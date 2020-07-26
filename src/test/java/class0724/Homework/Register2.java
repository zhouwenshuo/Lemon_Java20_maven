package class0724.Homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @time: 2020/7/27 0:10
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Register.class
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
//2、使用 @dataProvider 对 register(Student s)方法  进行3次测试 ,Student 有 username、password、type、sex 4个私有属性。
public class Register2 {

    @Test(dataProvider = "datas")
    public void registerDemo2(Student s){
        System.out.println("s = " + s);
    }

    @DataProvider
    public Object[] datas(){
        Student s1 = new Student("zhangsan","123456","1","male");
        Student s2 = new Student("lisi","123456","2","female");
        Student s3 = new Student("wangwu","123456","3","male");
        Student s4 = new Student("zhaoliu","123456","4","female");
        Object[] datas = {s1, s2, s3,s4};
        return datas;
    }
}
