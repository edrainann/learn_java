
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class HttpClientUtils {
	
	
	
	
	public static String post(String url,Map<String, Object> paramsMap) throws ClientProtocolException, IOException{
	    HttpPost httpPost = new HttpPost(url);
	    MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
	    entityBuilder.setCharset(Charset.forName("utf-8"));
	    entityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
	    ContentType contentType = ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8);
	    //填充参数
	    Set<String> keySet = paramsMap.keySet();
	    for(String key:keySet){
	        Object obj = paramsMap.get(key);
	        if(obj instanceof File){ //参数是File 类型
	            File file = (File) obj;
	            entityBuilder.addPart(key, new FileBody(file));
	        }else if(obj instanceof String){ //参数是String 类型
	            String value = (String) obj;
	            entityBuilder.addPart(key, new StringBody(value,contentType));
	        }else if(obj instanceof byte[]){
	            byte[] bytes = (byte[]) obj;
	            entityBuilder.addPart(key, new ByteArrayBody(bytes,ContentType.DEFAULT_BINARY,key));
	        }else{
	            throw new IllegalArgumentException(key+"的类型是"+obj.getClass()+"（允许的参数类型为File 或者 String）。");
	        }
	    }

	    httpPost.setEntity(entityBuilder.build());
	    CloseableHttpClient httpclient = HttpClients.createDefault();
	    HttpResponse response = httpclient.execute(httpPost);
	    if(response.getStatusLine().getStatusCode() == 200){
	        HttpEntity entity = response.getEntity();
	        String result = EntityUtils.toString(entity);
	        return result;
	    }
	    return null;
	}

	public static String send(String url, Map<String,Object> map,String encoding) throws ParseException, IOException{  
        String body = "";  
  
        //创建httpclient对象  
        CloseableHttpClient client = HttpClients.createDefault();  
        //创建post方式请求对象  
        HttpPost httpPost = new HttpPost(url);  
          
        //装填参数  
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();  
        if(map!=null){  
            for (Entry<String, Object> entry : map.entrySet()) {  
                nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));  
            }  
        }  
        //设置参数到请求对象中  
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, encoding));  
        
        //设置header信息  
        httpPost.setHeader("partner-identify", "{\"appsecret\":\"Q4NPeZ8ZRQkJ0GHndEKHwLcAqqYW/n2eqB70h/qAiLfKQECNzzeHzbD6isbi9A8k\",\"appkey\":\"xydadcce31a92e8b1c5\",\"appID\":\"2\"}");  
        //执行请求操作，并拿到结果（同步阻塞）  
        CloseableHttpResponse response = client.execute(httpPost);  
        //获取结果实体  
        HttpEntity entity = response.getEntity();  
        if (entity != null) {  
            //按指定编码转换结果实体为String类型  
            body = EntityUtils.toString(entity, encoding);  
        }  
        EntityUtils.consume(entity);  
        //释放链接  
        response.close();  
        return body;  
    }
	
	public static String sendUploadCommon(String url, Map<String,Object> map,Map<String,File> files) throws Exception{
		String body = "";  
		HttpPost httppost = new HttpPost(url);  
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder  
                .create();
		/**
		 * 添加文件
		 */
		if(files!=null){  
            for (Entry<String, File> entry : files.entrySet()) {  
                multipartEntityBuilder.addPart(entry.getKey(), new FileBody(entry.getValue()));  
            }  
        }  
//        httppost.setHeader("partner-identify", "{\"appsecret\":\"Q4NPeZ8ZRQkJ0GHndEKHwLcAqqYW/n2eqB70h/qAiLfKQECNzzeHzbD6isbi9A8k\",\"appkey\":\"xydadcce31a92e8b1c5\",\"appID\":\"2\"}");  
//        httppost.setHeader("Content-Type", "multipart/form-data");  

		/**
		 * 装填参数  
		 */
        if(map!=null){  
            for (Entry<String, Object> entry : map.entrySet()) {  
            	multipartEntityBuilder.addPart( entry.getKey(),new StringBody(( String ) entry.getValue(),  
            			ContentType.create("text/plain",StandardCharsets.UTF_8)));
            }  
        } 
        //设置参数到请求对象中  
//        httppost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));  
        
        httppost.setEntity( multipartEntityBuilder.build() );
        
      //执行请求操作，并拿到结果（同步阻塞）  
        CloseableHttpResponse response = httpclient.execute(httppost);  
        //获取结果实体  
        HttpEntity entity = response.getEntity();  
        if (entity != null) {  
            //按指定编码转换结果实体为String类型  
            body = EntityUtils.toString(entity, "UTF-8");  
        }  
        EntityUtils.consume(entity);  
        //释放链接  
        response.close(); 
        return body;  
		
	}
}
