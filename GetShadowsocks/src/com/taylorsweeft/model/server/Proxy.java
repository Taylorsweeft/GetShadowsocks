package com.taylorsweeft.model.server;

/**
 * @author TaylorSwift
 *
 */
public class Proxy {
	private boolean useProxy;

	private int proxyType;

	private String proxyServer;

	private int proxyPort;

	private int proxyTimeout;

	public Proxy(boolean useProxy, int proxyType, String proxyServer,
			int proxyPort, int proxyTimeout) {
		super();
		this.useProxy = useProxy;
		this.proxyType = proxyType;
		this.proxyServer = proxyServer;
		this.proxyPort = proxyPort;
		this.proxyTimeout = proxyTimeout;
	}

	public void setUseProxy(boolean useProxy) {
		this.useProxy = useProxy;
	}

	public boolean getUseProxy() {
		return this.useProxy;
	}

	public void setProxyType(int proxyType) {
		this.proxyType = proxyType;
	}

	public int getProxyType() {
		return this.proxyType;
	}

	public void setProxyServer(String proxyServer) {
		this.proxyServer = proxyServer;
	}

	public String getProxyServer() {
		return this.proxyServer;
	}

	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}

	public int getProxyPort() {
		return this.proxyPort;
	}

	public void setProxyTimeout(int proxyTimeout) {
		this.proxyTimeout = proxyTimeout;
	}

	public int getProxyTimeout() {
		return this.proxyTimeout;
	}

}