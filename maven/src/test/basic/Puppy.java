public class Puppy {

    //创造 构造器
//    public Puppy(String name){
//        //这个构造器仅有一个参数 name
//        System.out.println("Passed name is : " + name);
//    }
//
//    public static void main(String[] args){
//        //下面的语句创建一个对象
////        Puppy myPuppy = new Puppy("Allen");
//    }


    //调用局部变量
    public void puppyName(){
        String name = "allen";
        System.out.println("this is name : " + name);
    }

    public static void main(String[] args){
        Puppy myPuppy = new Puppy();
        myPuppy.puppyName();
    }

}
