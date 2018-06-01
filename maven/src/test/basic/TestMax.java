
/*
这个程序包含 main 方法和 max 方法。
main 方法是被 JVM 调用的，除此之外，main 方法和其它方法没什么区别。
main 方法的头部是不变的，如例子所示，带修饰符 public 和 static,返回 void 类型值，方法名字是 main,此外带个一个 String[] 类型参数。String[] 表明参数是字符串数组。
*/

public class TestMax {
    /** 主方法 */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);
    }

    /** 返回两个整数变量较大的值 */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}