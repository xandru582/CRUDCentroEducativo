CREATE DATABASE  IF NOT EXISTS `centroeducativo` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `centroeducativo`;
-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: 127.0.0.1    Database: centroeducativo
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(45) COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(45) COLLATE utf8mb3_spanish_ci NOT NULL,
  `apellido1` varchar(45) COLLATE utf8mb3_spanish_ci NOT NULL,
  `apellido2` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `fNacimiento` date DEFAULT NULL,
  `telefono` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `direccion` varchar(100) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `cp` varchar(5) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `poblacion` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES (43,'12345678A','Juan','Gómez','López','2001-03-15','666123456','juan@gmail.com','Calle Falsa 123','28001','Madrid'),(44,'23456789B','Ana','Pérez','García','2000-07-25','666234567','ana@gmail.com','Avenida Siempre Viva 456','28002','Madrid'),(45,'34567890C','Carlos','Martínez','Sanchez','2001-10-10','666345678','carlos@gmail.com','Calle Nueva 789','28003','Madrid'),(46,'45678901D','María','Jimenez','Díaz','2000-12-05','666456789','maria@gmail.com','Plaza Nuevaa','28004','Madrid'),(47,'56789012E','David','Fernandez','Ruiz','2001-05-20','666567890','david@gmail.com','Plaza Mayor 654','28005','Madrid'),(49,'45678901A','Pedro','Jimenez','Díaz','2000-12-05','666456789','maria@gmail.com','Plaza Nuevaa','28004','Madrid'),(50,'777666642B','Alejandro','BALAN','GUTIERREZ','2000-12-05','65388889','XANFDFSD','CALLE NAVARRA','18230','ATARFE');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aula`
--

DROP TABLE IF EXISTS `aula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(40) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `descripcion` varchar(80) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aula`
--

LOCK TABLES `aula` WRITE;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` VALUES (47,'101','Sala principal'),(48,'102','Laboratorio 1'),(50,'104','Sala de conferenciass'),(51,'105','Aula auxiliar'),(52,'103','Laboratorio2');
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autorizaciones`
--

DROP TABLE IF EXISTS `autorizaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autorizaciones` (
  `idalumno` int NOT NULL,
  `idautorizado` int NOT NULL,
  PRIMARY KEY (`idalumno`,`idautorizado`),
  KEY `fk_autorizaciones_autorizado_idx` (`idautorizado`),
  CONSTRAINT `fk_autorizaciones_alumno` FOREIGN KEY (`idalumno`) REFERENCES `alumno` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_autorizaciones_autorizado` FOREIGN KEY (`idautorizado`) REFERENCES `autorizado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autorizaciones`
--

LOCK TABLES `autorizaciones` WRITE;
/*!40000 ALTER TABLE `autorizaciones` DISABLE KEYS */;
INSERT INTO `autorizaciones` VALUES (43,32);
/*!40000 ALTER TABLE `autorizaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autorizado`
--

DROP TABLE IF EXISTS `autorizado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autorizado` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `nombre` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `apellido1` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `apellido2` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `parentesco` enum('TUTOR1','TUTOR2','OTROS') COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autorizado`
--

LOCK TABLES `autorizado` WRITE;
/*!40000 ALTER TABLE `autorizado` DISABLE KEYS */;
INSERT INTO `autorizado` VALUES (32,'98765432Z','Pedro','Gómez','López','TUTOR1'),(33,'87654321Y','Isabel','Pérez','García','OTROS'),(34,'76543210X','Francisco','Martínez','Sanchez','OTROS'),(35,'65432109W','Laura','Jimenez','Díaz','TUTOR1'),(36,'54321098V','Javier','Fernandez','Ruiz','TUTOR1');
/*!40000 ALTER TABLE `autorizado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `Observaciones` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `idcursoacademico` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`),
  KEY `fk_cursoacademico_idx` (`idcursoacademico`),
  CONSTRAINT `fk_cursoacademico` FOREIGN KEY (`idcursoacademico`) REFERENCES `cursoacademico` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (36,'1LAB','1LABORATORIO','No hay 4',141);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursoacademico`
--

DROP TABLE IF EXISTS `cursoacademico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursoacademico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `yearinicio` int NOT NULL,
  `yearfin` int NOT NULL,
  `descripcion` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `yearinicio_UNIQUE` (`yearinicio`)
) ENGINE=InnoDB AUTO_INCREMENT=146 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursoacademico`
--

LOCK TABLES `cursoacademico` WRITE;
/*!40000 ALTER TABLE `cursoacademico` DISABLE KEYS */;
INSERT INTO `cursoacademico` VALUES (141,2023,2024,'Curso 23-24'),(142,2024,2025,'Curso 24-25'),(143,2025,2026,'Curso 25-26'),(144,2026,2027,'Curso 26-27'),(145,2027,2028,'Curso 27-28');
/*!40000 ALTER TABLE `cursoacademico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matricula` (
  `idmatricula` int NOT NULL AUTO_INCREMENT,
  `idalumno` int DEFAULT NULL,
  `idunidad` int DEFAULT NULL,
  `descripcion` varchar(50) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `fMatricula` date DEFAULT NULL,
  `fBaja` date DEFAULT NULL,
  PRIMARY KEY (`idmatricula`),
  KEY `fk_matricula_alumno_idx` (`idalumno`),
  KEY `fk_matricula_unidad_idx` (`idunidad`),
  CONSTRAINT `fk_matricula_alumno` FOREIGN KEY (`idalumno`) REFERENCES `alumno` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `fk_matricula_unidad` FOREIGN KEY (`idunidad`) REFERENCES `unidad` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
INSERT INTO `matricula` VALUES (2,43,6,NULL,'2022-08-05','2025-09-09');
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(9) COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `apellido1` varchar(50) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `apellido2` varchar(50) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `direccion` varchar(50) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `cp` varchar(5) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `poblacion` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `provincia` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `telefono` varchar(9) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `tipo` smallint DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` VALUES (42,'12345678A','Juan','Pérez','García','Calle Principal 123','12345','Ciudad','Provincia','123456789','juan.perez@example.com',1),(43,'87654321B','María','López','González','Avenida Central 456','54321','Otra Ciudad','Otra Provincia','987654321','maria.lopez@example.com',2),(44,'55555555X','Pedro','González','Sánchez','Calle Secundaria 789','98765','Otra Población','Otra Provincia','555555555','pedro.gonzalez@example.com',0),(45,'99999999Y','Ana','Sánchez','Martínez','Avenida Principal 987','54321','Otra Ciudad','Otra Provincia','999999999','ana.sanchez@example.com',1);
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidad`
--

DROP TABLE IF EXISTS `unidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidad` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `Observaciones` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `idcurso` int DEFAULT NULL,
  `idtutor` int DEFAULT NULL,
  `idaula` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`),
  KEY `fk_unidad_curso_idx` (`idcurso`),
  KEY `fk_unidad_personal_idx` (`idtutor`),
  KEY `fk_unidad_aula_idx` (`idaula`),
  CONSTRAINT `fk_unidad_aula` FOREIGN KEY (`idaula`) REFERENCES `aula` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `fk_unidad_curso` FOREIGN KEY (`idcurso`) REFERENCES `curso` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `fk_unidad_personal` FOREIGN KEY (`idtutor`) REFERENCES `personal` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci COMMENT='1ºA\n1ºB';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidad`
--

LOCK TABLES `unidad` WRITE;
/*!40000 ALTER TABLE `unidad` DISABLE KEYS */;
INSERT INTO `unidad` VALUES (6,'1LABS','LABORATORIO','Unidad Suprema',36,42,47);
/*!40000 ALTER TABLE `unidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `password` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (31,'sergio','Pedro'),(32,'demo','Federico'),(33,'Juan','Federico');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-23  9:08:32
