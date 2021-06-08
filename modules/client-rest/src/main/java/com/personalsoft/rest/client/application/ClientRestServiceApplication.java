package com.personalsoft.rest.client.application;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.personalsoft.client.model.Client;
import com.personalsoft.client.service.ClientLocalService;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author amduffos
 */
@Component(property = { JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/client",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Clients.Rest" }, service = Application.class)
public class ClientRestServiceApplication extends Application {

	private static Log LOGGER = LogFactoryUtil.getLog(ClientRestServiceApplication.class);

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Client getClient(@QueryParam("name") String name) {
		List<Client> clients = clientApi.getClientsByName(name);
		LOGGER.info("Clients " + name + " obtained");
		LOGGER.info(clients.toString());
		return clients.get(0);
	}
	

	@POST
	@Produces("application/json")
	public Client createClient(@QueryParam("origin") String origin, @QueryParam("name") String name, 
			@QueryParam("lastName") String lastName, @QueryParam("documentType") int documentType, 
			@QueryParam("documentNumber") String documentNumber) {
		Client client = null;
		try {
			client = clientApi.addClient(origin, name, lastName, documentType, documentNumber);
			LOGGER.info("Client "+name+" created");
		} catch (PortalException e) {
			LOGGER.info("Error creating client "+name);
		}
		return client;
	}
	

	@PUT
	@Produces("application/json")
	public Client updateClient(@QueryParam("origin") String origin, @QueryParam("clientId") Long clientId, 
			@QueryParam("name") String name, @QueryParam("lastName") String lastName, 
			@QueryParam("documentType") int documentType, @QueryParam("documentNumber") String documentNumber) {
		Client client = null;
		try {
			client = clientApi.updateClient(origin, clientId, name, lastName, documentType, documentNumber);
			LOGGER.info("Client "+name+" updated");
		} catch (PortalException e) {
			LOGGER.info("Error updating client: "+name);
		}
		return client;
	}

	@DELETE
	@Produces("application/json")
	public Client deleteClient(@QueryParam("clientId") long clientId) {
		LOGGER.info("Client "+clientId+ " deleted");
		Client client = null;
		try {
			client = clientApi.deleteClient(clientId);
			LOGGER.info("Client "+clientId+" deleted");
		} catch (PortalException e) {
			LOGGER.info("Error deleting client: "+clientId);
		}
		return client;
	}


	@Reference
	ClientLocalService clientApi;
}