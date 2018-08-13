public class Test001 {
    public static void main(String[] args) {
        int[] arr01;
        String arr02[];
        User[] arr03;

        int[] s = null; //声明数组
        s = new int[10];  //给数组分配空间

        int[] ar01 = new int[10];//索引下标[0,length-1]：0，1，2，3，4，5，6，7，8，9
        String ar02[] = new String[5];
        User[] ar03 = new User[3];

        ar01[0] = 13;
        ar01[1] = 13;
        ar01[2] = 13;
//        ar01[10] = 13;  //java.lang.ArrayIndexOutOfBoundsException:

        //通过循环初始化数组
//        for(int i=0;i<10;i++){
        for(int i=0;i<ar01.length;i++){
            ar01[i] = 10*i;
        }
        //通过循环读取数组里面元素的值
        for(int i=0;i<ar01.length;i++){
            System.out.println(ar01[i]);
        }

        User[] ar04 = new User[3];
        ar04[0] = new User(1000,"edrain0");
        ar04[1] = new User(1001,"edrain1");
        ar04[2] = new User(1002,"edrain2");
//        ar04[3] = new User(1003,"edrain");
        for(int i=0;i<ar04.length;i++){
            System.out.println(ar04[i].getName());
        }

    }
}

