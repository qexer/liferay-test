create table FOO_Drink (
	uuid_ VARCHAR(75) null,
	drinkId LONG not null primary key,
	name VARCHAR(75) null,
	price INTEGER,
	createDate DATE null,
	modifiedDate DATE null
);

create table MenuCard_Drink (
	uuid_ VARCHAR(75) null,
	drinkId LONG not null primary key,
	name VARCHAR(75) null,
	price INTEGER,
	description VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);