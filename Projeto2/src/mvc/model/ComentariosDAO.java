package mvc.model;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class ComentariosDAO {
	private Connection connection = null;
	
	public ComentariosDAO() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost/dado","root", "adgjlra1");
		} 
		catch (SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
	
	public void adicionaComentario(Comentarios comentario) {
		 try {
			 String sql = "INSERT INTO Rel_Comentarios" + "(post_id,user_id,comentario) values(?,?,?)";
			 PreparedStatement stmt = connection.prepareStatement(sql);
			 stmt.setInt(1,post.getPost_id()); //nao é assim tem que mudar conforme a DAO
			 stmt.setInt(2,usuario.getUser_id()); //nao é assim
			 
			 stmt.execute();
			 stmt.close();
		 } 
		 catch (SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	//Lista comentarios por id do post
	public List<Comentarios> getLista() {
		 List<Comentarios> comentarios = new ArrayList<Comentarios>();
		 try {
			 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Rel_Comentarios WHERE post_id=?");
			 stmt.setInt(1, post.getId()); //isso vem da dao de post
			 ResultSet rs = stmt.executeQuery();
			 
			 
			 while (rs.next()) {
				 Comentarios comentario = new Comentarios();
				 comentario.setPost_id(rs.getInt("post_id"));
				 comentario.setComentario(rs.getString("comentario"));
				 comentario.setUser_id(rs.getInt("user_id"));
				 comentarios.add(comentario);
			 }
			 rs.close();
			 stmt.close();
		 } 
		 catch(SQLException e) {
			 System.out.println(e);
		 }
	 	 return comentarios;
	}
}
	
