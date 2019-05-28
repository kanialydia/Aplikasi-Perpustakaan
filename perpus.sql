-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2017 at 03:37 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `ID_Anggota` varchar(10) NOT NULL,
  `Nama_Anggota` varchar(20) DEFAULT NULL,
  `Tanggal_lahir` date DEFAULT NULL,
  `Alamat` varchar(50) DEFAULT NULL,
  `Jenis_Kelamin` varchar(1) NOT NULL,
  `No_Telepon` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`ID_Anggota`, `Nama_Anggota`, `Tanggal_lahir`, `Alamat`, `Jenis_Kelamin`, `No_Telepon`) VALUES
('A-0001', 'Disha Fitriani', '1988-02-14', 'Jl. Sapphir No. 5 Bdg', 'P', '082237789309'),
('A-0002', 'Jaka Pradipta', '1989-01-20', 'Sukabirus 88a', 'L', '082139867678'),
('A-0003', 'Rini Agustin', '1989-08-17', 'Jl. Mawar No. 5 Jkt', 'P', '08767793022'),
('A-0004', 'Ujang Marujang', '1989-05-15', 'Jl. Kepatihan Timur', 'L', '08713823999'),
('A-0005', 'Donni Hutapea', '1990-09-20', 'Kosan Blackhouse', 'L', '081249920390'),
('A-0006', 'Yusantina C.', '1988-03-28', 'Jl. Rantau no.1', 'P', '081129928909'),
('A-0007', 'Anna Apriliana', '1989-04-03', 'Jl. Galaxi No. 29', 'P', '08679920829'),
('A-0008', 'Alyssa S.', '1991-12-25', 'Jl. Lentera No. 12', 'P', '087727283900'),
('A-0009', 'Annissa W.', '1989-06-20', 'Jl. Wiro No. 212', 'P', '083217289202'),
('A-0010', 'Uya Kuya', '1988-02-29', 'Jl. Kecubung No. 5', 'L', '082218982989');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `ID_Buku` varchar(10) NOT NULL,
  `Judul_Buku` varchar(100) DEFAULT NULL,
  `Pengarang` varchar(50) DEFAULT NULL,
  `Penerbit` varchar(50) DEFAULT NULL,
  `Tahun_terbit` date DEFAULT NULL,
  `ID_Rak` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`ID_Buku`, `Judul_Buku`, `Pengarang`, `Penerbit`, `Tahun_terbit`, `ID_Rak`) VALUES
('AGA-0001', 'Tuntunan Surga', 'H. Umar', 'Dept. Agama Republik Indonesia', '2000-02-24', 'R04'),
('FIK-0001', 'Bintang Kejora', 'Ronald P. Pohan', 'Buku Sukses', '2003-03-13', 'R01'),
('FIK-0002', 'Kobo Chan', 'Masashi Ueda', 'Elex Media Komputindo', '1995-07-20', 'R01'),
('FIK-0003', 'Jangan Engkau Tinggalkan', 'Alex Junior', 'Erlangga', '2002-09-12', 'R01'),
('FIK-0004', 'Doraemon', 'Fujiko F. Fujio', 'Elex Media Komputindo', '1995-07-20', 'R02'),
('KOM-0001', 'Basis Data', 'Iman Hakim', 'Informatika', '2008-12-29', 'R02'),
('KOM-0002', 'Membangun Program', 'Ilham Munandar', 'Guna Karya Media', '2009-10-20', 'R02'),
('KOM-0003', 'Pemrograman Terstruktur', 'Budi Prihatin', 'Andi Jogjakarta', '2009-05-02', 'R02'),
('KOM-0004', 'Kemanan Jaringan', 'Asep Saepudin', 'Informatika', '2009-10-20', 'R02'),
('KOM-0005', 'Animasi Flow', 'Rahman Setia', 'Andi Jogjakarta', '2009-12-14', 'R02'),
('KUL-0001', 'Wisata Kuliner', 'Bondan', 'Gagas Media', '2008-12-29', 'R06'),
('KUL-0105', 'Membuat manisan', 'Ajeng Widarti', 'Boga Rasa', '2007-07-10', 'R06'),
('POL-0001', 'Uang Rakyat', 'Effendi Gazali', 'Elex Media Komputindo', '2009-08-20', 'R03'),
('POL-0002', 'Matinya Pejuang', 'Fathir Muhammad', 'Pena Dunia', '2008-01-12', 'R03'),
('SCI-0001', 'How to eat', 'Thomas A. Edison', 'Backdoor Publishing', '1990-04-19', 'R05'),
('SCI-0002', 'The Goal', 'Steven Gerrard', 'Liverpool Wall', '2008-09-10', 'R05'),
('SCI-0003', 'The Lost Science', 'Dan Brown', 'Gramedia', '2010-02-01', 'R05'),
('SCI-0004', 'Da Vinci Code', 'Dan Brown', 'Gramedia', '2006-03-13', 'R05'),
('SCI-0005', 'Benarkah?', 'Udin Marudin', 'Benteng', '2009-08-29', 'R05');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `ID_Peminjaman` int(10) NOT NULL,
  `ID_Petugas` varchar(10) DEFAULT NULL,
  `ID_Anggota` varchar(10) DEFAULT NULL,
  `ID_Buku` varchar(10) DEFAULT NULL,
  `Tanggal_Pinjam` date DEFAULT NULL,
  `Tanggal_Kembali` date DEFAULT NULL,
  `Tanggal_Pengembalian` date DEFAULT NULL,
  `Keterangan` varchar(20) NOT NULL,
  `Denda` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`ID_Peminjaman`, `ID_Petugas`, `ID_Anggota`, `ID_Buku`, `Tanggal_Pinjam`, `Tanggal_Kembali`, `Tanggal_Pengembalian`, `Keterangan`, `Denda`) VALUES
(1, 'P-0005', 'A-0010', 'SCI-0004', '2017-01-01', '2017-01-08', '0001-01-01', 'PINJAM', 0),
(2, 'P-0003', 'A-0009', 'AGA-0001', '2017-11-11', '2017-11-18', '2011-11-12', 'DIKEMBALIKAN', 0),
(3, 'P-0004', 'A-0003', 'FIK-0003', '2017-01-01', '2017-01-08', '2017-01-07', 'DIKEMBALIKAN', 0),
(4, 'P-0002', 'A-0003', 'AGA-0001', '2017-01-09', '2017-01-16', '2017-01-20', 'DIKEMBALIKAN', 4000),
(5, 'P-0001', 'A-0001', 'FIK-0003', '2010-02-01', '2010-02-08', '2017-02-03', 'DIKEMBALIKAN', 0),
(6, 'P-0003', 'A-0002', 'SCI-0005', '2017-06-28', '2017-07-05', '0001-01-01', 'PINJAM', 0),
(7, 'P-0001', 'A-0001', 'FIK-0002', '2017-12-13', '2017-12-20', '2017-12-14', 'DIKEMBALIKAN', 0),
(8, 'P-0001', 'A-0001', 'AGA-0001', '2017-05-12', '2017-05-19', '2017-05-21', 'DIKEMBALIKAN', 2000),
(9, 'P-0003', 'A-0004', 'FIK-0001', '2017-12-12', '2017-12-19', '0001-01-01', 'PINJAM', 0),
(10, 'P-0004', 'A-0009', 'SCI-0001', '2017-05-12', '2017-05-19', '0001-01-01', 'PINJAM', 0);

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `ID_Petugas` varchar(10) NOT NULL,
  `Nama_Petugas` varchar(50) DEFAULT NULL,
  `Tanggal_Lahir` date DEFAULT NULL,
  `Alamat` varchar(50) DEFAULT NULL,
  `Jenis_Kelamin` varchar(1) NOT NULL,
  `No_Telepon` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`ID_Petugas`, `Nama_Petugas`, `Tanggal_Lahir`, `Alamat`, `Jenis_Kelamin`, `No_Telepon`) VALUES
('P-0001', 'Sinta Ayu Lestari', '1987-02-14', 'Jl. Melati No. 9 Bdg', 'P', '082237958609'),
('P-0002', 'Fitriana Puspita', '1988-01-20', 'Perumahan indah 88a', 'P', '082138475678'),
('P-0003', 'Dewi Anggita S.', '1986-08-17', 'Jl. Yosudarso No. 2 Jkt', 'P', '08769384022'),
('P-0004', 'Reihand Malik', '1986-05-15', 'Jl. Siropatih Timur', 'L', '08713985799'),
('P-0005', 'Dino Riswanto', '1988-09-20', 'JL. Merbabu No.11', 'L', '081249973640');

-- --------------------------------------------------------

--
-- Table structure for table `rak`
--

CREATE TABLE `rak` (
  `ID_Rak` varchar(10) NOT NULL,
  `No_Rak` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rak`
--

INSERT INTO `rak` (`ID_Rak`, `No_Rak`) VALUES
('R01', 'NR01'),
('R02', 'NR01'),
('R03', 'NR02'),
('R04', 'NR02'),
('R05', 'NR03'),
('R06', 'NR03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`ID_Anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`ID_Buku`),
  ADD KEY `ID_Rak` (`ID_Rak`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`ID_Peminjaman`),
  ADD KEY `ID_Petugas` (`ID_Petugas`),
  ADD KEY `ID_Buku` (`ID_Buku`),
  ADD KEY `ID_Anggota` (`ID_Anggota`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`ID_Petugas`);

--
-- Indexes for table `rak`
--
ALTER TABLE `rak`
  ADD PRIMARY KEY (`ID_Rak`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `buku_ibfk_1` FOREIGN KEY (`ID_Rak`) REFERENCES `rak` (`ID_Rak`);

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`ID_Petugas`) REFERENCES `petugas` (`ID_Petugas`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`),
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`ID_Anggota`) REFERENCES `anggota` (`ID_Anggota`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
