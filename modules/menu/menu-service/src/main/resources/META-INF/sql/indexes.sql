create index IX_8D65E8BD on Menu_Drink (name[$COLUMN_LENGTH:75$]);
create index IX_A5EDA07B on Menu_Drink (price);
create index IX_B38BB076 on Menu_Drink (uuid_[$COLUMN_LENGTH:75$]);

create index IX_1C969043 on Menu_Food (name[$COLUMN_LENGTH:75$]);
create index IX_FCD1E9B5 on Menu_Food (price);
create index IX_A6FF9B0 on Menu_Food (uuid_[$COLUMN_LENGTH:75$]);