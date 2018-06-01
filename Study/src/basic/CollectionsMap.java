import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
    public static void main(String[] args){
        Map m1 = new HashMap();
        m1.put("Zara", 8);
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "22");

//        System.out.println();
        System.out.println("Map Elements");
//        System.out.println("\t" + m1);
        System.out.println(m1);

        //-----------------
        //第一个参数是key，第二个参数是value；相当于一个钥匙，一把锁
        Map<String,String> map = new HashMap<String, String>();
        map.put("a", "hello1");
        map.put("b", "hello2");
        map.put("c", "hello3");
        map.put("d", "hello4");

        System.out.println(map.size());
        //get的时候传入 key
        System.out.println(map.get("c"));
        System.out.println(map);

        //----map的遍历。它有两个集合，一个是值的集合，一个是键的集合。map都提供了方法进行访问。先遍历一下key
        for (String key : map.keySet()){
            System.out.println("我是键： " + key);
        }
        //----map的遍历。它有两个集合，一个是值的集合，一个是键的集合。map都提供了方法进行访问。遍历一下value
        for (String value : map.values()){
            System.out.println("我是值： "+ value);
        }
        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }


    }
}
