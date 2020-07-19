package class0706.inherit;

/**
 * @time: 2020/7/7 8:59
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: InheritDemo
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
public class InheritDemo {
    public static void main(String[] args) {
        //继承
//        Student s = new Student();
//        s.age = 81;
////        s.name = "高级学徒";
//        s.sex = "男";
//        System.out.println(s.age);
////        System.out.println(s.name);
//        System.out.println(s.sex);
////        s.eat();
//        s.sleep();
//        s.playGame();
//        System.out.println("============");
//        Teacher t = new Teacher();
//        t.age = 20;
////        t.name = "小泽老师";
//        System.out.println(t.age);
////        System.out.println(t.name);
////        t.eat();
//        t.sleep();
//        t.teach();
//        System.out.println("============");
        Doctor d = new Doctor();
        d.age = 50;
//        d.name = "牙医";
        System.out.println(d.age);
//        System.out.println(d.name);
//        d.eat();
        d.sleep();
        d.see();
        d.weight = 80;
        System.out.println(d.weight);
    }
}
