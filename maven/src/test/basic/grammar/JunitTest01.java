import org.junit.*;

public class JunitTest01 {

/*    Junit测试用例执行顺序：
    @BeforeClass ==> @Before ==> @Test ==> @After ==> @AfterClass
    @RunWith：指定使用的单元测试执行类
*/
    public JunitTest01() {
        System.out.println("构造函数");
    }

    @BeforeClass    //方法必须必须要是静态方法（static 声明），所有测试开始之前运行，注意区分before，是所有测试方法
    public static void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @BeforeClass    //方法必须必须要是静态方法（static 声明），所有测试开始之前运行，注意区分before，是所有测试方法
    public static void beforClass(){
        System.out.println("@BeforeClass");
    }

    @Before     //每一个测试方法之前运行
    public void before(){
        System.out.println("@Before");
    }

    @Test
    public void test(){
        System.out.println("@Test");
    }

    @Ignore     //被忽略的测试方法：加上之后，暂时不运行此段代码
    public void ignore(){
        System.out.println("@Ignore");
    }

    @After      //每一个测试方法之后运行
    public void after(){
        System.out.println("@After");
    }

    @AfterClass     //方法必须要是静态方法（static 声明），所有测试结束之后运行，注意区分 @After
    public static void afterClass(){
        System.out.println("@AfterClass");
    }
}