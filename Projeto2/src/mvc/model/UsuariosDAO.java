package mvc.model;

import java.io.*;
import java.sql.*;
import java.util.*;
import org.springframework.web.multipart.MultipartFile;

public class UsuariosDAO {
	
private Connection connection = null;
	
	public UsuariosDAO() {
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 connection = DriverManager.getConnection("jdbc:mysql://localhost/p2tecweb", "root", "adgjlra1");
		 } 
		 catch (SQLException | ClassNotFoundException e) {
			 e.printStackTrace();
		 }
	 }
	
	public void adiciona(Usuarios usuario) throws IOException {
		 MultipartFile filePart = usuario.getFoto_perfil();
		 /* Rotina para salvar o arquivo no servidor 
		 if (!filePart.isEmpty()) {
			 String fileName = filePart.getOriginalFilename();
			 File uploads = new File("/tmp");
			 File file = new File(uploads, fileName);
			 try (InputStream input = filePart.getInputStream()) {
			 	Files.copy(input, file.toPath());
		 	}
		}
		 */
		 try {
			 String sql = "INSERT INTO usuario (nome, email, username, senha, foto_perfil, bio) values(?,?,?,?,?,?)";
			 PreparedStatement stmt = connection.prepareStatement(sql);
			 stmt.setString(1,usuario.getNome());
			 stmt.setString(2,usuario.getEmail());
			 stmt.setString(3, usuario.getUsername());
			 stmt.setString(4, usuario.getSenha());
			 stmt.setBinaryStream(5, filePart.getInputStream());
			 stmt.setString(6, usuario.getBio());
			 //stmt.setBinaryStream(7, filePart.getInputStream());
			 
			 stmt.execute();
			 stmt.close();
		 } 
		 catch (SQLException e) {
			 e.printStackTrace();
		 }
	 }
	
	public boolean existeUsuario(Usuarios usuario) {
		 boolean existe = false;
		 try {
			 PreparedStatement stmt = connection.
			 prepareStatement("SELECT COUNT(*) FROM usuario WHERE username=? AND senha=? LIMIT 1");
			 stmt.setString(1, usuario.getUsername());
			 stmt.setString(2, usuario.getSenha());
			 ResultSet rs = stmt.executeQuery();
			 if(rs.next()){
				 if(rs.getInt(1) != 0) {existe=true;}
			 }
			 rs.close();
			 stmt.close();
		 } 
		 catch(SQLException e) {
			 System.out.println(e);
		 }
		 return existe;
		 }

		 public byte[] buscaFoto(String username) {
			 byte[] imgData = null;
			 try {
				 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM usuario WHERE username=? ");
				 stmt.setString(1, username);
				 ResultSet rs = stmt.executeQuery();
				 if(rs.next()) {
					 Blob image = rs.getBlob("foto");
					 imgData = image.getBytes(1, (int) image.length());
				 }
				 rs.close();
				 stmt.close();
			 } 
			 catch(SQLException e) {
				 System.out.println(e);
			}
			return imgData;		 
	}
		 
		 public void altera(Usuarios user) {
			 try {
				 String sql = "UPDATE Usuario SET (nome, username, senha, bio) values(?,?,?,?) WHERE user_id=?";
				 PreparedStatement stmt = connection.prepareStatement(sql);
				 stmt.setString(1, user.getNome());
				 stmt.setString(3, user.getUsername());
				 stmt.setString(4, user.getSenha());
				 stmt.setString(6, user.getBio());
				 stmt.setInt(8, user.getUser_id());
				 stmt.executeUpdate();
				 stmt.close();
			 } 
			 catch(SQLException e) {
				 System.out.println(e);
			 }
		}
		
		 public void remove(Integer user_id) {
				PreparedStatement stmt;
				try {
					stmt = connection.prepareStatement("DELETE FROM Usuario WHERE user_id=?");
					stmt.setLong(1, user_id);
					stmt.execute();
					stmt.close();
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		 
		 
	

}
