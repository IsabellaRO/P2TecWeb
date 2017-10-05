package mvc.model;

import java.sql.Date;
import java.io.IOException;
import java.sql.*;
import java.util.*;

import org.springframework.web.multipart.MultipartFile;

public class PostsDAO {
	private Connection connection = null;
		
		public PostsDAO(){
			try {
				 Class.forName("com.mysql.jdbc.Driver");
				 connection = DriverManager.getConnection("jdbc:mysql://localhost/dado","root", "adgjlra1");
			} 
			catch (SQLException | ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		
		public void adiciona(Posts post) {
			MultipartFile foto_filePart = post.getFoto();
			MultipartFile video_filePart = post.getVideo();
			MultipartFile musica_filePart = post.getMusica();
			
			 try {
				 String sql = "INSERT INTO Post" + "(foto,video,musica,quote,legenda,data,user_id) values(?,?,?,?,?,?,?)";
				 PreparedStatement stmt = connection.prepareStatement(sql);
				 stmt.setBinaryStream(1, foto_filePart.getInputStream());
				 stmt.setBinaryStream(2, video_filePart.getInputStream());
				 stmt.setBinaryStream(3, musica_filePart.getInputStream());
				 stmt.setString(4,post.getQuote());
				 stmt.setString(5, post.getLegenda());
				 stmt.setDate(6, new Date(post.getData().getTimeInMillis()));
				 stmt.setInt(7, post.getUser_id());
				 stmt.execute();
				 stmt.close();
			 } 
			 catch (SQLException | IOException e) {
				 e.printStackTrace();
			 }
		}
		
		public List<Posts> getLista() {
			 List<Posts> posts = new ArrayList<Posts>();
			 try {
				 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Posts WHERE user_id=?");
				 ResultSet rs = stmt.executeQuery();
				 while (rs.next()) {
					 Posts post = new Posts();
					 stmt.setInt(1, post.getUser_id());
					 post.setPost_id(rs.getInt("post_id"));
					 post.setFoto((MultipartFile) rs.getBlob("foto"));
					 post.setVideo((MultipartFile) rs.getBlob("video"));
					 post.setMusica((MultipartFile) rs.getBlob("musica"));
					 post.setQuote(rs.getString("quote"));
					 post.setLegenda(rs.getString("legenda"));
					 
					 
					 Calendar data = Calendar.getInstance();
					 Date dataPost = rs.getDate("dataFinalizacao");
					 
					 if(dataPost!=null) {
						 data.setTime(dataPost);
						 post.setData(data);
					 }
					 posts.add(post);
				 }
				 rs.close();
				 stmt.close();
			 } 
			 catch(SQLException e) {
				 System.out.println(e);
			 }
		 	 return posts;
		}
		
		public void remove(Posts post) {
			 try {
				 PreparedStatement stmt = connection.prepareStatement("DELETE FROM Posts WHERE post_id=?");
				 stmt.setInt(1, post.getPost_id());
				 stmt.execute();
				 stmt.close();
			 } 
			 catch(SQLException e) {
				 System.out.println(e);
			 }
		 }
		
		public Posts buscaPorId(Integer post_id) {
			 Posts post = new Posts();
			 try {
				 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Posts WHERE post_id=? ");
				 stmt.setInt(1, post_id);
				 ResultSet rs = stmt.executeQuery();
				 if(rs.next()) {
					 post.setPost_id(rs.getInt("post_id"));
					 post.setFoto((MultipartFile) rs.getBlob("foto"));
					 post.setVideo((MultipartFile) rs.getBlob("video"));
					 post.setMusica((MultipartFile) rs.getBlob("musica"));
					 post.setQuote(rs.getString("quote"));
					 post.setLegenda(rs.getString("legenda"));
					 
					 Calendar data = Calendar.getInstance();
					 Date dataPost = rs.getDate("data");
					 if(dataPost!=null) {
						 data.setTime(dataPost);
						 post.setData(data);
					 }
				 }
				 rs.close();
				 stmt.close();
	 		} 
			catch(SQLException e) {
				System.out.println(e);
			}
			return post;
		}
		
		public void altera(Posts post) {
			 try {
				 String sql = "UPDATE Post SET legenda=? WHERE id=?";
				 PreparedStatement stmt = connection.prepareStatement(sql);
				 stmt.setString(1, post.getLegenda());
				 stmt.setLong(2, post.getPost_id());
				 stmt.executeUpdate();
				 stmt.close();
			 } 
			 catch(SQLException e) {
				 System.out.println(e);
			 }
		}
		
		public void close() {
			 try { connection.close();}
			 catch (SQLException e) {e.printStackTrace();}
		 }

}
