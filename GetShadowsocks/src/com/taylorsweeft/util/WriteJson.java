package com.taylorsweeft.util;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author TaylorSwift
 *
 */
public class WriteJson {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		String josnString = JsonStrUtil
				.getJsonStr("http://www.ishadowsocks.org/");
		try {

			FileOutputStream out = new FileOutputStream("gui-config.json");
			out.write(josnString.getBytes());
			out.close();
			Process p = Runtime.getRuntime().exec("Shadowsocks.exe");
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}

}
