package cn.zarpk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Demo02 {
	//添加用户
	@Test
	public void addUser() {
		try {
			//1.注册驱动
			//2.建立连接
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student", "root", "123456");
			//3.创建statement对象
			Statement st = conn.createStatement();
			//4.执行sql
			String sql = "insert into user(sno,name,sex,age) values(20021,'廖宇航','女',18)";
			st.executeUpdate(sql);
			//5.关闭连接
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//思考：如何将驱动、连接、对象进行提取并封装？
		//作业：利用JDBC实现数据的修改和删除？  
	}

}
