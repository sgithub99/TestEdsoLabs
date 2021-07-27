package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.TicketDAO;
import db.ConnectDB;
import entities.PhongBan;
import entities.Ticket;

public class TicketDAOImpl implements TicketDAO {

	@Override
	public List<Ticket> timKiemTheoKhoangThoiGianTiepNhan(Date startDate, Date endDate, List<Ticket> lisTickets) {
		List<Ticket> listTicketByDate = new ArrayList<>();
		for (Ticket ticket : lisTickets) {
			if (ticket.getThoiGianTiepNhan().compareTo(startDate) >= 0
					&& ticket.getThoiGianTiepNhan().compareTo(endDate) <= 0) {
				listTicketByDate.add(ticket);
			}
		}

		return listTicketByDate;
	}

	@Override
	public List<Ticket> timKiemTheoSDTKhachHang(String sdt, List<Ticket> lisTickets) {
		List<Ticket> listTicketBySDT = new ArrayList<>();
		for (Ticket ticket : lisTickets) {
			if (ticket.getSdtKhachHang().equals(sdt)) {
				listTicketBySDT.add(ticket);
			}
		}
		return listTicketBySDT;
	}

	@Override
	public List<Ticket> timKiemTheoIDPhongBan(int idPhongBan, List<Ticket> lisTickets) {
		List<Ticket> listTicketByIdPhongBan = new ArrayList<>();
		for (Ticket ticket : lisTickets) {
			if (ticket.getIdPhongban() == idPhongBan) {
				listTicketByIdPhongBan.add(ticket);
			}
		}
		return listTicketByIdPhongBan;
	}

	@Override
	public List<Ticket> timKiemTheoTenPhongBan(String tenPhongBan, List<Ticket> lisTickets) {
		List<Ticket> listTicketByTenPhongBan = new ArrayList<>();

		for (Ticket ticket : lisTickets) {
			if (new PhongBanDAOImpl().getPhongBanById(ticket.getIdPhongban()).getTenPhongBan().toLowerCase().equals(tenPhongBan.toLowerCase())) {
				listTicketByTenPhongBan.add(ticket);
			}
		}
		return listTicketByTenPhongBan;
	}

	@Override
	public List<Ticket> timKiemTheoTicketId(int ticketId, List<Ticket> lisTickets) {
		List<Ticket> listTicketByIdTicket = new ArrayList<>();
		for (Ticket ticket : lisTickets) {
			if (ticket.getIdTicket() == ticketId) {
				listTicketByIdTicket.add(ticket);
			}
		}
		return listTicketByIdTicket;
	}

	@Override
	public List<Ticket> getListTicket() {
		List<Ticket> listTickets = new ArrayList<>();
		Connection con = null;
		PreparedStatement prst = null;
		ResultSet rs = null;

		con = ConnectDB.openConnection();
		try {
			prst = con.prepareStatement("select * from Ticket");
			rs = prst.executeQuery();
			while (rs.next()) {
				Ticket ticket = new Ticket();

				ticket.setIdTicket(rs.getInt("IdTicket"));
				ticket.setIdPhongban(rs.getInt("IdPhongBan"));
				ticket.setSdtKhachHang(rs.getString("SDT_KH"));
				ticket.setyKienKhachHang(rs.getString("YKienKhachHang"));
				ticket.setThoiGianTiepNhan(rs.getDate("ThoiGianTiepNhan"));
				ticket.setNdXyLyTicket(rs.getString("NoiDungXuLyTicket"));
				ticket.setTrangThaiXyLy(rs.getBoolean("TrangThaiXuLy"));
				ticket.setThoiGianXyLy(rs.getDate("ThoiGianXyLy"));
				listTickets.add(ticket);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listTickets;
	}

	@Override
	public boolean checkSDTInTicket(String sdt, List<Ticket> lisTickets) {
		for (Ticket ticket : lisTickets) {
			if (ticket.getSdtKhachHang().equals(sdt)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkIDPhongBanInTicket(int idPhongBan, List<Ticket> lisTickets) {
		for (Ticket ticket : lisTickets) {
			if (ticket.getIdPhongban() == idPhongBan) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkTenPhongBanInTicket(String tenPhongBan, List<Ticket> lisTickets) {
		for (Ticket ticket : lisTickets) {
			if (new PhongBanDAOImpl().getPhongBanById(ticket.getIdPhongban()).getTenPhongBan().toLowerCase()
					.equals(tenPhongBan.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkIDTicketInTicket(int ticketId, List<Ticket> lisTickets) {
		for (Ticket ticket : lisTickets) {
			if (ticket.getIdTicket() == ticketId) {
				return true;
			}
		}
		return false;
	}

}
