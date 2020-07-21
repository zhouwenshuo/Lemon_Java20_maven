package class0720.Homework;

import java.util.ArrayList;

/**
 * @time: 2020/7/21 10:05
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Homework
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
public class Homework1 {
    /*
    第一题 1、定义WriteBackData类有三个私有属性rowNum（行号）; cellNum（列号）;content（内容）;(10分)
    2、创建3个WriteBackData对象 (10分)
    w1：行号 1，列号 2，内容 Pass
    w2：行号 2，列号 2，内容 Fail
    w3：行号 3，列号 2，内容 Pass
    3、把w1、w2、w3放入ArrayList集合中。(10分)
    4、通过poi把ArrayList集合中的数据回写到exam.xls文件中第一个Sheet。(30分)
    回写规则：按照WriteBackData对象的rowNum行号和cellNum列号回写对应的excel中，content是回写的具体内容。
     */
    public static void main(String[] args) {
        WriteBackData w1 = new WriteBackData(1,1,"Pass");
        WriteBackData w2 = new WriteBackData(2,1,"Fail");
        WriteBackData w3 = new WriteBackData(3,1,"Pass");
        ArrayList<WriteBackData> arrayList = new ArrayList<>();
        arrayList.add(w1);
        arrayList.add(w2);
        arrayList.add(w3);
    }




}
