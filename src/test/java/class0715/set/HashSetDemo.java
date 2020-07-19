package class0715.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @time: 2020/7/16 9:39
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: HashSetDemo
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
public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet 存储和取出顺序不一样，无索引，不可重复。
        HashSet<String> set = new HashSet<>();
        //添加元素
        set.add("中国");
        set.add("中国");
        set.add("12");
        set.add("ab");
        set.add("a");
        set.add("c");
        set.add("2");
        System.out.println(set);
        //要取set集合中的元素只能遍历。
        //增强for ，迭代器
        for(String element : set) {
            System.out.println(element);
        }
        System.out.println("===============");
        Iterator<String> it = set.iterator();//alt + enter
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
