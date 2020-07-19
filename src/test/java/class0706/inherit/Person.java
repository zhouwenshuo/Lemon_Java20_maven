package class0706.inherit;

/**
 * @time: 2020/7/7 9:00
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Person
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
public class Person extends God {
    //所有都能访问
    public int age;
    //只是要子类都能访问
    protected String sex;
    //默认修饰，同一个包下才能访问
    int height;
    //当前类才能访问
    private String name;

    public Person() {
        super();
        System.out.println("Person 无参构造");
    }

    private void eat() {
        System.out.println("在米其林吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
