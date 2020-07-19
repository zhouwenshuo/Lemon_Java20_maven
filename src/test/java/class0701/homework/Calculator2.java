package class0701.homework;

import java.util.Scanner;

/**
 * @time: 2020/7/1 23:26
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: HomeWork3.class
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
public class Calculator2 {
    /*
    3.要求此计算器支持控制台输入数据，能根据实际输入的运算符（+、-、*、/）和数据来完成对应的运算（扩张题）。
    （提示键盘录入使用Scanner类）
     */
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator(){
        System.out.println("开始计算");
        while (true) {        //先进入循环，后面判断，执行成功后会break出来
            try {             //捕获异常，控制输入正确性，输入错误会提示重新输入
                Scanner input = new Scanner(System.in);
                System.out.println("请输入第一个数");
                double a = input.nextDouble();
                System.out.println("请输入第二个数");
                double b = input.nextDouble();
                System.out.println("请输入运算符（+ - * /）");
                char oper = input.next().charAt(0);

                if (oper == '+') {        //判断运算符，计算完成后结束出循环
                    System.out.println("两数和为：" + String.format("%.4f",(a + b)));
                    System.out.println("计算结束");     //由于小数位过长会丢失精度，格式化精确到4位小数
                    break;
                } else if (oper == '-') {
                    System.out.println("两数差为：" +String.format("%.4f",(a - b)));
                    System.out.println("计算结束");
                    break;
                } else if (oper == '*') {
                    System.out.println("两数积为：" + String.format("%.4f",(a * b)));
                    System.out.println("计算结束");
                    break;
                } else if (oper == '/') {
                    if (b != 0) {
                        System.out.println("两数商为：" +String.format("%.4f",(a / b)));
                        System.out.println("计算结束");
                        break;
                    } else {
                        System.out.println("分母不能是0");
                    }
                } else {
                    System.out.println("您输入的符号有误，请重新输入");
                }

            } catch (Exception e) {
                System.out.println("数字或运算符输入有误请重新输入");    //不抛出异常，友好提示
            }

        }

    }
}
