package class0703.homework;

/**
 * @time: 2020/7/3 16:59
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: HomeWork
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
public class Student {
    private String name;
    private int age;
    private int score =100;

//    public Student(){
//        //空参构造
//    }

    public Student(String n,int a){
        /*
        有参构造
         */
        System.out.println("=====有参构造开始=====");
        this.name=n;
        this.age=a;
//        this.score=s;
        if (this.age<15){
            this.age=15;
            System.out.println("年龄不能小于15岁，默认设置为15岁");
        }
        System.out.println("=====有参构造结束=====");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
        if (this.age<15){
            this.age=15;
            System.out.println("年龄不能小于15岁，默认设置为15岁");
        }
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public void show(){
        System.out.println("学生姓名："+name);
        System.out.println("学生年龄："+age);
        System.out.println("学生分数："+score);
    }
}
