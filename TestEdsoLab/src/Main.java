import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.impl.PhongBanDAOImpl;
import dao.impl.UserDAOImpl;
import entities.PhongBan;
import entities.User;

public class Main {
	public static void main(String[] args) {
		int choice = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập lựa chọn của bạn");
		do {
			System.out.println("0. Thoát chương trình");
			System.out.println("1. Quản lý phòng ban");
			System.out.println("2. Quản lý khiếu nại");
			choice = Integer.parseInt(input.nextLine());
			switch (choice) {
			case 0:
				break;
			case 1:
				int choicePhongBan = 0;
				System.out.println("Nhập lựa chọn của bạn");
				do {
					System.out.println("0. Thoát");
					System.out.println("1. Hiển thị danh sách phòng ban");
					System.out.println("2. Thêm mới phòng ban");
					System.out.println("3. Sửa phòng ban");
					System.out.println("4. Xoá phòng ban");
					System.out.println("5. Tìm kiếm theo tên phòng ban");
					System.out.println("6. Tìm kiếm theo id phòng ban");
					choicePhongBan = Integer.parseInt(input.nextLine());
					switch (choicePhongBan) {
					case 0:
						break;
					case 1:
						PhongBanDAOImpl phongBanDAOImpl = new PhongBanDAOImpl();
						List<PhongBan> listPhongBan = phongBanDAOImpl.getListPhongBan();
						for (PhongBan phongBan : listPhongBan) {
							System.out.println(phongBan.toString());
						}
						break;
					case 2:
						PhongBan phongBan = new PhongBan().nhapPhongBan();
						boolean themPhongBan = new PhongBanDAOImpl().themPhongBan(phongBan);
						if (themPhongBan) {
							System.out.println("Thêm mới phòng ban thành công!");
						} else {
							System.out.println("Thêm mới phòng ban thất bại!");
						}
						break;
					case 3:
						System.out.println("Nhập mã phòng ban cần sửa");
						int idPhongBan = Integer.parseInt(input.nextLine());
						List<PhongBan> listPhongBan1 = new PhongBanDAOImpl().getListPhongBan();
						boolean timKiemTheoIdPhongBan = new PhongBanDAOImpl().timKiemTheoIdPhongBan(idPhongBan,
								listPhongBan1);
						if (timKiemTheoIdPhongBan) {
							PhongBan phongBan2 = new PhongBanDAOImpl().getPhongBanById(idPhongBan);
							System.out.println("Nhập tên phòng ban cần sửa");
							phongBan2.setTenPhongBan(input.nextLine());
							System.out.println("Nhập ngày cần sửa");
							SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
							String date = input.nextLine();
							try {
								phongBan2.setNgayTao(sf.parse(date));
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							boolean suaPhongBan2 = new PhongBanDAOImpl().suaPhongBan(phongBan2);
							if (suaPhongBan2) {
								System.out.println("Sửa phòng ban thành công");

							} else {
								System.out.println("Sửa phòng ban thất bại");
							}
						} else {
							System.out.println("Không tìm thấy mã phòng ban");
						}
						break;
					case 4:
						System.out.println("Nhập mã phòng ban cần xoá");
						int maPhongBan = Integer.parseInt(input.nextLine());
						List<PhongBan> listPhongBan2 = new PhongBanDAOImpl().getListPhongBan();
						boolean timKiemTheoIdPhongBan2 = new PhongBanDAOImpl().timKiemTheoIdPhongBan(maPhongBan,
								listPhongBan2);
						if (timKiemTheoIdPhongBan2) {
							
						} else {
							System.out.println("Không tìm thấy mã phòng ban");
						}

						break;
					case 5:
						break;
					case 6:
						break;
					default:
						break;
					}
				} while (choicePhongBan != 0);
				break;
			case 2:
			default:
				break;
			}
		} while (choice != 0);
	}

}
