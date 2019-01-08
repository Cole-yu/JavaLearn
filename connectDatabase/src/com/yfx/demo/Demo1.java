package com.yfx.demo;

import java.sql.*;
public class Demo1 {
  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");     //����MYSQL JDBC��������   
      System.out.println("Success loading Mysql Driver!");
    }
    catch (Exception e) {
      System.out.print("Error loading Mysql Driver!");
      e.printStackTrace();
    }
    try {
      Connection connect = DriverManager.getConnection(
    	"jdbc:mysql://localhost:3306/user_cmx?&serverTimezone=GMT","root","");
        //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������

      	System.out.println("Success connect Mysql server!");
      	Statement stmt = connect.createStatement();
      	ResultSet rs = stmt.executeQuery("select * from user");		//user Ϊ���������
                                                              
      	while (rs.next()) {
      		System.out.println(rs.getString("name"));
      	}
    }
    catch (Exception e) {
    	System.out.print("get data error!");
    	e.printStackTrace();
    }
  }
}