-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 24, 2018 lúc 01:41 PM
-- Phiên bản máy phục vụ: 10.1.28-MariaDB
-- Phiên bản PHP: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `shop`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giohang`
--

CREATE TABLE `giohang` (
  `ma` varchar(50) NOT NULL,
  `ten` varchar(50) NOT NULL,
  `loai` varchar(50) NOT NULL,
  `giaCu` varchar(50) NOT NULL,
  `giaMoi` varchar(50) NOT NULL,
  `size` varchar(50) DEFAULT NULL,
  `mau` varchar(50) DEFAULT NULL,
  `anhTruoc` varchar(50) NOT NULL,
  `anhSau` varchar(50) NOT NULL,
  `ngaySanXuat` varchar(50) DEFAULT NULL,
  `hangSX` varchar(50) DEFAULT NULL,
  `gioiTinh` varchar(50) DEFAULT NULL,
  `ghiChu` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `ngayMua` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `giohang`
--

INSERT INTO `giohang` (`ma`, `ten`, `loai`, `giaCu`, `giaMoi`, `size`, `mau`, `anhTruoc`, `anhSau`, `ngaySanXuat`, `hangSX`, `gioiTinh`, `ghiChu`, `email`, `ngayMua`) VALUES
('47', 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', '1542875104631', 'thao370@gmail.com', 'Thu Nov 22 15:25:04 ICT 2018'),
('47', 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', '1542877723771', 'thao370@gmail.com', 'Thu Nov 22 16:08:43 ICT 2018'),
('47', 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', '1542877771388', 'thao370@gmail.com', 'Thu Nov 22 16:09:31 ICT 2018'),
('48', 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', '1542942125099', 'thao370@gmail.com', 'Fri Nov 23 10:02:05 ICT 2018'),
('47', 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', '1543035342157', 'thao@gmail.com', 'Sat Nov 24 11:55:42 ICT 2018');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `email` varchar(100) NOT NULL,
  `tenNguoiNhan` varchar(100) NOT NULL,
  `diaChi` varchar(255) NOT NULL,
  `thoigian` varchar(100) NOT NULL,
  `soDT` varchar(100) NOT NULL,
  `maSP` varchar(100) NOT NULL,
  `tenSP` varchar(100) NOT NULL,
  `tongTien` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`email`, `tenNguoiNhan`, `diaChi`, `thoigian`, `soDT`, `maSP`, `tenSP`, `tongTien`) VALUES
('thao370@gmail.com', 'thao', '98 man thien, q9, tp hcm', '2018-11-20', '123456789', '47 46 48 ', 'mu nam mu nam mu nam ', '30000'),
('test@gmail.com', 'werghj', '<Script>alert(\"hihi\");</Script>', '2018-11-14', '23456u7', '47 49 ', 'mu nam mu nam ', '20000'),
('test@gmail.com', 'thahaha', '<a href=\"http://localhost:8080/WEB_HACKER/hacker_ne?text=chao mung ban den ser hacker\" title=\"hacker\" target=\"_blank\">xem ne</a>', '2018-11-21', '234567', '47 46 49 ', 'mu nam mu nam mu nam ', '30000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `ma` int(11) NOT NULL,
  `ten` varchar(100) NOT NULL,
  `loai` varchar(100) DEFAULT NULL,
  `giaCu` varchar(100) DEFAULT NULL,
  `giaMoi` varchar(100) DEFAULT NULL,
  `size` varchar(100) DEFAULT NULL,
  `mau` varchar(100) DEFAULT NULL,
  `anhTruoc` varchar(100) NOT NULL,
  `anhSau` varchar(100) NOT NULL,
  `ngaySanXuat` varchar(100) DEFAULT NULL,
  `hangSX` varchar(100) DEFAULT NULL,
  `gioiTinh` varchar(100) DEFAULT NULL,
  `ghiChu` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`ma`, `ten`, `loai`, `giaCu`, `giaMoi`, `size`, `mau`, `anhTruoc`, `anhSau`, `ngaySanXuat`, `hangSX`, `gioiTinh`, `ghiChu`) VALUES
(46, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(47, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(48, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(49, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(50, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(51, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(52, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(53, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(54, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(55, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', ''),
(56, 'mu nam', 'A', '10000', '10000', '33', 'xanh', 'images/ss71541921156134truoc.jpg', 'images/ss81541921156156sau.jpg', '2018-11-12', 'asias', '', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `user` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `quyen` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`user`, `email`, `password`, `quyen`) VALUES
('abcd', 'abcd@gmail.com', 'e1adc3949ba59abbe56e057f2f883e', 'khachHang'),
('admin', 'admin', '12345', 'admin'),
('test', 'test@gmail.com', '98f6bcd4621d373cade4e832627b4f6', 'khachHang'),
('thaonguyen', 'thao370@gmail.com', '827ccbeea8a706c4c34a16891f84e7b', 'khachHang'),
('thaothao', 'thao@gmail.com', '827ccbeea8a706c4c34a16891f84e7b', 'khachHang'),
('trang', 'trang@gmail.com', 'e1adc3949ba59abbe56e057f2f883e', 'khachHang');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`ma`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `ma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
