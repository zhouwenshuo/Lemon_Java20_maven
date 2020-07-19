package class0717.Json;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * @time: 2020/7/19 22:17
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Json.class
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
public class Json {
    public static void main(String[] args) {
        //fastjson工具类，静态方法。
        //静态方法，不需要创建对象，直接用类名点调用。
//        String json = "{\"name\": \"张三\", \"age\": 18, \"score\":100}";
        //json字符串 转成 java对象。
//        Student s = JSONObject.parseObject(json,Student.class);
//        System.out.println(s);
        //java 对象转成json字符串
//        Student s2 = new Student("李四",20,90);
//        String json2 = JSONObject.toJSONString(s2);
//        System.out.println(json2);

        //json字符串转Map
//        Map<String,Object> map = JSONObject.parseObject(json, Map.class);
////        System.out.println(map);
//
//        //map转json字符串
//        String json3 = JSONObject.toJSONString(map);
//        System.out.println(json3);
        //json数组字符串转java对象 List
        String json = "[{\"name\": \"张三\", \"age\": 18},{\"name\": \"李四\", \"age\": 16}]";
        List<Teacher> list = JSONObject.parseArray(json, Teacher.class);
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }

    }


}
