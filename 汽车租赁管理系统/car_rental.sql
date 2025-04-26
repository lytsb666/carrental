/*
Navicat MariaDB Data Transfer

Source Server         : localhost
Source Server Version : 100121
Source Host           : localhost:3306
Source Database       : car_rental

Target Server Type    : MariaDB
Target Server Version : 100121
File Encoding         : 65001

Date: 2017-06-23 00:03:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminname` varchar(20) NOT NULL,
  `admin_password` varchar(20) NOT NULL,
  PRIMARY KEY (`adminname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('12345', '12345');

-- ----------------------------
-- Table structure for car_information
-- ----------------------------
DROP TABLE IF EXISTS `car_information`;
CREATE TABLE `car_information` (
  `number` int(11) NOT NULL,
  `cartype` varchar(25) CHARACTER SET utf16 DEFAULT NULL,
  `carower` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `price` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `color` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `hire` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `information` text CHARACTER SET utf8,
  `username` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of car_information
-- ----------------------------
INSERT INTO `car_information` VALUES ('1', '摩托', '老肥', '50', '白色', '是', '联系方式：112122121', '1235');
INSERT INTO `car_information` VALUES ('2', '捷达ee', '虚言表', '1000', '粉', '是', 'wdwdwdaa s', null);
INSERT INTO `car_information` VALUES ('5', '法拉利', '小李', '500', '黑', '是', null, null);
INSERT INTO `car_information` VALUES ('6', '拖车', '丽丽', '200', '里', '是', null, '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', '123');
INSERT INTO `user` VALUES ('1234', '123');
INSERT INTO `user` VALUES ('123456789', '123');
INSERT INTO `user` VALUES ('1235', '1235');
SET FOREIGN_KEY_CHECKS=1;
