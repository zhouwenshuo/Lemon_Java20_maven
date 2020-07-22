package class0720.Homework;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONValidator;

import java.util.HashMap;
import java.util.List;

/**
 * @time: 2020/7/21 10:16
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Homework2
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
public class Homework2 {
    /*
    第二题
    1、有json字符串：
    String s1 = [{"value":0,"expression":"$.code"},{"value":"OK","expression":"$.msg"},{"value":"OK","expression":"OK"}]
    String s2 = [{"value":"OK","expression":"OK"},{"value":"OK","expression":"OK"},{"value":"OK","expression":"OK"}]
    2、分别把s1、s2两个字符串转成两个List<JsonValidate>集合,自己分析JsonValidate有哪些字段（20分）
    3、循环s1的List集合，如果value和expression相等则输出Pass，否则输出Fail。（20分）
     */
    public static void main(String[] args) {
        String s1 = "[{\"value\":0,\"expression\":\"$.code\"},{\"value\":\"OK\",\"expression\":\"$.msg\"},{\"value\":\"OK\",\"expression\":\"OK\"}]";
        String s2 = "[{\"value\":\"OK\",\"expression\":\"OK\"},{\"value\":\"OK\",\"expression\":\"OK\"},{\"value\":\"OK\",\"expression\":\"OK\"}]";
//        List<Validate>
//        List<HashMap> list1 = JSONObject.parseArray(s1,HashMap.class);
//        List<HashMap> list2 = JSONObject.parseArray(s2,HashMap.class);
//        for (HashMap hashMap : list2){
//            System.out.println(hashMap.keySet());
//        }
//        for (HashMap hashMap : list1){
//            System.out.println(hashMap.get("value")+","+hashMap.get("expression"));
//            if (hashMap.get("value").equals(hashMap.get("expression"))){
//                System.out.println("Pass");
//            }else{
//                System.out.println("Fail");
//            }
//        }




    }
    }

