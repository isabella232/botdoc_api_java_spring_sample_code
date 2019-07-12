package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Authentication {
	private String email;
	private String api_key;
	

	public Authentication(String email, String api_key) {
		this.email = email;
		this.api_key = api_key;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public String getApikey() {
		return this.api_key;
	}
	

	public void setApikey(String v) {
		this.api_key = v;
	}
	

	public void setEmail(String v) {
		this.email = v;
	}
	

}