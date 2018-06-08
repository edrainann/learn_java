//package com.yiji.ltest.xyd.supplychain;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class SignTest {

    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("appkey", "e5be9b2957455f1d");
        params.put("appsecret", "bc9bf56031357f4593c13b6195205686");
        params.put("securityTypeCode", "60cf87b1c6d35be415eae596f600c903");
        params.put("merchantId", "3");
        //生成token
//        params.put("idCard", "420325197409291007");
//        params.put("mobile", "18805282017");
        //提交订单
//        params.put("idCard", "420325197409291007");
//        params.put("orderDetail", "甲壳虫(大),1个,10.00元/个");
//        params.put("orderNo", "HD201806055650000");
//        params.put("orderAmount", "220012");
        //发送发货通知
//        params.put("orderNo", "HD201806055650000");
//        params.put("obCn", "223344");
//        params.put("expressType", "2");
        //提交收货凭证
//        params.put("orderNo", "HD201806055650000");



        String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKN1oHQusNALis1t1lGYX0YxWFlm1yQvRUb8X8v8KCzCXSIW88YhQY8EidX1GFJQLwy6B/PnGeY1aFQycl08IZQDs/plMdWOacrTrsBY2Y69ReSUfXVLxs8Dwy6Ygef1IbbMvfo0oikXv9krz+jYJGp4t/K9XLsrIA6Y9PjuSUojAgMBAAECgYAwbI1fPeHFkFXLa+mc/I3lBoNM4OmFX7efQu7CSG5CbEYY7kHDhWCdlNOcneJZqEV3+LiYafNDPrkskFFPC5xKeVZg2KWdhTTJCy03tDylsS8mbIcbFtOcU9b7QXTFQ4id4qV8+KXg9Te9qCJD6IeaJm4eN4qP0LNyCREwkgCEQQJBAPAn0rFJeMxU0NYNWfgKNtP4EMQMJU08T2VYR38u44vl3tI3ij+eXXwEgqD36pkPmRh6kYdEOSub9MGo7zWa4uECQQCuPmxOulQz9m9o5H1/9oudV+gLmYwK8+O+tIsi3tDFnT2jAcE+uYnt3o8ErjGo+2MNCNpGBuZ001mxR5zD/lGDAkAUsWm/KvSErr4743SgIcktpI9VRTKloA+7TMsEU3b54/m6JVz9NFkbyYuz8Qi+3ZA0gsMtY5yFfG+vjC3ocYshAkEAm9BMcBZlZ9YuiGES7RQeg0Rxx7W2KrEv7oBqj3MqxBw5WwQdt6aY9fJ4eBoBZHfwel55Ofe/q6a35TUBta49WwJASASq6eKZ28kZPwLfwDRZaZWMemY978wMS+GAtFavpUOt7rO7S8lgtG0i0anKZ5lbXy3kZcSNRFNFPHKH1Czt3A==";

        System.out.println("params:"+params);
        System.out.println("sign:"+sign(params, privateKey));

    }

    public static String sign(Map<String, String> params, String privateKey) throws Exception {
        // 对参数名进行字典排序
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            String value = params.get(key);
            if (null != value && !"".equals(value) && !"sign".equals(key)) {
                sb.append(key).append("=").append(value).append("&");
            }
        }
        String s = sb.toString();
        s = s.substring(0, s.length()-1);
        System.out.println(s);
        String s1 = DigestUtils.shaHex(s);
//		String s1 = DigestUtils.sha1Hex(s);
        System.out.println(s1);


        //解密私钥
        byte[] keyBytes = Base64.decodeBase64(privateKey);
        //构造PKCS8EncodedKeySpec对象
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyBytes);
        //指定加密算法
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        //取私钥匙对象
        PrivateKey privateKey2 = keyFactory.generatePrivate(pkcs8EncodedKeySpec);


        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initSign(privateKey2);
        signature.update(s1.getBytes());
        byte[] b = signature.sign();
        return Base64.encodeBase64String(b);
    }

//	// 将base64编码后的公钥字符串转成PublicKey实例
//	public static PublicKey getPublicKey(String publicKey) throws Exception {
//		byte[] keyBytes = Base64.decodeBase64(publicKey);
//		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
//		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//		return keyFactory.generatePublic(keySpec);
//	}
//
//	// 将base64编码后的私钥字符串转成PrivateKey实例
//	public static PrivateKey getPrivateKey(String privateKey) throws Exception {
//		byte[] keyBytes = Base64.decodeBase64(privateKey);
//		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
//		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//		return keyFactory.generatePrivate(keySpec);
//	}


}
