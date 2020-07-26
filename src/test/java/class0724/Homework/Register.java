package class0724.Homework;

import org.testng.annotations.DataProvider;
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
//1、使用 @dataProvider 对 register(String username,String password,String type,String sex)方法 进行5次测试
public class Register {

    @Test(dataProvider = "datas")
    public void registerDemo(String username,String password,String type,String sex){
        System.out.println("username = " + username + ", password = " + password + ", type = " + type + ", sex = " + sex);
    }

    @DataProvider
    public Object[][] datas(){
        Object[][] datas = {
                {"zhangsan","123456","1","male"},
                {"lisi","123456","2","female"},
                {"wangwu","123456","3","male"},
                {"zhaoliu","123456","4","male"},
                {"zhengqi","123456","5","female"},
        };
        return datas;
    }
}
