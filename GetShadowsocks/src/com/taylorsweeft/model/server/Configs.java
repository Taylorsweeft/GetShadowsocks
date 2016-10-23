package com.taylorsweeft.model.server;

/**
 * @author TaylorSwift
 *
 */
public class Configs {
	private String server;

	private int server_port;

	private String password;

	private String method;

	private String remarks;

	private boolean auth;

	private int timeout;

	public Configs(String server, int server_port, String password,
			String method, String remarks, boolean auth, int timeout) {
		super();
		this.server = server;
		this.server_port = server_port;
		this.password = password;
		this.method = method;
		this.remarks = remarks;
		this.auth = auth;
		this.timeout = timeout;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getServer() {
		return this.server;
	}

	public void setServer_port(int server_port) {
		this.server_port = server_port;
	}

	public int getServer_port() {
		return this.server_port;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getMethod() {
		return this.method;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

	public boolean getAuth() {
		return this.auth;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getTimeout() {
		return this.timeout;
	}

}