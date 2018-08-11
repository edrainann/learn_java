/**
 * 测试封装
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
//        h.age = 13;   //无法使用私有属性
        h.name = "哇哈哈";
        TestEncapsulation01 t1 = new TestEncapsulation01();
//        t1.age=10;  //age被私有了 无法访问
        t1.setAge(10);
        t1.getName();
        System.out.println(t1.getName());
        System.out.println(t1.getAge());

    }
}

class Human{
    private int age;
    String name;

     void sayAge(){
         System.out.println(age);
     }
}

class Boy extends Human{
    void sayHello(){
//        System.out.println(age);  //子类无法使用父类的私有属性和方法
    }
}
