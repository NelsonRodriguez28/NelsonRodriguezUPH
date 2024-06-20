CREATE DATABASE  IF NOT EXISTS `bilioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `bilioteca`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bilioteca
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.27-MariaDB

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
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros` (
  `idlibro` int(255) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `editorial` varchar(45) NOT NULL,
  `autor` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `numero_de_paginas` int(11) NOT NULL,
  `edicion` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`idlibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES (1,'cien años de soledad','editorial sudamericana','gabriel garcia marquez','realismo magico',411,'primera edicion',10),(2,'don quijote de la mancha','miguel de cervantes','novela','novela',863,'primera edicion',5),(3,'1984','secker y warburg','george orwell','distopia',328,'primera edicion',15),(4,'el señor de los tornillos','george allen y unwin','J.R.R tolkien','fantasia',1216,'primera edicion',8),(5,'crimen y castigo','the russian messenger','fiodor dostoyevski','novela',671,'primera edicion',12),(6,'matar a un ruiseñor','J.B.lippincott y Co.','harper lee','novela',281,'primera edicion',10),(7,'orgullo y prejuicio','T.egerton,whitehall','jane austen','novela romantica',432,'primera edicion',7),(8,'el nombre de la rosa','bompiani','umberto eco','misterio',512,'primera edicion',6),(9,'la odisea','harper collins','homero','epica',374,'primera edicion',9),(10,'harry potter y la piedra filosofal','bloomsbury','J.K rowling','fantasia',223,'primera edicion',20);
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamos` (
  `id_prestamo` int(11) NOT NULL AUTO_INCREMENT,
  `idlibro` int(255) NOT NULL,
  `idusuarios` int(255) NOT NULL,
  `fecha_prestamo` date DEFAULT NULL,
  `fecha_entrega` date DEFAULT NULL,
  PRIMARY KEY (`id_prestamo`),
  KEY `idlibro` (`idlibro`,`idusuarios`),
  KEY `idusuarios` (`idusuarios`),
  CONSTRAINT `prestamos_ibfk_1` FOREIGN KEY (`idusuarios`) REFERENCES `usuarios` (`idusuarios`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `prestamos_ibfk_2` FOREIGN KEY (`idlibro`) REFERENCES `libros` (`idlibro`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (1,5,1,'2024-06-19',NULL),(2,6,18,'2024-06-19','2024-06-19');
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuarios` int(255) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` int(11) NOT NULL,
  `fecha_registro` date NOT NULL,
  PRIMARY KEY (`idusuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Nelson Rorriguez','1999-01-28','Moroceli',99186671,'2024-01-19'),(10,'carlos antonio','2000-01-12','moroceli',96037612,'2024-01-19'),(11,'lizzy fernanda','2001-01-20','moroceli',90873212,'2024-01-19'),(12,'bayron alexis','2009-01-15','moroceli',94567209,'2024-01-19'),(13,'jose danilo','2005-01-14','moroceli',95431100,'2024-01-19'),(14,'carlos eduardo','1997-01-10','moroceli',87653412,'2024-01-19'),(15,'luis mario ','1991-01-14','moroceli',34210098,'2024-01-19'),(16,'eugenia maria','1990-01-20','moroceli',98667123,'2024-01-19'),(17,'eduardo estrada','2000-01-28','moroceli',91234567,'2024-01-19'),(18,'juana gabriela','2006-01-25','moroceli',91008654,'2024-01-19');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bilioteca'
--

--
-- Dumping routines for database 'bilioteca'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-19 21:19:57
