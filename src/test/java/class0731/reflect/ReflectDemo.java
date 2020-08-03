package class0731.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        //反射：java代码再“运行时”【动态】获取一个类的属性和方法，或者调用一个对象的属性和方法。
        //java代码先编译再运行，动态：任意一个类。
        Student s = new Student();
//        s.name
        //Student Teacher
        //实现反射：必须要有字节码对象
        //Class 字节码对象 约等于 .class 文件，拿到字节码对象相当于拿到整个类所有信息
//        Class clazz1 = Student.class;
//        Class clazz2 = s.getClass();
//
//        Class clazz3 = Class.forName(className);
//        System.out.println(clazz1 == clazz2);
//        System.out.println(clazz1 == clazz3);
        String className = "com.lemon.reflect.Student";
        Class clazz3 = Class.forName(className);
        //创建对象  newInstance 调用空参。
        Object o = clazz3.newInstance();
        System.out.println(o);
        //调用属性->先获取属性，再通过对象调用。
        Field field = clazz3.getField("name");
        field.set(o,"zhangsan");
//        System.out.println(o);
//        System.out.println(field.get(o));
        //调用方法->先获取方法，再通过对象调用。
        Method method = clazz3.getMethod("eat");
        Object result = method.invoke(o);
//        System.out.println(result);
        //暴力反射：获取私有属性和方法
        Field field2 = clazz3.getDeclaredField("age");
        field2.setAccessible(true);
        field2.set(o,22);
        System.out.println(o);
    }
}
