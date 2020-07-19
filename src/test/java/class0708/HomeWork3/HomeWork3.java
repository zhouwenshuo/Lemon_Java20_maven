package class0708.HomeWork3;

import java.util.Arrays;

/**
 * @time: 2020/7/9 11:19
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: HomeWork3
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
/*
 三、字符串
 1、有字符串String s = "abc,123,中国,llllll,haha"; 最终输出：abc：3，123：3，中国：2，llllll:6，haha:4 数字代表长度
 2、翻转字符串 aiwozhonghua ，结果auhgnohzowia
 */
public class HomeWork3 {
    public static void main(String[] args) {
        String s = "abc,123,中国,llllll,haha";
        String[] s1 = s.split(",");
        System.out.println(Arrays.toString(s1));
        for (int i =0;i<s1.length;i++){
            System.out.println(s1[i]+':'+s1[i].length());
        }

        System.out.println("============");

        String s2 = "aiwozhonghua";
        String[] ss = s2.split("");
//        System.out.println(Arrays.toString(ss));
        String s3 = "";
        for (int j=s2.length()-1;j>=0;j--){
            s3+=ss[j];
        }
        System.out.println("翻转前:"+s2);
        System.out.println("翻转后:"+s3);
    }
}
