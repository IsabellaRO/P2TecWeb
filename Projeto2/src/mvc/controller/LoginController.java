package mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.Usuarios;
import mvc.model.UsuariosDAO;

@Controller
public class LoginController {
	@RequestMapping("registro")
	public String registro() {
		System.out.println("Redirect cadastro");
		return "cadastro";
	}

	 @RequestMapping(value = "efetuaRegistro", method = RequestMethod.POST)
	 public String upload(Usuarios usuario) throws IOException {
		 System.out.println("Cadastrando....\n\n\n");
		 UsuariosDAO dao = new UsuariosDAO();
		 usuario.setNome(request.getParameter("nome")); 
		 System.out.println(usuario.getNome());
//		 String trilha = dao.genTrilha(usuario.getUsername());
//		 System.out.println(trilha);
//		 String[] tokens = trilha.split("/");
//		 System.out.println(tokens);
//		 
//		 Integer count = 0;
//		 String code = null;
//		 for (String t : tokens){
//			 if(t == "playlist"){
//				code = tokens[count+1];
//			 }
//			 count++;
//		 }
//		 usuario.setTrilha(code);
		 
		 dao.adiciona(usuario);
		 return "redirect:login";
	 }
	 
	 @RequestMapping("loginForm")
	 public String loginForm() {
	 return "login";
	 }
	 @RequestMapping("efetuaLogin")
	 public String efetuaLogin(Usuarios usuario, HttpSession session) {
		 if(new UsuariosDAO().existeUsuario(usuario)) {
			 session.setAttribute("usuarioLogado", usuario.getUsername());
			 return "feed";
		 }
		 return "redirect:login";
	 }

}
