//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class XunHuan {
    public static void main(String[] args){
        //while 循环
        System.out.println("------while 循环------");
        int x = 10;
        while ( x < 15 ){
            System.out.print("value of x:" + x);
            x++;
            System.out.print("\n");
        }

        //do…while 循环
        System.out.println("------do…while 循环------");
        int y = 20;
        do {
            System.out.print("value of y :" + y);
            y++;
            System.out.print("\n");
        }while ( y< 25 );

        //for 循环
        System.out.println("------for 循环------");
//        for(int z = 10; z < 15; z = z+1){
        for(int z = 10; z < 15; ++z){
            System.out.print("value of z: " + z);
            System.out.print("\n");
        }

        //增强 for 循环
        System.out.println("------增强 for 循环------");
        int [] numbers = {10, 20, 30, 40, 50};
        for(int i : numbers){
            System.out.print( i );
            System.out.print( "," );
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names){
            System.out.print(name);
            System.out.print(",");
        }
        System.out.println();


        //break 关键字
        System.out.println("------break 关键字------");
        int [] num = {10, 20, 30, 40, 50};
        for(int j : num ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( j );
            System.out.print("\n");
        }

        //continue 关键字
        System.out.println("------continue 关键字------");
        int [] numc= {10, 20, 30, 40, 50};
        for(int g : numc ) {
            // 让程序立刻跳转到下一次循环的迭代；不输出30，直接输出40
            if( g == 30 ) {
                continue;
            }
            System.out.print( g );
            System.out.print("\n");
        }
    }
}
