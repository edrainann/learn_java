//测试方法的基本使用

public class TestMethod {
    public static void main(String[] args) {
        //通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.printSxt();
        tm.add1(30,40,50);
        int c = tm.add2(30,40,50)+1111;
        System.out.println(c);
    }

    void printSxt(){
        System.out.println("重庆");
        System.out.println("北京");
        System.out.println("上海");
    }

    void add1(int a1, int b1, int c1){
        int sum1 = a1 + b1 + c1;
        System.out.println(sum1);
    }

    int add2(int a2, int b2, int c2){
        int sum2 = a2 + b2 + c2;
        System.out.println("this is sum2:" + sum2);
        return sum2; //return两个作用：1.结束方法的运行；2.返回值
    }
}
