package mvc.controller;

import mvc.model.Posts;
import mvc.model.PostsDAO;
import mvc.model.Tarefa;
import mvc.model.TarefasDAO;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class PostsController {
	@RequestMapping("post")
	public String postagem() {
		return "post";
	}
	
	@RequestMapping("perfil")
	public String perfil(){
		return "meuperfil";
	}
	
	@RequestMapping(value ="criaQuote", method = RequestMethod.POST)
	public String criaPost(@Valid Posts post, BindingResult result) {
		if(result.hasErrors()){
			return "meuperfil";
		}
		PostsDAO dao = new PostsDAO();
		dao.adiciona(post);
		return "meuperfil";
	 }

}
