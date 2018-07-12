//测试嵌套循环

public class TestWhileQiantao {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("##############");
        for(int i =1;i<=5;i++){
            for ( int j=1;j<=5;j++){
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        System.out.println("##############");
        //打印1*2=2 2*2=4
        for (int m = 1; m <= 2; m++) {
            System.out.print(m + "*" + 2 + "=" + (m * 2) + "\t");
        }
        System.out.println();

        System.out.println("##############");
        //打印乘法表
        for(int n=1;n<=9;n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print(m + "*" + n + "=" + (m * n) + "\t");
            }
            System.out.println();
        }

        System.out.println("##############");
        //用while循环分别计算100以内的奇数及偶数的和，并输出
        int sum01 = 0;
        int sum02 = 0;
        for(int i=1;i<=3;i++) {
            if (i % 2 == 0) {//偶数
                sum01 += i;  //sum01=sum01 + i;
            } else {//奇数
                sum02 += i;
            }
        }
        System.out.println("偶数和"+sum01);
        System.out.println("奇数和"+sum02);
    }
}
