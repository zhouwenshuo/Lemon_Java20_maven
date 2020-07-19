package class0708.HomeWork1;

/**
 * @time: 2020/7/9 0:24
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: HomeWork4.class
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
 4、有Student类公有属性name、age、score
 a、创建5个Student对象存放在Student数组中
 b、循环打印Student数组，输出学生的name、age、score
 c、提供show(Student s),方法根据学生score输出对应语句
 score小于60输出不及格，score大于等于60小于90输出及格，score大于等于90小于等于100输出优秀。
 */
public class Student {
    public String name;
    public int age;
    public int score;

    public Student(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
}
