package cn.sxt.ed;

import cn.sxt.oo.User;
import java.util.Date;
import java.sql.*;
import static java.lang.Math.*;  //引入静态变量

public class Test {
    public static void main(String[] args) {
//        cn.sxt.oo.User user = new cn.sxt.oo.User();  //没导入user类
        User use = new User();
        String str;

        Date data = new Date();
        java.util.Date data01 = new java.util.Date();

        System.out.println(Math.PI);
        System.out.println(PI);  //引入静态变量

    }

}
