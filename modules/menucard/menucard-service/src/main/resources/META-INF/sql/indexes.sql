create index IX_1B75FA4 on FOO_Drink (name[$COLUMN_LENGTH:75$]);
create index IX_BBCB0674 on FOO_Drink (price);
create index IX_C969166F on FOO_Drink (uuid_[$COLUMN_LENGTH:75$]);

create index IX_20BBCC6D on MenuCard_Drink (name[$COLUMN_LENGTH:75$]);
create index IX_7D5432CB on MenuCard_Drink (price);
create index IX_275069A2 on MenuCard_Drink (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_27CAF0A4 on MenuCard_Drink (uuid_[$COLUMN_LENGTH:75$], groupId);