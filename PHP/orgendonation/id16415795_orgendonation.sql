-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 25, 2021 at 04:35 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id16415795_orgendonation`
--

-- --------------------------------------------------------

--
-- Table structure for table `donorlogin`
--

CREATE TABLE `donorlogin` (
  `id` int(11) NOT NULL,
  `d_email` varchar(50) NOT NULL,
  `d_pwd` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donorlogin`
--

INSERT INTO `donorlogin` (`id`, `d_email`, `d_pwd`) VALUES
(19, 'kru', 'kk'),
(20, 'gamit@gmail.com', '123456'),
(21, 'gamit@gmail.com', '123456'),
(22, 'gamit@gmail.com', '123456'),
(23, 'hahha', 'jajaha'),
(24, 'gamit@gmail.com', '123456'),
(25, 'gamit@gmail.com', '123456'),
(26, 'gamit@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `donorreg`
--

CREATE TABLE `donorreg` (
  `d_id` int(11) NOT NULL,
  `d_name` varchar(50) NOT NULL,
  `d_email` varchar(50) NOT NULL,
  `d_pass` varchar(50) NOT NULL,
  `d_dob` varchar(50) NOT NULL,
  `d_gender` varchar(50) NOT NULL,
  `d_bloodgroup` varchar(50) NOT NULL,
  `d_disease` varchar(100) NOT NULL,
  `d_state` varchar(100) NOT NULL,
  `d_category` varchar(150) NOT NULL,
  `d_city` varchar(100) NOT NULL,
  `d_contact` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donorreg`
--

INSERT INTO `donorreg` (`d_id`, `d_name`, `d_email`, `d_pass`, `d_dob`, `d_gender`, `d_bloodgroup`, `d_disease`, `d_state`, `d_category`, `d_city`, `d_contact`) VALUES
(1, 'krunal', 'kk@kk.com', '123', '14/5/97', 'female', 'A+', '', 'Gujarat', '', 'vyara', '789563223232'),
(2, '', '', 'krunal', '07/09/1997', 'male', 'o+', '', 'Gujarat', '', 'vyara', '831215446565'),
(3, '', '', '123456789', '7/9/1997', 'female', 'B+', '', 'gujarat', '', 'vyara', '1234567891'),
(4, '', '', '123456789', '17/3/2021', 'female', 'O+', '', 'Gujarat', '', 'vyara', '1234567891'),
(5, '', '', 'kkkkk', '9/3/2021', 'Male', 'A+', '', 'Gujarat', '', 'vyara', '1234567891'),
(6, '', '', 'kkkkkkk', '1/3/2021', 'Male', 'B+', '', 'NA', '', 'vyara', '1234567891'),
(36, 'zarana vasani', 'zaranavasani1188@gmail.com', 'zarana11', '25/3/2021', 'Femle', 'A+', 'nn', 'AndhraPradesh', 'Eyes', 'mansa', '8888888888');

-- --------------------------------------------------------

--
-- Table structure for table `orgens`
--

CREATE TABLE `orgens` (
  `id` int(11) NOT NULL,
  `orgens_name` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orgens`
--

INSERT INTO `orgens` (`id`, `orgens_name`) VALUES
(1, 'liver'),
(2, 'eye'),
(3, 'liver'),
(4, 'eye'),
(5, 'hair');

-- --------------------------------------------------------

--
-- Table structure for table `reclogin`
--

CREATE TABLE `reclogin` (
  `id` int(11) NOT NULL,
  `r_email` varchar(50) NOT NULL,
  `r_pass` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reclogin`
--

INSERT INTO `reclogin` (`id`, `r_email`, `r_pass`) VALUES
(1, 'jajqjjq', 'baba'),
(2, 'tvisha227@gmail.com', 'tvisha227'),
(3, 'khushi123@gmail.com', 'khushi12'),
(4, 'khushi123@gmail.com', 'khushi12'),
(5, 'khushi123@gmail.com', 'khushi123');

-- --------------------------------------------------------

--
-- Table structure for table `recreg`
--

CREATE TABLE `recreg` (
  `id` int(11) NOT NULL,
  `r_name` varchar(100) NOT NULL,
  `r_email` varchar(100) NOT NULL,
  `r_pass` varchar(100) NOT NULL,
  `r_dob` varchar(100) NOT NULL,
  `r_gender` varchar(100) NOT NULL,
  `r_bloodgroup` varchar(100) NOT NULL,
  `r_disease` varchar(100) NOT NULL,
  `r_state` varchar(100) NOT NULL,
  `r_category` varchar(100) NOT NULL,
  `r_city` varchar(100) NOT NULL,
  `r_contact` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recreg`
--

INSERT INTO `recreg` (`id`, `r_name`, `r_email`, `r_pass`, `r_dob`, `r_gender`, `r_bloodgroup`, `r_disease`, `r_state`, `r_category`, `r_city`, `r_contact`) VALUES
(2, 'krunal', 'ga@ga.com', '123456789', '1/3/2021', 'Male', 'A+', 'NA', 'AndhraPradesh', 'Eyes', 'NA', '8320255573'),
(3, 'kurl', 'ga@gaa.com', '123456789', '2/3/2021', 'Male', 'A+', 'NA', 'AndhraPradesh', 'Eyes', 'Vyara', '8320255573'),
(4, 'khushi', 'khushi123@gmail.com', 'khushi123', '23/3/2021', 'Femle', 'A+', 'nn', 'Gujarat', 'Kidney', 'Ahmedabad', '7486838475');

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE `request` (
  `id` int(11) NOT NULL,
  `r_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `r_cnum` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `r_orgen` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `r_bloodgroup` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `r_disease` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `r_description` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`id`, `r_name`, `r_cnum`, `r_orgen`, `r_bloodgroup`, `r_disease`, `r_description`) VALUES
(14, 'krunal', '8320255573', 'eyes', 'o+', 'na', 'I want to eyes in 10days'),
(15, 'hfjfjfjf', 'cjcjckgkg', 'kgkfkf', 'bzbx', 'ncnc', 'ncncncn'),
(16, 'kkkkk', '7847474747', 'Liver', 'A-', 'nn', 'I need liver'),
(17, 'kkkkk', '7847474747', 'Liver', 'A-', 'nn', 'I need liver'),
(18, 'kkkk', '7878546578', 'Eyes', 'A-', 'nn', 'I need eyes');

-- --------------------------------------------------------

--
-- Table structure for table `state`
--

CREATE TABLE `state` (
  `id` int(11) NOT NULL,
  `state_name` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `state`
--

INSERT INTO `state` (`id`, `state_name`) VALUES
(1, 'gujarat'),
(8, 'jbhv');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donorlogin`
--
ALTER TABLE `donorlogin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `donorreg`
--
ALTER TABLE `donorreg`
  ADD PRIMARY KEY (`d_id`);

--
-- Indexes for table `orgens`
--
ALTER TABLE `orgens`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reclogin`
--
ALTER TABLE `reclogin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `recreg`
--
ALTER TABLE `recreg`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `state`
--
ALTER TABLE `state`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donorlogin`
--
ALTER TABLE `donorlogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `donorreg`
--
ALTER TABLE `donorreg`
  MODIFY `d_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `orgens`
--
ALTER TABLE `orgens`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `reclogin`
--
ALTER TABLE `reclogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `recreg`
--
ALTER TABLE `recreg`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `request`
--
ALTER TABLE `request`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `state`
--
ALTER TABLE `state`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
