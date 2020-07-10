CREATE DATABASE IF NOT EXISTS internship;
CREATE  TABLE IF NOT EXISTS `internship`.`company` (
  `company_id` varchar(36) not null ,
  `company_name` VARCHAR(45) ,
  `comapany_registration_number` int ,
  `no_of_appliances` int ,
  PRIMARY KEY (`company_id`) )
ENGINE = InnoDB;
CREATE  TABLE IF NOT EXISTS `internship`.`appliance` (
  `appliance_id` varchar(36) not null ,
  `appliance_name` VARCHAR(45) ,
  `appliance_type` varchar(45) ,
  PRIMARY KEY (`appliance_id`) )
ENGINE = InnoDB;
CREATE  TABLE IF NOT EXISTS `internship`.`appliance_company` (
  `appliance_company_id` varchar(36) not null ,
  `stock` int ,
  `appliance_id` varchar(36) ,
  `company_id` varchar (36),
  PRIMARY KEY (`appliance_company_id`),
  foreign key(`appliance_id`) references `appliance`(`appliance_id`),
  foreign key(`company_id`) references `company`(`company_id`))
  ENGINE = InnoDB;
insert into company values ('abc123', 'RK Electronics','1235','2' );
select * from company;
insert into appliance values('123efg' , 'fan', 'home appliance');
select * from appliance;
insert into appliance_company value ('asdf1234', 23, '123efg', 'abc123');
select * from appliance_company;
select c.company_name as 'Company name', a.appliance_name as 'Appliance name', ar.stock as'Stock' from company as c,appliance as a, appliance_company as ar where ((a.appliance_id =ar.appliance_id)and(c.company_id=ar.company_id));
update appliance_company set stock =32 where (appliance_id='123efg' and company_id='abc123');


