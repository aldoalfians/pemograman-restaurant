-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2023 at 02:35 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurantpb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `drink_menu`
--

CREATE TABLE `drink_menu` (
  `kode_drink` varchar(25) NOT NULL,
  `name` varchar(255) NOT NULL,
  `stock` varchar(25) NOT NULL,
  `price` double NOT NULL,
  `category` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `drink_menu`
--

INSERT INTO `drink_menu` (`kode_drink`, `name`, `stock`, `price`, `category`) VALUES
('KM-001', 'Lemon Tea', 'Tersedia', 14000, 'Teh');

-- --------------------------------------------------------

--
-- Table structure for table `food_menu`
--

CREATE TABLE `food_menu` (
  `kode_food` varchar(25) NOT NULL,
  `name` varchar(255) NOT NULL,
  `stock` varchar(25) NOT NULL,
  `price` double NOT NULL,
  `category` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `food_menu`
--

INSERT INTO `food_menu` (`kode_food`, `name`, `stock`, `price`, `category`) VALUES
('KD001', 'Ayam Goreng', 'Kosong', 20000, 'Ayam');

-- --------------------------------------------------------

--
-- Table structure for table `ordermenu`
--

CREATE TABLE `ordermenu` (
  `id_order` varchar(25) NOT NULL,
  `username` varchar(255) NOT NULL,
  `nama_menu` varchar(255) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` double NOT NULL,
  `status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ordermenu`
--

INSERT INTO `ordermenu` (`id_order`, `username`, `nama_menu`, `jumlah`, `harga`, `status`) VALUES
('ORD001', 'aldo', 'Ayam Goreng', 2, 20000, 'Pembayaran Berhasil'),
('ORD002', 'aldo', 'Lemon Tea', 4, 14000, 'Pembayaran Berhasil'),
('ORD003', 'aldo', 'Lemon Tea', 2, 14000, 'Pembayaran Berhasil');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `username`, `password`, `gender`) VALUES
(1, 'Aldo Alfiansyah', 'aldo', '123123', 'Pria');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `drink_menu`
--
ALTER TABLE `drink_menu`
  ADD PRIMARY KEY (`kode_drink`);

--
-- Indexes for table `food_menu`
--
ALTER TABLE `food_menu`
  ADD PRIMARY KEY (`kode_food`);

--
-- Indexes for table `ordermenu`
--
ALTER TABLE `ordermenu`
  ADD PRIMARY KEY (`id_order`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
