import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.impl.PhongBanDAOImpl;
import dao.impl.TicketDAOImpl;
import dao.impl.UserDAOImpl;
import entities.PhongBan;
import entities.Ticket;
import entities.User;

public class Main {
	public static void main(String[] args) {
		int choice = 0;
		Scanner input = new Scanner(System.in);
		List<Ticket> listTicket = new TicketDAOImpl().getListTicket();
		Ticket ticket = new Ticket();
		ticket.printTicket(listTicket);
		System.out.println("Nhập lựa chọn của bạn");
		do {
			System.out.println("0. Thoát chương trình");
			System.out.println("1. Tìm kiếm ticket khiếu nại");
			System.out.println("2. Quản lý phòng ban");
			System.out.println("3. Nhập thông tin khiếu nại");
			choice = Integer.parseInt(input.nextLine());
			switch (choice) {
			case 0:
				break;
			case 1:
				int choiceTicket = 0;
				System.out.println("Nhập lựa chọn của bạn");
				do {
					System.out.println("0. Thoát chương trình");
					System.out.println("1. Tìm kiếm theo khoảng thời gian tiếp nhận");
					System.out.println("2. Tìm kiếm theo số điện thoại khách hàng");
					System.out.println("3. Tìm kiếm theo ticket Id");
					System.out.println("4. Tìm kiếm theo Id phòng ban");
					System.out.println("5. Tìm kiếm theo tên phòng ban");
					choiceTicket = Integer.parseInt(input.nextLine());
					switch (choiceTicket) {
					case 0:
						break;
					case 1:

						SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
						Date startDate = null;
						Date endDate = null;
						try {
							System.out.println("Nhập thời gian bắt đầu: ");
							startDate = sf.parse(input.nextLine());
							System.out.println("Nhập thời gian kết thúc: ");
							endDate = sf.parse(input.nextLine());

						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						List<Ticket> timKiemTheoKhoangThoiGianTiepNhan = new TicketDAOImpl()
								.timKiemTheoKhoangThoiGianTiepNhan(startDate, endDate, listTicket);
						new Ticket().printTicket(timKiemTheoKhoangThoiGianTiepNhan);
						break;
					case 2:
						System.out.println("Nhập số điện thoại khách hàng");
						String sdt = input.nextLine();
						boolean checkSDTInTicket = new TicketDAOImpl().checkSDTInTicket(sdt, listTicket);
						if (checkSDTInTicket) {
							List<Ticket> timKiemTheoSDTKhachHang = new TicketDAOImpl().timKiemTheoSDTKhachHang(sdt,
									listTicket);
							new Ticket().printTicket(timKiemTheoSDTKhachHang);

						} else {
							System.out.println("Không tồn tại số điện thoại trong ticket");
						}
						break;
					case 3:
						System.out.println("Nhập mã ticket");
						int ticketId = Integer.parseInt(input.nextLine());
						boolean checkIDTicketInTicket = new TicketDAOImpl().checkIDTicketInTicket(ticketId, listTicket);
						if (checkIDTicketInTicket) {
							List<Ticket> timKiemTheoTicketId = new TicketDAOImpl().timKiemTheoTicketId(ticketId,
									listTicket);
							new Ticket().printTicket(timKiemTheoTicketId);

						} else {
							System.out.println("Không tồn tại ticket ID trong ticket");
						}
						break;
					case 4:
						System.out.println("Nhập mã phòng ban");
						int idPhongBan = Integer.parseInt(input.nextLine());
						boolean checkIDPhongBanInTicket = new TicketDAOImpl().checkIDPhongBanInTicket(idPhongBan,
								listTicket);
						if (checkIDPhongBanInTicket) {
							List<Ticket> timKiemTheoIDPhongBan = new TicketDAOImpl().timKiemTheoIDPhongBan(idPhongBan,
									listTicket);
							new Ticket().printTicket(timKiemTheoIDPhongBan);

						} else {
							System.out.println("Không tồn tại mã phòng ban trong ticket");
						}
						break;
					case 5:
						System.out.println("Nhập tên phòng ban");
						String tenPhongBan = input.nextLine();
						boolean checkTenPhongBanInTicket = new TicketDAOImpl().checkTenPhongBanInTicket(tenPhongBan,
								listTicket);
						if (checkTenPhongBanInTicket) {
							List<Ticket> timKiemTheoTenPhongBan = new TicketDAOImpl()
									.timKiemTheoTenPhongBan(tenPhongBan, listTicket);
							new Ticket().printTicket(timKiemTheoTenPhongBan);

						} else {
							System.out.println("Không tồn tại mã phòng ban trong ticket");
						}
						break;
					default:
						System.out.println("Vui lòng nhập từ 1-4");
						break;
					}
				} while (choiceTicket != 0);
				break;
			case 2:
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
						new PhongBan().printPhongBan(listPhongBan);
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
						boolean timKiemTheoIdPhongBan = new PhongBanDAOImpl().checkIdPhongBan(idPhongBan,
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
						boolean timKiemTheoIdPhongBan2 = new PhongBanDAOImpl().checkIdPhongBan(maPhongBan,
								listPhongBan2);
						if (timKiemTheoIdPhongBan2) {
							PhongBan phongBanById = new PhongBanDAOImpl().getPhongBanById(maPhongBan);
							boolean xoaPhongBan = new PhongBanDAOImpl().xoaPhongBan(phongBanById);
							if (xoaPhongBan) {
								System.out.println("Xoá phòng ban thành công");
							} else {
								System.out.println("Xoá phòng ban thất bại");
							}
						} else {
							System.out.println("Không tìm thấy mã phòng ban");
						}
						break;
					case 5:

						List<PhongBan> listPhongBan3 = new PhongBanDAOImpl().getListPhongBan();
						System.out.println("Nhập tên phòng ban cần tìm kiếm");
						String tenPhongBan = input.nextLine();
						boolean checkTenPhongBan = new PhongBanDAOImpl().checkTenPhongBan(tenPhongBan, listPhongBan3);
						if (checkTenPhongBan) {
							List<PhongBan> timKiemTheoTenPhongBan = new PhongBanDAOImpl()
									.timKiemTheoTenPhongBan(tenPhongBan, listPhongBan3);
							new PhongBan().printPhongBan(timKiemTheoTenPhongBan);
						} else {
							System.out.println("Không tìm thấy phòng ban");
						}
						break;
					case 6:
						List<PhongBan> listPhongBan4 = new PhongBanDAOImpl().getListPhongBan();
						System.out.println("Nhập mã phòng ban cần tìm kiếm");
						int maPhongBan1 = Integer.parseInt(input.nextLine());
						boolean kiemTheoIdPhongBan = new PhongBanDAOImpl().checkIdPhongBan(maPhongBan1, listPhongBan4);
						if (kiemTheoIdPhongBan) {
							List<PhongBan> timKiemTheoIdPhongBan3 = new PhongBanDAOImpl()
									.timKiemTheoIdPhongBan(maPhongBan1, listPhongBan4);
							new PhongBan().printPhongBan(timKiemTheoIdPhongBan3);
						} else {
							System.out.println("Không tìm thấy mã phòng ban");
						}
						break;
					default:
						System.out.println("Vui lòng nhập từ 1-6");
						break;
					}
				} while (choicePhongBan != 0);
				break;
			case 3:

			default:
				break;
			}
		} while (choice != 0);
	}

}
