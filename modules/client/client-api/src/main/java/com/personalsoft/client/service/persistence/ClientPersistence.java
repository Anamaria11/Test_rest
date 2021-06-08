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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.personalsoft.client.exception.NoSuchClientException;
import com.personalsoft.client.model.Client;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the client service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientUtil
 * @generated
 */
@ProviderType
public interface ClientPersistence extends BasePersistence<Client> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClientUtil} to access the client persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the clients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching clients
	 */
	public java.util.List<Client> findByUuid(String uuid);

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
	public java.util.List<Client> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Client> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

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
	public java.util.List<Client> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the first client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

	/**
	 * Returns the last client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the last client in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

	/**
	 * Returns the clients before and after the current client in the ordered set where uuid = &#63;.
	 *
	 * @param clientId the primary key of the current client
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public Client[] findByUuid_PrevAndNext(
			long clientId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Removes all the clients where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of clients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching clients
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the clients where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching clients
	 */
	public java.util.List<Client> findByName(String name);

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
	public java.util.List<Client> findByName(String name, int start, int end);

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
	public java.util.List<Client> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

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
	public java.util.List<Client> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the first client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

	/**
	 * Returns the last client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the last client in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

	/**
	 * Returns the clients before and after the current client in the ordered set where name = &#63;.
	 *
	 * @param clientId the primary key of the current client
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public Client[] findByName_PrevAndNext(
			long clientId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Removes all the clients where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of clients where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching clients
	 */
	public int countByName(String name);

	/**
	 * Returns all the clients where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @return the matching clients
	 */
	public java.util.List<Client> findByFullName(String name, String lastName);

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
	public java.util.List<Client> findByFullName(
		String name, String lastName, int start, int end);

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
	public java.util.List<Client> findByFullName(
		String name, String lastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

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
	public java.util.List<Client> findByFullName(
		String name, String lastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByFullName_First(
			String name, String lastName,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the first client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByFullName_First(
		String name, String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

	/**
	 * Returns the last client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByFullName_Last(
			String name, String lastName,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the last client in the ordered set where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByFullName_Last(
		String name, String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

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
	public Client[] findByFullName_PrevAndNext(
			long clientId, String name, String lastName,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Removes all the clients where name = &#63; and lastName = &#63; from the database.
	 *
	 * @param name the name
	 * @param lastName the last name
	 */
	public void removeByFullName(String name, String lastName);

	/**
	 * Returns the number of clients where name = &#63; and lastName = &#63;.
	 *
	 * @param name the name
	 * @param lastName the last name
	 * @return the number of matching clients
	 */
	public int countByFullName(String name, String lastName);

	/**
	 * Returns all the clients where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @return the matching clients
	 */
	public java.util.List<Client> findByDocumentT_N(
		int documentType, String documentNumber);

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
	public java.util.List<Client> findByDocumentT_N(
		int documentType, String documentNumber, int start, int end);

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
	public java.util.List<Client> findByDocumentT_N(
		int documentType, String documentNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

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
	public java.util.List<Client> findByDocumentT_N(
		int documentType, String documentNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByDocumentT_N_First(
			int documentType, String documentNumber,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the first client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByDocumentT_N_First(
		int documentType, String documentNumber,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

	/**
	 * Returns the last client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client
	 * @throws NoSuchClientException if a matching client could not be found
	 */
	public Client findByDocumentT_N_Last(
			int documentType, String documentNumber,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Returns the last client in the ordered set where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching client, or <code>null</code> if a matching client could not be found
	 */
	public Client fetchByDocumentT_N_Last(
		int documentType, String documentNumber,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

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
	public Client[] findByDocumentT_N_PrevAndNext(
			long clientId, int documentType, String documentNumber,
			com.liferay.portal.kernel.util.OrderByComparator<Client>
				orderByComparator)
		throws NoSuchClientException;

	/**
	 * Removes all the clients where documentType = &#63; and documentNumber = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 */
	public void removeByDocumentT_N(int documentType, String documentNumber);

	/**
	 * Returns the number of clients where documentType = &#63; and documentNumber = &#63;.
	 *
	 * @param documentType the document type
	 * @param documentNumber the document number
	 * @return the number of matching clients
	 */
	public int countByDocumentT_N(int documentType, String documentNumber);

	/**
	 * Caches the client in the entity cache if it is enabled.
	 *
	 * @param client the client
	 */
	public void cacheResult(Client client);

	/**
	 * Caches the clients in the entity cache if it is enabled.
	 *
	 * @param clients the clients
	 */
	public void cacheResult(java.util.List<Client> clients);

	/**
	 * Creates a new client with the primary key. Does not add the client to the database.
	 *
	 * @param clientId the primary key for the new client
	 * @return the new client
	 */
	public Client create(long clientId);

	/**
	 * Removes the client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clientId the primary key of the client
	 * @return the client that was removed
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public Client remove(long clientId) throws NoSuchClientException;

	public Client updateImpl(Client client);

	/**
	 * Returns the client with the primary key or throws a <code>NoSuchClientException</code> if it could not be found.
	 *
	 * @param clientId the primary key of the client
	 * @return the client
	 * @throws NoSuchClientException if a client with the primary key could not be found
	 */
	public Client findByPrimaryKey(long clientId) throws NoSuchClientException;

	/**
	 * Returns the client with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param clientId the primary key of the client
	 * @return the client, or <code>null</code> if a client with the primary key could not be found
	 */
	public Client fetchByPrimaryKey(long clientId);

	/**
	 * Returns all the clients.
	 *
	 * @return the clients
	 */
	public java.util.List<Client> findAll();

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
	public java.util.List<Client> findAll(int start, int end);

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
	public java.util.List<Client> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator);

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
	public java.util.List<Client> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Client>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the clients from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of clients.
	 *
	 * @return the number of clients
	 */
	public int countAll();

}