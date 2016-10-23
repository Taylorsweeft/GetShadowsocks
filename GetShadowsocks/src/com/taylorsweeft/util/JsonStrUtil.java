package com.taylorsweeft.util;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.taylorsweeft.model.Server;
import com.taylorsweeft.model.server.Configs;
import com.taylorsweeft.model.server.Hotkey;
import com.taylorsweeft.model.server.LogViewer;
import com.taylorsweeft.model.server.Proxy;
import com.taylorsweeft.model.server.Root;

/**
 * @author TaylorSwift
 * 
 */
public class JsonStrUtil {

	public static String getJsonStr(String url) {
		List<Configs> configs = new ArrayList<>();
		for (Server server : GetServerUtil.getServers(url)) {
			configs.add(new Configs(server.getUrl(), Integer.parseInt(server
					.getPort()), server.getPassword(), "aes-256-cfb", "",
					false, 5));

		}
		LogViewer logViewer = new LogViewer("Consolas", 8.0, "black", "white",
				false, false, false, 600, 400, 338, 766, true);
		Proxy proxy = new Proxy(false, 0, "", 0, 3);
		Hotkey hotkey = new Hotkey("", "", "", "", "", "", "");
		Root root = new Root(configs, "null", 1, false, true, false, false,
				1080, null, false, false, false, false, logViewer, proxy,
				hotkey);
		String jsonStr = JSON.toJSONString(root);
		return jsonStr;

	}
}
