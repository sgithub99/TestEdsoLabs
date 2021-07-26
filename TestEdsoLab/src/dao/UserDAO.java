package dao;

import java.util.List;

import entities.User;

public interface UserDAO {
	
	public boolean dangNhap();
	
	public boolean dangKy();
	
	public boolean quenMatKhau();
	public List<User> getListUser();
	

}
