package class0703.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        //封装
//        Student s = new Student();
////        s.age = -18;
//        s.setAge(-18);
////        System.out.println(s.age);
//        System.out.println(s.getAge());

        Teacher t = new Teacher();
        t.setAge(18);
        t.setName("lisi");
        t.setSex("男");
        System.out.println(t.getAge());
        System.out.println(t.getName());
        System.out.println(t.getSex());
    }
}
