/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.personalsoft.client.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.personalsoft.client.model.Client;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Client in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ClientCacheModel implements CacheModel<Client>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ClientCacheModel)) {
			return false;
		}

		ClientCacheModel clientCacheModel = (ClientCacheModel)object;

		if (clientId == clientCacheModel.clientId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, clientId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", clientId=");
		sb.append(clientId);
		sb.append(", origin=");
		sb.append(origin);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", documentNumber=");
		sb.append(documentNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Client toEntityModel() {
		ClientImpl clientImpl = new ClientImpl();

		if (uuid == null) {
			clientImpl.setUuid("");
		}
		else {
			clientImpl.setUuid(uuid);
		}

		clientImpl.setClientId(clientId);

		if (origin == null) {
			clientImpl.setOrigin("");
		}
		else {
			clientImpl.setOrigin(origin);
		}

		if (createDate == Long.MIN_VALUE) {
			clientImpl.setCreateDate(null);
		}
		else {
			clientImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			clientImpl.setModifiedDate(null);
		}
		else {
			clientImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			clientImpl.setName("");
		}
		else {
			clientImpl.setName(name);
		}

		if (lastName == null) {
			clientImpl.setLastName("");
		}
		else {
			clientImpl.setLastName(lastName);
		}

		clientImpl.setDocumentType(documentType);

		if (documentNumber == null) {
			clientImpl.setDocumentNumber("");
		}
		else {
			clientImpl.setDocumentNumber(documentNumber);
		}

		clientImpl.resetOriginalValues();

		return clientImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		clientId = objectInput.readLong();
		origin = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		lastName = objectInput.readUTF();

		documentType = objectInput.readInt();
		documentNumber = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(clientId);

		if (origin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(origin);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeInt(documentType);

		if (documentNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentNumber);
		}
	}

	public String uuid;
	public long clientId;
	public String origin;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String lastName;
	public int documentType;
	public String documentNumber;

}