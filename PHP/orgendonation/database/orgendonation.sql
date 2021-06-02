-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2021 at 11:12 AM
-- Server version: 5.7.14
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `orgendonation`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(150) NOT NULL,
  `password` varchar(150) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

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
(1, 'krunal@ic.com', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `donorreg`
--

CREATE TABLE `donorreg` (
  `id` int(11) NOT NULL,
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

INSERT INTO `donorreg` (`id`, `d_name`, `d_email`, `d_pass`, `d_dob`, `d_gender`, `d_bloodgroup`, `d_disease`, `d_state`, `d_category`, `d_city`, `d_contact`) VALUES
(212, '', '', '', '', '', '', '', '', '', '', ''),
(16, 'Akash Gamit', 'gamitakash8888@gmail.com', '123456789', '24/04/2000', 'Male', 'A-', 'NA', 'Gujarat', 'Eyes', 'Vadodara', '7043311587'),
(17, 'Jaydip Gamit', 'jdgamit2121@gmail.com', '123456789', '21/04/1997', 'Male', 'A-', 'NA', 'Gujarat', 'Heart', 'Vadodara', '8320255573'),
(18, 'Nikunj Chaudhari', 'nikunj.chaudhari.2248@gmail.com', '123456789', '20/04/1997', 'Male', 'A-', 'NA', 'Gujarat', 'Lung', 'Vadodara', '9586590702'),
(1, 'krunal Gamit', 'gamitkrunal007@gmail.com', '123456789', '07/09/1997', 'Male', 'O+', 'NA', 'Gujarat', 'Eyes', 'Ahmedabad', '7043311587'),
(10, 'Hitesh Chaudhari', 'max2223@gmail.com', '123456789', '05/05/1998', 'Female', 'O-', 'NA', 'Gujarat', 'Liver', 'Surat', '7567958511'),
(11, 'krunal chaudhari', 'krunalchaudharikc@gmail.com', '123456789', '07/09/1997', 'Male', 'A+', 'NA', 'Gujarat', 'Eyes', 'Gandhinagar', '7043311587'),
(12, 'Alvin Gamit', 'gamitalvin143@gmail.com', '123456789', '04/07/1997', 'Male', 'A+', 'NA', 'Gujarat', 'Heart', 'Gandhinagar', '8320255573'),
(13, 'Abhishek Gamit', 'gamitabhishe461@gmail.com', '123456789', '13/01/1997', 'Male', 'A+', 'NA', 'Gujarat', 'Lung', 'Gandhinagar', '7069514084'),
(14, 'Abhi Gamit', 'abhigamit9988@gmail.com', '123456789', '13/10/1997', 'Male', 'A+', 'NA', 'Gujarat', 'Kidney', 'Gandhinagar', '9979190346'),
(15, 'Ankit Gamit', 'gamitankit3568@gmail.com', '123456789', '05/05/1998', 'Male', 'A+', 'NA', 'Gujarat', 'Liver', 'Gandhinagar', '9586564625'),
(9, 'Pankaj Chaudhari', 'chaudharipnjk1002@gmail.com', '123456789', '13/10/1997', 'Male', 'O-', 'NA', 'Gujarat', 'Kidney', 'Surat', '7970629795'),
(8, 'Jaydeep Chaudhari', 'jd1198@gmail.com', '123456789', '01/01/1997', 'Male', 'O-', 'NA', 'Gujarat', 'Lung', 'Surat', '9586590702'),
(7, 'Rutvik Chaudhari', 'chaudharirutvik333@gmail.com', '123456789', '04/07/1997', 'Male', 'O-', 'NA', 'Gujarat', 'Heart', 'Surat', '8320255573'),
(6, 'Rutvik Gamit', 'gamitrutvik007@gmail.com', '123456789', '07/09/1997', 'Male', 'O-', 'NA', 'Gujarat', 'Eyes', 'Surat', '7043311587'),
(3, 'Bipin Chaudhari', 'bmc5791@gmail.com', '123456789', '13/01/1997', 'Male', 'O+', 'NA', 'Gujarat', 'Lung', 'Ahmedabad', '7069514084'),
(4, 'Hardik Chaudhari', 'chaudharihardik10@gmail.com', '123456789', '13/10/1997', 'Male', 'O+', 'NA', 'Gujarat', 'Kidney', 'Ahmedabad', '9979190346'),
(5, 'Vishal Chaudhari', 'vishu2223@gmail.com', '123456789', '05/05/1998', 'Male', 'O+', 'NA', 'Gujarat', 'Liver', 'Ahmedabad', '9586564625'),
(19, 'Mihir Gamit', 'Mihirgamit2455@gmail.com', '123456789', '13/10/1997', 'Male', 'A-', 'NA', 'Gujarat', 'Kidney', 'Vadodara', '7970629795'),
(20, 'Shaishav Gamit', 'gamitshaishav@gmail.com', '123456789', '05/05/2000', 'Male', 'A-', 'NA', 'Gujarat', 'Liver', 'Vadodara', '7567958511'),
(21, 'Swet Chaudhari', 'swetchaudhari@gmail.com', '123456789', '07/07/1997', 'Male', 'B+', 'NA', 'Gujarat', 'Eyes', 'Rajkot', '7043311587'),
(22, 'Tej Chaudhari', 'tejchaudhari@gmail.com', '123456789', '04/07/1997', 'Male', 'B+', 'NA', 'Gujarat', 'Heart', 'Rajkot', '8320255573'),
(39, 'Bhumit Patel', 'patelbhumit@gmail.com', '123456789', '13/10/1997', 'Male', 'AB-', 'NA', 'Gujarat', 'Kidney', 'Mehsana', '7970629795'),
(38, 'Raj Patel', 'rajkananigmail.com', '123456789', '01/01/1997', 'Male', 'AB-', 'NA', 'Gujarat', 'Lung', 'Mehsana', '9586590702'),
(36, 'Kriyank Patel', 'patelkriyank030@gmail.com', '123456789', '07/09/1997', 'Male', 'AB-', 'NA', 'Gujarat', 'Eyes', 'Mehsana', '7043311587'),
(37, 'Rohan Patel', 'p.rohan@gmail.com', '123456789', '04/07/1997', 'Male', 'AB-', 'NA', 'Gujarat', 'Heart', 'Mehsana', '8320255573'),
(40, 'Apruv Patel', 'patelapurv001@gmail.com', '123456789', '05/05/1998', 'Female', 'AB-', 'NA', 'Gujarat', 'Liver', 'Mehsana', '7567958511'),
(35, 'Anand Patel', 'anand,patel.1995@gmail.com', '123456789', '05/05/1998', 'Male', 'AB+', 'NA', 'Gujarat', 'Liver', 'Junagadh', '9586564625'),
(34, 'Nimesh Patel', 'patelnimesh@gmail.com', '123456789', '13/10/1997', 'Male', 'AB+', 'NA', 'Gujarat', 'Kidney', 'Junagadh', '9979190346'),
(33, 'Hiru Patel', 'hiru1120@gmail.com', '123456789', '13/01/1997', 'Male', 'AB+', 'NA', 'Gujarat', 'Lung', 'Junagadh', '7069514084'),
(32, 'Tejas Patel', 'tejaspatel@gmail.com', '123456789', '04/07/1997', 'Male', 'AB+', 'NA', 'Gujarat', 'Heart', 'Junagadh', '8320255573'),
(31, 'Pradeep Patel', 'pradip.patel@gmail.com', '123456789', '07/09/1997', 'Male', 'AB+', 'NA', 'Gujarat', 'Eyes', 'Junagadh', '7043311587'),
(30, 'Akshay Chaudhari', 'Akshayc003@gmail.com', '123456789', '05/05/1998', 'Male', 'B-', 'NA', 'Gujarat', 'Liver', 'Bhavnagar', '7567958511'),
(29, 'Adarsh Chaudhari', 'chaudhariadarsh@gmail.com', '123456789', '13/10/1997', 'Male', 'B-', 'NA', 'Gujarat', 'Kidney', 'Bhavnagar', '7970629795'),
(28, 'Chirag Chaudhari', 'chiragc1234@gmail.com', '123456789', '01/01/1997', 'Male', 'B-', 'NA', 'Gujarat', 'Lung', 'Bhavnagar', '9586590702'),
(27, 'Anant Chaudhari', 'anant2145@gmail.com', '123456789', '04/07/1997', 'Male', 'B-', 'NA', 'Gujarat', 'Heart', 'Bhavnagar', '8320255573'),
(26, 'Sandip Gamit', 'chaudhari.sandip.1963@gmail.com', '123456789', '07/09/1997', 'Male', 'B-', 'NA', 'Gujarat', 'Eyes', 'Bhavnagar', '7043311587'),
(25, 'Tejas Chaudhari', 'chaudharitejas545@gmail.com', '123456789', '22/04/2000', 'Male', 'B+', 'NA', 'Gujarat', 'Liver', 'Bhavnagar', '8980130774'),
(24, 'Umang Chaudhari', 'chaudhariumang1010@gmail.com', '123456789', '10/10/1997', 'Male', 'B+', 'NA', 'Gujarat', 'Kidney', 'Rajkot', '9979190346'),
(23, 'Jay Chaudhari', 'chaudharijay010197@gmail.com', '123456789', '01/01/1997', 'Male', 'B+', 'NA', 'Gujarat', 'Lung', 'Rajkot', '7069514084'),
(2, 'Priyanka Gamit', 'pinkugamit@gmail.com', '123456789', '04/07/1997', 'Female', 'O+', 'NA', 'Gujarat', 'Heart', 'Ahmedabad', '8320255573');

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
(3, 'Lung'),
(4, 'Kidney'),
(5, 'Liver'),
(6, 'Intestines'),
(7, 'Pancreas'),
(8, 'Cornea'),
(9, 'Tissue');

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
(2, 'kru@kk.com', '15313513543');

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
(1, 'hasib', 'gullus@g.com', 'hhh', '070707', 'male', 'O-', 'ds', 'vyara', 'lung', 'vyara', '7043311587'),
(3, 'kurl', 'ga@gaa.com', '123456789', '2/3/2021', 'Male', 'A+', 'NA', 'AndhraPradesh', 'Eyes', 'Vyara', '8320255573'),
(2, 'krunal', 'kk@ll.com', 'hhh', '070707', 'male', 'O+', 'ds', 'vyara', 'kidney', 'surat', '832025573'),
(7, 'hasib', 'gullus@g.com', 'hhh', '070707', 'male', 'O-', 'ds', 'vyara', 'lung', 'vyara', '7043311587'),
(8, 'njdj', 'gullu@g.com', 'hhh', '070707', 'male', 'O-', 'ds', 'vyara', 'Heart', 'vyara', '7043311587'),
(9, 'gullu', 'gullu@g.com', 'hhh', '070707', 'male', 'O-', 'ds', 'vyara', 'liver', 'vyara', '7043311587'),
(10, 'gullu', 'gullu@g.com', 'hhh', '070707', 'male', 'O-', 'ds', 'vyara', 'eyes', 'vyara', '7043311587'),
(11, 'krunal', 'kk@kk.com', 'krunal@7997', '7/9/1997', 'Male', 'O+', 'Na', 'Gujarat', 'Eyes', 'VYARA', '8320255573');

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
(9, 'GUJRAT'),
(8, 'jbhv');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `donorlogin`
--
ALTER TABLE `donorlogin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `donorreg`
--
ALTER TABLE `donorreg`
  ADD PRIMARY KEY (`id`);

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
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `donorlogin`
--
ALTER TABLE `donorlogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
--
-- AUTO_INCREMENT for table `donorreg`
--
ALTER TABLE `donorreg`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=213;
--
-- AUTO_INCREMENT for table `orgens`
--
ALTER TABLE `orgens`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `reclogin`
--
ALTER TABLE `reclogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `recreg`
--
ALTER TABLE `recreg`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `request`
--
ALTER TABLE `request`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `state`
--
ALTER TABLE `state`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
