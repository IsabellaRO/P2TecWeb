package mvc.model;

import java.sql.*;
import java.util.*;

public class CurtidasDAO {
	private Connection connection = null;
	Posts post = new Posts();
	Usuarios usuario = new Usuarios();
	UsuariosDAO usuarios_dao = new UsuariosDAO();
	
	public CurtidasDAO() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost/p2tecweb","root", "adgjlra1");
		} 
		catch (SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
	
	public void adicionaCurtida(Curtidas curtida) {
		 try {
			 String sql = "INSERT INTO Rel_Curtidas" + "(post_id,user_id) values(?,?)";
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
	
	//Lista curtidas por id do post
	public List<Curtidas> getLista() {
		 List<Curtidas> curtidas = new ArrayList<Curtidas>();
		 try {
			 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Rel_Curtidas WHERE post_id=?");
			 stmt.setInt(1, post.getPost_id());
			 ResultSet rs = stmt.executeQuery();
			 
			 
			 while (rs.next()) {
				 Curtidas curtida = new Curtidas();
				 curtida.setPost_id(rs.getInt("post_id"));
				 curtida.setUser_id(rs.getInt("user_id"));
				 curtidas.add(curtida);
			 }
			 rs.close();
			 stmt.close();
		 } 
		 catch(SQLException e) {
			 System.out.println(e);
		 }
	 	 return curtidas;
	}
	
	public void descurte(Curtidas curtida){
		 try {
			 PreparedStatement stmt = connection.prepareStatement("DELETE FROM Curtidas WHERE curtida_id=?");
			 stmt.setInt(1, curtida.getCurtida_id());
			 stmt.execute();
			 stmt.close();
		 } 
		 catch(SQLException e) {
			 System.out.println(e);
		 }
	 }
}

