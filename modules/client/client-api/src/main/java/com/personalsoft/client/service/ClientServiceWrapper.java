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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ClientService}.
 *
 * @author Brian Wing Shun Chan
 * @see ClientService
 * @generated
 */
public class ClientServiceWrapper
	implements ClientService, ServiceWrapper<ClientService> {

	public ClientServiceWrapper(ClientService clientService) {
		_clientService = clientService;
	}

	@Override
	public com.personalsoft.client.model.Client addClient(
			String origin, String name, String lastName, Integer documentType,
			String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _clientService.addClient(
			origin, name, lastName, documentType, documentNumber);
	}

	@Override
	public com.personalsoft.client.model.Client deleteClient(long clientId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _clientService.deleteClient(clientId);
	}

	@Override
	public java.util.List<com.personalsoft.client.model.Client>
		getClientsBydocumentTypeAndNumber(
			Integer documentType, String documentNumber) {

		return _clientService.getClientsBydocumentTypeAndNumber(
			documentType, documentNumber);
	}

	@Override
	public java.util.List<com.personalsoft.client.model.Client>
		getClientsByName(String name) {

		return _clientService.getClientsByName(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _clientService.getOSGiServiceIdentifier();
	}

	@Override
	public com.personalsoft.client.model.Client updateClient(
			String origin, long clientId, String name, String lastName,
			Integer documentType, String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _clientService.updateClient(
			origin, clientId, name, lastName, documentType, documentNumber);
	}

	@Override
	public ClientService getWrappedService() {
		return _clientService;
	}

	@Override
	public void setWrappedService(ClientService clientService) {
		_clientService = clientService;
	}

	private ClientService _clientService;

}