use presly;

CREATE TABLE `picture` (
`id` int NOT NULL AUTO_INCREMENT,
`name` varchar(128) DEFAULT NULL,
`pictype` varchar(128) DEFAULT NULL,
`picture` blob DEFAULT NULL,
  PRIMARY KEY (`id`)
)