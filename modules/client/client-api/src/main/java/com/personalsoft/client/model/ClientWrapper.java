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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Client}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Client
 * @generated
 */
public class ClientWrapper
	extends BaseModelWrapper<Client> implements Client, ModelWrapper<Client> {

	public ClientWrapper(Client client) {
		super(client);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("clientId", getClientId());
		attributes.put("origin", getOrigin());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("lastName", getLastName());
		attributes.put("documentType", getDocumentType());
		attributes.put("documentNumber", getDocumentNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long clientId = (Long)attributes.get("clientId");

		if (clientId != null) {
			setClientId(clientId);
		}

		String origin = (String)attributes.get("origin");

		if (origin != null) {
			setOrigin(origin);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Integer documentType = (Integer)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String documentNumber = (String)attributes.get("documentNumber");

		if (documentNumber != null) {
			setDocumentNumber(documentNumber);
		}
	}

	/**
	 * Returns the client ID of this client.
	 *
	 * @return the client ID of this client
	 */
	@Override
	public long getClientId() {
		return model.getClientId();
	}

	/**
	 * Returns the create date of this client.
	 *
	 * @return the create date of this client
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document number of this client.
	 *
	 * @return the document number of this client
	 */
	@Override
	public String getDocumentNumber() {
		return model.getDocumentNumber();
	}

	/**
	 * Returns the document type of this client.
	 *
	 * @return the document type of this client
	 */
	@Override
	public int getDocumentType() {
		return model.getDocumentType();
	}

	/**
	 * Returns the last name of this client.
	 *
	 * @return the last name of this client
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the modified date of this client.
	 *
	 * @return the modified date of this client
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this client.
	 *
	 * @return the name of this client
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the origin of this client.
	 *
	 * @return the origin of this client
	 */
	@Override
	public String getOrigin() {
		return model.getOrigin();
	}

	/**
	 * Returns the primary key of this client.
	 *
	 * @return the primary key of this client
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this client.
	 *
	 * @return the uuid of this client
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the client ID of this client.
	 *
	 * @param clientId the client ID of this client
	 */
	@Override
	public void setClientId(long clientId) {
		model.setClientId(clientId);
	}

	/**
	 * Sets the create date of this client.
	 *
	 * @param createDate the create date of this client
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document number of this client.
	 *
	 * @param documentNumber the document number of this client
	 */
	@Override
	public void setDocumentNumber(String documentNumber) {
		model.setDocumentNumber(documentNumber);
	}

	/**
	 * Sets the document type of this client.
	 *
	 * @param documentType the document type of this client
	 */
	@Override
	public void setDocumentType(int documentType) {
		model.setDocumentType(documentType);
	}

	/**
	 * Sets the last name of this client.
	 *
	 * @param lastName the last name of this client
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the modified date of this client.
	 *
	 * @param modifiedDate the modified date of this client
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this client.
	 *
	 * @param name the name of this client
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the origin of this client.
	 *
	 * @param origin the origin of this client
	 */
	@Override
	public void setOrigin(String origin) {
		model.setOrigin(origin);
	}

	/**
	 * Sets the primary key of this client.
	 *
	 * @param primaryKey the primary key of this client
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this client.
	 *
	 * @param uuid the uuid of this client
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ClientWrapper wrap(Client client) {
		return new ClientWrapper(client);
	}

}