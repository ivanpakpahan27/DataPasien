-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.11-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for data_igd
CREATE DATABASE IF NOT EXISTS `data_igd` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `data_igd`;

-- Dumping structure for table data_igd.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `Id_Admin` int(5) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(30) NOT NULL,
  `No_Hp` varchar(13) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_Admin`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

-- Dumping structure for table data_igd.dokter
CREATE TABLE IF NOT EXISTS `dokter` (
  `Id_Dokter` int(5) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(30) NOT NULL,
  `Spesialis` varchar(50) NOT NULL,
  `Umur` int(2) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_Dokter`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

-- Dumping structure for table data_igd.layanan
CREATE TABLE IF NOT EXISTS `layanan` (
  `Id_Layanan` int(5) NOT NULL AUTO_INCREMENT,
  `Tanggal` date NOT NULL,
  `Id_Admin` int(5) NOT NULL,
  `Id_Pasien` int(5) NOT NULL,
  `Id_Dokter` int(5) NOT NULL,
  PRIMARY KEY (`Id_Layanan`),
  KEY `FK_layanan_admin` (`Id_Admin`),
  KEY `FK_layanan_pasien` (`Id_Pasien`),
  KEY `FK_layanan_dokter` (`Id_Dokter`),
  CONSTRAINT `FK_layanan_admin` FOREIGN KEY (`Id_Admin`) REFERENCES `admin` (`Id_Admin`),
  CONSTRAINT `FK_layanan_dokter` FOREIGN KEY (`Id_Dokter`) REFERENCES `dokter` (`Id_Dokter`),
  CONSTRAINT `FK_layanan_pasien` FOREIGN KEY (`Id_Pasien`) REFERENCES `pasien` (`Id_Pasien`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

-- Dumping structure for table data_igd.pasien
CREATE TABLE IF NOT EXISTS `pasien` (
  `Id_Pasien` int(5) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(30) NOT NULL,
  `Umur` int(2) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`Id_Pasien`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
