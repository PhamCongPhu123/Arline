-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: airlinedb
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `passengerstbl`
--

DROP TABLE IF EXISTS `passengerstbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengerstbl` (
  `Pid` int NOT NULL,
  `PName` varchar(20) DEFAULT NULL,
  `PNat` varchar(15) DEFAULT NULL,
  `PGen` varchar(10) DEFAULT NULL,
  `PPass` varchar(20) DEFAULT NULL,
  `PAdd` varchar(50) DEFAULT NULL,
  `Pphone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengerstbl`
--

LOCK TABLES `passengerstbl` WRITE;
/*!40000 ALTER TABLE `passengerstbl` DISABLE KEYS */;
INSERT INTO `passengerstbl` VALUES (1,'sgahgw','India','Male','25463','dhhdjye','254632'),(2,' vgsbhjj','Singapore','Female','26536 ',' ehjur','365734'),(3,'phu','Usa','Male','567546','hoian','54376863'),(4,'khanh','India','Female','354774','danang','34867529'),(5,' ly','Singapore','Female',' 536474',' sgtuy','36576454'),(6,'hoa','Span','Other','6376','dgh','53677'),(7,'khanh','India','Male','37872908','sbtwuyte','376743'),(8,'vu','China','Male','2636','sfdgfs','52524');
/*!40000 ALTER TABLE `passengerstbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-03 13:16:44
