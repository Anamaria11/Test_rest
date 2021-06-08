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

package com.personalsoft.client.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.personalsoft.client.service.ClientServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>ClientServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientServiceSoap
 * @generated
 */
public class ClientServiceHttp {

	public static com.personalsoft.client.model.Client addClient(
			HttpPrincipal httpPrincipal, String origin, String name,
			String lastName, Integer documentType, String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ClientServiceUtil.class, "addClient",
				_addClientParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, origin, name, lastName, documentType,
				documentNumber);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.personalsoft.client.model.Client)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.personalsoft.client.model.Client updateClient(
			HttpPrincipal httpPrincipal, String origin, long clientId,
			String name, String lastName, Integer documentType,
			String documentNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ClientServiceUtil.class, "updateClient",
				_updateClientParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, origin, clientId, name, lastName, documentType,
				documentNumber);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.personalsoft.client.model.Client)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.personalsoft.client.model.Client deleteClient(
			HttpPrincipal httpPrincipal, long clientId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ClientServiceUtil.class, "deleteClient",
				_deleteClientParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, clientId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.personalsoft.client.model.Client)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.personalsoft.client.model.Client>
		getClientsBydocumentTypeAndNumber(
			HttpPrincipal httpPrincipal, Integer documentType,
			String documentNumber) {

		try {
			MethodKey methodKey = new MethodKey(
				ClientServiceUtil.class, "getClientsBydocumentTypeAndNumber",
				_getClientsBydocumentTypeAndNumberParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, documentType, documentNumber);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.personalsoft.client.model.Client>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.personalsoft.client.model.Client>
		getClientsByName(HttpPrincipal httpPrincipal, String name) {

		try {
			MethodKey methodKey = new MethodKey(
				ClientServiceUtil.class, "getClientsByName",
				_getClientsByNameParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.personalsoft.client.model.Client>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClientServiceHttp.class);

	private static final Class<?>[] _addClientParameterTypes0 = new Class[] {
		String.class, String.class, String.class, Integer.class, String.class
	};
	private static final Class<?>[] _updateClientParameterTypes1 = new Class[] {
		String.class, long.class, String.class, String.class, Integer.class,
		String.class
	};
	private static final Class<?>[] _deleteClientParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[]
		_getClientsBydocumentTypeAndNumberParameterTypes3 = new Class[] {
			Integer.class, String.class
		};
	private static final Class<?>[] _getClientsByNameParameterTypes4 =
		new Class[] {String.class};

}