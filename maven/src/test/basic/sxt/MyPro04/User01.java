//构造方法重载(创建不同用户对象)

public class User01 {
    int id; // id
    String name; // 账户名
    String pwd; // 密码

    public User01() {
    }

    public User01(int id, String name) {
//        super();            //构造方法的第一句总是super()
        this.id = id;       //this表示创建好的对象
        this.name = name;
    }

    public User01(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        User01 u1 = new User01();
        User01 u2 = new User01(101, "高小七");
        User01 u3 = new User01(100, "高淇", "123456");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}