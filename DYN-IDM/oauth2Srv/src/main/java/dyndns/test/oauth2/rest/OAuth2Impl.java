package dyndns.test.oauth2.rest;

import org.springframework.stereotype.Service;

@Service( "services#default" )
public class OAuth2Impl implements OAuth2 {

	@Override
	public void authorize(String clientId, String redirectURI) {
		// TODO Auto-generated method stub

	}

	@Override
	public Token getToken(String grantType, String scope, String code) {
		// TODO Implement getToken
		Token token = new Token();
		token.setDummy("test");
		return token;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub

	}

}
