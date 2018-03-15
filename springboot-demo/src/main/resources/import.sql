
CREATE TABLE `tm_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(128) NOT NULL COMMENT '用户名',
  `realname` varchar(128) DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(64) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL COMMENT 'email',
  `jobuuid` varchar(64) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL COMMENT '部门',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `last_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` varchar(32) DEFAULT NULL COMMENT '状态 1:正常;0:删除',
  `phone` varchar(25) DEFAULT NULL COMMENT '联系方式',
  `home_page` varchar(128) DEFAULT NULL COMMENT '首页显示',
  `jobnumber` varchar(40) DEFAULT NULL,
  `group_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8

insert into `tm_user` (
`username`, `realname`, `password`, `salt`, `email`, `jobuuid`, `department_id`, `create_time`, `update_time`, `last_time`,
 `status`, `phone`, `home_page`, `jobnumber`, `group_id`
 )
values
('admin','admin','C1EE6E27D5D99E84487768FD33D9B3ED','1144F9E30644621D','admin@admin.com','d959b2a5cc5c402aabfc85931a3d8ad4',NULL,
'2017-07-27 11:45:14','2017-08-07 10:37:38',NULL,'1','','',NULL,'1');


