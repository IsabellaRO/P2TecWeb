package mvc.model;

import java.sql.*;
import java.util.*;

public class ComentariosDAO {
	private Connection connection = null;
	Posts post = new Posts();
	Usuarios usuario = new Usuarios();
	UsuariosDAO usuarios_dao = new UsuariosDAO();
	
	public ComentariosDAO() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost/p2tecweb","root", "adgjlra1");
		} 
		catch (SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
	
	public void adicionaComentario(Comentarios comentario) {
		 try {
			 String sql = "INSERT INTO Rel_Comentarios" + "(post_id,user_id,comentario) values(?,?,?)";
			 PreparedStatement stmt = connection.prepareStatement(sql);
			 stmt.setInt(1, post.getUser_id());
			 stmt.setInt(2, usuario.getUser_id()); 
			 
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
			 stmt.setInt(1, post.getPost_id());
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
	
	public void removeComentario(Comentarios comentario) {
		 try {
			 PreparedStatement stmt = connection.prepareStatement("DELETE FROM Comentarios WHERE comentario_id=?");
			 stmt.setInt(1, comentario.getComentario_id());
			 stmt.execute();
			 stmt.close();
		 } 
		 catch(SQLException e) {
			 System.out.println(e);
		 }
	 }
	
	public void editaComentario(Comentarios comentario) {
		 try {
			 String sql = "UPDATE Rel_Comentarios SET comentario=? WHERE comentario_id=?";
			 PreparedStatement stmt = connection.prepareStatement(sql);
			 stmt.setString(1, comentario.getComentario());
			 stmt.setLong(2, comentario.getComentario_id());
			 stmt.executeUpdate();
			 stmt.close();
		 } 
		 catch(SQLException e) {
			 System.out.println(e);
		 }
	}
}
	
