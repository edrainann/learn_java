

/*
首先声明了一个数组变量 myList，接着创建了一个包含 10 个 double 类型元素的数组，并且把它的引用赋值给 myList 变量。
*/
public class TestArray01 {
    public static void main(String[] args){
        int size1  = 11; //数组大小
        double[] myList = new double[size1];    // 定义数组
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        double total = 0;   // 计算所有元素的总和
        for (int i = 0; i < size1; i++){
//            total +=myList[i];
            total =total + myList[i];
        }
        System.out.println("总和为： " + total);
    }
}







