package class0706.polymorphism;

/**
 * @time: 2020/7/7 9:01
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: BankTest
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
public class BankTest {
    public static void main(String[] args) {
//        Teacher t = new Teacher();
//        Tester t2 = new Tester();
//        Worker w = new Worker();
////        Student s = new Student();
//        //父类类型接收子类对象
////        People p = new Teacher();
//        withdraw(t);
//        withdraw(t2);
//        withdraw(w);
////        withdraw(s);

//        People p = new Teacher();   //伪装，真实身份是Teacher
//        //不能使用子类特有方法
//        Teacher t = (Teacher)p;
//        t.show();
//        People p = new Teacher();
////        有什么优点，少定义变量，一个变量接受多种类似的数据。
////        不用多态必须3个变量
//        Teacher t = new Teacher();
//        Tester t2 = new Tester();
//        Worker w = new Worker();
        //用了多态只有一个变量，扩展性变强，可以接受People任意子类对象
        People p = new Teacher();
        withdraw(p);
//        p = new Tester();
//        p = new Worker();
    }
    //public static void withdraw(int a)   { // int a = 10;
    public static void withdraw(People p) { //People p = new Teacher(); People父类可以接受任意子类
        System.out.println("欢迎光临");
        //多态真正干事的是new出的对象，而不是父类。
        //方法重写之后一定调用重写之后的方法。
        p.enter();
        System.out.println("欢迎再次光临");
    }


//    public static void 解析Excel(Excel  Excel2003,Excel2007,Excel2013) {
//
//    }


//    public static void withdraw(Teacher t) {
//        System.out.println("欢迎光临");
//        t.enter();
//        System.out.println("欢迎再次光临");
//    }
//
//    public static void withdraw(Worker w) {
//        System.out.println("欢迎光临");
//        w.enter();
//        System.out.println("欢迎再次光临");
//    }
//
//    public static void withdraw(Tester t) {
//        System.out.println("欢迎光临");
//        t.enter();
//        System.out.println("欢迎再次光临");
//    }

}
