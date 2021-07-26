package dao;

import java.util.List;

import entities.PhongBan;

public interface PhongBanDAO {
	public List<PhongBan> getListPhongBan();

	public boolean themPhongBan(PhongBan phongBan);

	public boolean suaPhongBan(PhongBan phongBan);

	public boolean xoaPhongBan(PhongBan phongBan);

	public PhongBan getPhongBanById(int idPhongBan);
	
	public PhongBan timKiemTheoTenPhongBan(String tenPhongBan);
	
	public boolean timKiemTheoIdPhongBan(int idPhongBan, List<PhongBan> listPhongBans);
}
