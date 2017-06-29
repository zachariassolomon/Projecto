-- MySQL dump 10.16  Distrib 10.1.24-MariaDB, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: siaa
-- ------------------------------------------------------
-- Server version	5.7.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Interacao`
--
DROP TABLE IF EXISTS `Interacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Interacao` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `UserID` int(10) DEFAULT NULL,
  `TarefaID` int(10) NOT NULL,
  `Comment` varchar(255) NOT NULL,
  `Data_interacao` bigint(20) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKInteracao263490` (`TarefaID`),
  KEY `FKInteracao929740` (`UserID`),
  CONSTRAINT `FKInteracao263490` FOREIGN KEY (`TarefaID`) REFERENCES `Tarefa` (`ID`),
  CONSTRAINT `FKInteracao929740` FOREIGN KEY (`UserID`) REFERENCES `User` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Interacao`
--

LOCK TABLES `Interacao` WRITE;
/*!40000 ALTER TABLE `Interacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Interacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Projeto`
--

DROP TABLE IF EXISTS `Projeto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Projeto` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) NOT NULL,
  `Descricao` varchar(255) DEFAULT NULL,
  `Data_fim` bigint(20) DEFAULT NULL,
  `Data_criacao` bigint(20) DEFAULT NULL,
  `Estado` varchar(255) DEFAULT NULL,
  `Last_updated` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Nome` (`Nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Projeto`
--

LOCK TABLES `Projeto` WRITE;
/*!40000 ALTER TABLE `Projeto` DISABLE KEYS */;
/*!40000 ALTER TABLE `Projeto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sessao`
--

DROP TABLE IF EXISTS `Sessao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sessao` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `UserID` int(10) DEFAULT NULL,
  `TarefaID` int(10) NOT NULL,
  `Data_inicio` bigint(20) DEFAULT NULL,
  `Data_fim` bigint(20) DEFAULT NULL,
  `Comentario` varchar(255) DEFAULT NULL,
  `Tempo_trabalho` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKSessao853780` (`TarefaID`),
  KEY `FKSessao520031` (`UserID`),
  CONSTRAINT `FKSessao520031` FOREIGN KEY (`UserID`) REFERENCES `User` (`ID`),
  CONSTRAINT `FKSessao853780` FOREIGN KEY (`TarefaID`) REFERENCES `Tarefa` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sessao`
--

LOCK TABLES `Sessao` WRITE;
/*!40000 ALTER TABLE `Sessao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Sessao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tarefa`
--

DROP TABLE IF EXISTS `Tarefa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tarefa` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `TarefaID` int(10) DEFAULT NULL,
  `ProjetoID` int(10) DEFAULT NULL,
  `Descricao` varchar(255) DEFAULT NULL,
  `Estado` varchar(255) DEFAULT NULL,
  `Prioridade` int(10) DEFAULT NULL,
  `Data_inicio` bigint(20) DEFAULT NULL,
  `Data_fim` bigint(20) DEFAULT NULL,
  `Titulo` varchar(255) NOT NULL,
  `Last_updated` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKTarefa942994` (`ProjetoID`),
  KEY `FKTarefa745768` (`TarefaID`),
  CONSTRAINT `FKTarefa745768` FOREIGN KEY (`TarefaID`) REFERENCES `Tarefa` (`ID`),
  CONSTRAINT `FKTarefa942994` FOREIGN KEY (`ProjetoID`) REFERENCES `Projeto` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tarefa`
--

LOCK TABLES `Tarefa` WRITE;
/*!40000 ALTER TABLE `Tarefa` DISABLE KEYS */;
/*!40000 ALTER TABLE `Tarefa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Username` (`Username`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User_Projeto`
--

DROP TABLE IF EXISTS `User_Projeto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User_Projeto` (
  `UserID` int(10) NOT NULL,
  `ProjetoID` int(10) NOT NULL,
  PRIMARY KEY (`UserID`,`ProjetoID`),
  KEY `FKUser_Proje800586` (`UserID`),
  KEY `FKUser_Proje331562` (`ProjetoID`),
  CONSTRAINT `FKUser_Proje331562` FOREIGN KEY (`ProjetoID`) REFERENCES `Projeto` (`ID`),
  CONSTRAINT `FKUser_Proje800586` FOREIGN KEY (`UserID`) REFERENCES `User` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User_Projeto`
--

LOCK TABLES `User_Projeto` WRITE;
/*!40000 ALTER TABLE `User_Projeto` DISABLE KEYS */;
/*!40000 ALTER TABLE `User_Projeto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-28  0:52:50
