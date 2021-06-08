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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Client service. Represents a row in the &quot;PS_Client&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.personalsoft.client.model.impl.ClientModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.personalsoft.client.model.impl.ClientImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Client
 * @generated
 */
@ProviderType
public interface ClientModel extends BaseModel<Client> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a client model instance should use the {@link Client} interface instead.
	 */

	/**
	 * Returns the primary key of this client.
	 *
	 * @return the primary key of this client
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this client.
	 *
	 * @param primaryKey the primary key of this client
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this client.
	 *
	 * @return the uuid of this client
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this client.
	 *
	 * @param uuid the uuid of this client
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the client ID of this client.
	 *
	 * @return the client ID of this client
	 */
	public long getClientId();

	/**
	 * Sets the client ID of this client.
	 *
	 * @param clientId the client ID of this client
	 */
	public void setClientId(long clientId);

	/**
	 * Returns the origin of this client.
	 *
	 * @return the origin of this client
	 */
	@AutoEscape
	public String getOrigin();

	/**
	 * Sets the origin of this client.
	 *
	 * @param origin the origin of this client
	 */
	public void setOrigin(String origin);

	/**
	 * Returns the create date of this client.
	 *
	 * @return the create date of this client
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this client.
	 *
	 * @param createDate the create date of this client
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this client.
	 *
	 * @return the modified date of this client
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this client.
	 *
	 * @param modifiedDate the modified date of this client
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this client.
	 *
	 * @return the name of this client
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this client.
	 *
	 * @param name the name of this client
	 */
	public void setName(String name);

	/**
	 * Returns the last name of this client.
	 *
	 * @return the last name of this client
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this client.
	 *
	 * @param lastName the last name of this client
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the document type of this client.
	 *
	 * @return the document type of this client
	 */
	public int getDocumentType();

	/**
	 * Sets the document type of this client.
	 *
	 * @param documentType the document type of this client
	 */
	public void setDocumentType(int documentType);

	/**
	 * Returns the document number of this client.
	 *
	 * @return the document number of this client
	 */
	@AutoEscape
	public String getDocumentNumber();

	/**
	 * Sets the document number of this client.
	 *
	 * @param documentNumber the document number of this client
	 */
	public void setDocumentNumber(String documentNumber);

}