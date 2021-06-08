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
 * Provides the remote service utility for Client. This utility wraps
 * <code>com.personalsoft.client.service.impl.ClientServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ClientService
 * @generated
 */
public class ClientServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.personalsoft.client.service.impl.ClientServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.personalsoft.client.model.Client addClient(
			String origin, String name, String lastName, Integer documentType,
			String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addClient(
			origin, name, lastName, documentType, documentNumber);
	}

	public static com.personalsoft.client.model.Client deleteClient(
			long clientId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteClient(clientId);
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
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.personalsoft.client.model.Client updateClient(
			String origin, long clientId, String name, String lastName,
			Integer documentType, String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateClient(
			origin, clientId, name, lastName, documentType, documentNumber);
	}

	public static ClientService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ClientService, ClientService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ClientService.class);

		ServiceTracker<ClientService, ClientService> serviceTracker =
			new ServiceTracker<ClientService, ClientService>(
				bundle.getBundleContext(), ClientService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}