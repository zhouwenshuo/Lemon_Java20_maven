package class0731.cases;

import class0731.pojo.CaseInfo;
import class0731.utils.ExcelUtils;
import class0731.utils.HttpUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 注册接口测试类型
 */
public class RegisterCase {

    @Test(dataProvider = "datas")
    public void test(CaseInfo caseInfo) {
        //执行注册接口测试逻辑
        //调用注册接口
        try {
            HttpUtils.post(caseInfo.getUrl(),caseInfo.getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @DataProvider
    public Object[] datas() throws Exception {
        List<CaseInfo> list = ExcelUtils.read(0, 1, CaseInfo.class);
        return list.toArray();
    }
}
