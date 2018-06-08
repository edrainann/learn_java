public class CalculatorTest01 {

    public static void main(String[] args){
        Calculator c = new Calculator();
        //测试add()方法
        int result1 = c.add(1,2);
        if(result1 == 2){
            System.out.println("add()方法正确");
        }
        else if(result1 > 1){
            System.out.println("add() > 1");
        }
        else{
            System.out.println("add() ");
        }

        //测试sub()方法
        int result2 = c.sub(1, 2);
        if(result2 == 1){
            System.out.println("sub()方法正确");
        }
        else {
            System.out.println("sub()方法不正确");
        }



    }
}
