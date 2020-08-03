package class0803.cases;

import com.alibaba.fastjson.JSONObject;
import class0803.pojo.CaseInfo;
import class0803.utils.ExcelUtils;
import class0803.utils.HttpUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 注册接口测试类型
 */
public class RegisterCase {

    @Test(dataProvider = "datas")
    public void test(CaseInfo caseInfo) {
        //执行注册接口测试逻辑
        //调用注册接口
        HttpUtils.call(caseInfo);
    }

    @DataProvider
    public Object[] datas() throws Exception {
        List<CaseInfo> list = ExcelUtils.read(0, 1, CaseInfo.class);
        return list.toArray();
    }
}
