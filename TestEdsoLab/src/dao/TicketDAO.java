package dao;

import java.util.Date;
import java.util.List;

import entities.Ticket;

public interface TicketDAO {

	public List<Ticket> timKiemTheoKhoangThoiGianTiepNhan(Date startDate, Date endDate);

	public List<Ticket> timKiemTheoSDTKhachHang(String sdt);

	public List<Ticket> timKiemTheoIDPhongBan(int idPhongBan);

	public List<Ticket> timKiemTheoTenPhongBan(String tenPhongBan);

}
