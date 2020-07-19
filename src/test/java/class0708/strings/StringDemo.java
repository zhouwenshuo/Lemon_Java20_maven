package class0708.strings;

/**
 * @time: 2020/7/8 22:45
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: StringDemo.class
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
public class StringDemo {

    public static void main(String[] args) {
        //String类方法学习
        /*
        equals：判断字符串是是否一样，大小写敏感
		split：切割
		replace：替换
		substring：字符串截取
		==========================
		trim：删除字符串两端的空格
		length：获取字符串长度
		equalsIgnoreCase：判断是否一样，忽略大小写
		indexOf：获取指定内容在字符串中出现的位置
		isEmpty：判断字符串是否为空
		lastIndexOf：获取要匹配内容在字符串中最后出现的位置
         */
//        String s1 = "abc";
//        String s2 = "abc";
//        System.out.println(s1.equals(s2));
//        System.out.println(s2.equals(s1));
        //equalsIgnoreCase
        String s1 = "abc";
        String s2 = "aBc1";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s2.equalsIgnoreCase(s1));
//        String s = "111,222,113,11,2";  //商品id
//        String[] arr = s.split(",");
//        for (String s1 : arr) {
//            System.out.println(s1);
//        }
        //replace
//        String s = "abc12312312ads";
//        //s = "abc";  //重新赋值
//        //String newStr = s.replace("123","abc");
////        s = s.replace("123","abc");
//        s = s.replace("123","");
//        System.out.println(s);
//        System.out.println(newStr);
        //substring
//        String s = "abcasd12312312";
////        s = s.substring(6);
////        System.out.println(s);、
//        s = s.substring(6,9);   //包左不包右
//        System.out.println(s);
        /*
        trim：删除字符串两端的空格
		length：获取字符串长度
		equalsIgnoreCase：判断是否一样，忽略大小写
		indexOf：获取指定内容在字符串中出现的位置
		isEmpty：判断字符串是否为空
		lastIndexOf：获取要匹配内容在字符串中最后出现的位置
         */
//        String s = "  aaa   bbb  ";
//        s = s.trim();
//        s = s.replace(" ","");
//        System.out.println(s);
//        String s = "aaabbbccc";
//        System.out.println(s.length());
//        String s = "aaabbbccc";
//        System.out.println(s.indexOf("a"));
//        System.out.println(s.lastIndexOf("a"));
//        System.out.println(s.indexOf("1"));
//        System.out.println(s.indexOf("abc"));
//        String s = null;
//        System.out.println(s.isEmpty());
//        int a = 10;
//        System.out.println(a + "");
    }
}
