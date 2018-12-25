# Host: localhost  (Version 5.5.5-10.1.32-MariaDB)
# Date: 2018-12-25 10:59:06
# Generator: MySQL-Front 6.1  (Build 1.23)


#
# Structure for table "barang"
#

DROP TABLE IF EXISTS `barang`;
CREATE TABLE `barang` (
  `KdBrg` varchar(6) NOT NULL DEFAULT '',
  `NmBrg` varchar(50) DEFAULT NULL,
  `Satuan` varchar(10) DEFAULT NULL,
  `HargaBrg` int(6) DEFAULT NULL,
  `Stok` int(3) DEFAULT NULL,
  `pemasok` varchar(50) DEFAULT NULL,
  `KdKategori` int(3) DEFAULT NULL,
  PRIMARY KEY (`KdBrg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "barang"
#

INSERT INTO `barang` VALUES ('B101','Paracetamol','pcs',5000,16,'CV Cininta',1),('B102','Bodrex','strip',5000,15,'CV Cininta',1),('B103','Promag','mg',10000,30,'CV Cininta',1),('B104','Multivitamin Syrup','botol',25000,25,'CV Cininta',1),('B105','Panadol','pcs',3000,36,'PT Kimia Farma',1),('B106','Aspirin','botol',20000,55,'PT Kimia Farma',1),('B107','Termorex','botol',10000,15,'CV Cininta',1),('B108','Paramex','strip',6000,21,'PT Kimia Farma',1),('B201','Agrylin','mg',6000,22,'PT Dexa Medica',2),('B202','Aggravan','strip',2000,12,'PT Dexa Medica',2),('B203','prolecin','mg',8000,10,'CV Cininta',2),('B204','Tamaret','mg',7000,5,'PT Kimia Farma',2),('B301','Insto','botol',4000,29,'PT Kimia Farma',3),('B302','Xitrol','botol',4000,20,'PT Kimia Farma',3),('B303','Rohto Cool','botol',6000,29,'PT Dexa Medica',3),('B401','Salep','pcs',3000,25,'PT Dexa Medica',4),('B402','Guttae Nasales','botol',25000,30,'PT Kimia Farma',4),('B403','Suppositoria','pcs',15000,20,'CV Cininta',4),('B404','Guttae Opthalmicae','botol',16000,22,'CV Cininta',4);

#
# Structure for table "buktipesan"
#

DROP TABLE IF EXISTS `buktipesan`;
CREATE TABLE `buktipesan` (
  `NoPesan` varchar(7) NOT NULL DEFAULT '',
  `TglPesan` date DEFAULT NULL,
  `KdPlg` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`NoPesan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "buktipesan"
#

INSERT INTO `buktipesan` VALUES ('BP00001','2018-12-16',NULL),('BP00002','2018-12-16',NULL),('BP00003','2018-12-16',NULL),('BP00004','2018-12-16',NULL),('BP00005','2018-12-18',NULL),('BP00006','2018-12-18',NULL),('BP00007','2018-12-24',NULL),('BP00008','2018-12-25',NULL),('BP00009','2018-12-25',NULL),('BP00010','2018-12-25',NULL);

#
# Structure for table "detilpesan"
#

DROP TABLE IF EXISTS `detilpesan`;
CREATE TABLE `detilpesan` (
  `NoPesan` varchar(7) NOT NULL DEFAULT '',
  `KdBrg` varchar(6) NOT NULL DEFAULT '0',
  `HrgPesan` int(6) DEFAULT NULL,
  `JmlPesan` int(3) DEFAULT NULL,
  PRIMARY KEY (`NoPesan`,`KdBrg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "detilpesan"
#

INSERT INTO `detilpesan` VALUES ('BP00001','B101',5000,1),('BP00001','B102',5000,1),('BP00002','B401',3000,1),('BP00003','B301',4000,1),('BP00003','B303',6000,1),('BP00004','B101',5000,2),('BP00005','B108',6000,1),('BP00006','B101',5000,1),('BP00007','B106',20000,1),('BP00008','B102',5000,1),('BP00009','B102',5000,1),('BP00010','B102',5000,2);

#
# Structure for table "kategori"
#

DROP TABLE IF EXISTS `kategori`;
CREATE TABLE `kategori` (
  `KdKategori` varchar(3) NOT NULL DEFAULT '',
  `NmKategori` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`KdKategori`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "kategori"
#

INSERT INTO `kategori` VALUES ('1','Obat Bebas'),('2','Obat Keras'),('3','Obat Mata'),('4','Obat Luar');

#
# Structure for table "pelanggan"
#

DROP TABLE IF EXISTS `pelanggan`;
CREATE TABLE `pelanggan` (
  `KdPlg` varchar(6) NOT NULL DEFAULT '',
  `NmPlg` varchar(50) DEFAULT NULL,
  `AlamatPlg` varchar(50) DEFAULT NULL,
  `TelpPlg` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`KdPlg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "pelanggan"
#


#
# Structure for table "suplier"
#

DROP TABLE IF EXISTS `suplier`;
CREATE TABLE `suplier` (
  `kdsuplier` int(11) NOT NULL AUTO_INCREMENT,
  `nmsuplier` varchar(20) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telpsuplier` int(11) DEFAULT NULL,
  PRIMARY KEY (`kdsuplier`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Data for table "suplier"
#

INSERT INTO `suplier` VALUES (1,'PT Kimia Farma','Jl. jalan yuk',24894),(2,'CV Cininta','Jl Lampersari 57 Semarang',248313757),(3,'PT Dexa Medica','Jl Kelapa Gading Slt',25245454);
