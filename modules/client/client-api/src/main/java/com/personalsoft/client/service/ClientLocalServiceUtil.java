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

package com.personalsoft.client.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Client. This utility wraps
 * <code>com.personalsoft.client.service.impl.ClientLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ClientLocalService
 * @generated
 */
public class ClientLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.personalsoft.client.service.impl.ClientLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the client to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param client the client
	 * @return the client that was added
	 */
	public static com.personalsoft.client.model.Client addClient(
		com.personalsoft.client.model.Client client) {

		return getService().addClient(client);
	}

	/**
	 * Add new client and validate name, documentType and documentNumber
	 *
	 * @param userId
	 * @param name
	 * @param documentType
	 * @param documentNumber
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	public static com.personalsoft.client.model.Client addClient(
			String origin, String name, String lastName, Integer documentType,
			String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addClient(
			origin, name, lastName, documentType, documentNumber);
	}

	/**
	 * Creates a new client with the primary key. Does not add the client to the database.
	 *
	 * @param clientId the primary key for the new client
	 * @return the new client
	 */
	public static com.personalsoft.client.model.Client createClient(
		long clientId) {

		return getService().createClient(clientId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the client from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param client the client
	 * @return the client that was removed
	 */
	public static com.personalsoft.client.model.Client deleteClient(
		com.personalsoft.client.model.Client client) {

		return getService().deleteClient(client);
	}

	/**
	 * Deletes the client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param clientId the primary key of the client
	 * @return the client that was removed
	 * @throws PortalException if a client with the primary key could not be found
	 */
	public static com.personalsoft.client.model.Client deleteClient(
			long clientId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteClient(clientId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.personalsoft.client.model.impl.ClientModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.personalsoft.client.model.impl.ClientModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.personalsoft.client.model.Client fetchClient(
		long clientId) {

		return getService().fetchClient(clientId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the client with the primary key.
	 *
	 * @param clientId the primary key of the client
	 * @return the client
	 * @throws PortalException if a client with the primary key could not be found
	 */
	public static com.personalsoft.client.model.Client getClient(long clientId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getClient(clientId);
	}

	/**
	 * Returns a range of all the clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.personalsoft.client.model.impl.ClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of clients
	 * @param end the upper bound of the range of clients (not inclusive)
	 * @return the range of clients
	 */
	public static java.util.List<com.personalsoft.client.model.Client>
		getClients(int start, int end) {

		return getService().getClients(start, end);
	}

	public static java.util.List<com.personalsoft.client.model.Client>
		getClientsBydocumentTypeAndNumber(
			Integer documentType, String documentNumber) {

		return getService().getClientsBydocumentTypeAndNumber(
			documentType, documentNumber);
	}

	public static java.util.List<com.personalsoft.client.model.Client>
		getClientsByName(String name) {

		return getService().getClientsByName(name);
	}

	/**
	 * Returns the number of clients.
	 *
	 * @return the number of clients
	 */
	public static int getClientsCount() {
		return getService().getClientsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the client in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param client the client
	 * @return the client that was updated
	 */
	public static com.personalsoft.client.model.Client updateClient(
		com.personalsoft.client.model.Client client) {

		return getService().updateClient(client);
	}

	/**
	 * Validate fields: name, documentType and documentNumber. And Update a client
	 *
	 * @param userId
	 * @param name
	 * @param documentType
	 * @param documentNumber
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	public static com.personalsoft.client.model.Client updateClient(
			String origin, long clientId, String name, String lastName,
			Integer documentType, String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateClient(
			origin, clientId, name, lastName, documentType, documentNumber);
	}

	public static ClientLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ClientLocalService, ClientLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ClientLocalService.class);

		ServiceTracker<ClientLocalService, ClientLocalService> serviceTracker =
			new ServiceTracker<ClientLocalService, ClientLocalService>(
				bundle.getBundleContext(), ClientLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}