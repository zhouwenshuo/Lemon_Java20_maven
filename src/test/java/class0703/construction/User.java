package class0703.construction;

public class User {
    String name;
    String school;
    String username;

//    public void User() {
//        //这是一个普通方法，不过方法名和类名一致。
//    }

    public User() {
        //1、方法名必须和类名一致
        //2、没有返回值，void也没有
        System.out.println(".......User空参构造");
    }

    public User(String name,String school,String username) {
        //java里面找变量，就近原则
        //this关键字，可以区分局部变量和成员变量同明
        this.name = name;
        this.school = school;
        this.username = username;
        System.out.println(".......User有参构造");
    }

    public void pushHomeWork() {
        System.out.println("发布作业");
    }

    public void pushSignIn() {
        System.out.println("签到");
    }
}
