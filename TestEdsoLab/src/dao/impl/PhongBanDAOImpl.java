package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PhongBanDAO;
import db.ConnectDB;
import entities.PhongBan;

public class PhongBanDAOImpl implements PhongBanDAO {

	@Override
	public boolean themPhongBan(PhongBan phongBan) {
		Connection con = null;
		PreparedStatement prst = null;

		con = ConnectDB.openConnection();

		try {
			prst = con.prepareStatement("insert into PhongBan values (?, ?)");
			prst.setString(1, phongBan.getTenPhongBan());
			prst.setDate(2, new Date(phongBan.getNgayTao().getTime()));
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean suaPhongBan(PhongBan phongBan) {
		Connection con = null;
		PreparedStatement prst = null;

		con = ConnectDB.openConnection();
		try {
			prst = con.prepareStatement("update PhongBan set TenPhongBan = ?, NgayTao = ? where IdPhongBan = ?");
			prst.setString(1, phongBan.getTenPhongBan());
			prst.setDate(2, new Date(phongBan.getNgayTao().getTime()));
			prst.setInt(3, phongBan.getIdPhongBan());
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean xoaPhongBan(PhongBan phongBan) {
		Connection con = null;
		PreparedStatement prst = null;

		con = ConnectDB.openConnection();
		try {
			prst = con.prepareStatement("delete from PhongBan where IdPhongBan = ?");
			prst.setInt(1, phongBan.getIdPhongBan());
			int i = prst.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<PhongBan> getListPhongBan() {
		List<PhongBan> listPhongBans = new ArrayList<>();
		Connection con = null;
		PreparedStatement prst = null;
		ResultSet rs = null;

		con = ConnectDB.openConnection();
		try {
			prst = con.prepareStatement("select * from PhongBan");
			rs = prst.executeQuery();
			while (rs.next()) {
				PhongBan phongBan = new PhongBan();
				phongBan.setIdPhongBan(rs.getInt("IdPhongBan"));
				phongBan.setTenPhongBan(rs.getString("TenPhongBan"));
				phongBan.setNgayTao(rs.getDate("NgayTao"));
				listPhongBans.add(phongBan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listPhongBans;
	}

	@Override
	public PhongBan getPhongBanById(int idPhongBan) {
		PhongBan phongBan = new PhongBan();

		Connection con = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		con = ConnectDB.openConnection();
		try {
			prst = con.prepareStatement("select * from PhongBan where IdPhongBan = ?");
			prst.setInt(1, idPhongBan);
			rs = prst.executeQuery();
			if (rs.next()) {
				phongBan.setIdPhongBan(rs.getInt("IdPhongBan"));
				phongBan.setTenPhongBan(rs.getString("TenPhongBan"));
				phongBan.setNgayTao(rs.getDate("NgayTao"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return phongBan;
	}

	@Override
	public List<PhongBan> timKiemTheoTenPhongBan(String tenPhongBan, List<PhongBan> listPhongBans) {
		List<PhongBan> listPhongBan = new ArrayList<>();
		for (PhongBan phongBan : listPhongBans) {
			if (tenPhongBan.toLowerCase().equals(phongBan.getTenPhongBan().toLowerCase())) {
				listPhongBan.add(phongBan);
			}
		}

		return listPhongBan;
	}

	@Override
	public List<PhongBan> timKiemTheoIdPhongBan(int idPhongBan, List<PhongBan> listPhongBans) {
		List<PhongBan> listPhongBan = new ArrayList<>();
		for (PhongBan phongBan : listPhongBans) {
			if (phongBan.getIdPhongBan() == idPhongBan) {
				listPhongBan.add(phongBan);
			}
		}
		return listPhongBan;
	}

	@Override
	public boolean checkTenPhongBan(String tenPhongBan, List<PhongBan> listPhongBan) {
		for (PhongBan phongBan : listPhongBan) {
			if (tenPhongBan.toLowerCase().equals(phongBan.getTenPhongBan().toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkIdPhongBan(int idPhongBan, List<PhongBan> listPhongBan) {
		for (PhongBan phongBan : listPhongBan) {
			if (phongBan.getIdPhongBan() == idPhongBan) {
				return true;
			}
		}
		return false;
	}
}
