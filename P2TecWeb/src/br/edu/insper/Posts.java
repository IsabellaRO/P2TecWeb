package br.edu.insper;

import java.util.Calendar;

public class Posts {
	private Integer post_id;
	private MultipartFile foto;
	private MultipartFile video;
	private MultipartFile musica;
	private String quote;
	private String legenda;
	private Calendar data;
	private Integer user_id;
	
	public Integer getPost_id() {
		return this.post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public MultipartFile getFoto() {
		return this.foto;
	}
	public void setFoto(MultipartFile foto) {
		this.foto = foto;
	}
	public MultipartFile getVideo() {
		return this.video;
	}
	public void setVideo(MultipartFile video) {
		this.video = video;
	}
	public MultipartFile getMusica() {
		return this.musica;
	}
	public void setMusica(MultipartFile musica) {
		this.musica = musica;
	}
	public String getQuote() {
		return this.quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getLegenda() {
		return this.legenda;
	}
	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}
	public Calendar getData() {
		return this.data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Integer getUser_id() {
		return this.user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	
}
