class Animal02{

    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog02 extends Animal02{

    public void move(){
        super.move(); // 应用super类的方法
        System.out.println("狗可以跑和走");
    }
}

public class TestDog02{

    public static void main(String args[]){

        Animal02 b = new Dog02(); //
        b.move(); //执行 Dog02类的方法

    }
}
