package main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
public class User {
	@Id
	private String id;
	private String password;
	private boolean isArtist;
	private String username;
	private String phone;
	private String gender;

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
    	Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	
	public User() {}
	
	public User(String id, String password, boolean isArtist, String username, String phone, String gender) {
		super();
		this.id = id;
		this.password = password;
		this.isArtist = isArtist;
		this.username = username;
		this.phone = phone;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	/*
	public void setId(String id) {
		this.id = id;
	}
	*/

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isArtist() {
		return isArtist;
	}

	public void setArtist(boolean isArtist) {
		this.isArtist = isArtist;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// Tests if the email is valid - not null and different than empty
	private boolean validEmail() {
		if(id != null && id != "") {
			Matcher m = VALID_EMAIL_ADDRESS_REGEX.matcher(id);
		  	return m.find();
		}
		return false;
 	}

	// Tests if the password is valid - not null and different than empty
	private boolean validPassword() {
		if(password != null && password != "") {
	        return true;
	    }
	    return false;
	}

	// Tests if the mobile phone is valid - not null and bigger 8 chars
	private boolean validMobilePhone() {
		if((phone == null || phone == "") || (phone != null && phone.length() > 8 && phone.length() < 15)) {
	    	return true;
	    }
	    return false;
	}

	// Tests if the username is valid - not null and bigger 3 chars
	private boolean validUserName() {
		if(username == "" || (username != null && username.length() > 3)) {
			return true;
		}
		return false;
	}

	 // Tests if the user is valid
	 public boolean valid() {
		return validEmail() &&  validMobilePhone() && validPassword() && validUserName();
 	 }


}
