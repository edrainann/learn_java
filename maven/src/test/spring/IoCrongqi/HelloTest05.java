import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest05 {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Hello02 obj = (Hello02) context.getBean("helloBean05");
        obj.getMessage();
        context.registerShutdownHook();
    }

}
