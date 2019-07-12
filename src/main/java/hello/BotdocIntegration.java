package hello;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


public class BotdocIntegration {
	public static String base_url = "https://sandboxapi.botdoc.io/v1"; //environment base url
	public static String email = "<your_email>";
	public static String api_key = "<your_api_key>";
	
	
	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();		
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		Authentication auth = new Authentication(BotdocIntegration.email, BotdocIntegration.api_key);
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("email", auth.getEmail());
		map.add("api_key", auth.getApikey());
		HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(map, headers);
		JwtToken token = restTemplate.postForObject(BotdocIntegration.base_url + "/auth/get_token/", httpEntity, JwtToken.class);
		headers.add("Authorization", "JWT " + token.getToken());
		System.out.println("Authenticated!! Here is your token: " + token.getToken());
		
		
		
		
		
		//creates a PUSH request
		headers.setContentType(MediaType.APPLICATION_JSON);
		Request req = new Request();
		req.setType("push");
		req.setMessage("A nice message here");
		
		MultiValueMap<String, Object> mapReq = new LinkedMultiValueMap<String, Object>();
		mapReq.add("message", req.getMessage());
		mapReq.add("type", req.getType());
		HttpEntity<MultiValueMap<String, Object>> httpEntity2 = new HttpEntity<MultiValueMap<String, Object>>(map, headers);
		Request request = restTemplate.postForObject(BotdocIntegration.base_url + "/request/", httpEntity2, Request.class);
		
		System.out.println("Your request was created: " + request.getId());
		
		
		
		
		
		
		//Send medias to the request
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		Media med = new Media();
		med.setName("image1.jpg");
		med.setFile(Paths.get(".").toAbsolutePath().normalize().toString() + File.separator + "files" + File.separator + "image1.jpg");
		
		File file = new File(med.getFile());
		FileSystemResource fileResource = new FileSystemResource(file);
		
		MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
		bodyMap.add("name", med.getName());
	    bodyMap.add("file", fileResource);
	    bodyMap.add("request", request.getId());
	    
	    HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap, headers);
	    
	    ResponseEntity<String> response = restTemplate.exchange(BotdocIntegration.base_url + "/media/", HttpMethod.POST, requestEntity, String.class);
	    System.out.println("response status: " + response.getStatusCode());
	    System.out.println("response body: " + response.getBody());
		
		
	}
}
