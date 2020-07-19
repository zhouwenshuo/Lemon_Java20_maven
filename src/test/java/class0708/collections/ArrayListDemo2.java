package class0708.collections;

/**
 * @time: 2020/7/8 22:41
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: ArrayListDemo2.class
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
import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //List 常用API
        /*
        添加数据:add(…)
		取出数据:get(…)
		获取list集合的大小：size()
		其他API：
		移除数据：remove(…)
		isEmpty(…),判空函数
		contains(…),判断是否包含某数据
		set(…)，修改某个位置
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        list.add("abc");
        list.add("123");
        list.add("444");
        list.add("555");
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.size());
//            int[] arr = {1,2,3,4};
//            for(int i=0;i<arr.length;i++) {
//                System.out.println(arr[i]);
//            }
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===========");
        //增强for
        for(String element : list) {
            System.out.println(element);
        }

//        System.out.println(list.remove("123"));
//        System.out.println(list);
//        System.out.println(list.remove(0));
//        System.out.println(list);
//        list.clear();
//        System.out.println(list.isEmpty());
//        System.out.println(list.contains("abc1"));
//        list.set(0,"柠檬班");
//        System.out.println(list);
    }
}
