/*
* Copyright (C) 2005 - 2014 Jaspersoft Corporation. All rights  reserved.
* http://www.jaspersoft.com.
*
* Unless you have purchased  a commercial license agreement from Jaspersoft,
* the following license terms  apply:
*
* This program is free software: you can redistribute it and/or  modify
* it under the terms of the GNU Affero General Public License  as
* published by the Free Software Foundation, either version 3 of  the
* License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero  General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public  License
* along with this program.&nbsp; If not, see <http://www.gnu.org/licenses/>.
*/

package com.jaspersoft.jasperserver.jaxrs.client.api;

import com.jaspersoft.jasperserver.jaxrs.client.core.operationresult.OperationResult;

import javax.ws.rs.core.MultivaluedMap;

public interface GetDeleteRequest<ResponseType> extends Request{

    OperationResult<ResponseType> get();
    OperationResult<ResponseType> delete();
    GetDeleteRequest<ResponseType> addParam(String name, String... values);
    GetDeleteRequest<ResponseType> addParams(MultivaluedMap<String, String> params);
    GetDeleteRequest<ResponseType> addMatrixParam(String name, String... values);
    GetDeleteRequest<ResponseType> addMatrixParams(MultivaluedMap<String, String> params);

}
