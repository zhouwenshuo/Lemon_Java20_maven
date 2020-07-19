package class0708.HomeWork4;

import java.util.ArrayList;

/**
 * @time: 2020/7/9 13:49
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: CaseTest
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
 四、集合
 1、创建一个Case类，有id、name、apiId三个私有属性。 创建Case类5个对象，存储到ArrayList集合中。
 循环判断集合中是否有apiId =3的元素，如果有存储到另外一个ArrayList集合对象wantList中。 最后遍历输出wantList。
 */
public class CaseTest {
    public static void main(String[] args) {
        Case c1 = new Case(1,"zhangsan",1);
        Case c2 = new Case(2,"lisi",3);
        Case c3 = new Case(3,"wangwu",3);
        Case c4 = new Case(4,"zhaoliu",2);
        Case c5 = new Case(5,"zhoutian",3);
        ArrayList<Case> list= new ArrayList<Case>();
        ArrayList<Case> wantList= new ArrayList<Case>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        for (int i=0;i<list.size();i++){
            if (list.get(i).getApiId()==3){
                wantList.add(list.get(i));
            }
        }
        for (int j =0;j<wantList.size();j++){
            System.out.println("ID:"+wantList.get(j).getId());
            System.out.println("Name:"+wantList.get(j).getName());
            System.out.println("ApiID:"+wantList.get(j).getApiId());
            System.out.println("=====");
        }

    }

}
