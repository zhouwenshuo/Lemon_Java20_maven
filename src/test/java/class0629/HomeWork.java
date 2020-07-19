package class0629;

import java.util.Arrays;

/**
 * @time: 2020/6/29 22:37
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
public class HomeWork {
    public static void main(String[] args) {
        System.out.println("-----直角三角形-----");
        for (int i=1; i<=5;i++){        //i 行数
            for (int j=1;j<=i;j++){     //j 每行星星数
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-----等边三角形-----");
        for (int i=1;i<=5;i++){
            for (int j=5-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        /*
        写一段程序分别求出0-100偶数和奇数的和
         */
        System.out.println("-----求和-----");
        int sum1=0;  //存放偶数
        int sum2=0;  //存放奇数
        for (int i=0;i<=100;i++){
            if (i%2==0){  //整除2为偶数
                sum1+=i;
            }else {       //非整除为奇数
                sum2+=i;
            }
        }
        System.out.println("0-100偶数和为："+sum1);
        System.out.println("0-100奇数和为："+sum2);

        /*
        实现冒泡排序
         */
        System.out.println("-----冒泡排序-----");
        int[] array= {4,1,3,2,5};
        System.out.println("排序前："+ Arrays.toString(array));
        for (int i=1;i<=array.length-1;i++){   //外循环控制次数     数组长度-1
            for (int j=1;j<=array.length-i;j++){   //内循环控制起点    外循环每次可以确定一个最小（最大）值，内循环从n+1位置开始即可
                if (array[j-1]>array[j]){   //改成小于号是从大到小排序
                    int t=array[j-1];
                    array[j-1]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("排序后："+Arrays.toString(array));

    }
}
