
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest04 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Hello01 objA = (Hello01) context.getBean("helloBean04");
        objA.setMessage("I'm object A");
        objA.getMessage();
//        objA.setMessage("I'm object A");

        Hello01 objB = (Hello01) context.getBean("helloBean04");
        objB.getMessage();



    }
}