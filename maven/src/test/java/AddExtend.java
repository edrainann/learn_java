import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AddExtend {

    //上传发货凭证
    @Test
    public void testUploadFile1() throws Exception
    {
        //请求url
//		String url ="http://localhost:8080/openapi/thirdparty/file/upload/17C/ph";
        String url = "http://10.244.76.19:8055/scapi/order/submitDeliveryProof";
//		String url = "http://10.244.250.247:8080/scapi/order/submitDeliveryProof";

        Map<String, Object> map = new HashMap<>();
//		Map<String, File> file = new HashMap<>();
        String orderNo = "HD201805295650000";
        String sign = "RT/dgJB27mauE8P1fGumOG4CYsAU4Ua83GE3zVSw2cUe1A1qUEdiAzceuNRJaw+MDxe8h1PQY9emsPxbMiv0MRrA1+JfDOH9ri7dn+kDPvD1RLJ8ivOa8ecHFfOMyCtohIVJOU2yEpI5Dk4JvYNhywz1txYrPVFW2svvKPz66QU=";

        map.put( "merchantId", "3");
        map.put( "orderNo", orderNo);
        map.put( "sign", sign);
        map.put( "obCn", "223344");
        map.put( "expressType", "2");
//        map.put( "expressCom", "京东");
//        map.put( "cn", "2312313");



//		file.put( "identification_card_front", new File("E:\\jzGoods\\桔子新商品身份证正面2.jpg","UTF-8" ));
//        map.put( "files", new File("C:\\Users\\Administrator\\Desktop\\身份证\\微信截图_20180510101050.png",""));
        map.put( "files", new File("C:\\Users\\Administrator\\Desktop\\身份证\\LulworthCoveDorset_EN-AU6971167153_1920x1080.jpg",""));

        System.out.println("map:"+map);

        String response = HttpClientUtils.post( url, map );

        System.out.println("【提交发货凭证文件接口返回】  "  + response);
//        Assertion.isExecute(response, "【提交发货凭证文件接口返回】");
        JSONObject parse = JSON.parseObject(response);
        assertEquals(parse.get("message"), "上传发货凭证成功");
    }

    //上传收货凭证
    @Test
    public void submitReceivingProof() throws Exception
    {
        //请求url
//		String url ="http://localhost:8080/openapi/thirdparty/file/upload/17C/ph";
        String url = "http://10.244.76.19:8055/scapi/order/submitReceivingProof";
//		String url = "http://10.244.250.247:8080/scapi/order/submitReceivingProof";

        Map<String, Object> map = new HashMap<>();
//        Map<String, File> file = new HashMap<>();
        String orderNo = "HD201805285650000";

        map.put( "orderNo", orderNo);
        map.put( "sign", "B4+MLSkbdXN5nHKfPYqo81xoBiFG4XO801nm/144ZMkhKT/L4PgUAW5b8twGH+Q/iWaI8ui9+9RRZ3CNGv2FCkl/Rfk0MtrXIgWShRD5sTJNcB3DPsVDgF6cEDKN8HI+XJ4mBp7NYBkRb3/Zhx5zkycnlWrpcJR8jOJqQHCmFFY=");
        map.put( "merchantId", "3");


//		file.put( "identification_card_front", new File("E:\\jzGoods\\桔子新商品身份证正面2.jpg","UTF-8" ));
        map.put( "files", new File("C:\\Users\\Administrator\\Desktop\\身份证\\微信截图_20180510101050.png"));

        System.out.println("map:"+map);

        String response = HttpClientUtils.post( url, map );

        System.out.println("【提交发货凭证文件接口返回】  "  + response);
//        Assertion.isExecute(response, "【提交发货凭证文件失败】");
        JSONObject parse = JSON.parseObject(response);
        assertEquals(parse.get("message"), "上传收货凭证成功");
    }
}
