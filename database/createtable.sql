create database TestEdsoLabs
go
use TestEdsoLabs
go

create table Userr(
IdUser int identity primary key,
Username varchar(20),
Password varchar(10))

create table PhongBan(
IdPhongBan int identity primary key,
TenPhongBan nvarchar(100),
NgayTao datetime)

create table YKienKhachHang(
IdYKienKhachHang int identity primary key,
IdPhongBan int,
YKienKhachHang text,
ThoiGianTiepNhan datetime
foreign key (IdPhongBan) references PhongBan(IdPhongban)
)

create table Ticket(
IdTicket int identity primary key,
IdPhongBan int,
SDT_KH varchar(20),
YKienKhachHang text,
ThoiGianTiepNhan datetime,
NoiDungXuLyTicket nvarchar(200),
TrangThaiXuLy bit,
ThoiGianXyLy datetime,
foreign key (IdPhongBan) references PhongBan(IdPhongBan),
)
alter table Ticket
add constraint fk_idPhongBan
foreign key (IdPhongBan) references PhongBan(IdPhongBan)
on delete cascade

