CREATE TABLE company(
   company_id INT NOT NULL ,
   company_name VARCHAR(100) NOT NULL,
   no_of_appliances int NOT NULL,
  PRIMARY KEY ( company_id )
);
CREATE TABLE appliance(
   appliance_id INT NOT NULL ,
   appliance_name VARCHAR(100) NOT NULL,
   appliances_type VARCHAR(40) NOT NULL,
  PRIMARY KEY ( appliance_id )
);
CREATE TABLE company_appliance(
   id INT NOT NULL ,
   stock int NOT NULL,
   company_id int not null,
  PRIMARY KEY ( id )
  );

alter table company_appliance 
add foreign key (company_id) references company (company_id); 
alter table company_appliance add appliance_id int not null;
alter table company_appliance 
add foreign key ( appliance_id) references appliance (appliance_id);
select * from company;
insert into company values( 1, 'ABC electronics', 3);
insert into company values( 4, 'JQ softwares', 2);
insert into company values( 2, ' ASD pvt ltd', 1);  
select * from appliance;
 insert into appliance values( 2, 'power bank', 'mobile');
 insert into appliance values( 5, 'fans', 'home');
 insert into appliance values( 1, 'car music system', 'vehicle');
 select * from company_appliance;
 insert into company_appliance values( 6, 150, 1, 2);
 insert into company_appliance values( 7, 80, 2, 5);
 insert into company_appliance values( 8, 240, 4, 1);
 select * from company_appliance where stock>100;

