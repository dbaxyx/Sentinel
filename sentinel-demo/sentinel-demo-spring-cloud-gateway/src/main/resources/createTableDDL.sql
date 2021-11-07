CREATE DATABASE `sentinel` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;



-- sentinel.`order` definition

CREATE TABLE `order` (
  `id` int(11) NOT NULL COMMENT '订单id',
  `goods_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `price` int(11) NOT NULL COMMENT '价格',
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- sentinel.order_record definition

CREATE TABLE `order_record` (
  `id` int(11) NOT NULL,
  `order_note` varchar(100) DEFAULT NULL COMMENT '订单备注',
  `order_logistic_id` varchar(100) DEFAULT NULL COMMENT '订单物流id',
  `order_id` int(11) NOT NULL COMMENT '订单id',
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




-- sentinel.`user` definition

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `user_name` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;