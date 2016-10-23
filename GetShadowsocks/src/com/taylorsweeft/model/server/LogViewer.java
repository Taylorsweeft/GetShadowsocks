package com.taylorsweeft.model.server;

/**
 * @author TaylorSwift
 *
 */
public class LogViewer {
	private String fontName;

	private double fontSize;

	private String bgColor;

	private String textColor;

	private boolean topMost;

	private boolean wrapText;

	private boolean toolbarShown;

	private int width;

	private int height;

	private int top;

	private int left;

	private boolean maximized;

	public LogViewer(String fontName, double fontSize, String bgColor,
			String textColor, boolean topMost, boolean wrapText,
			boolean toolbarShown, int width, int height, int top, int left,
			boolean maximized) {
		super();
		this.fontName = fontName;
		this.fontSize = fontSize;
		this.bgColor = bgColor;
		this.textColor = textColor;
		this.topMost = topMost;
		this.wrapText = wrapText;
		this.toolbarShown = toolbarShown;
		this.width = width;
		this.height = height;
		this.top = top;
		this.left = left;
		this.maximized = maximized;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public String getFontName() {
		return this.fontName;
	}

	public void setFontSize(double fontSize) {
		this.fontSize = fontSize;
	}

	public double getFontSize() {
		return this.fontSize;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getBgColor() {
		return this.bgColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getTextColor() {
		return this.textColor;
	}

	public void setTopMost(boolean topMost) {
		this.topMost = topMost;
	}

	public boolean getTopMost() {
		return this.topMost;
	}

	public void setWrapText(boolean wrapText) {
		this.wrapText = wrapText;
	}

	public boolean getWrapText() {
		return this.wrapText;
	}

	public void setToolbarShown(boolean toolbarShown) {
		this.toolbarShown = toolbarShown;
	}

	public boolean getToolbarShown() {
		return this.toolbarShown;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getTop() {
		return this.top;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getLeft() {
		return this.left;
	}

	public void setMaximized(boolean maximized) {
		this.maximized = maximized;
	}

	public boolean getMaximized() {
		return this.maximized;
	}

}