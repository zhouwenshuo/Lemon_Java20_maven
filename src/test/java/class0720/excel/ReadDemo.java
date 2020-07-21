package class0720.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        //读取excel
        /*
        1、打开excel
        2、获取所有sheet
        3、获取指定sheet
        4、获取指定row
        5、指定的cell单元格
        6、获取单元格内容
         */
        FileInputStream fis = null;
        try {
            //1、打开excel
            fis = new FileInputStream("src/test/resources/demo.xlsx");
            //2、获取所有sheet   2003  2007~  Workbook2003  Workbook2007
            Workbook sheets = WorkbookFactory.create(fis);
            //3、获取指定sheet
//            sheets.getSheet("分数");
            Sheet sheet = sheets.getSheetAt(0);
            //4、获取指定row
            Row row = sheet.getRow(5);
            //5、指定的cell单元格
            Cell cell = row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            //6、获取单元格内容
            String cellValue = cell.getStringCellValue();
            System.out.println(cellValue);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关流
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
