package class0731.utils;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

import java.io.FileInputStream;
import java.util.List;

public class ExcelUtils {

    /**
     * 读取excel数据并封装到指定对象中
     * @param sheetIndex        开始sheet索引
     * @param sheetNum          sheet个数
     * @param clazz             excel映射类字节对象
     * @return
     */
    public static List read(int sheetIndex,int sheetNum,Class clazz) throws Exception {
        //1、excel文件流
        FileInputStream fis = new FileInputStream("src/test/resources/cases_v1.xls");
        //2、easypoi导入参数
        ImportParams params = new ImportParams();
        //从第0个sheet开始读取
        params.setStartSheetIndex(sheetIndex);
        //读取1个sheet
        params.setSheetNum(sheetNum);
        //3、导入 importExcel(execl文件流，映射关系字节码对象，导入参数)
        List caseInfoList = ExcelImportUtil.importExcel(fis, clazz, params);
        //4、关流
        fis.close();
        return caseInfoList;
    }
}
