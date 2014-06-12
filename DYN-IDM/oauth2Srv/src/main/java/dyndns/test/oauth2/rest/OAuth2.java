package dyndns.test.oauth2.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("oauth")
public interface OAuth2 {
	@Path("authorize")
	@GET
	@Produces({ MediaType.TEXT_HTML})
	void authorize(String clientId, String redirectURI);

	@Path("token")
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	Token getToken(String grantType, String scope, String code);

	@Path("validate")
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	void validate();
}
