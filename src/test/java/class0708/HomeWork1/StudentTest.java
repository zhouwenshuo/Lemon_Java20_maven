package class0708.HomeWork1;

import java.util.ArrayList;

/**
 * @time: 2020/7/9 0:38
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: StudentTest.class
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
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",20,59);
        Student s2 = new Student("lisi",20,60);
        Student s3 = new Student("wangwu",20,89);
        Student s4 = new Student("maliu",20,90);
        Student s5 = new Student("zhoutian",20,100);
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for (int i=0;i<list.size();i++){
            show(list.get(i));
        }
    }
    public static void show(Student s){
        System.out.println("姓名:"+s.name);
        System.out.println("年龄:"+s.age);
        System.out.println("成绩:"+s.score);
        if (s.score<0){
            System.out.println("评级:emmm...");
            System.out.println("=====");
        }else if (s.score<60){
            System.out.println("评级:不及格");
            System.out.println("=====");
        }else if (s.score < 90){
            System.out.println("评级:及格");
            System.out.println("=====");
        }else if (s.score<=100){
            System.out.println("评级:优秀");
            System.out.println("=====");
        }else{
            System.out.println("评级:突破天际了");
            System.out.println("=====");
        }
    }
}
