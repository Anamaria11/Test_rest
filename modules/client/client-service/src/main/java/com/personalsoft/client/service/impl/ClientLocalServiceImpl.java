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
import com.liferay.portal.kernel.util.Validator;
import com.personalsoft.client.model.Client;
import com.personalsoft.client.service.base.ClientLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the client local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.personalsoft.client.service.ClientLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.personalsoft.client.model.Client",
	service = AopService.class
)
public class ClientLocalServiceImpl extends ClientLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.personalsoft.client.service.ClientLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.personalsoft.client.service.ClientLocalServiceUtil</code>.
	 */
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
	public Client addClient(String origin, String name, String lastName, Integer documentType, String documentNumber)  throws PortalException{


	    validateClientData(name, lastName, documentType, documentNumber);
		
		Long clientId = counterLocalService.increment();
		Client client = clientPersistence.create(clientId);
		
		//serviceContext.getUserId(); //TODO review why not get userId from serviceContext instead parameter
		client.setOrigin(origin);
		client.setCreateDate(new Date());
		client.setModifiedDate(new Date());
		client.setName(name);
		client.setDocumentType(documentType);
		client.setDocumentNumber(documentNumber);
		client.setExpandoBridgeAttributes(client);
		
		return clientPersistence.update(client);
		
		
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
	public Client updateClient(String origin, long clientId, String name, String lastName, Integer documentType, String documentNumber)  throws PortalException{

	    validateClientData(name, lastName, documentType, documentNumber);

		Client client = getClient(clientId);
		
		client.setOrigin(origin);
		client.setModifiedDate(new Date());
		client.setName(name);
		client.setDocumentType(documentType);
		client.setDocumentNumber(documentNumber);
		
		return clientPersistence.update(client);
	}
	
	/**
	 * Delete a client by clientId
	 * 
	 * @param userId
	 * @param name
	 * @param documentType
	 * @param documentNumber
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	public Client deleteClient(long clientId)  throws PortalException{
		return clientPersistence.remove(clientId);
	}
	
	/**
	 * Validate:
	 * name -> Is not null and is not blank
	 * lastName -> Is not null and is not blank
	 * documentType -> Is not null and is between 0 and 4
	 * documentNumber -> Is not null and its length is over 4
	 * 
	 * @param name
	 * @param documentType
	 * @param documentNumber
	 * @throws PortalException
	 */
	private void validateClientData(String name, String lastName, Integer documentType, String documentNumber) throws PortalException {
		if(Validator.isNull(name) && Validator.isNull(lastName) && Validator.isNull(documentType) && Validator.isNull(documentNumber)
				&& Validator.isBlank(name) && Validator.isBlank(lastName) && (documentType<0 || documentType>4) && documentNumber.length()<4) {
			throw new PortalException("Error in client data");
		}
		
	}
	
	public List<Client> getClientsBydocumentTypeAndNumber(Integer documentType, String documentNumber) {
		return clientPersistence.findByDocumentT_N(documentType, documentNumber);
	}
	
	public List<Client> getClientsByName(String name) {
		return clientPersistence.findByName(name);
	}
}