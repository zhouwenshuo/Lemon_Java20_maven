package class0803.utils;

import com.alibaba.fastjson.JSONObject;
import class0803.pojo.CaseInfo;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HttpUtils {

    /**
     * 根据请求参数发送http请求
     * @param caseInfo          请求参数对象。
     */
    public static void call(CaseInfo caseInfo) {
        try {
            //1、创建默认请求头对象，并且添加X-Lemonban-Media-Type
            HashMap<String,String> headers = new HashMap<>();
            headers.put("X-Lemonban-Media-Type","lemonban.v1");
            String params = caseInfo.getParams();
            String url = caseInfo.getUrl();
            String method = caseInfo.getMethod();
            //2、判断请求方式，如果是post
            if("post".equals(method)) {
                String contentType = caseInfo.getContentType();
                //2.1、判断参数类型，如果是json
                if("json".equals(contentType)) {
                    headers.put("Content-Type","application/json");
                    //2.2、判断参数类型，如果是form
                }else if("form".equals(contentType)) {
                    //json参数转成key=value参数
                    params = jsonStr2KeyValueStr(params);
                    System.out.println("formParams:" + params);
                    headers.put("Content-Type","application/x-www-form-urlencoded");
                }
                HttpUtils.post(url,params,headers);
                //3、判断请求方式，如果是get
            }else if("get".equals(method)) {
                HttpUtils.get(url,headers);
                //4、判断请求方式，如果是patch
            }else if("patch".equals(method)){
                headers.put("Content-Type","application/json");
                HttpUtils.patch(url,params,headers);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * json字符串转成key=value
     * 例如：{"mobilephone":"13877788811","pwd":"12345678"} = > mobilephone=13877788811&pwd=12345678
     * @param json      JSON字符串
     * @return
     */
    public static String jsonStr2KeyValueStr(String json) {
        Map<String,String> map = JSONObject.parseObject(json, Map.class);
        Set<String> keySet = map.keySet();
        String formParams = "";
        for (String key : keySet) {
            //key=value&key=value&key=value&
            String value = map.get(key);
            formParams += key + "=" + value + "&";
        }
        return formParams.substring(0,formParams.length()-1);
    }


    /**
     * 发送一个get请求
     * @param url       携带参数的url
     *                  例如：http://api.lemonban.com/futureloan/loans?pageIndex=1&pageSize=1
     *                  例如：http://api.lemonban.com/futureloan/member/${member_id}/info
     * @throws Exception
     */
    public static void get(String url, Map<String,String> headers) throws Exception {
        //1、创建请求
        HttpGet get = new HttpGet(url);
        //2、添加请求头
        setHeaders(headers, get);
        //3、创建客户端
        HttpClient client = HttpClients.createDefault();
        //4、发送请求，获取响应对象
        HttpResponse response = client.execute(get);
        //5、格式化响应对象 response = 响应状态码 + 响应头 + 响应体
        printResponse(response);
    }


    /**
     * 发送一个post请求
     * @param url           接口地址
     * @param params        接口参数
     * @throws Exception
     */
    public static void post(String url, String params, Map<String,String> headers) throws Exception {
        //1、创建请求
        HttpPost post = new HttpPost(url);
        //2、添加请求头
//        post.setHeader("X-Lemonban-Media-Type","lemonban.v1");
//        post.setHeader("Content-Type","application/json");
//        post.setHeader("Content-Type","application/x-www-form-urlencoded");
        //headers.put("X-Lemonban-Media-Type","lemonban.v1");
        //headers.put("Content-Type","application/json");
        setHeaders(headers, post);
        // setHeaders 执行的代码就是 post.setHeader
//        post.setHeader("X-Lemonban-Media-Type","lemonban.v1");
//        post.setHeader("Content-Type","application/json");
        //3、添加请求体（参数）
        StringEntity body = new StringEntity(params,"utf-8");
        post.setEntity(body);
        //4、创建客户端
        HttpClient client = HttpClients.createDefault();
        //5、发送请求，获取响应对象
        HttpResponse response = client.execute(post);
        //6、格式化响应对象 response = 响应状态码 + 响应头 + 响应体
        printResponse(response);
    }


    /**
     * 发送一个post请求
     * @param url           接口地址
     * @param params        接口参数
     * @throws Exception
     */
    public static void patch(String url,String params, Map<String,String> headers) throws Exception {
        //1、创建请求
        HttpPatch patch = new HttpPatch(url);
        //2、添加请求头
//        patch.setHeader("X-Lemonban-Media-Type","lemonban.v1");
//        patch.setHeader("Content-Type","application/json");
        setHeaders(headers, patch);
        //3、添加请求体（参数）
        StringEntity body = new StringEntity(params,"utf-8");
        patch.setEntity(body);
        //4、创建客户端
        HttpClient client = HttpClients.createDefault();
        //5、发送请求，获取响应对象
        HttpResponse response = client.execute(patch);
        //6、格式化响应对象 response = 响应状态码 + 响应头 + 响应体
        printResponse(response);
    }



    /**
     * 打印响应
     * @param response          响应对象
     * @return
     * @throws IOException
     */
    public static String printResponse(HttpResponse response) throws IOException {
        //1响应状态码  链式编程
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        //2响应头
        Header[] allHeaders = response.getAllHeaders();
        System.out.println(Arrays.toString(allHeaders));
        //3响应体
        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(entity);
        System.out.println(body);
        System.out.println("======================================================");
        return body;
    }

    /**
     * 设置请求头
     * @param headers               包含了请求头的Map集合
     * @param request               请求对象
     */
    public static void setHeaders(Map<String, String> headers, HttpRequest request) {
        //获取所有请求头name
        Set<String> headerNames = headers.keySet();
        //遍历所有的请求头name
        for (String headerName : headerNames) {
            //获取请求头name对应的value
            String headerValue = headers.get(headerName);
            //设置请求头name，value
            request.setHeader(headerName,headerValue);
        }
    }
}
