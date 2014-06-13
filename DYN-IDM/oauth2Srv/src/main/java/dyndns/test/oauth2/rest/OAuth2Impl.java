package dyndns.test.oauth2.rest;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

@Service("services")
public class OAuth2Impl implements OAuth2 {

	@Override
	public void authorize(String clientId, String redirectURI) {
		System.out.println("authorize");

	}

	@Override
	public Token getToken(String grantType, String scope, String code) {
		// TODO Implement getToken
		System.out.println("getToken");
		Token token = new Token();
		token.setDummy("test");
		return token;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub

	}

}
