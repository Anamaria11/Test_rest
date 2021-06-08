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

package com.personalsoft.client.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.personalsoft.client.model.Client;
import com.personalsoft.client.service.base.ClientServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the client remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.personalsoft.client.service.ClientService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=ps",
		"json.web.service.context.path=Client"
	},
	service = AopService.class
)
public class ClientServiceImpl extends ClientServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.personalsoft.client.service.ClientServiceUtil</code> to access the client remote service.
	 */

	public Client addClient(String origin, String name, String lastName, Integer documentType, String documentNumber)  throws PortalException{
		return clientLocalService.addClient(origin, name, lastName, documentType, documentNumber);
	}
	
	public Client updateClient(String origin, long clientId, String name, String lastName, Integer documentType, String documentNumber)  throws PortalException{
		return clientLocalService.updateClient(origin, clientId, name, lastName, documentType, documentNumber);
	}
	
	public Client deleteClient(long clientId)  throws PortalException{
		return clientLocalService.deleteClient(clientId);
	}
	
	public List<Client> getClientsBydocumentTypeAndNumber(Integer documentType, String documentNumber) {
		return clientLocalService.getClientsBydocumentTypeAndNumber(documentType, documentNumber);
	}
	
	public List<Client> getClientsByName(String name) {
		return clientLocalService.getClientsByName(name);
	}
}