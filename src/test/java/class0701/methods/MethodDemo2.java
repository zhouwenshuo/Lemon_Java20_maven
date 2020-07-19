package class0701.methods;

public class MethodDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = add(a,b);
        System.out.println("sum = " + sum);

        int sum2 = add(100,50);
        System.out.println(sum2);
    }

    public static int add(int a,int b) {
        int sum = a + b;
        if( a > b) {
            return sum;
        }else if( a < b) {

        }else {

        }

        return sum;     //return 方法返回，方法结束
        //System.out.println(sum);   return后面不能写语句
    }
}
