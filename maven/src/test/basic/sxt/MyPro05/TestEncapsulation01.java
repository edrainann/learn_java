/**
 * 仍然测试封装
 * 属性一般使用private修饰
 *  1. 一般使用private访问权限。
 *  2.  提供相应的get/set方法来访问相关属性，这些方法通常是public修饰的，以提供对属性的赋值与读取操作(注意：boolean变量的get方法是is开头!)。
 *  3. 一些只用于本类的辅助性方法可以用private修饰，希望其他类调用的方法用public修饰。
 */
public class TestEncapsulation01 {
    // 属性一般使用private修饰
    private int id;
    private String name;
    private int age;
    private boolean man;

    // 为属性提供public修饰的set/get方法
    public void setName(String name){
        this.name = name;
    }
    public String getName() {   //方法类型不是void了
        return name;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("请输入正常的年龄！");
        }
    }
    public int getAge() {
        return age;
    }

}
