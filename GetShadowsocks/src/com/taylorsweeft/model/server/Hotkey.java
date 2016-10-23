package com.taylorsweeft.model.server;

/**
 * @author TaylorSwift
 *
 */
public class Hotkey {
	private String SwitchSystemProxy;

	private String ChangeToPac;

	private String ChangeToGlobal;

	private String SwitchAllowLan;

	private String ShowLogs;

	private String ServerMoveUp;

	private String ServerMoveDown;

	public Hotkey(String switchSystemProxy, String changeToPac,
			String changeToGlobal, String switchAllowLan, String showLogs,
			String serverMoveUp, String serverMoveDown) {
		super();
		SwitchSystemProxy = switchSystemProxy;
		ChangeToPac = changeToPac;
		ChangeToGlobal = changeToGlobal;
		SwitchAllowLan = switchAllowLan;
		ShowLogs = showLogs;
		ServerMoveUp = serverMoveUp;
		ServerMoveDown = serverMoveDown;
	}

	public void setSwitchSystemProxy(String SwitchSystemProxy) {
		this.SwitchSystemProxy = SwitchSystemProxy;
	}

	public String getSwitchSystemProxy() {
		return this.SwitchSystemProxy;
	}

	public void setChangeToPac(String ChangeToPac) {
		this.ChangeToPac = ChangeToPac;
	}

	public String getChangeToPac() {
		return this.ChangeToPac;
	}

	public void setChangeToGlobal(String ChangeToGlobal) {
		this.ChangeToGlobal = ChangeToGlobal;
	}

	public String getChangeToGlobal() {
		return this.ChangeToGlobal;
	}

	public void setSwitchAllowLan(String SwitchAllowLan) {
		this.SwitchAllowLan = SwitchAllowLan;
	}

	public String getSwitchAllowLan() {
		return this.SwitchAllowLan;
	}

	public void setShowLogs(String ShowLogs) {
		this.ShowLogs = ShowLogs;
	}

	public String getShowLogs() {
		return this.ShowLogs;
	}

	public void setServerMoveUp(String ServerMoveUp) {
		this.ServerMoveUp = ServerMoveUp;
	}

	public String getServerMoveUp() {
		return this.ServerMoveUp;
	}

	public void setServerMoveDown(String ServerMoveDown) {
		this.ServerMoveDown = ServerMoveDown;
	}

	public String getServerMoveDown() {
		return this.ServerMoveDown;
	}

}