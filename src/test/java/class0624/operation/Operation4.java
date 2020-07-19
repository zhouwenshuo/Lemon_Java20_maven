package class0624.operation;

/**
 * @author luojie
 * @date 2020/6/24 - 21:49
 * 柠檬班创新教育极致服务
 */
public class Operation4 {
    public static void main(String[] args) {
        //赋值运算符
        int a = 2147483647;
        //扩展赋值运算符
        //+= *= /= %=
        a += 5;  // a = (int)(a + 5);    强转：强制将一个大的类型转成一个小的类型。 3.14 -> 3
        System.out.println(a);
    }
}
