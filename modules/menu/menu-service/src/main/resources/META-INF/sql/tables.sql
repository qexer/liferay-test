create table Menu_Drink (
	uuid_ VARCHAR(75) null,
	drinkId LONG not null primary key,
	name VARCHAR(75) null,
	price INTEGER,
	createDate DATE null,
	modifiedDate DATE null
);

create table Menu_Food (
	uuid_ VARCHAR(75) null,
	foodId LONG not null primary key,
	name VARCHAR(75) null,
	details VARCHAR(75) null,
	spicy BOOLEAN,
	price INTEGER,
	createDate DATE null,
	modifiedDate DATE null
);