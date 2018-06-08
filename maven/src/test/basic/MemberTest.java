//import cn.yjxxclub.springboot.entity.Member;
//import cn.yjxxclub.springboot.mapper.MemberMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Describe: member应用测试类
 */
@RunWith(SpringRunner.class)    //SpringRunner是spring-test提供的测试执行单元类(SpringJUnit4ClassRunner的新名字)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)     //@SpringBootTest is saying “bootstrap with Spring Boot’s support”，类似springboot程序的测试引导入口
public class MemberTest {

    /**
     * Spring RestTemplate的便利替代。你可以获取一个普通的或发送基本HTTP认证（使用用户名和密码）的模板
     * 这里不使用
     */
    @Autowired
    private TestRestTemplate testRestTemplate;

//    @Autowired
//    MemberMapper memberMapper;


    /**
     * 2017-06-16 14:08:09.884  INFO 13803 --- [           main] com.alibaba.druid.pool.DruidDataSource   : {dataSource-1} inited
     size:5
     -----测试完毕-------
     2017-06-16 14:08:09.955  INFO 13803 --- [       Thread-4] ationConfigEmbeddedWebApplicationContext : Closing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@fd07cbb: startup date [Fri Jun 16 14:08:04 CST 2017]; root of context hierarchy
     */
    @Test
    public void test(){
        Map<String,Object> map = new HashMap();
        map.put("start",0);
        map.put("size",8);
//        List<Member> list = memberMapper.list(map);
//        System.out.println("size:"+list.size());
        System.out.println("-----测试完毕-------");

    }
}