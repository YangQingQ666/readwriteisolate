/*
Navicat MySQL Data Transfer

Source Server         : 47.96.152.111
Source Server Version : 50734
Source Host           : 47.96.152.111:3307
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50734
File Encoding         : 65001

Date: 2021-07-06 00:19:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '最后修改时间',
  `version` int(11) DEFAULT NULL,
  `deleted` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'kwhua222', '80', '123456@qq.com', null, '2021-07-05 11:34:29', '4', '1');
INSERT INTO `user` VALUES ('2', 'Jack', '20', 'test2@baomidou.com', null, null, '1', '1');
INSERT INTO `user` VALUES ('3', 'Tom', '28', 'test3@baomidou.com', null, null, '1', '1');
INSERT INTO `user` VALUES ('4', 'Sandy', '21', 'test4@baomidou.com', null, null, '1', '1');
INSERT INTO `user` VALUES ('5', 'Billie', '24', 'test5@baomidou.com', null, null, '1', '1');
INSERT INTO `user` VALUES ('1411878597148254209', 'jon', '30', '15263384@163.com', null, null, '1', '1');
INSERT INTO `user` VALUES ('1411880464351731713', 'smith', '31', '2423615474@qq.com', null, null, '1', '0');
INSERT INTO `user` VALUES ('1411881355834245121', 'smith', '30', '2423615474@qq.com', null, null, '1', '0');
INSERT INTO `user` VALUES ('1411882633486360578', 'smith', '30', '2423615474@qq.com', null, null, '1', '0');
INSERT INTO `user` VALUES ('1411882661378519042', 'smith', '30', '2423615474@qq.com', null, null, '1', '0');
INSERT INTO `user` VALUES ('1411883450557759489', 'smith', '30', '2423615474@qq.com', null, null, '1', '0');
INSERT INTO `user` VALUES ('1411883777566679042', 'smith', '30', '2423615474@qq.com', null, null, '1', '0');
INSERT INTO `user` VALUES ('1411883850362998785', 'smith', '30', '2423615474@qq.com', null, null, '1', '0');
INSERT INTO `user` VALUES ('1411883982571651073', 'smith', '30', '2423615474@qq.com', '2021-07-05 11:05:48', '2021-07-05 11:05:48', '1', '0');
INSERT INTO `user` VALUES ('1411884072593985537', 'smith11', '38', '242361547411@qq.com', '2021-07-05 11:06:09', '2021-07-05 11:07:08', '1', '0');
INSERT INTO `user` VALUES ('1411897860659572738', 'smith', '30', '2423615474@qq.com', '2021-07-05 12:00:56', '2021-07-05 12:00:56', '1', '0');
INSERT INTO `user` VALUES ('1411898118554763266', 'smith', '30', '2423615474@qq.com', '2021-07-05 12:01:58', '2021-07-05 12:01:58', '1', '0');
INSERT INTO `user` VALUES ('1411898681132539906', 'smith', '30', '2423615474@qq.com', '2021-07-05 12:04:12', '2021-07-05 12:04:12', '1', '0');
INSERT INTO `user` VALUES ('1411898870274703361', 'smith11', '38', '242361547411@qq.com', '2021-07-05 12:04:57', '2021-07-05 14:26:45', '1', '0');
INSERT INTO `user` VALUES ('1411945532066045954', 'miumiao', '102', '313459958@qq.com', '2021-07-05 15:10:22', '2021-07-05 15:10:22', '1', '0');
INSERT INTO `user` VALUES ('1411984351536553985', 'miumiao', '102', '313459958@qq.com', '2021-07-05 17:44:37', '2021-07-05 17:44:37', '1', '0');
INSERT INTO `user` VALUES ('1411987022163120129', 'miumiao', '102', '313459958@qq.com', '2021-07-05 17:55:14', '2021-07-05 17:55:14', '1', '0');
INSERT INTO `user` VALUES ('1411987026286120961', 'miumiao', '102', '313459958@qq.com', '2021-07-05 17:55:15', '2021-07-05 17:55:15', '1', '0');
INSERT INTO `user` VALUES ('1411987028823674881', 'miumiao', '102', '313459958@qq.com', '2021-07-05 17:55:16', '2021-07-05 17:55:16', '1', '0');
INSERT INTO `user` VALUES ('1411987031352840193', 'miumiao', '102', '313459958@qq.com', '2021-07-05 17:55:16', '2021-07-05 17:55:16', '1', '0');
