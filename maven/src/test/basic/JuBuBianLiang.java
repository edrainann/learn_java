
//java局部变量
/*
局部变量声明在方法、构造方法或者语句块中；
局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
访问修饰符不能用于局部变量；
局部变量只在声明它的方法、构造方法或者语句块中可见；
局部变量是在栈上分配的。
局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
 */

public class JuBuBianLiang {
    public int pupAge(){
        int age  = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
        return age;
    }

    public void pupYear(){
        int year = 2000;
        year = year + 22;
       System.out.println("小狗的年代是： " + year);
    }

    public static void pupDate(){
        int date = 1;
        date = date + 10;
        System.out.println("小狗的日期是： " + date);
    }

    public static void main(String[] args){
        JuBuBianLiang age = new JuBuBianLiang();
        age.pupAge();

        JuBuBianLiang year = new JuBuBianLiang();
        year.pupYear();

//        date.pupDate();
        JuBuBianLiang.pupDate();

    }
}
