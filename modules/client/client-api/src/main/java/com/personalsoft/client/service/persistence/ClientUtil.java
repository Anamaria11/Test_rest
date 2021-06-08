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

package com.personalsoft.client.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.personalsoft.client.model.Client;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the client service. This utility wraps <code>com.personalsoft.client.service.persistence.impl.ClientPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientPersistence
 * @generated
 */
public class ClientUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Client client) {
		getPersistence().clearCache(client);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Client> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Client> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Client> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Client> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Client update(Client client) {
		return getPersistence().update(client);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Client update(Client client, ServiceContext serviceContext) {
		return getPersistence().update(client, serviceContext);
	}

	/**
	 * Returns all the clients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching clients
	 */
	public static List<Client> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the clients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @return the range of matching clients
	 */
	public static List<Client> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the clients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the clients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Client> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByUuid_First(
			String uuid, OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByUuid_First(
		String uuid, OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByUuid_Last(
			String uuid, OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByUuid_Last(
		String uuid, OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the clients before and after the current client in the ordered set where uuid = &#63;.
	 *
	 * @param clientId the primary key of the current client
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public static Client[] findByUuid_PrevAndNext(
			long clientId, String uuid,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByUuid_PrevAndNext(
			clientId, uuid, orderByComparator);
	}

	/**
	 * Removes all the clients where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of clients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching clients
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the clients where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching clients
	 */
	public static List<Client> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the clients where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @return the range of matching clients
	 */
	public static List<Client> findByName(String name, int start, int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the clients where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByName(
		String name, int start, int end,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the clients where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByName(
		String name, int start, int end,
		OrderByComparator<Client> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByName_First(
			String name, OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByName_First(
		String name, OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByName_Last(
			String name, OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByName_Last(
		String name, OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the clients before and after the current client in the ordered set where name = &#63;.
	 *
	 * @param clientId the primary key of the current client
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public static Client[] findByName_PrevAndNext(
			long clientId, String name,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByName_PrevAndNext(
			clientId, name, orderByComparator);
	}

	/**
	 * Removes all the clients where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of clients where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching clients
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns all the clients where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @return the matching clients
	 */
	public static List<Client> findByFullName(String name, String lastName) {
		return getPersistence().findByFullName(name, lastName);
	}

	/**
	 * Returns a range of all the clients where name = &#63; and lastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @return the range of matching clients
	 */
	public static List<Client> findByFullName(
		String name, String lastName, int start, int end) {

		return getPersistence().findByFullName(name, lastName, start, end);
	}

	/**
	 * Returns an ordered range of all the clients where name = &#63; and lastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByFullName(
		String name, String lastName, int start, int end,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().findByFullName(
			name, lastName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the clients where name = &#63; and lastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByFullName(
		String name, String lastName, int start, int end,
		OrderByComparator<Client> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByFullName(
			name, lastName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByFullName_First(
			String name, String lastName,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByFullName_First(
			name, lastName, orderByComparator);
	}

	/**
	 * Returns the first client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByFullName_First(
		String name, String lastName,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByFullName_First(
			name, lastName, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByFullName_Last(
			String name, String lastName,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByFullName_Last(
			name, lastName, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByFullName_Last(
		String name, String lastName,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByFullName_Last(
			name, lastName, orderByComparator);
	}

	/**
	 * Returns the clients before and after the current client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param clientId the primary key of the current client
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public static Client[] findByFullName_PrevAndNext(
			long clientId, String name, String lastName,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByFullName_PrevAndNext(
			clientId, name, lastName, orderByComparator);
	}

	/**
	 * Removes all the clients where name = &#63; and lastName = &#63; from the database.
	 *
	 * @param name the name
	 * @param lastName the last name
	 */
	public static void removeByFullName(String name, String lastName) {
		getPersistence().removeByFullName(name, lastName);
	}

	/**
	 * Returns the number of clients where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @return the number of matching clients
	 */
	public static int countByFullName(String name, String lastName) {
		return getPersistence().countByFullName(name, lastName);
	}

	/**
	 * Returns all the clients where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @return the matching clients
	 */
	public static List<Client> findByDocumentT_N(
		int documentType, String documentNumber) {

		return getPersistence().findByDocumentT_N(documentType, documentNumber);
	}

	/**
	 * Returns a range of all the clients where documentType = &#63; and documentNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @return the range of matching clients
	 */
	public static List<Client> findByDocumentT_N(
		int documentType, String documentNumber, int start, int end) {

		return getPersistence().findByDocumentT_N(
			documentType, documentNumber, start, end);
	}

	/**
	 * Returns an ordered range of all the clients where documentType = &#63; and documentNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByDocumentT_N(
		int documentType, String documentNumber, int start, int end,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().findByDocumentT_N(
			documentType, documentNumber, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the clients where documentType = &#63; and documentNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching clients
	 */
	public static List<Client> findByDocumentT_N(
		int documentType, String documentNumber, int start, int end,
		OrderByComparator<Client> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByDocumentT_N(
			documentType, documentNumber, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByDocumentT_N_First(
			int documentType, String documentNumber,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByDocumentT_N_First(
			documentType, documentNumber, orderByComparator);
	}

	/**
	 * Returns the first client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByDocumentT_N_First(
		int documentType, String documentNumber,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByDocumentT_N_First(
			documentType, documentNumber, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public static Client findByDocumentT_N_Last(
			int documentType, String documentNumber,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByDocumentT_N_Last(
			documentType, documentNumber, orderByComparator);
	}

	/**
	 * Returns the last client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public static Client fetchByDocumentT_N_Last(
		int documentType, String documentNumber,
		OrderByComparator<Client> orderByComparator) {

		return getPersistence().fetchByDocumentT_N_Last(
			documentType, documentNumber, orderByComparator);
	}

	/**
	 * Returns the clients before and after the current client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param clientId the primary key of the current client
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public static Client[] findByDocumentT_N_PrevAndNext(
			long clientId, int documentType, String documentNumber,
			OrderByComparator<Client> orderByComparator)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByDocumentT_N_PrevAndNext(
			clientId, documentType, documentNumber, orderByComparator);
	}

	/**
	 * Removes all the clients where documentType = &#63; and documentNumber = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 */
	public static void removeByDocumentT_N(
		int documentType, String documentNumber) {

		getPersistence().removeByDocumentT_N(documentType, documentNumber);
	}

	/**
	 * Returns the number of clients where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @return the number of matching clients
	 */
	public static int countByDocumentT_N(
		int documentType, String documentNumber) {

		return getPersistence().countByDocumentT_N(
			documentType, documentNumber);
	}

	/**
	 * Caches the client in the entity cache if it is enabled.
	 *
	 * @param client the client
	 */
	public static void cacheResult(Client client) {
		getPersistence().cacheResult(client);
	}

	/**
	 * Caches the clients in the entity cache if it is enabled.
	 *
	 * @param clients the clients
	 */
	public static void cacheResult(List<Client> clients) {
		getPersistence().cacheResult(clients);
	}

	/**
	 * Creates a new client with the primary key. Does not add the client to the database.
	 *
	 * @param clientId the primary key for the new client
	 * @return the new client
	 */
	public static Client create(long clientId) {
		return getPersistence().create(clientId);
	}

	/**
	 * Removes the client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clientId the primary key of the client
	 * @return the client that was removed
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public static Client remove(long clientId)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().remove(clientId);
	}

	public static Client updateImpl(Client client) {
		return getPersistence().updateImpl(client);
	}

	/**
	 * Returns the client with the primary key or throws a <code>NoSuchClientException</code> if it could not be found.
	 *
	 * @param clientId the primary key of the client
	 * @return the client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public static Client findByPrimaryKey(long clientId)
		throws com.personalsoft.client.exception.NoSuchClientException {

		return getPersistence().findByPrimaryKey(clientId);
	}

	/**
	 * Returns the client with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param clientId the primary key of the client
	 * @return the client, or <code>null</code> if a client with the primary key could not be found
	 */
	public static Client fetchByPrimaryKey(long clientId) {
		return getPersistence().fetchByPrimaryKey(clientId);
	}

	/**
	 * Returns all the clients.
	 *
	 * @return the clients
	 */
	public static List<Client> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @return the range of clients
	 */
	public static List<Client> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of clients
	 */
	public static List<Client> findAll(
		int start, int end, OrderByComparator<Client> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of clients
	 */
	public static List<Client> findAll(
		int start, int end, OrderByComparator<Client> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the clients from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of clients.
	 *
	 * @return the number of clients
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ClientPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ClientPersistence, ClientPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ClientPersistence.class);

		ServiceTracker<ClientPersistence, ClientPersistence> serviceTracker =
			new ServiceTracker<ClientPersistence, ClientPersistence>(
				bundle.getBundleContext(), ClientPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}