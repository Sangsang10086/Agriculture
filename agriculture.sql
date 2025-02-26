-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: agriculture
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agricultural_products`
--

DROP TABLE IF EXISTS `agricultural_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agricultural_products` (
  `pro_agr_id` int NOT NULL AUTO_INCREMENT,
  `pro_name` varchar(50) DEFAULT NULL,
  `pro_sort` varchar(50) DEFAULT NULL,
  `pro_money` double DEFAULT NULL,
  `pro_indate` timestamp NULL DEFAULT NULL,
  `pro_outdate` timestamp NULL DEFAULT NULL,
  `pro_detail` varchar(200) DEFAULT NULL,
  `pro_size` double DEFAULT NULL,
  `pro_sellNum` double DEFAULT NULL,
  `pro_storeId` double DEFAULT NULL,
  `pro_seller_id` int DEFAULT NULL,
  `pro_img` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`pro_agr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agricultural_products`
--

LOCK TABLES `agricultural_products` WRITE;
/*!40000 ALTER TABLE `agricultural_products` DISABLE KEYS */;
INSERT INTO `agricultural_products` VALUES (1,'有机大米','蔬菜',12.5,'2025-01-01 00:00:00','2025-01-15 00:00:00','这款有机大米来自经过认证的有机农田，全程无农药、无化肥的施用，保证了大米的纯净与安全。',2000,1000,1,1,'/uploads/1.jpeg'),(2,'香甜玉米','蔬菜',8.3,'2025-01-02 01:00:00','2025-01-16 01:00:00','香甜玉米，颗颗饱满，咬一口满口都是浓郁的清甜。玉米粒颗颗完整，口感脆嫩多汁，营养丰富。无论是直接煮熟食用，还是制作成玉米沙拉、玉米汤，都能让您品尝到最纯粹的香甜味道，是您不可错过的美味农产品。',2000,1254,1,1,'/uploads/2.jpeg'),(3,'新鲜苹果','水果',15.2,'2025-01-03 02:00:00','2025-01-17 02:00:00','精选自果园中的优质果实。果型饱满，色泽鲜艳，果皮光滑细腻。每一颗苹果都咬一口汁水四溢，口感脆爽清甜，果肉紧实多汁，香气四溢。',2000,455,1,1,'/uploads/3.jpeg'),(4,'香蕉','水果',10.8,'2025-01-04 03:00:00','2025-01-18 03:00:00','美味香蕉，美味可口',5000,4556,1,1,'/uploads/4.png'),(5,'橙子','水果',13.7,'2025-01-05 04:00:00','2025-01-19 04:00:00','橙子好吃',5000,4220,1,1,'/uploads/5.jpeg'),(6,'玉米','谷物',9.5,'2025-01-06 05:00:00','2025-01-20 05:00:00','玉米好香',2000,1225,1,1,'/uploads/6.jpeg'),(7,'小麦','谷物',11.4,'2025-01-07 06:00:00','2025-01-21 06:00:00','小麦高产',2000,1444,1,1,'/uploads/7.jpeg'),(8,'草莓','水果',20.1,'2025-01-08 07:00:00','2025-01-22 07:00:00','草莓好甜',2000,1141,1,1,'/uploads/8.jpeg'),(12,'香蕉','水果',12.5,'2025-02-04 07:05:52','2025-02-05 11:31:56','这个香蕉又大又甜，透漏着屎黄色',5000,1545,2,1,'/uploads/d2353052-835f-4c6d-8d3e-c35d2e8c8b5e.png');
/*!40000 ALTER TABLE `agricultural_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buyers`
--

DROP TABLE IF EXISTS `buyers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buyers` (
  `buyer_id` int NOT NULL AUTO_INCREMENT,
  `buyer_username` varchar(50) DEFAULT NULL,
  `buyer_password` varchar(50) DEFAULT NULL,
  `buyer_name` varchar(50) DEFAULT NULL,
  `buyer_gender` varchar(5) DEFAULT NULL,
  `buyer_phone` varchar(50) DEFAULT NULL,
  `buyer_address` varchar(200) DEFAULT NULL,
  `buyer_createTime` datetime DEFAULT NULL,
  `buyer_updateTime` datetime DEFAULT NULL,
  `buyer_birth` date DEFAULT NULL,
  PRIMARY KEY (`buyer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buyers`
--

LOCK TABLES `buyers` WRITE;
/*!40000 ALTER TABLE `buyers` DISABLE KEYS */;
INSERT INTO `buyers` VALUES (1,'buyer','123','买家测试','男','15035623265','河南省郑州市','2025-01-05 19:33:28','2025-05-05 19:33:37','2025-02-18');
/*!40000 ALTER TABLE `buyers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logistics_orders`
--

DROP TABLE IF EXISTS `logistics_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logistics_orders` (
  `log_order_id` int NOT NULL,
  `log_log_id` int DEFAULT NULL,
  `log_seller_id` int DEFAULT NULL,
  `log_buyer_id` int DEFAULT NULL,
  PRIMARY KEY (`log_order_id`),
  KEY `log_log_id` (`log_log_id`),
  KEY `log_seller_id` (`log_seller_id`),
  KEY `log_buyer_id` (`log_buyer_id`),
  CONSTRAINT `log_buyer_id` FOREIGN KEY (`log_buyer_id`) REFERENCES `buyers` (`buyer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `log_log_id` FOREIGN KEY (`log_log_id`) REFERENCES `logistics_user` (`logistic_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `log_seller_id` FOREIGN KEY (`log_seller_id`) REFERENCES `sellers` (`seller_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logistics_orders`
--

LOCK TABLES `logistics_orders` WRITE;
/*!40000 ALTER TABLE `logistics_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `logistics_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logistics_user`
--

DROP TABLE IF EXISTS `logistics_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logistics_user` (
  `logistic_id` int NOT NULL AUTO_INCREMENT,
  `logistic_name` varchar(50) DEFAULT NULL,
  `logistic_username` varchar(50) DEFAULT NULL,
  `logistic_password` varchar(50) DEFAULT NULL,
  `logistic_gender` varchar(50) DEFAULT NULL,
  `logistic_phone` varchar(50) DEFAULT NULL,
  `logistic_address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`logistic_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logistics_user`
--

LOCK TABLES `logistics_user` WRITE;
/*!40000 ALTER TABLE `logistics_user` DISABLE KEYS */;
INSERT INTO `logistics_user` VALUES (1,'张三','zhangsan','123456','男','13812345678','北京市朝阳区'),(2,'李四','lisi','abcdef','女','13912345678','上海市浦东新区'),(3,'王五','wangwu','qwerty','男','13612345678','广州市天河区'),(4,'赵六','zhaoliu','zxcvbn','女','13712345678','深圳市南山区'),(5,'孙七','sunqi','asdfgh','男','13512345678','杭州市西湖区'),(6,'周八','zhouba','uioplk','女','13312345678','成都市高新区'),(7,'吴九','wujiu','jklmno','男','13212345678','重庆市渝中区'),(8,'郑十','zhengshi','ghjklm','女','13112345678','武汉市江汉区'),(9,'钱一','qianyi','bnmvcx','男','13012345678','南京市鼓楼区'),(10,'陈二','chener','qazwsx','女','15812345678','西安市雁塔区');
/*!40000 ALTER TABLE `logistics_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `managers`
--

DROP TABLE IF EXISTS `managers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `managers` (
  `manager_id` int NOT NULL AUTO_INCREMENT,
  `manager_username` varchar(50) DEFAULT NULL,
  `manager_password` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `managers`
--

LOCK TABLES `managers` WRITE;
/*!40000 ALTER TABLE `managers` DISABLE KEYS */;
INSERT INTO `managers` VALUES (1,'admin','123456','管理','河南驻马店','1335145',NULL);
/*!40000 ALTER TABLE `managers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_pro_arg_id` int DEFAULT NULL,
  `order_store_id` int DEFAULT NULL,
  `order_seller_id` int DEFAULT NULL,
  `order_buyer_id` int DEFAULT NULL,
  `order_pro_size` int DEFAULT NULL,
  `order_logi_order_id` int DEFAULT NULL,
  `order_logistic_id` int DEFAULT NULL,
  `order_status` varchar(50) DEFAULT NULL,
  `order_proPay` double DEFAULT NULL,
  `order_createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,1,NULL,NULL,1,10,NULL,NULL,'待付款',61.12,NULL),(25,1,1,NULL,1,2,NULL,NULL,'待付款',25,'2025-02-08 17:11:37');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellers`
--

DROP TABLE IF EXISTS `sellers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellers` (
  `seller_id` int NOT NULL AUTO_INCREMENT,
  `seller_username` varchar(50) DEFAULT NULL,
  `seller_password` varchar(50) DEFAULT NULL,
  `seller_name` varchar(50) DEFAULT NULL,
  `seller_gender` varchar(10) DEFAULT NULL,
  `seller_phone` varchar(50) DEFAULT NULL,
  `seller_address` varchar(200) DEFAULT NULL,
  `seller_createTime` datetime DEFAULT NULL,
  `seller_updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`seller_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellers`
--

LOCK TABLES `sellers` WRITE;
/*!40000 ALTER TABLE `sellers` DISABLE KEYS */;
INSERT INTO `sellers` VALUES (1,'seller','123','卖家测试','女','15236523265','河南省郑州市','2024-02-05 19:36:04','2025-02-02 19:36:32');
/*!40000 ALTER TABLE `sellers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shopping_cart`
--

DROP TABLE IF EXISTS `shopping_cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shopping_cart` (
  `cart_id` int NOT NULL AUTO_INCREMENT,
  `cart_num` int DEFAULT NULL,
  `cart_address` varchar(200) DEFAULT NULL,
  `cart_addTime` datetime DEFAULT NULL,
  `cart_sellerId` int DEFAULT NULL,
  `cart_buyerId` int DEFAULT NULL,
  `cart_proId` int DEFAULT NULL,
  `cart_storeId` int DEFAULT NULL,
  PRIMARY KEY (`cart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shopping_cart`
--

LOCK TABLES `shopping_cart` WRITE;
/*!40000 ALTER TABLE `shopping_cart` DISABLE KEYS */;
INSERT INTO `shopping_cart` VALUES (1,2,'北京',NULL,1,1,1,1),(2,1,'上海',NULL,1,2,1,1);
/*!40000 ALTER TABLE `shopping_cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stores`
--

DROP TABLE IF EXISTS `stores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stores` (
  `store_id` int NOT NULL AUTO_INCREMENT,
  `store_seller_id` int DEFAULT NULL,
  `store_pro_arg_id` int DEFAULT NULL,
  `store_name` varchar(50) DEFAULT NULL,
  `store_createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`store_id`),
  KEY `store_seller_id` (`store_seller_id`),
  KEY `store_pro_arg_id` (`store_pro_arg_id`),
  CONSTRAINT `store_pro_arg_id` FOREIGN KEY (`store_pro_arg_id`) REFERENCES `agricultural_products` (`pro_agr_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_seller_id` FOREIGN KEY (`store_seller_id`) REFERENCES `sellers` (`seller_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stores`
--

LOCK TABLES `stores` WRITE;
/*!40000 ALTER TABLE `stores` DISABLE KEYS */;
INSERT INTO `stores` VALUES (1,1,1,'商店测试','2025-01-05 19:40:17');
/*!40000 ALTER TABLE `stores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-08 18:03:19
