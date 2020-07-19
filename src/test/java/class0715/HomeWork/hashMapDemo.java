package class0715.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @time: 2020/7/16 10:32
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: hashMapDemo
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
两个班级，1801，studentA，studentB，studentC，
        1802，studentD，studentE
用map保存两个班的学生数据
用两种循环遍历，取出每个班级下的学生shuju
 */
public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> class1801 = new HashMap<>();
        HashMap<String,Student> class1802 = new HashMap<>();
        class1801.put("studentA",studentDemo("zhangsan",25,"男"));
        class1801.put("studentB",studentDemo("lisi",26,"男"));
        class1801.put("studentC",studentDemo("xiaohua",27,"女"));
        class1802.put("studentD",studentDemo("xiaoming",28,"男"));
        class1802.put("studentE",studentDemo("xiaohong",29,"女"));

        Set<String> set = class1801.keySet();
        System.out.println("1801班级学生如下:");
        for (String key : set){
            System.out.println("id:"+key);
            show(class1801.get(key));
            System.out.println("=====");
        }

        System.out.println("==========================");

        Set<Map.Entry<String, Student>> entrySet= class1802.entrySet();
        System.out.println("1802班级学生如下:");
        for (Map.Entry<String, Student> entry : entrySet){
            System.out.println("id:"+entry.getKey());
            show(entry.getValue());
            System.out.println("=====");
        }

    }

    /**
     *
     * @param name 姓名
     * @param age 年领
     * @param gender 性别
     * @return s 返回map
     */
    public static Student studentDemo(String name, Integer age, String gender){
        return new Student(name,age,gender);
    }

    public static void show(Student student){
        System.out.println("姓名:"+student.getName());
        System.out.println("年龄:"+student.getAge());
        System.out.println("性别:"+student.getGender());
    }


}

