package class0624.array;

/**
 * @author luojie
 * @date 2020/6/24 - 20:16
 * 柠檬班创新教育极致服务
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //数组:数据类型相同具有相同的意义的数据。
        int age1 = 20;
        int age2 = 25;
        int age3 = 28;
        //...
        int age50 = 30;
        int score1 = 100;
        int score2 = 99;
        //数组初始化=赋值=创建： 动态初始化
        //数据类型[] 数组名 = new 数据类型[数组的长度];
        //数组默认值：整数：0，小数：0.0，boolean：false char：空字符 引用数据类型：null
        int[] arr = new int[4];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        arr[0] = 20;
        arr[1] = 30;
        System.out.println("===================");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //ArrayIndexOutOfBoundsException:数组越界异常，访问了不存在的索引
        //异常：程序的错误
        //System.out.println(arr[4]);
        System.out.println(arr.length);
    }
}
