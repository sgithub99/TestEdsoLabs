package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UserDAO;
import db.ConnectDB;
import entities.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> getListUser() {
		List<User> listUser = new ArrayList<>();
		Connection con = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		
		con = ConnectDB.openConnection();
		try {
			prst = con.prepareStatement("select * from Userr");
			rs = prst.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setIdUser(rs.getInt("IdUser"));
				user.setUserName(rs.getString("Username"));
				user.setPassword(rs.getString("Password"));
				listUser.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUser;
	}

	@Override
	public boolean dangNhap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dangKy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean quenMatKhau() {
		// TODO Auto-generated method stub
		return false;
	}
}
