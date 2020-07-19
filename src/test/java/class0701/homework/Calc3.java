package class0701.homework;

import java.util.Scanner;

/**
 * @time: 2020/7/3 17:13
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Calc3
 * @desc: ┏┓　　　┏┓+ +
 * 　　　┏┛┻━━━┛┻┓ + +
 * 　　　┃　　　　　　　┃
 * 　　　┃　　　━　　　┃ ++ + + +
 * 　　 ████━████ ┃+
 * 　　　┃　　　　　　　┃ +
 * 　　　┃　　　┻　　　┃
 * 　　　┃　　　　　　　┃ + +
 * 　　　┗━┓　　　┏━┛
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃ + + + +
 * 　　　　　┃　　　┃　　　　Codes are far away from bugs with the animal protecting
 * 　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃　　+
 * 　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　┃ 　　　　　　　┣┓
 * 　　　　　┃ 　　　　　　　┏┛
 * 　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　┃┫┫　┃┫┫
 * 　　　　　　┗┻┛　┗┻┛+ + + +
 */
public class Calc3 {
    public static void main(String[] args) {
        entrance();
        start();
        end();
    }

    public static void entrance(){
        System.out.println("欢迎使用计算器！");
    }
    public static void start(){
        while (true) {        //先进入循环，后面判断，执行成功后会break出来
            try {             //捕获异常，控制输入正确性，输入错误会提示重新输入
                Scanner input = new Scanner(System.in);
                System.out.println("请输入第一个数");
                double a = input.nextDouble();
                System.out.println("请输入第二个数");
                double b = input.nextDouble();
                System.out.println("请输入运算符（+ - * /）");
                char oper = input.next().charAt(0);

                String res = calculate(a,b,oper);    //调用计算方法
                if (!res.equals("NULL")){
                    break;
                }

            } catch (Exception e) {
                System.out.println("数字或运算符输入有误请重新输入");    //不抛出异常，友好提示
            }

        }
    }

    public static String calculate(double a , double b,char oper){
        String res = "NULL";
        if (oper == '+') {        //判断运算符，计算完成后结束出循环
            System.out.println("两数和为：" + String.format("%.4f",(a + b)));
            res = Double.toString(a+b);
        } else if (oper == '-') {
            System.out.println("两数差为：" +String.format("%.4f",(a - b)));
            res = Double.toString(a-b);
        } else if (oper == '*') {
            System.out.println("两数积为：" + String.format("%.4f",(a * b)));
            res = Double.toString(a*b);
        } else if (oper == '/') {
            if (b != 0) {
                System.out.println("两数商为：" +String.format("%.4f",(a / b)));
                res = Double.toString(a/b);
            } else {
                System.out.println("分母不能是0");
            }
        } else {
            System.out.println("您输入的符号有误，请重新输入");
        }
        return res;
    }

    public static void end(){
        System.out.println("计算结束");
    }
}
