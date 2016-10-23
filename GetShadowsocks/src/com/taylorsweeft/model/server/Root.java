package com.taylorsweeft.model.server;

import java.util.List;

/**
 * @author TaylorSwift
 *
 */
public class Root {
	private List<Configs> configs;

	private String strategy;

	private int index;

	private boolean global;

	private boolean enabled;

	private boolean shareOverLan;

	private boolean isDefault;

	private int localPort;

	private String pacUrl;

	private boolean useOnlinePac;

	private boolean availabilityStatistics;

	private boolean autoCheckUpdate;

	private boolean isVerboseLogging;

	private LogViewer logViewer;

	private Proxy proxy;

	private Hotkey hotkey;

	public void setConfigs(List<Configs> configs) {
		this.configs = configs;
	}

	public List<Configs> getConfigs() {
		return this.configs;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}

	public void setGlobal(boolean global) {
		this.global = global;
	}

	public boolean getGlobal() {
		return this.global;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setShareOverLan(boolean shareOverLan) {
		this.shareOverLan = shareOverLan;
	}

	public boolean getShareOverLan() {
		return this.shareOverLan;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setLocalPort(int localPort) {
		this.localPort = localPort;
	}

	public int getLocalPort() {
		return this.localPort;
	}

	public void setPacUrl(String pacUrl) {
		this.pacUrl = pacUrl;
	}

	public String getPacUrl() {
		return this.pacUrl;
	}

	public void setUseOnlinePac(boolean useOnlinePac) {
		this.useOnlinePac = useOnlinePac;
	}

	public boolean getUseOnlinePac() {
		return this.useOnlinePac;
	}

	public void setAvailabilityStatistics(boolean availabilityStatistics) {
		this.availabilityStatistics = availabilityStatistics;
	}

	public boolean getAvailabilityStatistics() {
		return this.availabilityStatistics;
	}

	public void setAutoCheckUpdate(boolean autoCheckUpdate) {
		this.autoCheckUpdate = autoCheckUpdate;
	}

	public boolean getAutoCheckUpdate() {
		return this.autoCheckUpdate;
	}

	public void setIsVerboseLogging(boolean isVerboseLogging) {
		this.isVerboseLogging = isVerboseLogging;
	}

	public boolean getIsVerboseLogging() {
		return this.isVerboseLogging;
	}

	public void setLogViewer(LogViewer logViewer) {
		this.logViewer = logViewer;
	}

	public LogViewer getLogViewer() {
		return this.logViewer;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	public Proxy getProxy() {
		return this.proxy;
	}

	public void setHotkey(Hotkey hotkey) {
		this.hotkey = hotkey;
	}

	public Hotkey getHotkey() {
		return this.hotkey;
	}

	public Root(List<Configs> configs, String strategy, int index,
			boolean global, boolean enabled, boolean shareOverLan,
			boolean isDefault, int localPort, String pacUrl,
			boolean useOnlinePac, boolean availabilityStatistics,
			boolean autoCheckUpdate, boolean isVerboseLogging,
			LogViewer logViewer, Proxy proxy, Hotkey hotkey) {
		super();
		this.configs = configs;
		this.strategy = strategy;
		this.index = index;
		this.global = global;
		this.enabled = enabled;
		this.shareOverLan = shareOverLan;
		this.isDefault = isDefault;
		this.localPort = localPort;
		this.pacUrl = pacUrl;
		this.useOnlinePac = useOnlinePac;
		this.availabilityStatistics = availabilityStatistics;
		this.autoCheckUpdate = autoCheckUpdate;
		this.isVerboseLogging = isVerboseLogging;
		this.logViewer = logViewer;
		this.proxy = proxy;
		this.hotkey = hotkey;
	}

}