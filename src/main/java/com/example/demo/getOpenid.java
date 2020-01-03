package com.example.demo;

import org.apache.commons.lang.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;


@Controller
public class getOpenid {
    @ResponseBody
    @RequestMapping("/getOpenid")
    public String getOpenID(String code)
    {
        System.out.println("code is :"+ code);
        //String WX_URL;
        String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=wx1d1c09bef8994e61&secret=1895fdb8ba3c1f45da36ee4c9bfd46b8&js_code="+code+"&grant_type=authorization_code";
        //StringBuffer BWX_URL = new StringBuffer("https://api.weixin.qq.com/sns/jscode2session?appid=wx27c9fcfd24eb433c&secret=3d2c507c121ad8b67a54e554c1a49d08&js_code=");
        //BWX_URL.append(code).append("&grant_type=authorization_code");
        //WX_URL = BWX_URL.toString();
        WX_URL.replaceAll("\r", "").replaceAll("\n",""); //避免url有折行
        System.out.println("in getopenid url is :" + WX_URL);
        try {
            if (StringUtils.isBlank(code)) {
                System.out.println("code为空");
            } else {
                //String requestUrl = WX_URL.replace("APPID", WxConfig.APPID).replace("SECRET", WxConfig.APPSECRECT).replace("JSCODE", code);

                JSONObject jsonObject = CommonUtil.httpsRequest(WX_URL, "GET", null); //获取openid
                if (jsonObject != null) {
                    try {
                        // 业务操作
                        System.out.println("all info get:"+jsonObject.toString());
                        String openid = jsonObject.getString("openid");
                        return openid;
                    } catch (Exception e) {
                        System.out.println("业务操作失败");
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("code无效");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

class CommonUtil {
    /**
     * 发送https请求
     * @param requestUrl 请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr 提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static JSONObject httpsRequest(String requestUrl, String requestMethod, String outputStr) {
        requestUrl.replaceAll("\r", "").replaceAll("\n",""); //避免url有折行
        System.out.println("httpsRequest url :"+ requestUrl);
        JSONObject jsonObject = null;
        try {
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);

            // 当outputStr不为null时向输出流写数据
            if (null != outputStr) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }
            System.out.println("1");
            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }

            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            conn.disconnect();
            jsonObject = JSONObject.fromObject(buffer.toString());
        } catch (ConnectException ce) {
            System.out.println("连接超时");
        } catch (Exception e) {
            System.out.println("请求异常:"+e);
        }
        return jsonObject;
    }
}

class MyX509TrustManager implements X509TrustManager {

    // 检查客户端证书
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
    }

    // 检查服务器端证书
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
    }

    // 返回受信任的X509证书数组
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}

class WxConfig {
    public static String APPID = "wx1d1c09bef8994e61";
    public static String APPSECRECT = "1895fdb8ba3c1f45da36ee4c9bfd46b8";
    public static String GRANTTYPE = "你的GRANTTYPE ";

}
