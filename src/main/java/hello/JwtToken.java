package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class JwtToken {
	private String token;
	

	public String getToken() {
		return this.token;
	}
	

	public void setToken(String v) {
		this.token = v;
	}
}