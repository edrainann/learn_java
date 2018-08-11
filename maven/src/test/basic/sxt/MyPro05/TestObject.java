public class TestObject {
    public static void main(String[] args) {
        //Object obj;

        TestObject to = new TestObject();
        System.out.println(to.toString());

        Person03 p3 = new Person03("edrain",10);
        System.out.println(p3.toString());

    }

    public String toString(){
        return "测试Object对象";
    }

}

class Person03 {
    String name;
    int age;

    @Override
    public String toString() {
        return name+",年龄："+age;
    }

    public Person03(String name, int age){
        this.name = name;
        this.age = age;
    }
}

