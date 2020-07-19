package class0703.memory;


public class MemoryDemo {
    public static void main(String[] args) {
        //java内存模型(了解)
        User u1 = new User("罗杰","柠檬班","luojie");
        System.out.println(u1.name);
        System.out.println(u1.school);
        System.out.println(u1.username);
        u1.pushHomeWork();
        u1.pushSignIn();
        System.out.println("==================");
//        User u2 = new User("张三","柠檬班","zhangsan");
//        System.out.println(u2.name);
//        System.out.println(u2.school);
//        System.out.println(u2.username);
//        u2.pushHomeWork();
//        u2.pushSignIn();
//        int a = 10;
//        int b = a;
//        System.out.println(a);
//        System.out.println(b);
        //两个对象指向同一个地址值（引用）  掌握。
        User u2 = u1;
        u2.name = "张三";
        u2.school = "柠檬班";
        u2.username = "zhangsan";
        System.out.println(u2.name);            //"张三"
        System.out.println(u2.school);          //"柠檬班"
        System.out.println(u2.username);        //"zhangsan"
        System.out.println("==================");
        System.out.println(u1.name);            //?
        System.out.println(u1.school);          //?
        System.out.println(u1.username);        //?
        System.out.println("==================");
        u1.name = "李四";
        System.out.println(u2.name);
        System.out.println(u1.name);
    }
}
