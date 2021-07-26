package entities;

public class User {
	private int IdUser;
	private String userName;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int idUser, String userName, String password) {
		super();
		IdUser = idUser;
		this.userName = userName;
		this.password = password;
	}
	public int getIdUser() {
		return IdUser;
	}
	public void setIdUser(int idUser) {
		IdUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [IdUser=" + IdUser + ", userName=" + userName + ", password=" + password + "]";
	}

	
	
	

}
