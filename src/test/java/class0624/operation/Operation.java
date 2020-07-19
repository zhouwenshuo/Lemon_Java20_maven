package class0624.operation;

/**
 * @author luojie
 * @date 2020/6/24 - 21:32
 * 柠檬班创新教育极致服务
 */
public class Operation {
    public static void main(String[] args) {
        //运算符
        int a = 10;
        int b = 3;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        //整数于整数相除得到整数
//        //大的数据和小的数据运算结果大的数据类型
//        System.out.println(a / b);
//        System.out.println(10 / 3.0);
        //% 取模 取余数
//        System.out.println(10 % 4);
//        System.out.println(4 % 10);
        //++(自增1)  --(自减1)
        int c = 10;
//        c++;    //c = c + 1;
//        ++c;      //c = c + 1;
        //参与运算 ++在前面先自增1，再运算.++在后先运算，再自增1
//        int d = c++;        // int d = c; c = c + 1;
        int d = ++c;        //  c = c + 1; int d = c;
        System.out.println(c);      //11
        System.out.println(d);      //11
    }
}
