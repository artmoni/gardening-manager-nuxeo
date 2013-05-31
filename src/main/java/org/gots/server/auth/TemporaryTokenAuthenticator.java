package org.gots.server.auth;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nuxeo.ecm.platform.api.login.UserIdentificationInfo;
import org.nuxeo.ecm.platform.ui.web.auth.interfaces.NuxeoAuthenticationPlugin;
import org.nuxeo.runtime.api.Framework;

public class TemporaryTokenAuthenticator implements NuxeoAuthenticationPlugin {
	
	@Override
	public Boolean handleLoginPrompt(HttpServletRequest httpRequest, HttpServletResponse httpResponse, String baseURL) {
		return false;
	}

	@Override
	public UserIdentificationInfo handleRetrieveIdentity(HttpServletRequest httpRequest,
			HttpServletResponse httpResponse) {

		
		
		//get token and username
		// decrypt 
		String secureKey = Framework.getProperty("gots.clientsecret","bidon");
		String username="";
		//check date if not expired
		
		//log the valide user
		return new UserIdentificationInfo(	username, username);
		
	}

	@Override
	public Boolean needLoginPrompt(HttpServletRequest httpRequest) {
		return false;
	}

	@Override
	public void initPlugin(Map<String, String> parameters) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> getUnAuthenticatedURLPrefix() {
		return null;
	}

}
