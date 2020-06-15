/*
 Navicat Premium Data Transfer

 Source Server         : alicloud
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 47.96.250.239:3306
 Source Schema         : groupchat

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 15/06/2020 20:52:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '默认主键',
  `content` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '这是条默认弹幕' COMMENT '弹幕内容',
  `size` tinyint(2) NULL DEFAULT 1 COMMENT '弹幕大小，0小，1中，2大',
  `color` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '#000000' COMMENT '弹幕颜色，初始黑',
  `bold` tinyint(1) NULL DEFAULT 0 COMMENT '是否加粗，0不加粗，1加粗',
  `italic` tinyint(1) NULL DEFAULT 0 COMMENT '是否斜体，0不斜体。1斜体',
  `position` tinyint(2) NULL DEFAULT 0 COMMENT '弹幕位置，0随机，1固定定端，2固定底端',
  `ip` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0.0.0.0' COMMENT '弹幕来源的主机',
  `name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '-USER-' COMMENT '弹幕发送者的昵称',
  `time` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '2020-01-01 00:00:00' COMMENT '弹幕的时间',
  `available` tinyint(2) NULL DEFAULT 1 COMMENT '是否可用，1可用，0不可用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 236 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '弹幕表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
