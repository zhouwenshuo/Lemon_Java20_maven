package class0701.objects;

public class Phone {
    //手机类,实体类，pojo，一般没有main方法
    //静止的（属性用`变量`来描述）和（动态的行为用`函数`来描述）。
    //成员变量/字段/属性  类中方法外,成员变量的默认值和数组一样
    int price;
    String brand;
    int size;

    public void call() {
        System.out.println("打电话.....");
    }

    public void sendMessage() {
        System.out.println("发短息.....");
    }



}
