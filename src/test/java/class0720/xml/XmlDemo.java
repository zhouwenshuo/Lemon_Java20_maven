package class0720.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.util.List;

public class XmlDemo {
    public static void main(String[] args) throws Exception {
        //xml 读  （了解）  dom4j
        //1、xml读取对象
        SAXReader reader = new SAXReader();
        FileInputStream fis = new FileInputStream("src/test/resources/student.xml");
        //2、整颗dom树
        Document document = reader.read(fis);
        //3、获取root标签
        Element rootElement = document.getRootElement();
//        System.out.println(rootElement.getName());
        //4、获取root标签下的一级子标签
        List<Element> subElements1 = rootElement.elements();
        for (Element element : subElements1) {
            System.out.println(element.getName() + "====" + element.getData());
            //4.1、获取属性
            Attribute id = element.attribute("id");
            if(id != null) {
                System.out.println(id.getName() + "===>" + id.getData());
            }
            //5、获取root标签下的二级子标签
            List<Element> subElements2 = element.elements();
            if(subElements2 != null && subElements2.size() > 0) {
                for (Element element1 : subElements2) {
                    System.out.println(element1.getName() + "====" + element1.getData());
                }
            }
        }

        fis.close();
    }
}
