package entities;

import java.util.Date;

public class Ticket {

	private int idTicket;
	private PhongBan idPhongban;
	private User idUser;
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

	public Ticket(int idTicket, PhongBan idPhongban, User idUser, String sdtKhachHang, String yKienKhachHang,
			Date thoiGianTiepNhan, String ndXyLyTicket, boolean trangThaiXyLy, Date thoiGianXyLy) {
		super();
		this.idTicket = idTicket;
		this.idPhongban = idPhongban;
		this.idUser = idUser;
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

	public PhongBan getIdPhongban() {
		return idPhongban;
	}

	public void setIdPhongban(PhongBan idPhongban) {
		this.idPhongban = idPhongban;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
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
		return "Ticket [idTicket=" + idTicket + ", idPhongban=" + idPhongban + ", idUser=" + idUser + ", sdtKhachHang="
				+ sdtKhachHang + ", yKienKhachHang=" + yKienKhachHang + ", thoiGianTiepNhan=" + thoiGianTiepNhan
				+ ", ndXyLyTicket=" + ndXyLyTicket + ", trangThaiXyLy=" + trangThaiXyLy + ", thoiGianXyLy="
				+ thoiGianXyLy + "]";
	}

	
}
