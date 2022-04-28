/*
 Navicat Premium Data Transfer

 Source Server         : MySQL Server
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : java_swing_example

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 28/04/2022 10:52:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sinhvien
-- ----------------------------
DROP TABLE IF EXISTS `sinhvien`;
CREATE TABLE `sinhvien`  (
  `ma_sv` int(0) NOT NULL AUTO_INCREMENT,
  `hoten` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `namsinh` int(0) NULL DEFAULT NULL,
  `phai` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sodienthoai` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `email` char(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `diachi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ma_sv`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sinhvien
-- ----------------------------
INSERT INTO `sinhvien` VALUES (1, 'John', 20220428, 'NAM', '01365', '123@gmail.com', 'HCM');
INSERT INTO `sinhvien` VALUES (2, 'John', 2002, 'nam', '0393546167', 'aibiet2098@gmail.com', 'VietNam');
INSERT INTO `sinhvien` VALUES (3, 'Nguyễn Hồng Hiệu', 2002, 'nam', '113', 'hieu@gmail.com', 'hcm');

SET FOREIGN_KEY_CHECKS = 1;
