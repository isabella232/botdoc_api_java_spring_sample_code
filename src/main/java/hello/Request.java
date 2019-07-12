package hello;

public class Request {
	private String message;
	private String requester_privatenotes;
	private String type;
	private Boolean is_draft;
	private String short_message;
	private String long_message_subject;
	private String long_message;
	private String callback_url;
	private String tfa_send_to;
	private String tfa_send_to_value;
	private String identifier;
	private String id;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRequester_privatenotes() {
		return requester_privatenotes;
	}
	public void setRequester_privatenotes(String requester_privatenotes) {
		this.requester_privatenotes = requester_privatenotes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getIs_draft() {
		return is_draft;
	}
	public void setIs_draft(Boolean is_draft) {
		this.is_draft = is_draft;
	}
	public String getShort_message() {
		return short_message;
	}
	public void setShort_message(String short_message) {
		this.short_message = short_message;
	}
	public String getLong_message_subject() {
		return long_message_subject;
	}
	public void setLong_message_subject(String long_message_subject) {
		this.long_message_subject = long_message_subject;
	}
	public String getLong_message() {
		return long_message;
	}
	public void setLong_message(String long_message) {
		this.long_message = long_message;
	}
	public String getCallback_url() {
		return callback_url;
	}
	public void setCallback_url(String callback_url) {
		this.callback_url = callback_url;
	}
	public String getTfa_send_to() {
		return tfa_send_to;
	}
	public void setTfa_send_to(String tfa_send_to) {
		this.tfa_send_to = tfa_send_to;
	}
	public String getTfa_send_to_value() {
		return tfa_send_to_value;
	}
	public void setTfa_send_to_value(String tfa_send_to_value) {
		this.tfa_send_to_value = tfa_send_to_value;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
