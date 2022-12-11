package com.DBConnection.spring;

public class DBConnection {
	String connectionURL;
	String username;
	String password;
	
	
	public DBConnection(String connectionURL, String username, String password) {
		this.connectionURL = connectionURL;
		this.username = username;
		this.password = password;
	}
	public String getConnectionURL() {
		return connectionURL;
	}
	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
