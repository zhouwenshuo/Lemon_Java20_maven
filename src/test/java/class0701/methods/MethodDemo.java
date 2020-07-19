package class0701.methods;

public class MethodDemo {
    public static void main(String[] args) {
        //方法
//        int a = 40;
//        int b = 20;
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a + b);
//        System.out.println("===================");
//        int a2 = 4;
//        int b2 = 2;
//        System.out.println(a2 - b2);
//        System.out.println(a2 * b2);
//        System.out.println(a2 / b2);
//        System.out.println(a2 + b2);
//        System.out.println("===================");
//        int a3 = 10;
//        int b3 = 5;
//        System.out.println(a3 - b3);
//        System.out.println(a3 * b3);
//        System.out.println(a3 / b3);
//        System.out.println(a3 + b3);
        int a = 40;
        int b = 20;
        method(a,b);        //调用方法
        int a2 = 4;
        int b2 = 2;
        method(a2,b2);
        int a3 = 10;
        int b3 = 5;
        method(a3,b3);
    }

    /*
    * 修饰符 函数返回值类型 函数名(参数类型 参数名...){
    *   函数体
    * }
    * static 静态 ：为什么加静态，因为要在main方法中直接调用
    * void：没有返回值
    * 函数名：和变量名，遵循驼峰命名法 getAge
    * 参数类型 参数名...：参数列表 个数和类型都是任意的。
    *
    * 返回值(类型任意)  + 参数列表 (个数和类型都是任意的)  == 无限种可能。
    * 返回值和参数列表 取决于本方法要做实现什么功能
     * */
    public static void method(int a,int b) {
        //代码的维护性提高了
        //方法可以反复调用
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a + b);
        System.out.println("===================");
    }
}
