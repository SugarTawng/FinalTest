-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: sua_chua_dien_thoai
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `suachua`
--

DROP TABLE IF EXISTS `suachua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suachua` (
  `MAPSC` int NOT NULL AUTO_INCREMENT,
  `NGAYLAP` date DEFAULT NULL,
  `NOIDUNG` text COLLATE utf8_bin,
  `IMEI` varchar(15) COLLATE utf8_bin NOT NULL,
  `TONGTIEN` decimal(10,2) DEFAULT '0.00',
  PRIMARY KEY (`MAPSC`),
  KEY `fk_sc_dt_idx` (`IMEI`),
  CONSTRAINT `fk_sc_dt` FOREIGN KEY (`IMEI`) REFERENCES `dienthoai` (`IMEI`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suachua`
--

LOCK TABLES `suachua` WRITE;
/*!40000 ALTER TABLE `suachua` DISABLE KEYS */;
INSERT INTO `suachua` VALUES (1,'2023-06-01','Sửa lỗi màn hình','IMEI001',100000.00),(2,'2023-06-02','Thay pin mới','IMEI002',50000.00),(3,'2023-06-03','Nâng cấp phần mềm','IMEI003',200000.00),(4,'2023-06-04','Thay màn hình','IMEI004',150000.00),(5,'2023-06-05','Sửa lỗi âm thanh','IMEI005',80000.00),(6,'2023-06-06','Thay pin cũ','IMEI006',60000.00),(7,'2023-06-07','Nâng cấp bộ nhớ','IMEI007',250000.00),(8,'2023-06-08','Thay cảm biến','IMEI008',120000.00),(9,'2023-06-09','Sửa lỗi cảm ứng','IMEI009',90000.00),(10,'2023-06-10','Thay loa ngoài','IMEI010',70000.00),(15,'2022-06-01','Thay man hinh\nThay pin','IMEI010',570000.00);
/*!40000 ALTER TABLE `suachua` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-04 13:53:25
