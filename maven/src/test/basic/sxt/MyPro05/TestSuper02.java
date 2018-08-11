public class TestSuper02 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象......");
        new ChildClass02();
    }
}
class FatherClass02 {
    public FatherClass02() {
        super();//默认第一句，就算不写也会有
        System.out.println("创建FatherClass");
    }
}
class ChildClass02 extends FatherClass02 {
    public ChildClass02() {
        super();//super永远位于构造器的第一句
        System.out.println("创建ChildClass");
    }
}