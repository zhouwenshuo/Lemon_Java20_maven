package class0624;

/**
 * @time: 2020/6/24 23:07
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
 * 数组与运算符
 */


public class HomeWork {
    /*
    创建数组
    请使用两种语法创建数组
    一维数组：{100，200，300，400，500}
    二维数组：{{"java","html"},{"css","javascript"}}
     */
    public static void main(String[] args) {
        int[] array1 = {100, 200, 300, 400, 500};   //初始化
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("==============");
        int[] array2 = new int[5];          //new一个整形数组对象，并设置长度，挨个赋值
        array2[0] = 100;
        array2[1] = 200;
        array2[2] = 300;
        array2[3] = 400;
        array2[4] = 500;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("==============");
        String[][] array3 = {{"java", "html"}, {"css", "javascript"}};  //初始化
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                System.out.println(array3[i][j]);
            }
        }
        System.out.println("==============");
        String[][] array4 = new String[2][2];     //new对象，设置长度，挨个赋值
        array4[0][0] = "java";
        array4[0][1] = "html";
        array4[1][0] = "css";
        array4[1][1] = "javascript";
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.println(array4[i][j]);
            }
        }
        System.out.println("==============");
        /*
        第二题：int x = 1;int y = 2;  求出下面结果，并说明为什么
        求：x/y
        求：y/x
        求：x%y
        求：y%x
         */
        int x = 1;
        int y = 2;
        System.out.println(x/y);   //结果0 ，" / " 为整除
        System.out.println(y/x);   //结果2
        System.out.println(x%y);   //结果1   " % " 为取余
        System.out.println(y%x);   //结果0


    }


}
