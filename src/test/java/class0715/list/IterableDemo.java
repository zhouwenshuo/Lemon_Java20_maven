package class0715.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @time: 2020/7/16 9:36
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: IterableDemo
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
public class IterableDemo {
    public static void main(String[] args) {
        //迭代器
        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        list.add("abc");
        list.add("123");
        list.add("444");
        list.add("555");
        //迭代器用法了解。 增强for循环底层就是迭代器实现的，一般用增强for替代迭代器。
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {  //hasNext 判断是否由下个元素
            String s = it.next();         //取出元素，向下移动
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
