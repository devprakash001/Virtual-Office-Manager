/*
SQLyog Ultimate v8.82 
MySQL - 5.1.45-community : Database - office_manager
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`office_manager` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `office_manager`;

/*Table structure for table `emp_attendance` */

DROP TABLE IF EXISTS `emp_attendance`;

CREATE TABLE `emp_attendance` (
  `ecode` int(4) DEFAULT NULL,
  `atnd_date` date DEFAULT NULL,
  `time_in` varchar(30) DEFAULT NULL,
  `time_out` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emp_attendance` */

insert  into `emp_attendance`(`ecode`,`atnd_date`,`time_in`,`time_out`) values (1001,'2024-08-31','3:25:13','3:27:53'),(1002,'2024-08-31','3:26:6','3:27:37');

/*Table structure for table `emp_mstr` */

DROP TABLE IF EXISTS `emp_mstr`;

CREATE TABLE `emp_mstr` (
  `ecode` int(4) NOT NULL,
  `ename` varchar(30) DEFAULT NULL,
  `edob` date DEFAULT NULL,
  `egender` varchar(10) DEFAULT NULL,
  `epost` varchar(30) DEFAULT NULL,
  `eadder` varchar(100) DEFAULT NULL,
  `ecity` varchar(40) DEFAULT NULL,
  `econt` decimal(10,0) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `idname` varchar(30) DEFAULT NULL,
  `idno` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`ecode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emp_mstr` */

insert  into `emp_mstr`(`ecode`,`ename`,`edob`,`egender`,`epost`,`eadder`,`ecity`,`econt`,`email`,`idname`,`idno`) values (1001,'Dev Prakash Singh','2005-06-30','Male','Web Devloper','Jankipuram','Lucknow','9838011971','dev@gmail.com','Dev_745698','45844'),(1002,'Ragini','2004-07-07','Female','Devlopment','Rajaji Puram','Lucknow','9801597634','ragini@gmail.com','ragini_98745','456971');

/*Table structure for table `emp_status` */

DROP TABLE IF EXISTS `emp_status`;

CREATE TABLE `emp_status` (
  `ecode` int(4) NOT NULL,
  `join_date` date DEFAULT NULL,
  `last_work_date` date DEFAULT NULL,
  `emp_status` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`ecode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emp_status` */

insert  into `emp_status`(`ecode`,`join_date`,`last_work_date`,`emp_status`) values (1001,'2024-08-26',NULL,'Working'),(1002,'2024-08-26',NULL,'Working');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `user` varchar(30) NOT NULL,
  `pswd` varchar(20) DEFAULT NULL,
  `utype` varchar(20) DEFAULT NULL,
  `ac_status` int(1) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`user`,`pswd`,`utype`,`ac_status`) values ('Admin','admin','Admin',1),('Dev','96314','Company',1),('dev@gmail.com','412','Employee',1),('ragini@gmail.com','214','Employee',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
