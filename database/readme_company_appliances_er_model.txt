The company appliances real world problem consists of 3 entities:
1) company
	attributes are company_id(int as well as primary key) , company_name (varchar) and number_of_appliances manufactures(int).
2) appliance
	attributes are appliance_id(int as well as primary key) , appliance_name(varchar) and appliance_type (varchar)
3) consumer
	attribute are consumer_id(int as well as primary key) , consumer_name(varchar), consumer_gender (varchar), consumer_phone(int) and address (varchar)

relation between these entities:
1) company and appliances (manufacture)
	company manufactures appliances. Attributes of this are:
		manufacture_id(int as well as primary key), company_id and appliance_id (foreign keys) , stock(int), gaurantee_expire_date (date) and manufacture_date (date)
2) manufactured appliance and consumer (sell)
	consumer buys manufactured appliances. Attributes of thi are:
		sell_id(int as well as primary key), manufacture_id and consumer_id (foreign key), sell_date(date).
