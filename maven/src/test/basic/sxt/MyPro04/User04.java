/**
 * 测试参数传值机制
 *
 */
public class User04 {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码

    public User04(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer01(User04  u){
        u.name="高小八";
    }

    public void testParameterTransfer02(User04  u){
        u = new User04(200,"高三");
//        u.name="高三";
    }

    public static void main(String[] args) {
        User04 u1 = new User04(100, "高小七");
        u1.testParameterTransfer01(u1);
        System.out.println(u1.name);

        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}