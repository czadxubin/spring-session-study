CREATE DATABASE IF NOT EXISTS ssm_framwork DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
use ssm_framwork;
create Table user_info(
	id int primary key auto_increment,
	username varchar(50),
	password varchar(128),
	insert_time_for_his timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	update_time_for_his timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


