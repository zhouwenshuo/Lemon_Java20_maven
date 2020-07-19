package class0703.construction;

public class UserTest {
    public static void main(String[] args) {
        //构造方法:
        //作用: 主要作用创建对象，次要作用给属性赋值。
        //如果一个类没有写任意构造方法，java会提供一个无参（空参）构造
        //如果提供了任意构造方法，java不再提供构造方法。
        User u1 = new User();
        u1.name = "罗杰";
        u1.school = "柠檬班";
        u1.username = "luojie";

        System.out.println(u1.name);
        System.out.println(u1.school);
        System.out.println(u1.username);

        u1.pushHomeWork();
        u1.pushSignIn();

        System.out.println("==================");
        User u2 = new User("张三","柠檬班","zhangsan");

        System.out.println(u2.name);
        System.out.println(u2.school);
        System.out.println(u2.username);

        u2.pushHomeWork();
        u2.pushSignIn();


    }
}
