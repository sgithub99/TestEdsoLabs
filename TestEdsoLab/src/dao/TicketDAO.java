package dao;

import java.util.Date;
import java.util.List;

import entities.Ticket;

public interface TicketDAO {

	public List<Ticket> getListTicket();

	public List<Ticket> timKiemTheoKhoangThoiGianTiepNhan(Date startDate, Date endDate, List<Ticket> lisTickets);

	public List<Ticket> timKiemTheoSDTKhachHang(String sdt, List<Ticket> lisTickets);

	public boolean checkSDTInTicket(String sdt, List<Ticket> lisTickets);

	public List<Ticket> timKiemTheoIDPhongBan(int idPhongBan, List<Ticket> lisTickets);

	public boolean checkIDPhongBanInTicket(int idPhongBan, List<Ticket> lisTickets);

	public boolean checkIDTicketInTicket(int ticketId, List<Ticket> lisTickets);

	public List<Ticket> timKiemTheoTicketId(int ticketId, List<Ticket> lisTickets);

	public boolean checkTenPhongBanInTicket(String tenPhongBan, List<Ticket> lisTickets);

	public List<Ticket> timKiemTheoTenPhongBan(String tenPhongBan, List<Ticket> lisTickets);

}
