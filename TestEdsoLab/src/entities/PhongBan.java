package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PhongBan {

	private int idPhongBan;
	private String tenPhongBan;
	private Date ngayTao;

	public PhongBan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongBan(int idPhongBan, String tenPhongBan, Date ngayTao) {
		super();
		this.idPhongBan = idPhongBan;
		this.tenPhongBan = tenPhongBan;
		this.ngayTao = ngayTao;
	}

	public int getIdPhongBan() {
		return idPhongBan;
	}

	public void setIdPhongBan(int idPhongBan) {
		this.idPhongBan = idPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Override
	public String toString() {
		return "PhongBan [idPhongBan=" + idPhongBan + ", tenPhongBan=" + tenPhongBan + ", ngayTao=" + ngayTao + "]";
	}
	

	public void printPhongBan(List<PhongBan> lisPhongBans) {
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.printf("%-15s%-30s%-15s\n", "Mã phòng ban", "Tên phòng ban", "Ngày tạo");
		for (PhongBan phongBan : lisPhongBans) {
			System.out.printf("%-15d%-30s%-15s\n", phongBan.getIdPhongBan(), phongBan.getTenPhongBan(),
					sf.format(phongBan.getNgayTao()));
		}

	}

	public PhongBan nhapPhongBan() {
		PhongBan phongBan = new PhongBan();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tên phòng ban:");
		phongBan.setTenPhongBan(input.nextLine());
		System.out.println("Nhập ngày tạo");
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		String date = input.nextLine();
		try {
			phongBan.setNgayTao(sf.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return phongBan;
	}

	public void suaPhongBan() {
		PhongBan phongBan = new PhongBan();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tên phòng ban cần sửa:");
		phongBan.setTenPhongBan(input.nextLine());
		System.out.println("Nhập ngày cần sửa");
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		String date = input.nextLine();
		try {
			phongBan.setNgayTao(sf.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
