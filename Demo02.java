package cn.zarpk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Demo02 {
	//����û�
	@Test
	public void addUser() {
		try {
			//1.ע������
			//2.��������
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student", "root", "123456");
			//3.����statement����
			Statement st = conn.createStatement();
			//4.ִ��sql
			String sql = "insert into user(sno,name,sex,age) values(20021,'���','Ů',18)";
			st.executeUpdate(sql);
			//5.�ر�����
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//˼������ν����������ӡ����������ȡ����װ��
		//��ҵ������JDBCʵ�����ݵ��޸ĺ�ɾ����  
	}

}
