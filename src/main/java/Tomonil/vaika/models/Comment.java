package Tomonil.vaika.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id
	private long IdComment;
	private String Comment;
	private long IdUser;
	private long IdCar;
	public Comment() {
		super();
	}
	public Comment(long idComment, String comment, long idUser, long idCar) {
		super();
		IdComment = idComment;
		Comment = comment;
		IdUser = idUser;
		IdCar = idCar;
	}
	public long getIdComment() {
		return IdComment;
	}
	public void setIdComment(long idComment) {
		IdComment = idComment;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public long getIdUser() {
		return IdUser;
	}
	public void setIdUser(long idUser) {
		IdUser = idUser;
	}
	public long getIdCar() {
		return IdCar;
	}
	public void setIdCar(long idCar) {
		IdCar = idCar;
	}
	
	
}
