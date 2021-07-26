package dao;

import java.util.List;

import entities.PhongBan;

public interface PhongBanDAO {
	public List<PhongBan> getListPhongBan();

	public boolean themPhongBan(PhongBan phongBan);

	public boolean suaPhongBan(PhongBan phongBan);

	public boolean xoaPhongBan(PhongBan phongBan);

	public PhongBan getPhongBanById(int idPhongBan);

	public List<PhongBan> timKiemTheoTenPhongBan(String tenPhongBan, List<PhongBan> listPhongBans);

	public boolean checkTenPhongBan(String tenPhongBan, List<PhongBan> listPhongBan);

	public List<PhongBan> timKiemTheoIdPhongBan(int idPhongBan, List<PhongBan> listPhongBans);
	
	public boolean checkIdPhongBan(int idPhongBan, List<PhongBan> listPhongBan);
}
