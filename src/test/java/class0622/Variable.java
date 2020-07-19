package class0622;

/**
 * @author luojie
 * @date 2020/6/22 - 21:30
 * 柠檬班创新教育极致服务
 */
public class Variable {
    public static void main(String[] args) {
        //变量
        //定义格式：数据类型 变量名 = 变量值;
        int i = 10;
//        int i = 20;  相同作用域下变量不能同名
        //布尔类型
        boolean bool1 = true;
        boolean bool2 = false;
        //整数类型
        byte b = 120;
        short s = 100;
        int i2 = 1000;
        long l = 10000;
        //直接写一个整数1000，它的类型int。
        long l2 = 2147483647;
        //2147483648超出了int的范围，不能直接赋值，必须在数字后面加一个大写L小写l。
//        long l3 = 2147483648;
        long l3 = 1L;
        //浮点类型（小数）,小数的默认类型是double
        //大的数据类型不能直接赋值给小的数据类型
        //加F强行表示float类型。
        float f = 3.14F;
        double d = 3.14D;
        double d2 = 3.14;
        //字符类型,必须用单引号包裹，有且只有一个内容
        char c1 = ' ';
        char c2 = '1';
        char c3 = 'a';
        //定义
        char c4 = '中';
//        char c5 = c1;
//        System.out.println(c4);
        //使用
        c4 = '国';
//        System.out.println(c4);
        c4 = c3;
//        System.out.println(c4);

        //同一行定义多个变量
        int a2=10,b2=20;

        //字符串定义  String是数据类型
        String str = "java20.....aaahelow中文";
        System.out.println(str);
        System.out.println("java20.....aaahelow中文");
        String msg = "登录成功";
        System.out.println(msg);

    }

}
