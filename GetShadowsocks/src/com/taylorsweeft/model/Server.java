package com.taylorsweeft.model;

/**
 * @author TaylorSwift
 *
 */
public class Server {

	private String url;
	private String port;
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Server(String url, String port, String password) {
		super();
		this.url = url;
		this.port = port;
		this.password = password;
	}

}
