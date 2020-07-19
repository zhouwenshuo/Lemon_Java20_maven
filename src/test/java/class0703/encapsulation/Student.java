package class0703.encapsulation;

public class Student {
    String name;
    private int age;        //私有：只能本类方法

    //age赋值操作
    public void setAge(int age) {
        if(age < 0) {
            System.out.println("年龄有误,请重新设置");
        }else {
            this.age = age;
        }
    }

    //age取值操作
    public int getAge() {
        return age;
    }

    public void study() {
        System.out.println(name + "学习");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }
}
