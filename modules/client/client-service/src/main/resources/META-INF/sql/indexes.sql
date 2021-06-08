create index IX_569F994E on PS_Client (documentType, documentNumber[$COLUMN_LENGTH:75$]);
create index IX_73DC17A1 on PS_Client (name[$COLUMN_LENGTH:75$], lastName[$COLUMN_LENGTH:75$]);
create index IX_5EBC4D67 on PS_Client (uuid_[$COLUMN_LENGTH:75$]);