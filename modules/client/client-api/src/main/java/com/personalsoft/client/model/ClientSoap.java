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

package com.personalsoft.client.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.personalsoft.client.service.http.ClientServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ClientSoap implements Serializable {

	public static ClientSoap toSoapModel(Client model) {
		ClientSoap soapModel = new ClientSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setClientId(model.getClientId());
		soapModel.setOrigin(model.getOrigin());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setLastName(model.getLastName());
		soapModel.setDocumentType(model.getDocumentType());
		soapModel.setDocumentNumber(model.getDocumentNumber());

		return soapModel;
	}

	public static ClientSoap[] toSoapModels(Client[] models) {
		ClientSoap[] soapModels = new ClientSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ClientSoap[][] toSoapModels(Client[][] models) {
		ClientSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ClientSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ClientSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ClientSoap[] toSoapModels(List<Client> models) {
		List<ClientSoap> soapModels = new ArrayList<ClientSoap>(models.size());

		for (Client model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ClientSoap[soapModels.size()]);
	}

	public ClientSoap() {
	}

	public long getPrimaryKey() {
		return _clientId;
	}

	public void setPrimaryKey(long pk) {
		setClientId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getClientId() {
		return _clientId;
	}

	public void setClientId(long clientId) {
		_clientId = clientId;
	}

	public String getOrigin() {
		return _origin;
	}

	public void setOrigin(String origin) {
		_origin = origin;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public int getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(int documentType) {
		_documentType = documentType;
	}

	public String getDocumentNumber() {
		return _documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		_documentNumber = documentNumber;
	}

	private String _uuid;
	private long _clientId;
	private String _origin;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _lastName;
	private int _documentType;
	private String _documentNumber;

}