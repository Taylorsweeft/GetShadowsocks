package com.taylorsweeft.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.taylorsweeft.model.Server;

/**
 * @author TaylorSwift
 *
 */
public class GetServerUtil {
	public static List<Server> servers;

	public static List<Server> getServers(String url) {
		Elements links = null;
		Document doc;
		int flag = 0;
		servers = new ArrayList<>();
		try {
			doc = Jsoup.connect(url).get();
			Elements ListDiv = doc.getElementsByAttributeValue("class",
					"col-sm-4 text-center");
			for (Element element : ListDiv) {
				links = element.getElementsByTag("h4");
				Server server = new Server(null, null, null);
				for (Element link : links) {
					if (flag < 4) {

						String linkText = link.text().trim();
						if (linkText.contains("��������ַ")) {
							server.setUrl(linkText.substring(7,
									linkText.length()));
							flag++;
						} else if (linkText.contains("�˿�")) {
							server.setPort(linkText.substring(3,
									linkText.length()));
							flag++;
						} else if (linkText.contains("����:")) {
							server.setPassword(linkText.substring(4,
									linkText.length()));
							flag++;
						}

						if (flag == 3) {
							servers.add(server);
							flag = 0;
						}
					}

				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return servers;

	}
}
