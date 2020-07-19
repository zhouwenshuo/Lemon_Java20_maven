package class0624.array;

/**
 * @author luojie
 * @date 2020/6/24 - 20:38
 * 柠檬班创新教育极致服务
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //数组初始化 静态初始化
        //数据类型[] 数组名 = {值1,值2,值3,值4};
        String[] arr = {"java","python","android"};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        arr[0] = "JAVA";
        System.out.println("=========");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        System.out.println(arr.length);
        //索引和长度的关系 = 最大的索引=数组长度-1
    }
}
