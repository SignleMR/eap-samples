/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Version : 50615
 Source Host           : 127.0.0.1
 Source Database       : footmark

 Target Server Version : 50615
 File Encoding         : utf-8

 Date: 05/17/2015 20:20:06 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_bas_code_table`
-- ----------------------------
DROP TABLE IF EXISTS `t_bas_code_table`;
CREATE TABLE `t_bas_code_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code_type` varchar(100) DEFAULT NULL,
  `code_key` varchar(100) DEFAULT NULL,
  `code_value` varchar(100) DEFAULT NULL,
  `code_name` varchar(200) DEFAULT NULL,
  `code_desc` varchar(200) DEFAULT NULL,
  `code_group` varchar(100) DEFAULT NULL,
  `ordinal` int(2) DEFAULT NULL,
  `can_modify_ind` char(1) DEFAULT '1',
  `status` char(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Records of `t_bas_code_table`
-- ----------------------------
BEGIN;
INSERT INTO `t_bas_code_table` VALUES ('1', 'Indicator', 'S0', '0', '否', null, null, '2', '0', '1'), ('2', 'Indicator', 'S1', '1', '是', null, null, '1', '0', '1');
COMMIT;

-- ----------------------------
--  Table structure for `t_usr_account`
-- ----------------------------
DROP TABLE IF EXISTS `t_usr_account`;
CREATE TABLE `t_usr_account` (
  `id` bigint(18) unsigned NOT NULL DEFAULT '0' COMMENT '账号ID',
  `user_account` varchar(100) DEFAULT NULL COMMENT '登录账号',
  `user_account_type` char(1) DEFAULT NULL COMMENT '登录账号类型；UserAccountType',
  `user_id` bigint(18) DEFAULT NULL COMMENT '用户ID',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `i_tua_user_account` (`user_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_usr_profile`
-- ----------------------------
DROP TABLE IF EXISTS `t_usr_profile`;
CREATE TABLE `t_usr_profile` (
  `id` bigint(18) NOT NULL DEFAULT '0' COMMENT '用户ID',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `password` char(40) DEFAULT NULL COMMENT '登录密码',
  `mobile_no` char(11) DEFAULT NULL COMMENT '手机号',
  `status` char(1) DEFAULT NULL COMMENT '用户状态',
  `user_source` varchar(100) DEFAULT NULL COMMENT '用户来源',
  `reg_time` datetime DEFAULT NULL COMMENT '注册时间',
  `reg_ip` varchar(200) DEFAULT NULL COMMENT '注册IP',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

SET FOREIGN_KEY_CHECKS = 1;
