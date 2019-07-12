package hello;

public class Media {
	private String request;
	private String content_type;
	private String name;
	private String file;
	private String total_chunks;
	private String current_chunk;
	private String id;
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getTotal_chunks() {
		return total_chunks;
	}
	public void setTotal_chunks(String total_chunks) {
		this.total_chunks = total_chunks;
	}
	public String getCurrent_chunk() {
		return current_chunk;
	}
	public void setCurrent_chunk(String current_chunk) {
		this.current_chunk = current_chunk;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
