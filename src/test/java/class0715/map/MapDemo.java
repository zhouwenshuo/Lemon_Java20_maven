package class0715.map;

import java.util.HashMap;

/**
 * @time: 2020/7/16 9:37
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: MapDemo
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
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //添加
        map.put("id",100);
        map.put("age",18);
        map.put("score",60);
//        map.put("score",160);
        map.put("score1",100);
//        System.out.println(map);
//        //取出来
//        int id = map.get("id");
//        System.out.println(id);
//        int age = map.get("age");
//        System.out.println(age);
//        int score = map.get("score");
//        System.out.println(score);
//        int score1 = map.get("score1");
//        System.out.println(score1);
//        //长度
//        System.out.println(map.size());
//
//        map.remove("id");
//        System.out.println(map);
        //获取所有的key
//        System.out.println(map);
//        Set<String> set = map.keySet(); //父接口 接受 子实现。 多态
//        System.out.println(set);
//        //获取所有的值
//        Collection<Integer> values = map.values();//父接口 接受 子实现。 多态
//        System.out.println(values);
        //containsKey 判断键是否存在

        //如果score key 不存在，存（score，100），如果score存在，再score对应的值上加10.
        System.out.println(map);
        if(map.containsKey("score")) {
            //如果score存在，再score对应的值上加10.
            int score = map.get("score");   //70 60
            map.put("score", score * 10);
        }else {
            //如果score key 不存在，存（score，100）
            map.put("score",100);
        }
        System.out.println(map);
    }
}
