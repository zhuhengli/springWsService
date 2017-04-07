CREATE TABLE `tb_Dept` (
  `Id` bigint(20) NOT NULL,
  `DeptName` varchar(200) NOT NULL,
  `ParentId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_OssUser` (
  `UserId` bigint(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `DeptId` bigint(20) DEFAULT NULL,
  `UserName` varchar(20) NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;