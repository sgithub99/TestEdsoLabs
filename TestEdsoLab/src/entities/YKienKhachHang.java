package entities;

import java.util.Date;

public class YKienKhachHang {
	private int idYKienKhachHang;
	private PhongBan idPhongBan;
	private String sdtKhachHang;
	private String yKienKhachHang;
	private Date thoiGianTiepNhan;

	public YKienKhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YKienKhachHang(int idYKienKhachHang, PhongBan idPhongBan, String sdtKhachHang, String yKienKhachHang,
			Date thoiGianTiepNhan) {
		super();
		this.idYKienKhachHang = idYKienKhachHang;
		this.idPhongBan = idPhongBan;
		this.sdtKhachHang = sdtKhachHang;
		this.yKienKhachHang = yKienKhachHang;
		this.thoiGianTiepNhan = thoiGianTiepNhan;
	}

	public int getIdYKienKhachHang() {
		return idYKienKhachHang;
	}

	public void setIdYKienKhachHang(int idYKienKhachHang) {
		this.idYKienKhachHang = idYKienKhachHang;
	}

	public PhongBan getIdPhongBan() {
		return idPhongBan;
	}

	public void setIdPhongBan(PhongBan idPhongBan) {
		this.idPhongBan = idPhongBan;
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

	@Override
	public String toString() {
		return "YKienKhachHang [idYKienKhachHang=" + idYKienKhachHang + ", idPhongBan=" + idPhongBan + ", sdtKhachHang="
				+ sdtKhachHang + ", yKienKhachHang=" + yKienKhachHang + ", thoiGianTiepNhan=" + thoiGianTiepNhan + "]";
	}

	
}
