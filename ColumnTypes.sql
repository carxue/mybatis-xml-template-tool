/*
Navicat MySQL Data Transfer

Source Server         : 本地虚拟机
Source Server Version : 50630
Source Host           : 192.168.32.129:3306
Source Database       : xuekui_data

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2017-06-13 16:05:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ColumnTypes
-- ----------------------------
DROP TABLE IF EXISTS `ColumnTypes`;
CREATE TABLE `ColumnTypes` (
  `bigint_bigint` bigint(20) DEFAULT NULL COMMENT 'bigint类型',
  `tinyint_tinyint` tinyint(4) DEFAULT NULL COMMENT 'tinyint类型',
  `smallint_smallint` smallint(6) DEFAULT NULL COMMENT 'smallint类型',
  `mediumint_mediumint` mediumint(9) DEFAULT NULL COMMENT 'mediumint类型',
  `int_int` int(11) DEFAULT NULL COMMENT 'int类型',
  `integer_integer` int(11) DEFAULT NULL COMMENT 'interger类型',
  `bit_bit` bit(1) DEFAULT NULL COMMENT 'bit类型',
  `real_real` double DEFAULT NULL COMMENT 'real类型',
  `double_double` double DEFAULT NULL COMMENT 'double类型',
  `decimal_decimal` decimal(10,0) DEFAULT NULL COMMENT 'decimal类型',
  `char_char` char(255) DEFAULT NULL COMMENT 'char类型',
  `varchar_varchar` varchar(255) DEFAULT NULL COMMENT 'varchar类型',
  `date_date` date DEFAULT NULL COMMENT 'date类型',
  `datetime_datetime` datetime DEFAULT NULL COMMENT 'datatime类型',
  `year_year` year(4) DEFAULT NULL COMMENT 'year类型',
  `time_time` time DEFAULT NULL COMMENT 'time类型',
  `timestamp_timestamp` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'timestamp类型',
  `float_float` float DEFAULT NULL COMMENT 'float类型'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ColumnTypes
-- ----------------------------
