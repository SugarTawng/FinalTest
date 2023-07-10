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
-- Table structure for table `dienthoai`
--

DROP TABLE IF EXISTS `dienthoai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dienthoai` (
  `IMEI` varchar(15) COLLATE utf8_bin NOT NULL,
  `TENDT` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `LOAIDT` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `HOTENKH` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `SDTKH` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`IMEI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dienthoai`
--

LOCK TABLES `dienthoai` WRITE;
/*!40000 ALTER TABLE `dienthoai` DISABLE KEYS */;
INSERT INTO `dienthoai` VALUES ('IMEI001','Điện thoại 1','Loại 1','Nguyễn Văn A','0987654321'),('IMEI002','Điện thoại 2','Loại 2','Trần Thị B','0123456789'),('IMEI003','Điện thoại 3','Loại 1','Lê Văn C','0932112233'),('IMEI004','Điện thoại 4','Loại 2','Phạm Thị D','0845678910'),('IMEI005','Điện thoại 5','Loại 1','Hoàng Văn E','0765432109'),('IMEI006','Điện thoại 6','Loại 2','Vũ Thị F','0654321098'),('IMEI007','Điện thoại 7','Loại 1','Đặng Văn G','0543210987'),('IMEI008','Điện thoại 8','Loại 2','Trịnh Thị H','0432109876'),('IMEI009','Điện thoại 9','Loại 1','Lý Văn I','0321098765'),('IMEI010','Điện thoại 10','Loại 2','Ngô Thị K','0210987654'),('IMEI011','Điện thoại 11','Loai 1','Éc','0210987655'),('IMEI012','Điện thoại 12','Loai 2','Lắc','0210987656'),('IMEI013','Điện thoại 13','Loai 1','Tèo','0210987657'),('IMEI014','Điện thoại 14','Loai 2','Ngô Thị Ec','0765432100'),('soIMEI','Ten dien thoai','Loai 1','Ho ten khach hang','0123456789');
/*!40000 ALTER TABLE `dienthoai` ENABLE KEYS */;
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
