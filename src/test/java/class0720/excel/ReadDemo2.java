package class0720.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDemo2 {
    public static void main(String[] args) {
        //读取excel
        /*
        1、打开excel
        2、获取所有sheet
        3、获取指定sheet
        4、获取所有row
        5、获取所有的单元格
        6、获取单元格内容
         */
        FileInputStream fis = null;
        try {
            //1、打开excel
            fis = new FileInputStream("src/test/resources/demo.xlsx");
            //2、获取所有sheet   2003  2007~  Workbook2003  Workbook2007
            Workbook sheets = WorkbookFactory.create(fis);
            //3、获取指定sheet
            Sheet sheet = sheets.getSheetAt(0);
            //4、获取所有row
            //4.1、普通for循环
            int lastRowNum = sheet.getLastRowNum();
            for(int i=1;i<=lastRowNum;i++) {             //循环行
                Row row = sheet.getRow(i);
                int lastCellNum = row.getLastCellNum();
                for(int j=0;j<lastCellNum;j++) {       //循环列
                    Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    cell.setCellType(CellType.STRING);
                    String cellValue = cell.getStringCellValue();
                    System.out.print(cellValue + ",");
                }
                System.out.println();
            }
            //4.2、增强for循环
//            for (Row row : sheet) {             //循环行
//                for (Cell cell : row) {         //循环列
//                    //强行转换单元格类型 String
//                    cell.setCellType(CellType.STRING);
//                    String cellValue = cell.getStringCellValue();
//                    System.out.print(cellValue + ",");
//                }
//                System.out.println();
//            }
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
