create table PS_Client (
	uuid_ VARCHAR(75) null,
	clientId LONG not null primary key,
	origin VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	lastName VARCHAR(75) null,
	documentType INTEGER,
	documentNumber VARCHAR(75) null
);