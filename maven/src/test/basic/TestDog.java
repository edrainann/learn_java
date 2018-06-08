class Animal01{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog01 extends Animal01{
    public void move(){
        System.out.println("狗可以跑和走");
    }
}

public class TestDog {
    public static void main(String[] args){
        Animal01 a = new Animal01();
        Animal01 b = new Dog01();   //尽管b属于Animal类型，但是它运行的是Dog类的move方法。
        Dog01 c = new Dog01();

        a.move();
        b.move();
        c.move();
    }
}
