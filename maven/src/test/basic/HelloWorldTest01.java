public class HelloWorldTest01 {

    public static void main(String[] args){
        //不使用框架之前的步骤
        //1.创建一个HelloWorld的对象
        HelloWorld helloWorld = new HelloWorld();
        //2.为实例对象的属性赋值
        helloWorld.setName("This is Spring Test");
        //3. 调用对象的方法
        helloWorld.sayHello();
    }

}
