package class0703.overload;

public class MethodOverLoad {
    //重载规则：在同一个类中，方法名一样，参数不一样（类型，数量），与返回值无关
    //重载作用：少记忆方法名

    public int add(int a,int b) {
//        int sum = a + b;
        return a + b;
    }

//    public void add(int a,int b) {
//          与返回值无关，这不属于重载
//    }

    public double add(double a,double b) {
        return a + b;
    }

    public long add(long a,long b) {
        return a + b;
    }

    public int add(int a,int b,int c) {
        return a + b + c;
    }

    public String add(String a,String b) {
        return a + b;
    }

    public String add() {
        return "a" + "b";
    }

    public void add(String s) {
        System.out.println(s);
    }

    public void show(int a,String b) {

    }

    public int show(String b,int a) {
        return a;
    }
}
