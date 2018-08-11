/**
* 测试继承
 * 接口可以多继承，但是类只有单继承
**/

public class TestExtends {
    public static void main(String[] args) {
        Student01 s = new Student01("啦啦啦",172,"Java");
        s.rest();
        s.study();

        Student01 stu = new Student01();  //构造空的继承
        stu.name = "edrain";

        Student01 stu2 = new Student01("哇哈哈",10,"xx专业");
        System.out.println(stu2 instanceof Student01);
        System.out.println(stu2 instanceof Person01);
        System.out.println(stu2 instanceof Object);
    }
}

class Person01 /*extends Object*/{
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会儿");
    }
}

//class Student01{
//    String name;
//    int height;
//    String major;
//
//    public void study(){
//        System.out.println("学习两小时");
//    }
//
//    public void rest(){
//        System.out.println("休息一会儿");
//    }
//}
//使用继承类
class Student01 extends Person01{
    String major;

    public void study(){
        System.out.println("学习两小时");
    }

    public Student01(String name, int height, String major){
        //天然拥有父类的属性
        this.name = name;
        this.height = height;
        this.major = major;
    }

    public Student01(){}  //构造空的继承
}
