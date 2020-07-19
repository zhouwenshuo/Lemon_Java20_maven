package class0708.HomeWork1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @time: 2020/7/8 22:46
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: HomeWork.class
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

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        一、循环、if、数组 1、求1到1000的水仙花数，所谓的水仙花数就是一个三位数它的各个数的立方和等于该数本身。
        153他就是一个水仙花数，1的立方加上5的立方再加上3的立方就等于153。（1*1*1+5*5*5+3*3*3=153）
         */
        ArrayList<Integer> l =new ArrayList<Integer>();
        for (int i=100;i<1000;i++){
            if (i==method(i)){    //调用求立方 方法
                l.add(i);
            }
        }
        System.out.println("水仙花："+l);
        System.out.println("===============");

        //九九乘法表
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(Integer.toString(j)+'✖'+Integer.toString(i)+"="+Integer.toString(i*j)+" ");
            }
            System.out.println();
        }
        System.out.println("===============");

        //5、输出两个数组相同的内容，例如：{1,3,4,10} {11,3,13,55} 结果输出：3 （提示使用双重循环）
        int[] list1={1,3,5,7,9};
        int[] list2={2,3,4,8,9};
        for (int value : list1) {
            for (int j = 0; j < list2.length; j++) {
                if (value == list2[j]) {
                    System.out.println("重复数据：" + value);
                }
            }
        }
        System.out.println("===============");

        //猜数字
        int num = (int)(Math.random()*100+1);     //生成1-100之间的随机整数
        System.out.println("猜数字游戏开始，请输入数字");
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                int a = input.nextInt();
                if (a==num){
                    System.out.println("恭喜你猜对了！");
                    break;
                }else if (a<num){
                    System.out.println("小了，再猜一次...");
                }else {
                    System.out.println("大了，再猜一次...");
                }
            }catch (Exception e){
                System.out.println("输入错误，请重新输入");
            }
        }

    }

    public static int method(int a){
        //封装求水仙花数方法
        int a1=a/100;   //求出百位数
        int a2=a%100/10;  //求出十位数
        int a3=a%10;    //求出个位数
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
        return (int) Math.pow(a1,3) + (int) Math.pow(a2,3) + (int) Math.pow(a3,3);  //返回结果
    }
}
