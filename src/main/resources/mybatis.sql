/*
 Date: 19/04/2019 14:42:41
*/

-- ----------------------------
-- Table structure for ym_dept
-- ----------------------------
DROP TABLE IF EXISTS `ym_dept`;
CREATE TABLE `ym_dept`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ym_employee
-- ----------------------------
DROP TABLE IF EXISTS `ym_employee`;
CREATE TABLE `ym_employee`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dept_id` int(11) NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Procedure structure for employeepage
-- ----------------------------
DROP PROCEDURE IF EXISTS `employeepage`;
delimiter ;;
CREATE PROCEDURE `employeepage`(pageindex int,pagesize int,out total int)
BEGIN
select count(*) into total from ym_employee;
PREPARE s1 FROM 'select * from ym_employee  ORDER BY id  LIMIT ?,?';
   SET @startRow = pagesize * (pageindex - 1);
   SET @pageSize1 = pagesize;
EXECUTE s1 USING @startRow,@pageSize1;
DEALLOCATE PREPARE s1;
	 

 END

