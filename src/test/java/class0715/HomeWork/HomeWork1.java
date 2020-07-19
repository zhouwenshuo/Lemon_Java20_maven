package class0715.HomeWork;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @time: 2020/7/16 9:41
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: HomeWork1
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
1、有HashMap对象{"id":"1","mobile_phone":"13212312312","pwd":"12312312"}
a、存好元素之后使用两种方式进行遍历
b、判断Map中是否有mobile_phone 键，如果有输出对应的值，如果没有提示没有。
c、替换Map中pwd对应的值，替换为88888888。
 */
public class HomeWork1 {
    public static void main(String[] args) {
        HashMap<String,String> map1=new HashMap<>();
        map1.put("id","1");
        map1.put("mobile_phone","13212312312");
        map1.put("pwd","12312312");


        //遍历1
        Set<String> set = map1.keySet();
        System.out.println(set);
        for (String key : set){
            System.out.println(key+"="+map1.get(key));
        }
        System.out.println("====================");

        //遍历2
        Set<Entry<String,String>> entrySet= map1.entrySet();
        for (Entry<String,String> entry : entrySet){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("====================");


        if (map1.containsKey("mobile_phone")){
            System.out.println(map1.get("mobile_phone"));
        }else {
            System.out.println("抱歉，没有找到。");
        }
        System.out.println("====================");


        if (map1.containsKey("pwd")){
            map1.put("pwd","88888888");
            System.out.println(map1.get("pwd"));
        }else {
            System.out.println("抱歉，没有找到。");
        }

    }


}
