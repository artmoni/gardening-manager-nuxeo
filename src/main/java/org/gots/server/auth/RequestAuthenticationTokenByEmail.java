/* *********************************************************************** *
 * project: org.gots.*
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) ${year} by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : contact at gardening-manager dot com                  *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file 
 *   Contributors:                                                         *
 *                - Sebastien FLEURY                                       *
 *                                                                         *
 * *********************************************************************** */

package org.gots.server.auth;

import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.automation.core.collectors.DocumentModelCollector;
import org.nuxeo.ecm.automation.core.collectors.BlobCollector;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentRef;
import org.nuxeo.runtime.api.Framework;

/**
 * @author sfleury
 */
@Operation(id=RequestAuthenticationTokenByEmail.ID, category=Constants.CAT_SERVICES, label="RequestAuthenticationTokenByEmail", description="")
public class RequestAuthenticationTokenByEmail {

    public static final String ID = "RequestAuthenticationTokenByEmail";

    @OperationMethod
    public void run(Object input) {
    	// get from request: email, username, deviceID, appName...
//    	String email = input.get
    	// create user if not exists
    	
    	// create authentication temporary token
    	// send email with token
		String secureKey = Framework.getProperty("gots.clientsecret","bidon");

    	
    }    

}
