package class0706.inherit.override;

/**
 * @time: 2020/7/7 8:53
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Phone5S
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
public class Phone5S extends Phone {

    public Phone5S() {
//        super("aaa");     //调用父类的无参构造，必须在第一行，super()是默认值，不加默认也在
        this("a");      //调用本类其他构造，必须在第一行
    }

    public Phone5S(String name) {

    }


    @Override //注解 检查此方法是不是重写方法
    public void siri() {
        //System.out.println("siri 讲英文");
        //指定调用父类的siri()
        //就近原则
        super.siri();
        System.out.println("siri 讲中文");
        show();
        //this 当前对象
//        this.siri();
        this.show();
    }


}
