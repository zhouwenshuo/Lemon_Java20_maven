package class0708.collections;

/**
 * @time: 2020/7/8 22:41
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: ArrayListDemo.class
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
//不同包下调用类，必须使用导包语句，除lang
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList 超级数组，数据类型可以不同，长度可变
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add("abc");
//        list.add(1.1);
//        list.add(false);
//        System.out.println(list);   //ArrayList重写了toString();println会调用传入对象toString();
        //java 是强类型语言
        //泛型：控制集合的数据类型,只能是引用数据类型
//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("false");
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(11);
//        System.out.println(list);
        ArrayList<Student> list = new ArrayList<>();
        Student s = new Student();
        s.name = "zs";
        s.age = 19;
        Student s2 = new Student();
        s2.name = "ls";
        s2.age = 20;
        list.add(s);
        list.add(s2);
        System.out.println(list);

    }
}
