package class0722.Homework;

import org.testng.annotations.*;

/**
 * @time: 2020/7/23 9:56
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: TestNGDemo
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
public class TestNGDemo {
    //1、用代码说明 @BeforeSuite  @BeforeTest @BeforeClass @BeforeMethod 执行顺序
    /*
    suite > test > class > method
    执行时，顺序 BeforeSuite > BeforeTest > BeforeClass > BeforeMethod > 测试方法
    before注解，相当于初始化，在测试执行前进行准备工作
    after注解，相当于执行后进行清理工作，比如清理内存、数据等
     */
    @Test
    public void f(){
        System.out.println("TestNGDemo.f");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("TestNGDemo.beforeSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("TestNGDemo.beforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("TestNGDemo.beforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("TestNGDemo.beforeMethod");
    }





}
