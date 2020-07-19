package class0703.overload;

public class MethodOverLoadTest {
    public static void main(String[] args) {
        MethodOverLoad mol = new MethodOverLoad();
        int sum = mol.add(10,20);
        double sum2 = mol.add(3.14,3.1);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
