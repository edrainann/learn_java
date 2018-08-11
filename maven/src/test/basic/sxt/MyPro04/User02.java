/**
 * 测试static关键字的用法
 * static修饰的成员变量和方法，从属于类。
 *普通变量和方法从属于对象的。
 */
public class User02 {
    int id; // id
    String name; // 账户名
    String pwd; // 密码

    static String company = "北京尚学堂"; // 公司名称


    public User02(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("id是：" + id + "  name是：" + name);
    }

    public void login() {
        printCompany();//调用静态方法
        System.out.println(company); //调用静态变量
        System.out.println("登录：" + name);
    }

    public static void printCompany() {
//         login();//调用非静态成员，编译就会报错
        System.out.println(company);
    }

    public static void main(String[] args) {
//        User02 u = new User02(101, "高小七");
        User02.printCompany();
        User02.company = "北京阿里爷爷";
        User02.printCompany();
    }
}
