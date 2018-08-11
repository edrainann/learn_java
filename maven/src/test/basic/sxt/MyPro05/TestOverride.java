/**
 * 测试方法的重写override
 */

public class TestOverride {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle h = new Horse();
        Vehicle v3 = new Plane();
        v1.run();
        h.run();
        v3.run();
        h.stop();
        v3.stop();
    }
}

class Vehicle { // 交通工具类
    public void run() {
        System.out.println("跑....");
    }
    public void stop() {
        System.out.println("停止不动");
    }
}

class Horse extends Vehicle { // 马也是交通工具
    public void run() { // 重写父类方法
        System.out.println("四蹄翻飞，嘚嘚嘚...");
    }
}

class Plane extends Vehicle {
    public void run() { // 重写父类方法
        System.out.println("天上飞！");
    }
    public void stop() {
        System.out.println("空中不能停，坠毁了！");
    }
}