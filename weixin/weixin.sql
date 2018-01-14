/*
Navicat MySQL Data Transfer

Source Server         : 111
Source Server Version : 50530
Source Host           : 192.168.17.215:3306
Source Database       : weixin

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2017-09-07 18:47:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(50) DEFAULT NULL,
  `saleDate` date DEFAULT NULL,
  `costPrice` decimal(10,0) DEFAULT NULL,
  `totalPrice` decimal(10,0) DEFAULT NULL,
  `totalNumber` decimal(11,0) DEFAULT NULL,
  `client_id` bigint(20) DEFAULT NULL,
  `comment` varchar(50) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES ('1', '123456', '2017-09-01', null, null, null, '2', null, '待发货');
INSERT INTO `bill` VALUES ('2', '963245', '2017-09-02', null, null, null, '3', null, '待发货');
INSERT INTO `bill` VALUES ('3', '9962', '2017-08-30', null, null, null, '3', null, '已发货');
INSERT INTO `bill` VALUES ('4', '23232', '2017-09-07', '0', '784', '6', '3', null, '待发货');
INSERT INTO `bill` VALUES ('5', '4353', '2017-09-06', '0', '1486', '9', '9', null, '待付款');
INSERT INTO `bill` VALUES ('6', '345345', '2017-09-07', '0', '400', '3', '3', null, '待发货');
INSERT INTO `bill` VALUES ('7', '6546', '2017-09-07', '0', '234', '2', '11', null, '待发货');
INSERT INTO `bill` VALUES ('8', '5645634', '2017-09-07', '0', '385', '2', '11', null, '待发货');
INSERT INTO `bill` VALUES ('9', '234234', '2017-09-07', '0', '68', '1', '11', null, '待发货');
INSERT INTO `bill` VALUES ('10', null, '2017-09-07', '0', '1071', '8', '11', null, '待发货');
INSERT INTO `bill` VALUES ('11', null, '2017-09-07', '0', '3374', '40', '12', null, '待付款');
INSERT INTO `bill` VALUES ('12', null, '2017-09-07', '0', '68', '1', '11', null, '待发货');
INSERT INTO `bill` VALUES ('13', null, '2017-09-07', '0', '294', '3', '11', null, '待付款');

-- ----------------------------
-- Table structure for billitem
-- ----------------------------
DROP TABLE IF EXISTS `billitem`;
CREATE TABLE `billitem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bill_id` bigint(20) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `number` decimal(11,0) DEFAULT NULL,
  `smallAccount` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of billitem
-- ----------------------------
INSERT INTO `billitem` VALUES ('1', '1', '1', '1', '199');
INSERT INTO `billitem` VALUES ('2', '2', '1', '2', '332');
INSERT INTO `billitem` VALUES ('6', '4', '1', '2', '332');
INSERT INTO `billitem` VALUES ('7', '4', '2', '2', '136');
INSERT INTO `billitem` VALUES ('8', '5', '1', '1', '166');
INSERT INTO `billitem` VALUES ('9', '5', '2', '2', '136');
INSERT INTO `billitem` VALUES ('10', '5', '3', '3', '474');
INSERT INTO `billitem` VALUES ('11', '5', '4', '3', '657');
INSERT INTO `billitem` VALUES ('12', '5', '6', '1', '266');
INSERT INTO `billitem` VALUES ('14', '4', '3', '2', '316');
INSERT INTO `billitem` VALUES ('15', '6', '1', '2', '332');
INSERT INTO `billitem` VALUES ('16', '7', '2', '1', '68');
INSERT INTO `billitem` VALUES ('17', '7', '1', '1', '166');
INSERT INTO `billitem` VALUES ('18', '6', '2', '1', '68');
INSERT INTO `billitem` VALUES ('19', '8', '1', '1', '166');
INSERT INTO `billitem` VALUES ('20', '8', '4', '1', '219');
INSERT INTO `billitem` VALUES ('21', '9', '2', '1', '68');
INSERT INTO `billitem` VALUES ('22', '10', '2', '3', '204');
INSERT INTO `billitem` VALUES ('23', '10', '4', '1', '219');
INSERT INTO `billitem` VALUES ('24', '10', '8', '2', '332');
INSERT INTO `billitem` VALUES ('25', '11', '2', '33', '2244');
INSERT INTO `billitem` VALUES ('26', '11', '8', '3', '498');
INSERT INTO `billitem` VALUES ('27', '10', '3', '2', '316');
INSERT INTO `billitem` VALUES ('28', '5', '7', '3', '498');
INSERT INTO `billitem` VALUES ('29', '11', '3', '4', '632');
INSERT INTO `billitem` VALUES ('30', '12', '2', '1', '68');
INSERT INTO `billitem` VALUES ('31', '13', '2', '2', '136');
INSERT INTO `billitem` VALUES ('32', '13', '3', '1', '158');

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `openId` varchar(50) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `concernTime` date DEFAULT NULL,
  `cancelConcernTime` date DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `gift` varchar(20) DEFAULT NULL,
  `url` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES ('8', '巴浪鱼', '广东广州', 'ooPcXwr7Ojdpq-kAo2m7CEpxefOk', null, '2017-09-06', null, '1', null, null);
INSERT INTO `client` VALUES ('9', '小夕', '湖北黄冈', 'oP_mZwhWlVaMeveZ_KTt9D2MG97Q', null, '2017-09-07', '2017-09-07', '1', null, null);
INSERT INTO `client` VALUES ('10', '不一', '上海', 'oP_mZwrozHGlkf-DZn5LaQdaX_ck', null, '2017-09-06', null, '1', null, null);
INSERT INTO `client` VALUES ('11', '贝加尔的湖', '广东广州天河也认同与', 'oP_mZwqh4l5fAt-6QbjNZlcS5_2Y', '156358', '2017-09-07', null, '1', null, null);
INSERT INTO `client` VALUES ('12', '锥', '广东广州', 'oP_mZwkNAiT74BXd_YSSKu3u2QnA', null, '2017-09-07', null, '1', null, null);

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `thumb_media_id` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `digest` varchar(255) DEFAULT NULL,
  `show_cover_pic` tinyint(1) DEFAULT NULL,
  `content` text,
  `content_source_url` varchar(255) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `salePrice` decimal(10,0) DEFAULT NULL,
  `mediaId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material
-- ----------------------------
INSERT INTO `material` VALUES ('3', '今日特价', 'aHnZ8pDnLaUlDRe1ldR4Y-fU1LXlyCntiU_qrx_Xldw', '小芯', '中国式浪漫 心点芯蛋糕', '0', '<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>今日特价</title>\n    <style type=\"text/css\">\n\n        .panel-fit, .panel-fit body {\n            border: 0 none;\n            height: 100%;\n            margin: 0;\n            overflow: hidden;\n            padding: 0;\n        }\n\n        .panel-noscroll {\n            overflow: hidden;\n        }\n\n        .rich_media {\n            position: relative;\n        }\n\n        .rich_media {\n            margin-left: auto;\n            margin-right: auto;\n            width: 600px;\n        }\n\n        .rich_media {\n            position: relative;\n        }\n\n        .rich_media {\n            margin-left: auto;\n            margin-right: auto;\n            width: 600px;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .not_in_mm .rich_media_inner {\n            position: relative;\n        }\n\n        .rich_media_inner {\n            background-color: #fff;\n            padding-bottom: 100px;\n        }\n\n        .rich_media_inner {\n            padding: 20px;\n        }\n\n        .rich_media_inner {\n            background-color: #fff;\n            padding-bottom: 100px;\n        }\n\n        .rich_media_inner {\n            padding: 20px;\n        }\n\n        .rich_media_inner {\n            font-size: 16px;\n            hyphens: auto;\n            overflow-wrap: break-word;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        body.rich_media_empty_extra .rich_media_area_primary::before {\n            display: none;\n        }\n\n        .rich_media_area_primary::before {\n            border-top: 1px solid #e5e5e5;\n            bottom: -2px;\n            content: \" \";\n            height: 1px;\n            left: 0;\n            position: absolute;\n            top: auto;\n            transform: scaleY(0.5);\n            transform-origin: 0 0 0;\n            width: 100%;\n        }\n\n        .rich_media_area_primary {\n            background-color: #fff;\n            padding: 20px 15px 15px;\n            position: relative;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .not_in_mm .rich_media_meta_list {\n            position: relative;\n            z-index: 1;\n        }\n\n        .rich_media_meta_list {\n            font-size: 0;\n            line-height: 20px;\n            margin-bottom: 18px;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .rich_media_meta {\n            max-width: none;\n        }\n\n        .meta_original_tag {\n            border: 1px solid #9e9e9e;\n            border-radius: 20% / 50%;\n            color: #8c8c8c;\n            display: inline-block;\n            font-size: 15px;\n            line-height: 1.1;\n            padding: 1px 0.5em;\n            vertical-align: middle;\n        }\n\n        .rich_media_meta {\n            display: inline-block;\n            font-size: 16px;\n            margin-bottom: 10px;\n            margin-right: 8px;\n            vertical-align: middle;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .rich_media_meta_list em {\n            font-style: normal;\n        }\n\n        .rich_media_meta {\n            max-width: none;\n        }\n\n        .rich_media_meta_text {\n            color: #8c8c8c;\n        }\n\n        .rich_media_meta {\n            display: inline-block;\n            font-size: 16px;\n            margin-bottom: 10px;\n            margin-right: 8px;\n            vertical-align: middle;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n\n        .panel-fit, .panel-fit body {\n            border: 0 none;\n            height: 100%;\n            margin: 0;\n            overflow: hidden;\n            padding: 0;\n        }\n\n        .panel-noscroll {\n            overflow: hidden;\n        }\n\n        .not_in_mm a.rich_media_meta_nickname {\n            display: none;\n        }\n\n        a.rich_media_meta_nickname {\n            display: inline-block !important;\n        }\n\n        .rich_media_meta {\n            max-width: none;\n        }\n\n        .rich_media_meta {\n            display: inline-block;\n            font-size: 16px;\n            margin-bottom: 10px;\n            margin-right: 8px;\n            vertical-align: middle;\n        }\n\n        a {\n            color: #607fa6;\n            text-decoration: none;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n\n        .panel-fit, .panel-fit body {\n            border: 0 none;\n            height: 100%;\n            margin: 0;\n            overflow: hidden;\n            padding: 0;\n        }\n\n        .panel-noscroll {\n            overflow: hidden;\n        }\n\n        .not_in_mm .rich_media_content {\n            position: relative;\n        }\n\n        .rich_media_content {\n            min-height: 350px;\n        }\n\n        .rich_media_content {\n            color: #3e3e3e;\n            overflow: hidden;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n\n        element.style {\n            height: auto !important;\n            visibility: visible !important;\n            width: auto !important;\n        }\n\n        .rich_media_content * {\n            box-sizing: border-box !important;\n            max-width: 100% !important;\n            overflow-wrap: break-word !important;\n        }\n\n        img {\n            height: auto !important;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n</head>\n<body>\n<div class=\"rich_media_inner\">\n    <div id=\"js_article\" class=\"rich_media\">\n        <div id=\"page-content\" class=\"rich_media_area_primary\">\n            <div id=\"img-content\">\n                <h2 class=\"rich_media_title\" id=\"activity-name\">\n                    今日特惠：新品上式,免费试吃,特价多多,优惠多多！</h2>\n            </div>\n        </div>\n        <div id=\"meta_content\" class=\"rich_media_meta_list\">\n            <span id=\"copyright_logo\" class=\"rich_media_meta meta_original_tag\"></span>\n            <em id=\"post-date\" class=\"rich_media_meta rich_media_meta_text\">2017-09-05</em>\n            <em class=\"rich_media_meta rich_media_meta_text\"></em>\n            <a id=\"post-user\" class=\"rich_media_meta rich_media_meta_link rich_media_meta_nickname\" href=\"##\"></a>\n        </div>\n        <div id=\"js_content\" class=\"rich_media_content \">\n            <p>\n                <a href=\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx97e19ae7635f583f&scope=snsapi_base&response_type=code&redirect_uri=http%3A%2F%2Flets.cake.pm%2Findex.html&state=cakeRolls#wechat_redirect\"\n                   target=\"_blank\"></a>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(255, 172, 170); font-size: 18px; letter-spacing: 2px;\">\n                   <strong>今日特价</strong>\n                </span>\n            </p>\n            <p style=\"text-align: center; margin-top: 10px; line-height: 1.75em;\">\n                <strong style=\"font-size: 16px; letter-spacing: 2px;\">\n                    <span style=\"color: rgb(54, 54, 54);\">| 拿破仑&红丝绒 |</span>\n                </strong>\n                <br>\n            </p>\n            <p style=\"text-align: center; line-height: 1.75em;\">\n                <span style=\"font-size: 12px; letter-spacing: normal;\">\n                  <strong>\n                     <span style=\"font-size: 12px; color: rgb(54, 54, 54);\">Mille-Feuille & Red Velvet Cake</span>\n                  </strong>\n                </span>\n            </p>\n            <p style=\"text-align: center; line-height: 1.75em;\">\n                 <span style=\"font-size: 12px; letter-spacing: normal;\">\n                  <strong>\n                     <span style=\"font-size: 12px; color: rgb(54, 54, 54);\"></span>\n                  </strong>\n               </span>\n            </p>\n            <section data-role=\"outer\" label=\"Powered by 135editor.com\"\n                     style=\"white-space: normal; max-width: 100%; background-color: rgb(255, 255, 255); text-size-adjust: auto; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                <p style=\"font-size: 16px; color: rgb(62, 62, 62); max-width: 100%; min-height: 1em; text-align: center; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                    <br>\n                </p>\n                <p style=\"font-size: 16px; color: rgb(62, 62, 62); max-width: 100%; min-height: 1em; text-align: center; line-height: 1.75em; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                    <span style=\"font-size: 14px; color: rgb(54, 54, 54);\">▼</span>\n                </p>\n            </section>\n            <p style=\"margin-top: 15px; margin-bottom: 15px; white-space: normal; text-align: center; line-height: 1.75em;\">\n              <span style=\"color: rgb(54, 54, 54);\">\n                <strong>\n                   <span style=\"font-size: 14px; letter-spacing: 2px;\">\n                        正宗的\n                        <span style=\"background-color: rgb(214, 168, 65); color: rgb(255, 255, 255);\">可洛尼 Clonee</span>\n                        </span>\n                       </strong>\n                   </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n            <span style=\"color: rgb(54, 54, 54);\">\n             <span style=\"font-size: 14px; letter-spacing: 2px;\">——新鲜现烤、层层酥脆的黄油酥皮</span>\n            </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n               <span style=\"color: rgb(54, 54, 54);\">\n               <span style=\"font-size: 14px; letter-spacing: 2px;\">香甜顺滑的手熬卡仕达酱</span>\n                </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54);\">\n                <span style=\"font-size: 14px; letter-spacing: 2px;\">\n                  <br>\n                </span>\n               </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54);\">\n                <span style=\"font-size: 14px; letter-spacing: 2px;\">即使不爱甜食的ni</span>\n                 </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n               <span style=\"color: rgb(54, 54, 54);\">\n               <span style=\"font-size: 14px; letter-spacing: 2px;\">也会难忘这一份入口即化的感觉</span>\n              </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 2em;\">\n                <br>\n            </p>\n            <p style=\"margin-bottom: 15px; margin-top: 15px;\" align=\"center\">\n                <a href=\"\"\n                   target=\"_blank\">\n                    <img class=\" __bg_gif\" data-type=\"gif\"\n                         data-src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SV8wUKDibYZCYPLPSRESyiafwicAZfLfXYErvUXPda6yLvOsgNgBDiczibWic0I49lw17YgiadyF7tNzBD0A/0\"\n                         data-ratio=\"0.17708333333333334\" data-w=\"960\"\n                         style=\"width: auto ! important; height: auto ! important; visibility: visible ! important;\"\n                         src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SV8wUKDibYZCYPLPSRESyiafwicAZfLfXYErvUXPda6yLvOsgNgBDiczibWic0I49lw17YgiadyF7tNzBD0A/0\"\n                         data-order=\"0\" data-fail=\"0\">\n                </a>\n            </p>\n            <p style=\"margin-bottom: 15px; margin-top: 15px;\">\n                <br>\n            </p>\n            <section data-role=\"outer\" label=\"Powered by 135editor.com\"\n                     style=\"white-space: normal; max-width: 100%; background-color: rgb(255, 255, 255); text-size-adjust: auto; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                <section class=\"\" data-tools=\"135编辑器\" data-id=\"86362\"\n                         style=\"max-width: 100%; box-sizing: border-box; border-width: 0px; border-style: none; border-color: initial; word-wrap: break-word !important;\">\n                    <section\n                            style=\"margin-left: 5px; padding: 15px 10px; max-width: 100%; box-sizing: border-box; border-width: 2px; border-style: solid; border-color: rgb(62, 62, 64); border-radius: 4px; word-wrap: break-word !important;\">\n                        <section class=\"\" data-style=\"clear:none;font-size:14px;\"\n                                 style=\"max-width: 100%; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                            <p style=\"text-align: center;\">\n                                <br>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: 2em;\">\n                                <a href=\"http://zhou.natapp1.cc/product_index.do\"\n                                   target=\"_blank\">\n            <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">\n            <img class=\"\" data-s=\"300,640\" data-type=\"jpeg\"\n                 data-src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SV8wUKDibYZCYPLPSRESyiafwg9hl7X57YKBjSHK6MRQaQo7hH2CUSFG7qOC4qRmjmAZumE5gmtY0Mg/0\"\n                 data-ratio=\"0.81484375\" data-w=\"1280\"\n                 style=\"font-family: 微软雅黑; text-align: center; white-space: normal; background-color: rgb(255, 255, 255); width: 250px ! important; height: auto ! important; visibility: visible ! important;\"\n                 _width=\"250px\"\n                 src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SV8wUKDibYZCYPLPSRESyiafwg9hl7X57YKBjSHK6MRQaQo7hH2CUSFG7qOC4qRmjmAZumE5gmtY0Mg/0\"\n                 data-fail=\"0\" width=\"250\" height=\"204\">\n            </span>\n                                </a>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: 2em;\">\n            <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">\n            <br>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"font-size: 15px;\">\n            <strong>\n            <span style=\"letter-spacing: 2px; color: rgb(191, 9, 43);\">今日特惠价：68元</span>\n            </strong>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n                                <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">（原价：68）</span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">\n            <br>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">\n            <br>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">\n            <br>\n            </span>\n                            </p>\n                        </section>\n                    </section>\n                </section>\n            </section>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">心点芯糕点</span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">新店开张</span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color:#363636\">\n                  <span style=\"font-size: 14px; letter-spacing: 2px;  color: rgb(191, 9, 43);\">全场八折</span>\n                </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">欢迎前来品尝</span>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n                <span style=\"background-color: rgb(254, 220, 79); color: rgb(255, 255, 255); font-size: 14px;\"> - END - </span>\n                <br>\n            </p>\n        </div>\n    </div>\n</div>\n</body>\n</html>', '', '1', null, 'aHnZ8pDnLaUlDRe1ldR4YwOzifSz80TsExCqGX3IFlI');
INSERT INTO `material` VALUES ('4', '今日特价', 'aHnZ8pDnLaUlDRe1ldR4Y5ysCRHvT0nF0UViHCRL-_w', '小芯', '中国式浪漫 心点芯蛋糕', '0', '<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title></title>\n    <style type=\"text/css\">\n\n        .panel-fit, .panel-fit body {\n            border: 0 none;\n            height: 100%;\n            margin: 0;\n            overflow: hidden;\n            padding: 0;\n        }\n\n        .panel-noscroll {\n            overflow: hidden;\n        }\n\n        .rich_media {\n            position: relative;\n        }\n\n        .rich_media {\n            margin-left: auto;\n            margin-right: auto;\n            width: 600px;\n        }\n\n        .rich_media {\n            position: relative;\n        }\n\n        .rich_media {\n            margin-left: auto;\n            margin-right: auto;\n            width: 600px;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .not_in_mm .rich_media_inner {\n            position: relative;\n        }\n\n        .rich_media_inner {\n            background-color: #fff;\n            padding-bottom: 100px;\n        }\n\n        .rich_media_inner {\n            padding: 20px;\n        }\n\n        .rich_media_inner {\n            background-color: #fff;\n            padding-bottom: 100px;\n        }\n\n        .rich_media_inner {\n            padding: 20px;\n        }\n\n        .rich_media_inner {\n            font-size: 16px;\n            hyphens: auto;\n            overflow-wrap: break-word;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        body.rich_media_empty_extra .rich_media_area_primary::before {\n            display: none;\n        }\n\n        .rich_media_area_primary::before {\n            border-top: 1px solid #e5e5e5;\n            bottom: -2px;\n            content: \" \";\n            height: 1px;\n            left: 0;\n            position: absolute;\n            top: auto;\n            transform: scaleY(0.5);\n            transform-origin: 0 0 0;\n            width: 100%;\n        }\n\n        .rich_media_area_primary {\n            background-color: #fff;\n            padding: 20px 15px 15px;\n            position: relative;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .not_in_mm .rich_media_meta_list {\n            position: relative;\n            z-index: 1;\n        }\n\n        .rich_media_meta_list {\n            font-size: 0;\n            line-height: 20px;\n            margin-bottom: 18px;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .rich_media_meta {\n            max-width: none;\n        }\n\n        .meta_original_tag {\n            border: 1px solid #9e9e9e;\n            border-radius: 20% / 50%;\n            color: #8c8c8c;\n            display: inline-block;\n            font-size: 15px;\n            line-height: 1.1;\n            padding: 1px 0.5em;\n            vertical-align: middle;\n        }\n\n        .rich_media_meta {\n            display: inline-block;\n            font-size: 16px;\n            margin-bottom: 10px;\n            margin-right: 8px;\n            vertical-align: middle;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n        .rich_media_meta_list em {\n            font-style: normal;\n        }\n\n        .rich_media_meta {\n            max-width: none;\n        }\n\n        .rich_media_meta_text {\n            color: #8c8c8c;\n        }\n\n        .rich_media_meta {\n            display: inline-block;\n            font-size: 16px;\n            margin-bottom: 10px;\n            margin-right: 8px;\n            vertical-align: middle;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n\n        .panel-fit, .panel-fit body {\n            border: 0 none;\n            height: 100%;\n            margin: 0;\n            overflow: hidden;\n            padding: 0;\n        }\n\n        .panel-noscroll {\n            overflow: hidden;\n        }\n\n        .not_in_mm a.rich_media_meta_nickname {\n            display: none;\n        }\n\n        a.rich_media_meta_nickname {\n            display: inline-block !important;\n        }\n\n        .rich_media_meta {\n            max-width: none;\n        }\n\n        .rich_media_meta {\n            display: inline-block;\n            font-size: 16px;\n            margin-bottom: 10px;\n            margin-right: 8px;\n            vertical-align: middle;\n        }\n\n        a {\n            color: #607fa6;\n            text-decoration: none;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n\n        .panel-fit, .panel-fit body {\n            border: 0 none;\n            height: 100%;\n            margin: 0;\n            overflow: hidden;\n            padding: 0;\n        }\n\n        .panel-noscroll {\n            overflow: hidden;\n        }\n\n        .not_in_mm .rich_media_content {\n            position: relative;\n        }\n\n        .rich_media_content {\n            min-height: 350px;\n        }\n\n        .rich_media_content {\n            color: #3e3e3e;\n            overflow: hidden;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n    <style type=\"text/css\">\n\n        element.style {\n            height: auto !important;\n            visibility: visible !important;\n            width: auto !important;\n        }\n\n        .rich_media_content * {\n            box-sizing: border-box !important;\n            max-width: 100% !important;\n            overflow-wrap: break-word !important;\n        }\n\n        img {\n            height: auto !important;\n        }\n\n        * {\n            margin: 0;\n            padding: 0;\n        }\n    </style>\n</head>\n<body>\n<div class=\"rich_media_inner\">\n    <div id=\"js_article\" class=\"rich_media\">\n        <div id=\"page-content\" class=\"rich_media_area_primary\">\n            <div id=\"img-content\">\n                <h2 class=\"rich_media_title\" id=\"activity-name\">\n                    今日特惠：新品上式,免费试吃,特价多多,优惠多多！</h2>\n            </div>\n        </div>\n        <div id=\"meta_content\" class=\"rich_media_meta_list\">\n            <span id=\"copyright_logo\" class=\"rich_media_meta meta_original_tag\"></span>\n            <em id=\"post-date\" class=\"rich_media_meta rich_media_meta_text\"></em>\n            <em class=\"rich_media_meta rich_media_meta_text\"></em>\n            <a id=\"post-user\" class=\"rich_media_meta rich_media_meta_link rich_media_meta_nickname\" href=\"##\"></a>\n        </div>\n        <div id=\"js_content\" class=\"rich_media_content \">\n            <p>\n                <a href=\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx97e19ae7635f583f&scope=snsapi_base&response_type=code&redirect_uri=http%3A%2F%2Flets.cake.pm%2Findex.html&state=cakeRolls#wechat_redirect\"\n                   target=\"_blank\"></a>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(255, 172, 170); font-size: 18px; letter-spacing: 2px;\">\n                   <strong>今日特价</strong>\n                </span>\n            </p>\n            <p style=\"text-align: center; margin-top: 10px; line-height: 1.75em;\">\n                <strong style=\"font-size: 16px; letter-spacing: 2px;\">\n                    <span style=\"color: rgb(54, 54, 54);\">| 拿破仑&红丝绒 |</span>\n                </strong>\n                <br>\n            </p>\n            <p style=\"text-align: center; line-height: 1.75em;\">\n                <span style=\"font-size: 12px; letter-spacing: normal;\">\n                  <strong>\n                     <span style=\"font-size: 12px; color: rgb(54, 54, 54);\">Mille-Feuille & Red Velvet Cake</span>\n                  </strong>\n                </span>\n            </p>\n            <p style=\"text-align: center; line-height: 1.75em;\">\n                 <span style=\"font-size: 12px; letter-spacing: normal;\">\n                  <strong>\n                     <span style=\"font-size: 12px; color: rgb(54, 54, 54);\"></span>\n                  </strong>\n               </span>\n            </p>\n            <section data-role=\"outer\" label=\"Powered by 135editor.com\"\n                     style=\"white-space: normal; max-width: 100%; background-color: rgb(255, 255, 255); text-size-adjust: auto; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                <p style=\"font-size: 16px; color: rgb(62, 62, 62); max-width: 100%; min-height: 1em; text-align: center; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                    <br>\n                </p>\n                <p style=\"font-size: 16px; color: rgb(62, 62, 62); max-width: 100%; min-height: 1em; text-align: center; line-height: 1.75em; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                    <span style=\"font-size: 14px; color: rgb(54, 54, 54);\">▼</span>\n                </p>\n            </section>\n            <p style=\"margin-top: 15px; margin-bottom: 15px; white-space: normal; text-align: center; line-height: 1.75em;\">\n              <span style=\"color: rgb(54, 54, 54);\">\n                <strong>\n                   <span style=\"font-size: 14px; letter-spacing: 2px;\">\n                        正宗的\n                        <span style=\"background-color: rgb(214, 168, 65); color: rgb(255, 255, 255);\">幸运星 Lucky</span>\n                        </span>\n                       </strong>\n                   </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n            <span style=\"color: rgb(54, 54, 54);\">\n             <span style=\"font-size: 14px; letter-spacing: 2px;\">——新鲜现烤、层层酥脆的黄油酥皮</span>\n            </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n               <span style=\"color: rgb(54, 54, 54);\">\n               <span style=\"font-size: 14px; letter-spacing: 2px;\">香甜顺滑的手熬卡仕达酱</span>\n                </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54);\">\n                <span style=\"font-size: 14px; letter-spacing: 2px;\">\n                  <br>\n                </span>\n               </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54);\">\n                <span style=\"font-size: 14px; letter-spacing: 2px;\">即使不爱甜食的ni</span>\n                 </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n               <span style=\"color: rgb(54, 54, 54);\">\n               <span style=\"font-size: 14px; letter-spacing: 2px;\">也会难忘这一份入口即化的感觉</span>\n              </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 2em;\">\n                <br>\n            </p>\n            <p style=\"margin-bottom: 15px; margin-top: 15px;\" align=\"center\">\n                <a href=\"\"\n                   target=\"_blank\">\n                    <img class=\" __bg_gif\" data-type=\"gif\"\n                         data-src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SWEic8gOtYiankbMRZwqb2DSUQCibbIB9jr6xvqHKibvTWfVfFFnJ00QAbtTYicFwXzmljIRJ5ia8xjgDOQ/0\"\n                         data-ratio=\"0.17708333333333334\" data-w=\"960\"\n                         style=\"width: auto ! important; height: auto ! important; visibility: visible ! important;\"\n                         src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SWEic8gOtYiankbMRZwqb2DSUQCibbIB9jr6xvqHKibvTWfVfFFnJ00QAbtTYicFwXzmljIRJ5ia8xjgDOQ/0\"\n                         data-order=\"0\" data-fail=\"0\">\n                </a>\n            </p>\n            <p style=\"margin-bottom: 15px; margin-top: 15px;\">\n                <br>\n            </p>\n            <section data-role=\"outer\" label=\"Powered by 135editor.com\"\n                     style=\"white-space: normal; max-width: 100%; background-color: rgb(255, 255, 255); text-size-adjust: auto; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                <section class=\"\" data-tools=\"135编辑器\" data-id=\"86362\"\n                         style=\"max-width: 100%; box-sizing: border-box; border-width: 0px; border-style: none; border-color: initial; word-wrap: break-word !important;\">\n                    <section\n                            style=\"margin-left: 5px; padding: 15px 10px; max-width: 100%; box-sizing: border-box; border-width: 2px; border-style: solid; border-color: rgb(62, 62, 64); border-radius: 4px; word-wrap: break-word !important;\">\n                        <section class=\"\" data-style=\"clear:none;font-size:14px;\"\n                                 style=\"max-width: 100%; box-sizing: border-box !important; word-wrap: break-word !important;\">\n                            <p style=\"text-align: center;\">\n                                <br>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: 2em;\">\n                                <a href=\"http://zhou.natapp1.cc/product_index.do\"\n                                   target=\"_blank\">\n            <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">\n            <img class=\"\" data-s=\"300,640\" data-type=\"jpeg\"\n                 data-src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SWEic8gOtYiankbMRZwqb2DSUtAGCAr1SC7TKGVtPdc4aBHicUqMclxNC1LuViaqdsXGGE7tiaibfiamEBbQ/0\"\n                 data-ratio=\"0.81484375\" data-w=\"1280\"\n                 style=\"font-family: 微软雅黑; text-align: center; white-space: normal; background-color: rgb(255, 255, 255); width: 250px ! important; height: auto ! important; visibility: visible ! important;\"\n                 _width=\"250px\"\n                 src=\"http://mmbiz.qpic.cn/mmbiz_jpg/Dp5Cn2U86SWEic8gOtYiankbMRZwqb2DSUtAGCAr1SC7TKGVtPdc4aBHicUqMclxNC1LuViaqdsXGGE7tiaibfiamEBbQ/0\"\n                 data-fail=\"0\" width=\"250\" height=\"204\">\n            </span>\n                                </a>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: 2em;\">\n            <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">\n            <br>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"font-size: 15px;\">\n            <strong>\n            <span style=\"letter-spacing: 2px; color: rgb(191, 9, 43);\">今日特惠价：90元</span>\n            </strong>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n                                <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">（原价：90）</span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">\n            <br>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">\n            <br>\n            </span>\n                            </p>\n                            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n            <span style=\"letter-spacing: 2px; font-size: 12px; color: rgb(178, 178, 178); text-decoration: underline;\">\n            <br>\n            </span>\n                            </p>\n                        </section>\n                    </section>\n                </section>\n            </section>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">心点芯糕点</span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">新店开张</span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color:#363636\">\n                  <span style=\"font-size: 14px; letter-spacing: 2px;  color: rgb(191, 9, 43);\">全场八折</span>\n                </span>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: 1.75em;\">\n                <span style=\"color: rgb(54, 54, 54); font-size: 14px; letter-spacing: 2px;\">欢迎前来品尝</span>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"text-align: center;\">\n                <br>\n            </p>\n            <p style=\"white-space: normal; text-align: center; line-height: normal;\">\n                <span style=\"background-color: rgb(254, 220, 79); color: rgb(255, 255, 255); font-size: 14px;\"> - END - </span>\n                <br>\n            </p>\n        </div>\n    </div>\n</div>\n</body>\n</html>', '', '6', null, 'aHnZ8pDnLaUlDRe1ldR4Y6vYW6kYzz6DYXYk-jGuJms');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `key` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `media_id` varchar(255) DEFAULT NULL,
  `state` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '在线服务', null, null, null, null, null, '1');
INSERT INTO `menu` VALUES ('2', '进入店铺', 'view', null, 'https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx0c5d7a2b65075463&redirect_uri=http://zmh.nat400.top/product_index.do&response_type=code&scope=snsapi_base#wechat_redirect', null, null, '1');
INSERT INTO `menu` VALUES ('3', '活动中心', null, null, null, null, null, '1');
INSERT INTO `menu` VALUES ('5', '关于我们', 'view', null, 'https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx0c5d7a2b65075463&redirect_uri=http://zmh.nat400.top/introduce.do&response_type=code&scope=snsapi_base#wechat_redirect', '1', null, '1');
INSERT INTO `menu` VALUES ('7', '转盘抽奖', 'view', null, 'https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx0c5d7a2b65075463&redirect_uri=http://zmh.nat400.top/lottery.do&response_type=code&scope=snsapi_base#wechat_redirect', '3', null, '1');
INSERT INTO `menu` VALUES ('8', '每日特价', 'media_id', null, '', '3', 'aHnZ8pDnLaUlDRe1ldR4Y5ysCRHvT0nF0UViHCRL-_w', '1');
INSERT INTO `menu` VALUES ('9', '小游戏', 'view', null, 'http://h5.lequ.com/index/play/id/22/', '3', null, '1');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `client_id` bigint(20) DEFAULT NULL,
  `receiveContent` varchar(600) DEFAULT NULL,
  `replyContent` varchar(600) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `inputTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '3', '图片', '亲，已帮你找到图片', 'text', '2017-09-05 18:09:48');
INSERT INTO `message` VALUES ('2', '3', '你好', 'http://zhou.nat100.top/offer.html', 'text', '2017-09-06 09:40:37');
INSERT INTO `message` VALUES ('3', '3', '你好', 'http://zhou.natapp1.cc/offer.html', 'text', '2017-09-06 10:04:05');
INSERT INTO `message` VALUES ('4', '8', '规律', '没有吧，这个好难', 'text', '2017-09-06 15:17:25');
INSERT INTO `message` VALUES ('5', '8', 'is关键是', '这些问题，我还不知道啦', 'text', '2017-09-06 15:18:12');
INSERT INTO `message` VALUES ('6', '9', '你的', 'http://zhou.natapp1.cc/offer.html', 'text', '2017-09-06 22:16:45');
INSERT INTO `message` VALUES ('7', '10', '哈喽', 'http://zhou.natapp1.cc/offer.html', 'text', '2017-09-06 22:30:33');
INSERT INTO `message` VALUES ('8', '10', '你好', '你好啊，我们来聊天吧', 'text', '2017-09-06 22:35:38');
INSERT INTO `message` VALUES ('9', '10', '聊什么呢', '什么都行！', 'text', '2017-09-06 22:35:44');
INSERT INTO `message` VALUES ('10', '9', '什么', '哦，就是知道了的意思', 'text', '2017-09-06 22:39:21');

-- ----------------------------
-- Table structure for openid_mediaid
-- ----------------------------
DROP TABLE IF EXISTS `openid_mediaid`;
CREATE TABLE `openid_mediaid` (
  `openId` varchar(255) DEFAULT NULL,
  `media_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of openid_mediaid
-- ----------------------------

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `salePrice` decimal(10,0) DEFAULT NULL,
  `costPrice` decimal(10,0) DEFAULT NULL,
  `imageURL` varchar(100) DEFAULT NULL,
  `introduce` varchar(100) DEFAULT NULL,
  `weight` decimal(10,1) DEFAULT NULL,
  `secondImg` varchar(100) DEFAULT NULL,
  `inHead` tinyint(1) DEFAULT NULL,
  `detailImg` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '可洛尼 Clonee', null, '1', '/static/image/11.jpg', '地道芝士与巧克力', '1.0', '/static/image/12.jpg', '1', '/static/image/scrolling1.jpg');
INSERT INTO `product` VALUES ('2', '在一起 星河版 Together', '68', '58', '/static/image/21.jpg', '柔香奶酪蛋糕冠军', '1.0', '/static/image/22.jpg', '0', null);
INSERT INTO `product` VALUES ('3', '\r\n纪念日 Anniversary\r\n', '158', '56', '/static/image/31.jpg', '浓巧克力酱，软芝士', '1.5', '/static/image/32.jpg', '0', null);
INSERT INTO `product` VALUES ('4', '红丝绒 Red velvet', '219', '88', '/static/image/41.jpg', '浓缩乳香，可可原香', '1.0', '/static/image/42.jpg', '1', '/static/image/scrolling2.jpg');
INSERT INTO `product` VALUES ('6', '幸运星 Lucky', null, '155', '/static/image/3dd97e26-b886-4d43-820c-86a0c48b022d.jpg', '覆盆子酱，醇巧克力', '2.0', '/static/image/5a5c5001-9fa4-4bd2-90ad-9b6431a4a5fd.jpg', '0', null);
INSERT INTO `product` VALUES ('7', '地中海 classical', '166', '67', '/static/image/fe9d4498-b1bf-4bfb-b70a-d814b133e693.jpg', '三款经典 一次享受', '1.5', '/static/image/310d35e8-99a5-4db3-bc6f-3becc0918879.jpg', '0', null);
INSERT INTO `product` VALUES ('8', ' D&C 轻奢礼盒', '166', '67', '/static/image/ac0f5eaa-7ff7-4932-937f-a87d908d1592.jpg', ' D&C 轻奢礼盒', '2.0', '/static/image/5fe47a68-be2d-4bab-931e-914dc13d50e9.jpg', '0', null);
INSERT INTO `product` VALUES ('9', ' 冰包 Insulation Bag', '156', '88', '/static/image/fcc67c79-be1e-488b-adc1-c0cde4432a4c.jpg', '集中握持 有效锁冷', '2.0', '/static/image/8222f9f0-c253-41c5-98d0-d6f6fa718de6.jpg', '0', null);

-- ----------------------------
-- Table structure for salechart
-- ----------------------------
DROP TABLE IF EXISTS `salechart`;
CREATE TABLE `salechart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sn` varchar(255) DEFAULT NULL,
  `number` decimal(11,0) DEFAULT NULL,
  `costPrice` decimal(10,0) DEFAULT NULL,
  `salePrice` decimal(10,0) DEFAULT NULL,
  `profit` decimal(10,0) DEFAULT NULL,
  `saleTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salechart
-- ----------------------------
INSERT INTO `salechart` VALUES ('1', '222', '3', '36', '60', '24', '2017-09-05 10:02:51');
INSERT INTO `salechart` VALUES ('2', '1', '4', '10', '50', '40', '2017-09-05 10:05:25');
INSERT INTO `salechart` VALUES ('3', null, '1', '0', '199', '199', '2017-09-06 16:47:21');
INSERT INTO `salechart` VALUES ('4', null, '1', '0', '166', '166', '2017-09-06 21:37:55');
INSERT INTO `salechart` VALUES ('5', null, '1', '0', '166', '166', '2017-09-07 09:21:49');
INSERT INTO `salechart` VALUES ('6', null, '1', '0', '68', '68', '2017-09-07 10:25:44');
INSERT INTO `salechart` VALUES ('7', null, '1', '0', '166', '166', '2017-09-07 15:45:55');
INSERT INTO `salechart` VALUES ('8', null, '1', '0', '68', '68', '2017-09-07 15:48:44');
INSERT INTO `salechart` VALUES ('9', null, '1', '0', '68', '68', '2017-09-07 16:24:58');
INSERT INTO `salechart` VALUES ('10', null, '8', '0', '544', '544', '2017-09-07 16:53:06');
INSERT INTO `salechart` VALUES ('11', null, '1', '0', '68', '68', '2017-09-07 17:27:40');
INSERT INTO `salechart` VALUES ('12', null, '1', '0', '68', '68', '2017-09-07 17:30:16');
