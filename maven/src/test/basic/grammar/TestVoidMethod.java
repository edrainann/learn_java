
/*这里printGrade方法是一个void类型方法，它不返回值。
 一个void方法的调用一定是一个语句。
 所以，它被在main方法第三行以语句形式调用，就像任何以分号结束的语句一样。
 */
public class TestVoidMethod {
    public static void main(String[] args) {
        printGrade(78.5);
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }


}