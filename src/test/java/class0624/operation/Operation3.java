package class0624.operation;

/**
 * @author luojie
 * @date 2020/6/24 - 21:49
 * 柠檬班创新教育极致服务
 */
public class Operation3 {
    public static void main(String[] args) {
        //逻辑运算符    &(7) |(回车键) ！(1) && ||
        // & 并且
        // | 或者
        // ！ 非 取反
        int a = 10;
        int b = 5;
        // & 并且 所有的条件同时满足结果才是真，遇到false则false。
//        System.out.println( a > b & a > b); //true & true       true
//        System.out.println( a > b & a < b); //true & false      false
//        System.out.println( a < b & a > b); //false & true      false
//        System.out.println( a < b & a < b); //false & false     false
        // | 或者 只要满足其中一个条件结果就为真，遇到true则true。
//        System.out.println( a > b | a > b); //true | true       true
//        System.out.println( a > b | a < b); //true | false      true
//        System.out.println( a < b | a > b); //false | true      true
//        System.out.println( a < b | a < b); //false | false     false
//        System.out.println(!false);
//        System.out.println(!true);
//        System.out.println(!!true);
        //短路与 && ||  提升效率，&&左边为false，右边不执行，||左边为true,右边不执行
//        System.out.println( a > b && a > b); //true & true       true
//        System.out.println( a > b && a < b); //true & false      false
//        System.out.println( a < b && a > b); //false & true      false
//        System.out.println( a < b && a < b); //false & false     false
        System.out.println( a < b && a++ < b); //false & false     false
        System.out.println(a);
    }
}
