import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest02 {

    public static void main(String[] args){
        //不使用框架之前的步骤
        //1.创建一个HelloWorld的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("");
        //2.为实例对象的属性赋值
        HelloWorld helloWorld = (HelloWorld) context.getBean("hello world");
        //3. 调用对象的方法
        helloWorld.sayHello();
    }
}
