/*
 Navicat Premium Data Transfer

 Source Server         : adger
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : waterall

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 20/05/2020 21:34:21
 数据库名字根据自己定义 无所谓 注意改下配置文件
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for be_comment
-- ----------------------------
DROP TABLE IF EXISTS `be_comment`;
CREATE TABLE `be_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `date` datetime(0) NULL DEFAULT NULL,
  `emp_id` int(11) NULL DEFAULT NULL,
  `comment` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for be_flow
-- ----------------------------
DROP TABLE IF EXISTS `be_flow`;
CREATE TABLE `be_flow`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `stepname` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '步骤名称',
  `deptid` int(11) NULL DEFAULT NULL COMMENT '步骤负责部门',
  `type1` int(11) NULL DEFAULT NULL COMMENT '新户的流程',
  `type2` int(11) NULL DEFAULT NULL COMMENT '分户的流程',
  `type3` int(11) NULL DEFAULT NULL COMMENT '过户的流程',
  `type4` int(11) NULL DEFAULT NULL COMMENT '代扣的流程',
  `type5` int(11) NULL DEFAULT NULL COMMENT '换表的流程',
  `type6` int(11) NULL DEFAULT NULL COMMENT '重签的流程',
  `type7` int(11) NULL DEFAULT NULL COMMENT '销户的流程',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of be_flow
-- ----------------------------
INSERT INTO `be_flow` VALUES (-1, '终止', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `be_flow` VALUES (0, '完成', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `be_flow` VALUES (1, '用户申请', 4, 1, 1, 1, 1, 1, 1, 1);
INSERT INTO `be_flow` VALUES (2, '初步审核', 2, 2, 2, 2, 2, 2, 2, 2);
INSERT INTO `be_flow` VALUES (3, '教施公费', 3, 3, 3, NULL, NULL, 3, NULL, NULL);
INSERT INTO `be_flow` VALUES (4, '水费清算', 4, NULL, 4, NULL, NULL, NULL, NULL, 3);
INSERT INTO `be_flow` VALUES (5, '供水协议', 2, 4, 5, NULL, NULL, NULL, 3, NULL);
INSERT INTO `be_flow` VALUES (6, '施工竣工', 7, 5, 6, NULL, NULL, 4, NULL, NULL);
INSERT INTO `be_flow` VALUES (7, '通水停水', 5, 6, 7, NULL, NULL, 5, NULL, 4);
INSERT INTO `be_flow` VALUES (8, '档案存档', 2, 7, 8, 3, 3, 6, 4, 5);

-- ----------------------------
-- Table structure for be_formula
-- ----------------------------
DROP TABLE IF EXISTS `be_formula`;
CREATE TABLE `be_formula`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_user_id` int(11) NULL DEFAULT NULL,
  `water_type_code` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `allo_text` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `allo_type` int(11) NULL DEFAULT NULL,
  `allo_value` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for be_history
-- ----------------------------
DROP TABLE IF EXISTS `be_history`;
CREATE TABLE `be_history`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `step_id` int(11) NULL DEFAULT NULL,
  `date` datetime(0) NULL DEFAULT NULL,
  `emp_id` int(11) NULL DEFAULT NULL,
  `is_back` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for be_order
-- ----------------------------
DROP TABLE IF EXISTS `be_order`;
CREATE TABLE `be_order`  (
  `order_no` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_type` int(11) NULL DEFAULT NULL,
  `stpe_id` int(11) NULL DEFAULT NULL,
  `create_emp` int(11) NULL DEFAULT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `complete_emp` int(11) NULL DEFAULT NULL,
  `complete_date` datetime(0) NULL DEFAULT NULL,
  `last_edit_emp` int(11) NULL DEFAULT NULL,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_type` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `link_man` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `use_target` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `house_height` int(11) NULL DEFAULT NULL,
  `max_amount` int(11) NULL DEFAULT NULL,
  `meter_type_id` int(11) NULL DEFAULT NULL,
  `meter_count` int(11) NULL DEFAULT NULL,
  `user_remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pay_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bank_company` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bank_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `old_user_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `old_user_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `old_user_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `old_user_addr` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `old_meter` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `audit_emp_id` int(11) NULL DEFAULT NULL,
  `audit_message` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `project_money` decimal(18, 2) NULL DEFAULT NULL,
  `real_money` decimal(18, 2) NULL DEFAULT NULL,
  `pay_date` datetime(0) NULL DEFAULT NULL,
  `project_date1` datetime(0) NULL DEFAULT NULL,
  `project_date2` datetime(0) NULL DEFAULT NULL,
  `area_id` int(11) NULL DEFAULT NULL,
  `abort_cause` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`order_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for be_order_lite
-- ----------------------------
DROP TABLE IF EXISTS `be_order_lite`;
CREATE TABLE `be_order_lite`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_type` int(11) NULL DEFAULT NULL,
  `date` datetime(0) NULL DEFAULT NULL,
  `emp_id` int(11) NULL DEFAULT NULL,
  `user_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for be_order_user
-- ----------------------------
DROP TABLE IF EXISTS `be_order_user`;
CREATE TABLE `be_order_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sms_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `project_money` decimal(18, 2) NULL DEFAULT NULL,
  `real_money` decimal(18, 2) NULL DEFAULT NULL,
  `invoice_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `formula` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `contract_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `meter_type_id` int(11) NULL DEFAULT NULL,
  `meter_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `max_value` int(11) NULL DEFAULT NULL,
  `start_value` int(11) NULL DEFAULT NULL,
  `meter_factory` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `doc_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for iv_archive
-- ----------------------------
DROP TABLE IF EXISTS `iv_archive`;
CREATE TABLE `iv_archive`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '交票人',
  `In_id` int(11) NULL DEFAULT NULL COMMENT '对应入库ID',
  `start_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '起始号码',
  `end_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '结束号码',
  `counts` int(255) NULL DEFAULT NULL COMMENT '总张数',
  `archive_date` datetime(0) NULL DEFAULT NULL COMMENT '交票日期',
  `archive_emp_id` int(11) NULL DEFAULT NULL COMMENT '收票人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for iv_ininvoice
-- ----------------------------
DROP TABLE IF EXISTS `iv_ininvoice`;
CREATE TABLE `iv_ininvoice`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Invoice_type` int(255) NULL DEFAULT NULL COMMENT '发票类型（0普通发票 1增值税发票）',
  `start_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '开始号码',
  `end_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '结束号码',
  `counts` int(255) NULL DEFAULT NULL COMMENT '总张数',
  `In_date` datetime(0) NULL DEFAULT NULL COMMENT '入库时间',
  `In_emp_id` int(11) NULL DEFAULT NULL COMMENT '入库操作人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for iv_invoice
-- ----------------------------
DROP TABLE IF EXISTS `iv_invoice`;
CREATE TABLE `iv_invoice`  (
  `Invoice_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发票号码（一般是8位。批量收费时是10位，前8位相同，后2位是流水号。）',
  `Invoice_type` int(255) NULL DEFAULT NULL COMMENT '发票类型（0普通发票 1增值税发票）',
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '领用收费员',
  `In_id` int(11) NULL DEFAULT NULL COMMENT '入库批次ID',
  `out_id` int(11) NULL DEFAULT NULL COMMENT '出库批次ID',
  `archive_id` int(11) NULL DEFAULT NULL COMMENT '交票批次ID',
  `used` bit(1) NULL DEFAULT NULL COMMENT '已使用',
  `use_date` datetime(0) NULL DEFAULT NULL COMMENT '使用日期',
  `Invalid` bit(1) NULL DEFAULT NULL COMMENT '已作废',
  `Invalid_date` datetime(0) NULL DEFAULT NULL COMMENT '作废日期',
  `archived` bit(1) NULL DEFAULT NULL COMMENT '已交票',
  `archive_date` datetime(0) NULL DEFAULT NULL COMMENT '交票日期',
  PRIMARY KEY (`Invoice_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for iv_outinvoice
-- ----------------------------
DROP TABLE IF EXISTS `iv_outinvoice`;
CREATE TABLE `iv_outinvoice`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '领用人',
  `In_id` int(11) NULL DEFAULT NULL COMMENT '对应入库ID',
  `start_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '起始号码',
  `end_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '结束号码',
  `counts` int(255) NULL DEFAULT NULL COMMENT '总张数',
  `out_date` datetime(0) NULL DEFAULT NULL COMMENT '出库日期',
  `out_emp_id` int(11) NULL DEFAULT NULL COMMENT '出库操作人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for py_balance
-- ----------------------------
DROP TABLE IF EXISTS `py_balance`;
CREATE TABLE `py_balance`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `balance_date` date NULL DEFAULT NULL COMMENT '销账日期',
  `balance_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账金额',
  `bill_no` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '水费单',
  `bill_real_money1` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账前实收金额',
  `bill_real_money2` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账后实收金额',
  `pay_no` varchar(22) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交费单',
  `pay_use_money1` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账前已用金额',
  `pay_use_money2` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账后已用金额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for py_balance_detail
-- ----------------------------
DROP TABLE IF EXISTS `py_balance_detail`;
CREATE TABLE `py_balance_detail`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NULL DEFAULT NULL COMMENT '总目ID',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `balance_date` datetime(0) NULL DEFAULT NULL COMMENT '销账日期',
  `balance_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账金额',
  `bill_no` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '水费单号',
  `bill_detail_id` int(11) NULL DEFAULT NULL COMMENT '水费单明细ID',
  `cost_type_code` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '费用项编码',
  `detail_real_money1` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账前实收金额',
  `detail_real_money2` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账后实收金额',
  `pay_no` varchar(22) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交费单号',
  `pay_use_money1` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账前已用金额',
  `pay_use_money2` decimal(18, 2) NULL DEFAULT NULL COMMENT '销账后已用金额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for py_bill
-- ----------------------------
DROP TABLE IF EXISTS `py_bill`;
CREATE TABLE `py_bill`  (
  `bill_no` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '水费单号（规则：SF0100000987-201308，共19位，SF+用户编码+年月）',
  `read_id` int(11) NULL DEFAULT NULL COMMENT '对应的抄表ID',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '建单日期',
  `bill_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '应交金额',
  `real_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '实交金额',
  `balance` bit(1) NULL DEFAULT NULL COMMENT '已结清',
  `balance_date` datetime(0) NULL DEFAULT NULL COMMENT '结清日期',
  PRIMARY KEY (`bill_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for py_bill_detail
-- ----------------------------
DROP TABLE IF EXISTS `py_bill_detail`;
CREATE TABLE `py_bill_detail`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_no` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属水费单',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `cost_type_code` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '费用项编码',
  `amount` int(11) NULL DEFAULT NULL COMMENT '水量',
  `price` decimal(18, 2) NULL DEFAULT NULL COMMENT '单价',
  `detail_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '应收金额',
  `real_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '实收金额',
  `balance` bit(1) NULL DEFAULT NULL COMMENT '已结清',
  `balance_date` datetime(0) NULL DEFAULT NULL COMMENT '结清日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for py_pay
-- ----------------------------
DROP TABLE IF EXISTS `py_pay`;
CREATE TABLE `py_pay`  (
  `pay_no` varchar(22) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '交费单号（规则：JF0100000987-201401-02，共22位。JF用户编码-年月-按月流水）',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `pay_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交费方式（坐收 走收 银行代扣）',
  `pay_date` datetime(0) NULL DEFAULT NULL COMMENT '交费日期',
  `Invoice` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发票号码',
  `pay_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '交费金额',
  `use_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '已用金额',
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '收费员',
  PRIMARY KEY (`pay_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for py_sum_report
-- ----------------------------
DROP TABLE IF EXISTS `py_sum_report`;
CREATE TABLE `py_sum_report`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `type` int(255) NULL DEFAULT NULL COMMENT '类型（0月报表  1年报表）',
  `report_year` int(255) NULL DEFAULT NULL COMMENT '年份',
  `report_month` int(255) NULL DEFAULT NULL COMMENT '月份（只有月报表才有值）',
  `line_no` int(11) NULL DEFAULT NULL COMMENT '行号',
  `C1` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第一列',
  `C2` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第二列',
  `C3` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第三列',
  `C4` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第四列',
  `C5` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第五列',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for py_user_history
-- ----------------------------
DROP TABLE IF EXISTS `py_user_history`;
CREATE TABLE `py_user_history`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `type` int(255) NULL DEFAULT NULL COMMENT '记录类型（0水费单 1交费单）',
  `order_no` varchar(22) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '水费单或交费单号',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '建单时间',
  `pre_value` int(255) NULL DEFAULT NULL COMMENT '上月表码（仅水费单有值）',
  `cur_value` int(255) NULL DEFAULT NULL COMMENT '本月表码（仅水费单有值）',
  `amount` int(255) NULL DEFAULT NULL COMMENT '用水量  （仅水费单有值）',
  `bill_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '应缴水费（仅水费单有值）',
  `pay_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '交费金额（仅交费单有值）',
  `user_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '余额/欠费（正数表示余额    负数表示欠费）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rd_change_max_value
-- ----------------------------
DROP TABLE IF EXISTS `rd_change_max_value`;
CREATE TABLE `rd_change_max_value`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime(0) NULL DEFAULT NULL COMMENT '操作日期',
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '操作员',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `meter_no` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '水表编码',
  `max_value1` int(255) NULL DEFAULT NULL COMMENT '修正前最大表码值',
  `max_value2` int(255) NULL DEFAULT NULL COMMENT '修正后最大表码值',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rd_change_value
-- ----------------------------
DROP TABLE IF EXISTS `rd_change_value`;
CREATE TABLE `rd_change_value`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime(0) NULL DEFAULT NULL COMMENT '操作日期',
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '操作员',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `pre_value1` int(255) NULL DEFAULT NULL COMMENT '修正前底码',
  `pre_value2` int(255) NULL DEFAULT NULL COMMENT '修正后底码',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rd_read
-- ----------------------------
DROP TABLE IF EXISTS `rd_read`;
CREATE TABLE `rd_read`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `read_year` int(255) NULL DEFAULT NULL COMMENT '抄表年份',
  `read_month` int(255) NULL DEFAULT NULL COMMENT '抄表月份',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `meter_no` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '水表编码',
  `max_value` int(255) NULL DEFAULT NULL COMMENT '最大表码值（冗余数据）',
  `volume_Id` int(11) NULL DEFAULT NULL COMMENT '表册ID',
  `volume_Index` int(255) NULL DEFAULT NULL COMMENT '表册中的序号（冗余数据）',
  `read_emp_id` int(11) NULL DEFAULT NULL COMMENT '抄表人',
  `read_date` datetime(0) NULL DEFAULT NULL COMMENT '抄表时间',
  `pre_value` int(255) NULL DEFAULT NULL COMMENT '上月表码',
  `enter` bit(1) NULL DEFAULT NULL COMMENT '已输入',
  `cur_value` int(255) NULL DEFAULT NULL COMMENT '本月表码',
  `dial` bit(1) NULL DEFAULT NULL COMMENT '转表',
  `amount` int(255) NULL DEFAULT NULL COMMENT '用水量',
  `formula` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '套用提比提量值',
  `audit` bit(1) NULL DEFAULT NULL COMMENT '已审核',
  `audit_emp_id` int(11) NULL DEFAULT NULL COMMENT '审核人',
  `audit_date` datetime(0) NULL DEFAULT NULL COMMENT '审核日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rd_read_types
-- ----------------------------
DROP TABLE IF EXISTS `rd_read_types`;
CREATE TABLE `rd_read_types`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `read_id` int(11) NULL DEFAULT NULL COMMENT '抄表ID',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `water_type_code` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用水类型代码（其实就是费用类型）',
  `allot_text` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '提取值表述（仅供参考，如：80%）',
  `amount` int(255) NULL DEFAULT NULL COMMENT '分量水量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rd_task
-- ----------------------------
DROP TABLE IF EXISTS `rd_task`;
CREATE TABLE `rd_task`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `read_year` int(255) NULL DEFAULT NULL COMMENT '抄表年份',
  `read_month` int(255) NULL DEFAULT NULL COMMENT '抄表月份',
  `volumeId` int(255) NULL DEFAULT NULL COMMENT '表册',
  `emp_Id` int(255) NULL DEFAULT NULL COMMENT '责任抄表人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rd_volume
-- ----------------------------
DROP TABLE IF EXISTS `rd_volume`;
CREATE TABLE `rd_volume`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `volume_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '表册名称',
  `area_id` int(11) NULL DEFAULT NULL COMMENT '所属辖区ID',
  `order_Index` int(255) NULL DEFAULT NULL COMMENT '排列顺序',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rd_year_month
-- ----------------------------
DROP TABLE IF EXISTS `rd_year_month`;
CREATE TABLE `rd_year_month`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `read_year` int(255) NULL DEFAULT NULL COMMENT '抄表年份',
  `read_month` int(255) NULL DEFAULT NULL COMMENT '抄表月份',
  `Is_current` bit(1) NULL DEFAULT NULL COMMENT '当前',
  `Init_emp_id` int(11) NULL DEFAULT NULL COMMENT '初始化操作人',
  `Init_date` datetime(0) NULL DEFAULT NULL COMMENT '初始化时间',
  `end_date` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sy_area
-- ----------------------------
DROP TABLE IF EXISTS `sy_area`;
CREATE TABLE `sy_area`  (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '抄表辖区名称',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_area
-- ----------------------------
INSERT INTO `sy_area` VALUES (1, '雨花区', '哈哈', b'0');

-- ----------------------------
-- Table structure for sy_cost_type
-- ----------------------------
DROP TABLE IF EXISTS `sy_cost_type`;
CREATE TABLE `sy_cost_type`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `kind` int(255) NULL DEFAULT NULL COMMENT '类型 （0用水类型 1附加费）',
  `code` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '编码 （用水类型2位数，附加费3位数）',
  `cost_type_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '费用类型名称（根据不同情况，建议分别为该字段取别名为：用水类型名称WaterTypeName、附加费类型名称SurchargeName）',
  `full_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '费用类型全称（主要用于附加费）',
  `price` decimal(9, 2) NULL DEFAULT NULL COMMENT '单价（元）',
  `surcharge_text` varchar(800) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '附加费征收范围说明文字（缓存，仅有参考意义）',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sy_dept
-- ----------------------------
DROP TABLE IF EXISTS `sy_dept`;
CREATE TABLE `sy_dept`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `disabled` int(11) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sy_dept
-- ----------------------------
INSERT INTO `sy_dept` VALUES (1, '经理部', '总经理办公室', 0);
INSERT INTO `sy_dept` VALUES (2, '生技室', '生产技术部', 0);
INSERT INTO `sy_dept` VALUES (3, '财务室', '', 0);
INSERT INTO `sy_dept` VALUES (4, '收费室', '营业厅收费室', 0);
INSERT INTO `sy_dept` VALUES (5, '抄表班', NULL, 0);
INSERT INTO `sy_dept` VALUES (6, '稽查队', NULL, 0);
INSERT INTO `sy_dept` VALUES (7, '安装队', NULL, 0);

-- ----------------------------
-- Table structure for sy_em_parea_power
-- ----------------------------
DROP TABLE IF EXISTS `sy_em_parea_power`;
CREATE TABLE `sy_em_parea_power`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '员工ID',
  `area_id` int(11) NULL DEFAULT NULL COMMENT '抄表辖区ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sy_emp
-- ----------------------------
DROP TABLE IF EXISTS `sy_emp`;
CREATE TABLE `sy_emp`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `emp_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工号',
  `pwd` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码 （MD5加密）',
  `dept_id` int(11) NULL DEFAULT NULL COMMENT '部门ID',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sy_emp
-- ----------------------------
INSERT INTO `sy_emp` VALUES (1, '管理员', 'admin', '123', 1, '这是管理员的账号', b'1');
INSERT INTO `sy_emp` VALUES (2, '第二个管理员', 'adger', '202cb962ac59075b964b07152d234b70', 1, '这是管理员的账号', b'1');

-- ----------------------------
-- Table structure for sy_emp_menu_power
-- ----------------------------
DROP TABLE IF EXISTS `sy_emp_menu_power`;
CREATE TABLE `sy_emp_menu_power`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '员工ID',
  `menu_id` int(11) NULL DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sy_menu
-- ----------------------------
DROP TABLE IF EXISTS `sy_menu`;
CREATE TABLE `sy_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `parent` int(255) NULL DEFAULT NULL COMMENT '菜单上级ID',
  `url` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单链接的URL',
  `on_click` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单点击时的js代码',
  `icon` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单图标对应的样式类',
  `order_Index` int(255) NULL DEFAULT NULL COMMENT '菜单排序号',
  `flow_id` int(11) NULL DEFAULT NULL COMMENT '此菜单项对应业扩流程中的流程ID',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sy_meter_type
-- ----------------------------
DROP TABLE IF EXISTS `sy_meter_type`;
CREATE TABLE `sy_meter_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meter_type_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '水表型号名称',
  `aperture` int(255) NULL DEFAULT NULL COMMENT '口径',
  `mavvalue` int(255) NULL DEFAULT NULL COMMENT '最大表码值（吨。此种水表的默认最大表码值）',
  `minvalue` int(255) NULL DEFAULT NULL COMMENT '下限设置（吨。仅供参考，不做实际用途）',
  `life` int(255) NULL DEFAULT NULL COMMENT '周检年限（月）',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sy_surcharge
-- ----------------------------
DROP TABLE IF EXISTS `sy_surcharge`;
CREATE TABLE `sy_surcharge`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `surcharge_id` int(11) NULL DEFAULT NULL COMMENT '附加费ID（其实就是费用类型ID）',
  `water_type_id` int(11) NULL DEFAULT NULL COMMENT '用水类型ID（其实就是费用类型ID）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for us_formula
-- ----------------------------
DROP TABLE IF EXISTS `us_formula`;
CREATE TABLE `us_formula`  (
  `id` int(11) NOT NULL,
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `water_type_code` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用水类型代码（其实就是费用类型代码）',
  `allot_text` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '提取值表述（仅供参考，如：80%）',
  `allot_type` int(255) NULL DEFAULT NULL COMMENT '提取方式（0提量 1提比 2取剩余）',
  `allot_value` int(255) NULL DEFAULT NULL COMMENT '提取值（提量时表示水量，提比时表示百分比，取剩余时此字段无用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for us_meter
-- ----------------------------
DROP TABLE IF EXISTS `us_meter`;
CREATE TABLE `us_meter`  (
  `meter_no` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '水表编号（14位，规则：M+10位用户编码+杠+2位流水号。如：M0100000987-02，表示用户0100000987的第2块水表，此用户换过一次表。）',
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属用户',
  `meter_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '表身码',
  `meter_type_id` int(11) NULL DEFAULT NULL COMMENT '水表类型',
  `max_value` int(255) NOT NULL COMMENT '最大表码值',
  `start_value` int(255) NULL DEFAULT NULL COMMENT '起始底码（仅供参考）',
  `setup_date` datetime(0) NULL DEFAULT NULL COMMENT '装表日期',
  `factory` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '水表厂家',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`meter_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for us_sms
-- ----------------------------
DROP TABLE IF EXISTS `us_sms`;
CREATE TABLE `us_sms`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `send_time` datetime(0) NULL DEFAULT NULL COMMENT '发送时间',
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '操作人',
  `message` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发送内容',
  `type` int(255) NULL DEFAULT NULL COMMENT '发送类型（0给所有用户发 1只给欠费用户发）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for us_user
-- ----------------------------
DROP TABLE IF EXISTS `us_user`;
CREATE TABLE `us_user`  (
  `user_no` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户编码（规则：共10位，前2位表示辖区，后8位是全局流水号）',
  `user_name` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户姓名（最多40个汉字）',
  `abc` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简码',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  `address` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系地址（即用水地址）',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `sms_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '短信电话',
  `area_id` int(11) NULL DEFAULT NULL COMMENT '所属辖区',
  `user_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户类型（公户、私户）',
  `pay_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '收款方式（坐收、走收、银行代扣）',
  `bank_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '开户银行',
  `bank_num` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '银行账号',
  `formula` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '提比提量值',
  `user_money` decimal(18, 2) NULL DEFAULT NULL COMMENT '用户金额（正数是预缴费余额、负数是欠费金额）',
  `meter_id` int(11) NULL DEFAULT NULL COMMENT '水表ID',
  `doc_num` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '档案编号',
  `pwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码（MD5加密。暂时无用，为将来的移动互联网查询预留的字段）',
  `contract_num` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '合同编号（指供水协议的合同编号）',
  `contract_date` datetime(0) NULL DEFAULT NULL COMMENT '合同签订日期',
  `volume_id` int(11) NULL DEFAULT NULL COMMENT '所属表册ID',
  `volume_orderIndex` int(11) NULL DEFAULT NULL COMMENT '在表册中的序号',
  `disabled` bit(1) NULL DEFAULT NULL COMMENT '禁用 （0可使用 1已禁用）',
  PRIMARY KEY (`user_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
