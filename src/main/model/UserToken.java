package main.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class UserToken {
	private String id;
	private boolean artist;

	public UserToken() {}

	public UserToken(String id, boolean artist) {
		super();
		this.id = id;
		this.artist = artist;

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
		return artist;
	}

	public void setArtist(boolean artist) {
		this.artist = artist;
	}
}
