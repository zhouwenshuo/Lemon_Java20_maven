package class0708.HomeWork4;

import java.util.ArrayList;

/**
 * @time: 2020/7/9 12:49
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: ArrayListDemo
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
2、新建一个类ArrayListDemo，使用今天上课讲解api完成下面需求。
 1、定义老师类Teacher，私有属性：name，age，提供空参有参构造，提供get/set方法。
 2、创建老师对象t1，name：张三，age：25
 3、创建老师对象t2，name：李四，age：35
 4、创建老师对象t3，name：老王，age：19
 5、创建老师对象t4，name：赵六，age：29
 6、创建ArrayList集合对象存储t1，t2，t3，t4
 7、删除第三个老师对象。
 8、取出第一个老师对象，将姓名name改为张龙。
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Teacher4 t1 = new Teacher4("张三",25);
        Teacher4 t2 = new Teacher4("李四",35);
        Teacher4 t3 = new Teacher4("老王",19);
        Teacher4 t4 = new Teacher4("赵六",29);
        ArrayList<Teacher4> list = new ArrayList<Teacher4>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.remove(t3);
        list.get(0).setName("张龙");
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getAge());
            System.out.println("=====");
        }



    }
}
