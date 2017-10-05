package mvc.model;

public class Comentarios {
	
	private Integer comentario_id;
	private Integer post_id;
	private Integer user_id;
	private String comentario;
	
	public Integer getComentario_id() {
		return this.comentario_id;
	}
	public void setComentario_id(Integer comentario_id) {
		this.comentario_id = comentario_id;
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
	public String getComentario() {
		return this.comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
