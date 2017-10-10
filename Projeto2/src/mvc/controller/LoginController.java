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
		return "cadastro";
	}

	 @RequestMapping(value = "efetuaRegistro", method = RequestMethod.POST)
	 public String upload(Usuarios usuario) throws IOException {
		 UsuariosDAO dao = new UsuariosDAO();
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
