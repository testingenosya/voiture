package Tomonil.vaika.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private long IdUser;
	private String Name;
	private String Mdp;
	public User(long idUser, String name, String mdp) {
		super();
		IdUser = idUser;
		Name = name;
		Mdp = mdp;
	}
	public User() {
		super();
	}
	public long getIdUser() {
		return IdUser;
	}
	public void setIdUser(long idUser) {
		IdUser = idUser;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMdp() {
		return Mdp;
	}
	public void setMdp(String mdp) {
		Mdp = mdp;
	}
	
	
}
