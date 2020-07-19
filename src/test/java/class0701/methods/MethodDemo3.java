package class0701.methods;

public class MethodDemo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        print(arr);
        System.out.println("==========");
        int[] arr2 = {1,2,3,4};
        print(arr2);
    }

    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

}
