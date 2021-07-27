package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dao.impl.PhongBanDAOImpl;

public class Ticket {

	private int idTicket;
	private int idPhongban;
	private String sdtKhachHang;
	private String yKienKhachHang;
	private Date thoiGianTiepNhan;
	private String ndXyLyTicket;
	private boolean trangThaiXyLy;
	private Date thoiGianXyLy;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int idTicket, int idPhongban, String sdtKhachHang, String yKienKhachHang, Date thoiGianTiepNhan,
			String ndXyLyTicket, boolean trangThaiXyLy, Date thoiGianXyLy) {
		super();
		this.idTicket = idTicket;
		this.idPhongban = idPhongban;
		this.sdtKhachHang = sdtKhachHang;
		this.yKienKhachHang = yKienKhachHang;
		this.thoiGianTiepNhan = thoiGianTiepNhan;
		this.ndXyLyTicket = ndXyLyTicket;
		this.trangThaiXyLy = trangThaiXyLy;
		this.thoiGianXyLy = thoiGianXyLy;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public int getIdPhongban() {
		return idPhongban;
	}

	public void setIdPhongban(int idPhongban) {
		this.idPhongban = idPhongban;
	}

	public String getSdtKhachHang() {
		return sdtKhachHang;
	}

	public void setSdtKhachHang(String sdtKhachHang) {
		this.sdtKhachHang = sdtKhachHang;
	}

	public String getyKienKhachHang() {
		return yKienKhachHang;
	}

	public void setyKienKhachHang(String yKienKhachHang) {
		this.yKienKhachHang = yKienKhachHang;
	}

	public Date getThoiGianTiepNhan() {
		return thoiGianTiepNhan;
	}

	public void setThoiGianTiepNhan(Date thoiGianTiepNhan) {
		this.thoiGianTiepNhan = thoiGianTiepNhan;
	}

	public String getNdXyLyTicket() {
		return ndXyLyTicket;
	}

	public void setNdXyLyTicket(String ndXyLyTicket) {
		this.ndXyLyTicket = ndXyLyTicket;
	}

	public boolean isTrangThaiXyLy() {
		return trangThaiXyLy;
	}

	public void setTrangThaiXyLy(boolean trangThaiXyLy) {
		this.trangThaiXyLy = trangThaiXyLy;
	}

	public Date getThoiGianXyLy() {
		return thoiGianXyLy;
	}

	public void setThoiGianXyLy(Date thoiGianXyLy) {
		this.thoiGianXyLy = thoiGianXyLy;
	}

	@Override
	public String toString() {
		return "Ticket [idTicket=" + idTicket + ", idPhongban=" + idPhongban + ", sdtKhachHang=" + sdtKhachHang
				+ ", yKienKhachHang=" + yKienKhachHang + ", thoiGianTiepNhan=" + thoiGianTiepNhan + ", ndXyLyTicket="
				+ ndXyLyTicket + ", trangThaiXyLy=" + trangThaiXyLy + ", thoiGianXyLy=" + thoiGianXyLy + "]";
	}
	

	public void printTicket(List<Ticket> listTickets) {
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.printf("%-15s%-25s%-15s%-15s%-15s%-30s%-20s%-15s\n", "Ticket ID", "Phòng ban tiếp nhận", "SDT KH",
				"Ý kiến KH", "TG tiếp nhận", "Nội dung xử lý", "Trạng thái xử lý", "TG xử lý");
		for (Ticket ticket : listTickets) {
			System.out.printf("%-15d%-25s%-15s%-15s%-15s%-30s%-20b%-15s\n", ticket.getIdTicket(),
					new PhongBanDAOImpl().getPhongBanById(ticket.getIdPhongban()).getTenPhongBan(), ticket.getSdtKhachHang(), ticket.getyKienKhachHang(),
					sf.format(ticket.getThoiGianTiepNhan()), ticket.getNdXyLyTicket(), ticket.isTrangThaiXyLy(),
					sf.format(ticket.getThoiGianXyLy()));
		}
	}

}
