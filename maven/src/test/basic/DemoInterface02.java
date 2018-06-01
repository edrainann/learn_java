public class DemoInterface02 {
    public void test1(A a) {
        a.doSth();
    }
    public static void main(String[] args) {
        DemoInterface02 d = new DemoInterface02();
        A a = new B();
        d.test1(a);
    }
}
interface A {
    public int doSth();
}
class B implements A {
    public int doSth() {
        System.out.println("now in B");
        return 123;
    }
}
