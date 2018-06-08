import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest01 {
    public static void main(String[] args) {
        /*1、利用框架提供的 XmlBeanFactory() API 去生成工厂 bean 以及利用 ClassPathResource() API 去加载在路径 CLASSPATH 下可用的 bean 配置文件。
        XmlBeanFactory() API 负责创建并初始化所有的对象，即在配置文件中提到的 bean。*/
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        /*2、利用第一步生成的 bean 工厂对象的 getBean() 方法得到所需要的 bean。
        这个方法通过配置文件中的 bean ID 来返回一个真正的对象，该对象最后可以用于实际的对象。一旦得到这个对象，就可以利用这个对象来调用任何方法。*/
        Hello01 obj = (Hello01) context.getBean("helloBean01");
        obj.getMessage();
    }
}