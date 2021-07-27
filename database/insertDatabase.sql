insert into Userr values('sondx', '123')

--Thêm Ticket
insert into Ticket values(9, '098871413', 'abcxyz', '2021-02-12', N'Nội dung xử lý ticket', 1, '2021-04-01')
insert into Ticket values(7, '043123454', 'abcxyz', '2019-03-09', N'Nội dung xử lý ticket 1', 1, '2019-06-01')
insert into Ticket values(3, '097512341', 'abcxyz', '2018-05-29', N'Nội dung xử lý ticket 2', 0, '2018-07-01')
insert into Ticket values(6, '012345566', 'abcxyz', '2020-12-01', N'Nội dung xử lý ticket 3', 1, '2020-12-10')
insert into Ticket values(4, '045654331', 'abcxyz', '2020-10-28', N'Nội dung xử lý ticket 4', 0, '2020-11-08')
insert into Ticket values(5, '045654331', 'abcxyz', '2021-01-20', N'Nội dung xử lý ticket 4', 0, '2021-11-08')
insert into Ticket values(3, '045654331', 'abcxyz', '2019-07-28', N'Nội dung xử lý ticket 4', 0, '2019-09-08')
insert into Ticket values(5, '045654331', 'abcxyz', '2018-08-21', N'Nội dung xử lý ticket 4', 0, '2018-10-08')

--Thêm phòng ban
insert into PhongBan values(N'Phòng nhân sự', '2020-05-12')
insert into PhongBan values(N'Phòng hành chính', '2021-02-19')
insert into PhongBan values(N'Phòng kỹ thuật', '2019-01-10')
insert into PhongBan values(N'Phòng giám đốc', '2018-07-17')

select * from PhongBan
