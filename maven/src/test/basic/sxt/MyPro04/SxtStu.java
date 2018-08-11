public class SxtStu {

    //属性fields
    int id;
    String name;
    int age;

    //方法
    void study(){
        System.out.println("我在学习");
    }

    void play(){
        System.out.println("我在游戏");
    }

    //构造方法。用户创建这个类的对象。无参的构造方法可以由系统自动创建
    SxtStu(){
    }

    //程序执行的入口，必须要有
    public static void main(String[] args) {
        SxtStu stu = new SxtStu();  //创建一个对象
        stu.play();
    }
}

