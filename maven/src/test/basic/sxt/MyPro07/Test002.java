/**
 * 测试数组的三种初始化方式
 */
public class Test002 {
    public static void main(String[] args) {
        //静态初始化
        int[] a ={2,4,67};
        User[] b = {
                new User(1001,"edrain01"),
                new User(1002,"edrain02"),
                new User(1003,"edrain03")
        };

        //默认初始化
        int[] c = new int[3];  //默认给数组的元素进行赋值，跟成员变量的赋值类型一样

        //动态初始化
        int[] a1 = new int[2]; //动态初始化数组，先分配空间；
        a1[0] = 1;  //给出数组元素赋值
        a1[1] = 2;  //给出数组元素赋值


    }
}
