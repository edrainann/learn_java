public class TestPrimitiveDataType03 {
    public static void main(String[] agrs){
        char a ='T';
//        char b = '哇';
        char c = '\u0061';
        System.out.println(c);

        //转义字符
        System.out.println("" + 'a' + '\n' + 'b' );
        System.out.println("" + 'a' + '\t' + 'b' );
        System.out.println("" + 'a' + '\'' + 'b' );     //a'b

        //String就是字符序列
        String d = "abc";

        //测试布尔类型
        boolean man = true;

        if(man){    //极不推荐 man == true
            System.out.println("男性");
        }
    }

}
