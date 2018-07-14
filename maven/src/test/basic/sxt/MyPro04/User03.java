//测试静态初始化块的使用

public class User03 {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码
    static String company; //公司名称

    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        User03 u3 = new User03();
    }
}