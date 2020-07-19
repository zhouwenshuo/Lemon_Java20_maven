package class0624.arrayarray;

/**
 * @author luojie
 * @date 2020/6/24 - 20:46
 * 柠檬班创新教育极致服务
 */
public class ArrayArrayDemo {
    public static void main(String[] args) {
        //二维数组
        //静态初始化
        //数据类型[][] 数组名 = {{值1，值2，}，{值1，值2}，{值1，值2}};
//        String[][] java20 = {
//                {"罗志祥","小祥","罗永浩"},
//                {"韩红","刘亦菲","迪丽热巴"},
//                {"刘翔","娟娟子"}
//        };
////        System.out.println(java20);
////        System.out.println(java20[1][1]);
////        System.out.println(java20[0][2]);
////        System.out.println(java20[0]);
//        System.out.println(java20[1][1]);
//        java20[1][1] = "杨超越";
//        System.out.println(java20[1][1]);
//        System.out.println(java20.length);
//        System.out.println(java20[2].length);

        //动态初始化
        //数据类型[][] 数组名 = new 数据类型[二位数组的长度][];
//        int[][] arr = new int[3][];
//        int[][] arr2 = new int[3][2];
//        System.out.println(arr2);
//        System.out.println(arr2[0]);
//        System.out.println(arr2[0][0]);
//        arr2[0][0] = 100;
//        System.out.println(arr2[0][0]);
//        System.out.println(arr2.length);
//        System.out.println(arr2[0].length);
        int[][] arr = new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[2].length);
        System.out.println("============");
        //NullPointerException:空指针异常
        arr[0] = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);
    }
}
