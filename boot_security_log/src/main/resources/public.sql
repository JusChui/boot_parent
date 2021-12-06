/*
 Navicat Premium Data Transfer

 Source Server         : myPg
 Source Server Type    : PostgreSQL
 Source Server Version : 90224
 Source Host           : 192.168.80.128:5432
 Source Catalog        : xh
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 90224
 File Encoding         : 65001

 Date: 06/12/2021 16:06:21
*/


-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS "public"."menu";
CREATE TABLE "public"."menu" (
  "id" varchar(36) COLLATE "pg_catalog"."default" NOT NULL,
  "menu_url" varchar(32) COLLATE "pg_catalog"."default",
  "create_time" timestamp(6),
  "update_time" timestamp(6),
  "delete_flag" char(2) COLLATE "pg_catalog"."default" DEFAULT 0,
  "menu_name" varchar(255) COLLATE "pg_catalog"."default",
  "menu_order" int4,
  "menu_level" int4
)
;
COMMENT ON COLUMN "public"."menu"."menu_url" IS '菜单路径';
COMMENT ON COLUMN "public"."menu"."menu_name" IS '菜单名称';
COMMENT ON COLUMN "public"."menu"."menu_order" IS '菜单排序';
COMMENT ON COLUMN "public"."menu"."menu_level" IS '菜单等级';

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO "public"."menu" VALUES ('00121', '/auth/getUserInfo', '2021-12-05 20:30:36', '2021-12-05 20:30:39', '00', '获取登录信息', NULL, NULL);
INSERT INTO "public"."menu" VALUES ('000', '/', '2021-11-28 18:46:40', '2021-11-28 18:46:44', '00', '主菜单', 1, 0);

-- ----------------------------
-- Table structure for menu_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."menu_role";
CREATE TABLE "public"."menu_role" (
  "id" varchar(36) COLLATE "pg_catalog"."default" NOT NULL,
  "menu_id" varchar(36) COLLATE "pg_catalog"."default",
  "role_id" varchar(36) COLLATE "pg_catalog"."default",
  "delete_flag" char(2) COLLATE "pg_catalog"."default" DEFAULT 0,
  "create_time" timestamp(6),
  "update_time" timestamp(6)
)
;

-- ----------------------------
-- Records of menu_role
-- ----------------------------
INSERT INTO "public"."menu_role" VALUES ('ehwrtjy', '000', '000', '00', NULL, NULL);
INSERT INTO "public"."menu_role" VALUES ('3145t', '000', '001', '00', NULL, NULL);
INSERT INTO "public"."menu_role" VALUES ('h45', '000', '002', '00', NULL, NULL);
INSERT INTO "public"."menu_role" VALUES ('htrje', '000', '003', '00', NULL, NULL);
INSERT INTO "public"."menu_role" VALUES ('rhe', '00121', '001', '00', NULL, NULL);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS "public"."role";
CREATE TABLE "public"."role" (
  "role_id" varchar(36) COLLATE "pg_catalog"."default" NOT NULL,
  "role_name" varchar(30) COLLATE "pg_catalog"."default",
  "role_name_zh" varchar(255) COLLATE "pg_catalog"."default",
  "create_time" timestamp(6),
  "update_time" timestamp(6),
  "delete_flag" char(2) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO "public"."role" VALUES ('001', 'ROLE_ADMIN', '管理员权限', NULL, NULL, '00');
INSERT INTO "public"."role" VALUES ('002', 'ROLE_USR', '普通用户', NULL, NULL, '00');
INSERT INTO "public"."role" VALUES ('003', 'ROLE_DBA', '数据库管理员', NULL, NULL, '00');
INSERT INTO "public"."role" VALUES ('000', 'ROLE_DEF', '匿名用户', NULL, NULL, '00');

-- ----------------------------
-- Table structure for usr_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."usr_info";
CREATE TABLE "public"."usr_info" (
  "user_id" varchar(36) COLLATE "pg_catalog"."default" NOT NULL,
  "user_name" varchar(50) COLLATE "pg_catalog"."default",
  "password" varchar(64) COLLATE "pg_catalog"."default",
  "enabled" char(1) COLLATE "pg_catalog"."default",
  "create_time" timestamp(0),
  "update_time" timestamp(0)
)
;
COMMENT ON COLUMN "public"."usr_info"."enabled" IS '是否可用：1/可用';

-- ----------------------------
-- Records of usr_info
-- ----------------------------
INSERT INTO "public"."usr_info" VALUES ('gwrhm', 'usr', '$2a$10$pfkba6VGiBJlWVRBR5IE3uVkgBNICTRnuy6Ew5wIpWQRwlZY1CpUa', '1', '2021-11-28 16:24:20', '2021-11-28 16:24:23');
INSERT INTO "public"."usr_info" VALUES ('reikety', 'dba', '$2a$10$pfkba6VGiBJlWVRBR5IE3uVkgBNICTRnuy6Ew5wIpWQRwlZY1CpUa', '1', '2021-11-28 16:24:35', '2021-11-28 16:24:38');
INSERT INTO "public"."usr_info" VALUES ('000grhw23', 'admin', '$2a$10$8vevDhOUhcW5qYELM62dfuXQBn6fTBpiAbkuTC2hXVg6VbEErlJ7y', '1', '2021-11-28 16:23:02', '2021-11-28 16:23:02');

-- ----------------------------
-- Table structure for usr_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."usr_role";
CREATE TABLE "public"."usr_role" (
  "id" varchar(36) COLLATE "pg_catalog"."default" NOT NULL,
  "usr_id" varchar(36) COLLATE "pg_catalog"."default",
  "role_id" varchar(36) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of usr_role
-- ----------------------------
INSERT INTO "public"."usr_role" VALUES ('0001', '000grhw23', '001');
INSERT INTO "public"."usr_role" VALUES ('34ytej', 'gwrhm', '002');
INSERT INTO "public"."usr_role" VALUES ('f544y', 'reikety', '003');

-- ----------------------------
-- Primary Key structure for table menu
-- ----------------------------
ALTER TABLE "public"."menu" ADD CONSTRAINT "menu_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table menu_role
-- ----------------------------
ALTER TABLE "public"."menu_role" ADD CONSTRAINT "menu_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table role
-- ----------------------------
ALTER TABLE "public"."role" ADD CONSTRAINT "role_pkey" PRIMARY KEY ("role_id");

-- ----------------------------
-- Primary Key structure for table usr_info
-- ----------------------------
ALTER TABLE "public"."usr_info" ADD CONSTRAINT "usr_info_pkey" PRIMARY KEY ("user_id");

-- ----------------------------
-- Primary Key structure for table usr_role
-- ----------------------------
ALTER TABLE "public"."usr_role" ADD CONSTRAINT "usr_role_pkey" PRIMARY KEY ("id");
