package mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FollowersDAO {
	
	private Connection connection = null;
	Usuarios seguidor = new Usuarios();
	Usuarios usuario = new Usuarios();
	UsuariosDAO usuarios_dao = new UsuariosDAO();
	
	public FollowersDAO() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost/dado","root", "adgjlra1");
		} 
		catch (SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
	
	public void adicionaSeguidor(Followers follow) {
		 try {
			 String sql = "INSERT INTO Rel_Follow" + "(user_id, seg_id) values(?,?)";
			 PreparedStatement stmt = connection.prepareStatement(sql);
			 stmt.setInt(1, usuario.getUser_id()); 
			 stmt.setInt(2, seguidor.getUser_id());
			 
			 stmt.execute();
			 stmt.close();
		 } 
		 catch (SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	//Lista comentarios por id do post
	public List<Followers> getLista() {
		 List<Followers> follows = new ArrayList<Followers>();
		 try {
			 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Rel_Follow WHERE user_id=?");
			 stmt.setInt(1, usuario.getUser_id());
			 ResultSet rs = stmt.executeQuery();
			 
			 
			 while (rs.next()) {
				 Followers follow = new Followers();
				 follow.setUser_id(rs.getInt("user_id"));
				 follow.setSeg_id(rs.getInt("seg_id"));
				 follows.add(follow);
			 }
			 rs.close();
			 stmt.close();
		 } 
		 catch(SQLException e) {
			 System.out.println(e);
		 }
	 	 return follows;
	}
	
	public void remove(Integer user_id, Integer seg_id) {
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("DELETE FROM Rel_Follow  WHERE user_id=? AND seg_id=?");
			stmt.setInt(1, user_id);
			stmt.setInt(2, seg_id);
			stmt.execute();
			stmt.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
