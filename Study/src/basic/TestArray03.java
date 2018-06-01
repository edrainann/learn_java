
/*
foreach 循环或者加强型循环，它能在不使用下标的情况下遍历数组。
*/

public class TestArray03 {
    public static void main(String[] args){
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        //打印所有数组元素
        for (double element : myList){
            System.out.println("打印数组元素： " + element);
        }

    }
}
