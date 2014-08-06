/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package org.kurento.kmf.jsonrpcconnector.server;

import org.kurento.kmf.jsonrpcconnector.JsonRpcHandler;

public interface JsonRpcHandlerRegistry {

	/**
	 * Configure a JsonRpcHandler at the specified URL paths.
	 * 
	 * @param jsonRpcHandler
	 * @param paths
	 * @return The handler registration object
	 */
	JsonRpcHandlerRegistration addHandler(JsonRpcHandler<?> jsonRpcHandler,
			String... paths);

	JsonRpcHandlerRegistration addPerSessionHandler(
			Class<? extends JsonRpcHandler<?>> handlerClass, String... string);

	JsonRpcHandlerRegistration addPerSessionHandler(String beanName,
			String... string);

}