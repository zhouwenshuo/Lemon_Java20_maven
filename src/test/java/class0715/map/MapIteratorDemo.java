package class0715.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @time: 2020/7/16 9:38
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: MapIteratorDemo
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
public class MapIteratorDemo {
    public static void main(String[] args) {
        //map 遍历
        HashMap<String,Integer> map = new HashMap<>();
        //添加
        map.put("id",100);
        map.put("age",18);
        map.put("score",60);
//        map.put("score",160);
        map.put("score2",100);

        //取出来
//        int id = map.get("id");
//        System.out.println(id);
//        int age = map.get("age");
//        System.out.println(age);
//        int score = map.get("score");
//        System.out.println(score);
//        Integer score1 = map.get("score1");     //获取一个不存再的key，返回null
//        System.out.println(score1);

        Set<String> set = map.keySet(); //父接口 接受 子实现。 多态
        System.out.println(set);

        //遍历所有的key键
        for (String key : set) {
            //通过键找值
            int value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("====================");

//        EntryDemo e1 = new EntryDemo("xxid","100");
//        EntryDemo e2 = new EntryDemo("name","zhangsan");
//        EntryDemo e3 = new EntryDemo("age","18");
        //获取所有的键值对
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        for(Entry<String,Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }


//        xxid = list.get(0);
//        yyid = list.get(1);



    }
}
