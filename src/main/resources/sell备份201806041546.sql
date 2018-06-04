/*
Navicat MySQL Data Transfer

Source Server         : cf
Source Server Version : 50640
Source Host           : 123.207.95.134:3306
Source Database       : sell

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-06-04 15:44:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `detail_id` varchar(36) NOT NULL,
  `order_id` varchar(32) NOT NULL,
  `product_id` varchar(32) NOT NULL,
  `product_name` varchar(64) NOT NULL,
  `product_price` decimal(8,2) NOT NULL,
  `product_quantity` int(11) NOT NULL,
  `product_icon` varchar(512) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`detail_id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('123455', '123', '231', '鸡翅', '5.00', '2', 'http://sdfa/d.jpg', '2018-05-29 11:07:18', '2018-05-29 11:42:32');
INSERT INTO `order_detail` VALUES ('123456', '123', '232', '皮蛋瘦肉粥', '10.30', '1', 'http://sdfa/d.jpg', '2018-05-29 11:10:47', '2018-05-29 11:29:26');
INSERT INTO `order_detail` VALUES ('1527908917237373169', '1527908917148952155', '1234', '皮蛋瘦肉粥', '10.00', '1', 'http://xxxx.jpg', '2018-06-02 11:10:16', '2018-06-02 11:10:16');
INSERT INTO `order_detail` VALUES ('1527909225828221361', '1527909225740785738', '1234', '皮蛋瘦肉粥', '10.00', '1', 'http://xxxx.jpg', '2018-06-02 11:15:24', '2018-06-02 11:15:24');
INSERT INTO `order_detail` VALUES ('1527909424246251921', '1527909424163397121', '1234', '皮蛋瘦肉粥', '10.00', '1', 'http://xxxx.jpg', '2018-06-02 11:18:43', '2018-06-02 11:18:43');
INSERT INTO `order_detail` VALUES ('1527909424303425573', '1527909424163397121', '12345678', '皮皮虾', '68.50', '2', 'http://xxxxxxxxxxxxxxxxxxxxxxxxxx.jpg', '2018-06-02 11:18:43', '2018-06-02 11:18:43');
INSERT INTO `order_detail` VALUES ('1527932701560754311', '1527932701396672922', '1234', '皮蛋瘦肉粥', '10.00', '1', 'http://xxxx.jpg', '2018-06-02 17:46:41', '2018-06-02 17:46:41');
INSERT INTO `order_detail` VALUES ('1527932701706788435', '1527932701396672922', '12345678', '皮皮虾', '68.50', '2', 'http://xxxxxxxxxxxxxxxxxxxxxxxxxx.jpg', '2018-06-02 17:46:41', '2018-06-02 17:46:41');

-- ----------------------------
-- Table structure for order_master
-- ----------------------------
DROP TABLE IF EXISTS `order_master`;
CREATE TABLE `order_master` (
  `order_id` varchar(36) NOT NULL,
  `buyer_name` varchar(32) NOT NULL,
  `buyer_phone` varchar(32) NOT NULL,
  `buyer_address` varchar(128) NOT NULL,
  `buyer_openid` varchar(32) DEFAULT NULL COMMENT '买家微信id',
  `order_amount` decimal(8,2) NOT NULL,
  `order_status` tinyint(3) NOT NULL DEFAULT '0' COMMENT '默认0新下单',
  `pay_status` tinyint(3) NOT NULL DEFAULT '0' COMMENT '默认0是未支付',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`),
  KEY `idx_buyer_openid` (`buyer_openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of order_master
-- ----------------------------
INSERT INTO `order_master` VALUES ('123', 'cxf', '13412345678', 'zhku', '122123', '53.50', '0', '0', '2018-05-29 10:38:52', '2018-05-29 10:38:52');
INSERT INTO `order_master` VALUES ('1527908917148952155', 'cxf', '13212345678', 'zhku', '120120', '10.00', '0', '0', '2018-06-02 11:10:16', '2018-06-02 11:10:16');
INSERT INTO `order_master` VALUES ('1527909225740785738', 'cxf', '13212345678', 'zhku', '120120', '10.00', '0', '0', '2018-06-02 11:15:24', '2018-06-02 11:15:24');
INSERT INTO `order_master` VALUES ('1527909424163397121', 'cxf', '13212345678', 'zhku', '120120', '147.00', '0', '1', '2018-06-02 11:18:43', '2018-06-03 14:11:36');

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `category_id` varchar(36) NOT NULL,
  `category_name` varchar(64) NOT NULL,
  `category_type` int(11) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `unique_category_type` (`category_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product_category` VALUES ('1', '热销榜', '2', '2018-05-26 23:15:31', '2018-05-26 23:15:31');
INSERT INTO `product_category` VALUES ('6', '女生最爱', '3', '2018-05-27 11:17:37', '2018-05-27 11:17:37');
INSERT INTO `product_category` VALUES ('9', '热销榜', '1', '2018-05-27 14:17:17', '2018-05-27 14:17:17');

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
  `product_id` varchar(36) NOT NULL,
  `product_name` varchar(64) NOT NULL,
  `product_price` decimal(8,2) NOT NULL,
  `product_stock` int(11) NOT NULL,
  `product_description` varchar(64) DEFAULT NULL,
  `product_icon` varchar(512) DEFAULT NULL,
  `product_status` int(11) NOT NULL,
  `category_type` int(11) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product_info` VALUES ('1234', '皮蛋瘦肉粥', '10.00', '28', '很好喝的粥', 'http://xxxx.jpg', '0', '3', '2018-05-27 19:27:52', '2018-06-02 17:46:41');
INSERT INTO `product_info` VALUES ('12345678', '皮皮虾', '68.50', '120', '很好吃的虾', 'http://xxxxxxxxxxxxxxxxxxxxxxxxxx.jpg', '1', '2', '2018-05-27 20:25:55', '2018-06-02 17:46:41');

-- ----------------------------
-- Table structure for seller_activity
-- ----------------------------
DROP TABLE IF EXISTS `seller_activity`;
CREATE TABLE `seller_activity` (
  `activity_id` varchar(36) NOT NULL,
  `seller_id` varchar(32) NOT NULL,
  `activity_type` tinyint(2) NOT NULL,
  `activity_description` varchar(256) NOT NULL,
  PRIMARY KEY (`activity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of seller_activity
-- ----------------------------

-- ----------------------------
-- Table structure for seller_info
-- ----------------------------
DROP TABLE IF EXISTS `seller_info`;
CREATE TABLE `seller_info` (
  `seller_id` varchar(36) NOT NULL DEFAULT '',
  `seller_name` varchar(128) NOT NULL,
  `seller_description` varchar(128) NOT NULL,
  `seller_score` decimal(3,1) NOT NULL,
  `seller_service_score` decimal(3,1) NOT NULL,
  `seller_food_score` decimal(3,1) NOT NULL,
  `seller_rank_rate` decimal(4,1) NOT NULL,
  `seller_min_price` decimal(8,0) NOT NULL,
  `seller_delivery_price` decimal(8,0) NOT NULL,
  `seller_rating_count` decimal(4,0) NOT NULL,
  `seller_sell_count` int(32) NOT NULL,
  `seller_bulletin` varchar(256) NOT NULL,
  PRIMARY KEY (`seller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of seller_info
-- ----------------------------
