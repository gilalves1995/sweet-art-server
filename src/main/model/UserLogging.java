package main.model;

import main.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



@Entity
public class UserLogging {
	@Id
	private String id;
	private String password;
	private boolean isArtist;

	public UserLogging() {}

	public UserLogging(String id, String password, boolean isArtist, String username, String phone, String gender) {
		super();
		this.id = id;
		this.password = password;
		this.isArtist = isArtist;

	}

	public String getId() {
		return id;
	}

	/*
	public void setId(String id) {
		this.id = id;
	}
	*/

	public boolean isArtist() {
		return isArtist;
	}

	public void setArtist(boolean isArtist) {
		this.isArtist = isArtist;
	}

	public String getPassword() {
		return password;
	}

}
