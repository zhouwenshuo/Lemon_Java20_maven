package class0703.homework;

/**
 * @time: 2020/7/4 0:12
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Score.class
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
 * 代码优化
 */
public class FunctionDemo {
    public static void main(String[] args) {
        int[] classA={65,40,66,80,90,100,45,59};
        int[] classB={60,40,68,80,95,38,45,59};
        int[] classC={65,30,68,58,93,28,45,59};
        System.out.println("A班及格人数："+ countPassStudent(classA));
        System.out.println("B班及格人数："+ countPassStudent(classB));
        System.out.println("C班及格人数："+ countPassStudent(classC));
    }

    //封装循环方法，每次调用时传数组参数，返回值
    public static int countPassStudent(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>=60){
                sum+=1;
            }
        }
        return sum;
    }
}
