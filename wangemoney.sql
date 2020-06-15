-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2020 at 04:46 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wangemoney`
--

-- --------------------------------------------------------

--
-- Table structure for table `anonymous`
--

CREATE TABLE `anonymous` (
  `Device` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anonymous`
--

INSERT INTO `anonymous` (`Device`) VALUES
('SMARTFREN01');

-- --------------------------------------------------------

--
-- Table structure for table `customerservice`
--

CREATE TABLE `customerservice` (
  `type` varchar(5) NOT NULL,
  `ID` varchar(8) NOT NULL,
  `Name` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customerservice`
--

INSERT INTO `customerservice` (`type`, `ID`, `Name`) VALUES
('human', '00000001', 'Maria');

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `question` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `answer` varchar(100) NOT NULL,
  `username` varchar(12) NOT NULL,
  `csid` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `ID` int(8) NOT NULL,
  `type` varchar(12) NOT NULL,
  `senderTN` varchar(16) NOT NULL,
  `receiverTN` varchar(16) NOT NULL,
  `vaccountpay` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `TelephoneNum` varchar(16) NOT NULL,
  `email` varchar(50) NOT NULL,
  `vaccount` varchar(30) NOT NULL,
  `saldo` int(11) NOT NULL,
  `name` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`TelephoneNum`, `email`, `vaccount`, `saldo`, `name`) VALUES
('082162105112', 'christopherhutabarat7@gmail.com', '012345678', 524000, 'Christopher Hutabarat');

-- --------------------------------------------------------

--
-- Table structure for table `userlogininfo`
--

CREATE TABLE `userlogininfo` (
  `TelephoneNum` varchar(16) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userlogininfo`
--

INSERT INTO `userlogininfo` (`TelephoneNum`, `password`) VALUES
('082162105112', 'pentatonix123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD UNIQUE KEY `TelpNumPrim` (`TelephoneNum`);

--
-- Indexes for table `userlogininfo`
--
ALTER TABLE `userlogininfo`
  ADD UNIQUE KEY `TelpNumPrim` (`TelephoneNum`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
