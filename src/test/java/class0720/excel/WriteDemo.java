package class0720.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteDemo {
    public static void main(String[] args) throws Exception {
        //excel 回写
        //写：创建excel创建sheet创建row创建cell
        //修改操作：读取出，再写入。
        //1、打开excel
        FileInputStream fis = new FileInputStream("src/test/resources/demo.xlsx");
        //2、获取所有sheet
        Workbook sheets = WorkbookFactory.create(fis);
        //3、获取指定sheet
        Sheet sheet = sheets.getSheetAt(0);

        //4、获取指定row
        Row row = sheet.getRow(1);
        //5、获取指定cell
        Cell cell = row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
        //6、修改值
        cell.setCellValue(99);         //java内存中做了修改，并没有回写到文件中。

        Row row2 = sheet.getRow(5);
        //5、获取指定cell
        Cell cell2 = row2.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
        //6、修改值
        cell2.setCellValue(99);         //java内存中做了修改，并没有回写到文件中。


        //7、关键输出流对象
        FileOutputStream fos = new FileOutputStream("src/test/resources/demo.xlsx");
        //8、把java内存中内容回写到excel文件中。
        sheets.write(fos);
        //9、关流
        fis.close();
        fos.close();
    }
}
