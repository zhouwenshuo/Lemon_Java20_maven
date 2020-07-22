package class0720.Homework;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @time: 2020/7/21 10:05
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: Homework
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
public class Homework1 {
    /*
    第一题 1、定义WriteBackData类有三个私有属性rowNum（行号）; cellNum（列号）;content（内容）;(10分)
    2、创建3个WriteBackData对象 (10分)
    w1：行号 1，列号 2，内容 Pass
    w2：行号 2，列号 2，内容 Fail
    w3：行号 3，列号 2，内容 Pass
    3、把w1、w2、w3放入ArrayList集合中。(10分)
    4、通过poi把ArrayList集合中的数据回写到exam.xls文件中第一个Sheet。(30分)
    回写规则：按照WriteBackData对象的rowNum行号和cellNum列号回写对应的excel中，content是回写的具体内容。
     */
    public static void main(String[] args) throws IOException {
        WriteBackData w1 = new WriteBackData(1,1,"Pass");
        WriteBackData w2 = new WriteBackData(2,1,"Fail");
        WriteBackData w3 = new WriteBackData(3,1,"Pass");
        ArrayList<WriteBackData> arrayList = new ArrayList<>();
        arrayList.add(w1);
        arrayList.add(w2);
        arrayList.add(w3);

        String filepath = "src/test/java/class0720/Homework/exam.xls";
        FileInputStream fis = newFis(filepath);
        Workbook sheets = WorkbookFactory.create(fis);
        Sheet sheet = sheets.getSheetAt(0);


        int lastRowNum = sheet.getLastRowNum();
        ArrayList<String> arrayList1 = new ArrayList<>();
        Cell cell = null;
        for (WriteBackData writeBackData : arrayList){ //遍历对象
            for (int i=1;i<=lastRowNum;i++){   //循环行
                Row row = sheet.getRow(i);
                int lastCellNum = row.getLastCellNum();
                arrayList1.clear();
                for (int j=0;j<lastCellNum;j++){   //循环列
                    cell = row.getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    String cellValue = cell.getStringCellValue();
                    System.out.println(String.format("第%d行第%d列的值为%s",i,j+1,cellValue));
                    arrayList1.add(cellValue);
                }
                System.out.println(String.format("第%d行的数据%s:",i,arrayList1.toString()));
                if (writeBackData.getRowNum().equals(arrayList1.get(0))&&writeBackData.getCellNum().equals(arrayList1.get(1))){
                    row.getCell(2,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(writeBackData.getContent());
                }
            }
        }

        //输出流，把内存的数据修改进文件里
        FileOutputStream fos = newFos(filepath);
        sheets.write(fos);
        closeFis(fis);
        closeFos(fos);

    }

    public static FileInputStream newFis(String filepath) throws FileNotFoundException {
        //创建输入流
        return new FileInputStream(filepath);
    }
    public static void closeFis(FileInputStream fileInputStream) throws IOException {
        //关闭输入流
        fileInputStream.close();
    }
    public static FileOutputStream newFos(String filepath) throws FileNotFoundException {
        //创建输出流
        return new FileOutputStream(filepath);
    }
    public static void closeFos(FileOutputStream fileOutputStream) throws IOException {
        //关闭输出流
        fileOutputStream.close();
    }


}
