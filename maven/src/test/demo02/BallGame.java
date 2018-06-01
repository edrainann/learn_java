package demo02;

import  javax.swing.*;
import java.awt.*;

public class BallGame extends JFrame{

    //由于懒加载问题，有可能出现第一次加载图片无效的情况；最小化图像窗口再打开即可
    Image ball = Toolkit.getDefaultToolkit().getImage("src/demo02/images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("src/demo02/images/desk.jpg");

    double x=100;   //小球的横坐标
    double y=100;   //小球的纵坐标
    //boolean right = true;   //V2.0方向
    double degree = 3.14/3; //V3.0弧度，此处60°

    //画窗口的方法
    public  void paint(Graphics g) {
        System.out.println("窗口被画了一次~");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);

        //V2.0窗口动起来的
        /*
        if(right){
            x = x + 10;
        }else{
            x = x - 10;
        }

        if(x > 856-40-30){  //856是窗口宽度，40是桌子边框的宽度，30是小球的直径
            right = false;
        }
        if(x<40) {   //40是桌子边框的宽度
            right = true;
        }
    }
    */
        //V3.0小球又弧度的动起来
        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        //碰到上下边界
        if (y > 500 - 40 - 30 || y < 40 + 40) {   //500是窗口高度，40是桌子边框，30是球直径，最后一个40是边框蓝的高度
            degree = -degree;
        }
        //碰到左右边界
        if (x < 40 || x > 856 - 40 - 30) {
            degree = 3.14 - degree;
        }
    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

        //V2.0窗口动起来的，V3.0重画窗口,每秒画25次
        while (true){
            repaint();
            try{
                Thread.sleep(40);   //40ms, 1s=1000ms,大约一秒画25次窗口
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //main方法是程序执行的入口
    public static void main(String[] args){
        System.out.println("这是第一次窗口的显示");
        BallGame game = new BallGame();
        game.launchFrame();
    }

}
