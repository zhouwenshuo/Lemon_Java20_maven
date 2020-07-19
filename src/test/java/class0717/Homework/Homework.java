package class0717.Homework;

import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.List;

/**
 * @time: 2020/7/19 22:25
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Homework.class
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
/*






4、把下面json字符串解析成java对象（扩展题目，可以不做）
{ "name": "中国", "provinces": [{ "name": "黑龙江", "capital": "哈尔滨" },
                                { "name": "广东", "capital": "广州" },
                                 { "name": "湖南", "capital": "长沙" }] }
 */
public class Homework {
    public static void main(String[] args) {
        /*
        1、String json = {"name": "张三", "age": "18", "score":"100"}; 解析成Student对象。
         */
        String json1 = "{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"}";
        Student s1 = JSONObject.parseObject(json1,Student.class);
        System.out.println(s1);
        System.out.println("===============");

        /*
        2、String json =  [{"name": "张三", "age": "18", "score":"100"},
                    {"name": "李四", "age": "16", "score":"100"}] 解析成List<Student>对象。
         */
        String json2="[{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"},{\"name\": \"李四\", \"age\": \"16\", \"score\":\"100\"}]";
        List<Student> list=JSONObject.parseArray(json2,Student.class);
        for (Student student : list){
            System.out.println(student);
        }

        /*
        3、有config.properties文件内容如下
            username=zhangsan
            password=123456
            使用Properties类的中方法读取到java程序中并输出在控制台上。
         */


    }


}
