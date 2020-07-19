package class0701.objects;

public class PhoneTest {
    public static void main(String[] args) {
        //创建Phone类的对象.
        //类名 对象(变量)名 = new 类名();
        Phone p1 = new Phone();
        System.out.println(p1);
        p1.brand = "Apple";
        System.out.println(p1.brand);
        p1.price = 5000;
        System.out.println(p1.price);
        p1.size = 6;
        System.out.println(p1.size);
        p1.call();
        p1.sendMessage();
        System.out.println("================");
        //可以创建多少个对象呢？对象和对象之间有什么联系吗？
        Phone p2 = new Phone();
        System.out.println(p2);
        p2.brand = "华为";
        p2.price = 5000;
        p2.size = 7;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        System.out.println(p2.size);
        p2.call();
        p2.sendMessage();
        /*
 *      局部变量特点：
 * 			定义在函数体内
 * 			定义在函数参数列表里
 * 			代码块中{}
 * 		成员变量特点
 * 			定义在类体内
 * 			在函数外
 * 			在代码块外
 * 		生命周期：
 * 			局部变量出了包含他的{}就死亡
 * 			成员变量对象不消亡就一起存在
         */
    }
}
