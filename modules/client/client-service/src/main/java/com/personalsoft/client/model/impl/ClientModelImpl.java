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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.personalsoft.client.model.Client;
import com.personalsoft.client.model.ClientModel;
import com.personalsoft.client.model.ClientSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Client service. Represents a row in the &quot;PS_Client&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ClientModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ClientImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientImpl
 * @generated
 */
@JSON(strict = true)
public class ClientModelImpl
	extends BaseModelImpl<Client> implements ClientModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a client model instance should use the <code>Client</code> interface instead.
	 */
	public static final String TABLE_NAME = "PS_Client";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"clientId", Types.BIGINT},
		{"origin", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"name", Types.VARCHAR},
		{"lastName", Types.VARCHAR}, {"documentType", Types.INTEGER},
		{"documentNumber", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("clientId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("origin", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentType", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("documentNumber", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table PS_Client (uuid_ VARCHAR(75) null,clientId LONG not null primary key,origin VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,lastName VARCHAR(75) null,documentType INTEGER,documentNumber VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table PS_Client";

	public static final String ORDER_BY_JPQL = " ORDER BY client.name ASC";

	public static final String ORDER_BY_SQL = " ORDER BY PS_Client.name ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long DOCUMENTNUMBER_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long DOCUMENTTYPE_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long LASTNAME_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long NAME_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static Client toModel(ClientSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Client model = new ClientImpl();

		model.setUuid(soapModel.getUuid());
		model.setClientId(soapModel.getClientId());
		model.setOrigin(soapModel.getOrigin());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setLastName(soapModel.getLastName());
		model.setDocumentType(soapModel.getDocumentType());
		model.setDocumentNumber(soapModel.getDocumentNumber());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<Client> toModels(ClientSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Client> models = new ArrayList<Client>(soapModels.length);

		for (ClientSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public ClientModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _clientId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setClientId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _clientId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Client.class;
	}

	@Override
	public String getModelClassName() {
		return Client.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Client, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Client, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Client, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Client)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Client, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Client, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Client)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Client, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Client, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Client>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Client.class.getClassLoader(), Client.class, ModelWrapper.class);

		try {
			Constructor<Client> constructor =
				(Constructor<Client>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Client, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Client, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Client, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Client, Object>>();
		Map<String, BiConsumer<Client, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Client, ?>>();

		attributeGetterFunctions.put("uuid", Client::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Client, String>)Client::setUuid);
		attributeGetterFunctions.put("clientId", Client::getClientId);
		attributeSetterBiConsumers.put(
			"clientId", (BiConsumer<Client, Long>)Client::setClientId);
		attributeGetterFunctions.put("origin", Client::getOrigin);
		attributeSetterBiConsumers.put(
			"origin", (BiConsumer<Client, String>)Client::setOrigin);
		attributeGetterFunctions.put("createDate", Client::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Client, Date>)Client::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Client::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Client, Date>)Client::setModifiedDate);
		attributeGetterFunctions.put("name", Client::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Client, String>)Client::setName);
		attributeGetterFunctions.put("lastName", Client::getLastName);
		attributeSetterBiConsumers.put(
			"lastName", (BiConsumer<Client, String>)Client::setLastName);
		attributeGetterFunctions.put("documentType", Client::getDocumentType);
		attributeSetterBiConsumers.put(
			"documentType",
			(BiConsumer<Client, Integer>)Client::setDocumentType);
		attributeGetterFunctions.put(
			"documentNumber", Client::getDocumentNumber);
		attributeSetterBiConsumers.put(
			"documentNumber",
			(BiConsumer<Client, String>)Client::setDocumentNumber);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getClientId() {
		return _clientId;
	}

	@Override
	public void setClientId(long clientId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_clientId = clientId;
	}

	@JSON
	@Override
	public String getOrigin() {
		if (_origin == null) {
			return "";
		}
		else {
			return _origin;
		}
	}

	@Override
	public void setOrigin(String origin) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_origin = origin;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalName() {
		return getColumnOriginalValue("name");
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_lastName = lastName;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalLastName() {
		return getColumnOriginalValue("lastName");
	}

	@JSON
	@Override
	public int getDocumentType() {
		return _documentType;
	}

	@Override
	public void setDocumentType(int documentType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_documentType = documentType;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public int getOriginalDocumentType() {
		return GetterUtil.getInteger(
			this.<Integer>getColumnOriginalValue("documentType"));
	}

	@JSON
	@Override
	public String getDocumentNumber() {
		if (_documentNumber == null) {
			return "";
		}
		else {
			return _documentNumber;
		}
	}

	@Override
	public void setDocumentNumber(String documentNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_documentNumber = documentNumber;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalDocumentNumber() {
		return getColumnOriginalValue("documentNumber");
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (entry.getValue() != getColumnValue(entry.getKey())) {
				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Client.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Client toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Client>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ClientImpl clientImpl = new ClientImpl();

		clientImpl.setUuid(getUuid());
		clientImpl.setClientId(getClientId());
		clientImpl.setOrigin(getOrigin());
		clientImpl.setCreateDate(getCreateDate());
		clientImpl.setModifiedDate(getModifiedDate());
		clientImpl.setName(getName());
		clientImpl.setLastName(getLastName());
		clientImpl.setDocumentType(getDocumentType());
		clientImpl.setDocumentNumber(getDocumentNumber());

		clientImpl.resetOriginalValues();

		return clientImpl;
	}

	@Override
	public int compareTo(Client client) {
		int value = 0;

		value = getName().compareTo(client.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Client)) {
			return false;
		}

		Client client = (Client)object;

		long primaryKey = client.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Client> toCacheModel() {
		ClientCacheModel clientCacheModel = new ClientCacheModel();

		clientCacheModel.uuid = getUuid();

		String uuid = clientCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			clientCacheModel.uuid = null;
		}

		clientCacheModel.clientId = getClientId();

		clientCacheModel.origin = getOrigin();

		String origin = clientCacheModel.origin;

		if ((origin != null) && (origin.length() == 0)) {
			clientCacheModel.origin = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			clientCacheModel.createDate = createDate.getTime();
		}
		else {
			clientCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			clientCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			clientCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		clientCacheModel.name = getName();

		String name = clientCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			clientCacheModel.name = null;
		}

		clientCacheModel.lastName = getLastName();

		String lastName = clientCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			clientCacheModel.lastName = null;
		}

		clientCacheModel.documentType = getDocumentType();

		clientCacheModel.documentNumber = getDocumentNumber();

		String documentNumber = clientCacheModel.documentNumber;

		if ((documentNumber != null) && (documentNumber.length() == 0)) {
			clientCacheModel.documentNumber = null;
		}

		return clientCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Client, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Client, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Client, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Client)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Client, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Client, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Client, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Client)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Client>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private long _clientId;
	private String _origin;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private String _lastName;
	private int _documentType;
	private String _documentNumber;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Client, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Client)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("clientId", _clientId);
		_columnOriginalValues.put("origin", _origin);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("lastName", _lastName);
		_columnOriginalValues.put("documentType", _documentType);
		_columnOriginalValues.put("documentNumber", _documentNumber);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("clientId", 2L);

		columnBitmasks.put("origin", 4L);

		columnBitmasks.put("createDate", 8L);

		columnBitmasks.put("modifiedDate", 16L);

		columnBitmasks.put("name", 32L);

		columnBitmasks.put("lastName", 64L);

		columnBitmasks.put("documentType", 128L);

		columnBitmasks.put("documentNumber", 256L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Client _escapedModel;

}