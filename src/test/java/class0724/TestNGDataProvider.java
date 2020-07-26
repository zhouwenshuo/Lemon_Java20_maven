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
public class TestNGDataProvider {
    @Test(dataProvider = "d")
    public void f(String username,String password){
        System.out.println("username = " + username + ", password = " + password);
    }

    @DataProvider(name = "d")
    public Object[][] datas(){
        Object[][] datas = {
                {"zhangsan","123456"},
                {"lisi","123456"},
                {"wangwu","123456"}
        };
        return datas;
    }


}













