package demo;
/*
测试标识符的写法
1字节=8，2的八次方=256
2字节=16，2的十六次方=65536
javac -encoding UTF-8 Biaoshifu.java
*/
public class Biaoshifu {
    public static void main(String[] args){
        int $abd = 3;
        int $ = 4;
        int _123 = 5;
        //int 123abc = 7;   //标识符不能以数字开头
        //int abd# = 3;     //标识符不能包含除了字母、数字、下划线、$ 之外的其他字符
//        int class = 3；
        int 哇 = 8;    //java内部采用了Unicode字符集， universal
        char a1 = '艾';
        char a2 = 'a';
        int a3 = a2 + 9;
        char a4 = (char)a3; //强制转型

        System.out.println(哇);
        System.out.println(a1);
        System.out.println(a4);

    }
}

