class Point {
    double x, y;

    //构造方法名称和类名必须保持一致
    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    //无参构造器
    Point(){

    }

    public double getDistance(Point d) {
        return Math.sqrt((x - d.x) * (x - d.x) + (y - d.y) * (y - d.y));
    }
}
public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point origin = new Point(0.0, 0.0);
        Point pp = new Point();

        System.out.println(p.getDistance(origin));
    }
}