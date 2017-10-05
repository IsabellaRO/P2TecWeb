package mvc.model;

public class Curtidas {
	
	private Integer curtida_id;
	private Integer post_id;
	private Integer user_id;
	
	public Integer getCurtida_id() {
		return this.curtida_id;
	}
	public void setCurtida_id(Integer curtida_id) {
		this.curtida_id = curtida_id;
	}
	
	public Integer getPost_id() {
		return this.post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public Integer getUser_id() {
		return this.user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
