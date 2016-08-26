package net.varago.stream;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import net.varago.Settings;

public class Stream {

	/**
	 * @author: Zaen Khilji
	 */

	public String getNews() throws IOException {
		String data = getData(Settings.URL);

		return data.substring(data.indexOf("<news>") + 9,
				data.indexOf("</news>"));
	}

	private static String getData(String address) throws IOException {
		URL url = new URL(address);
		InputStream html = null;
		html = url.openStream();
		int c = 0;
		StringBuffer buffer = new StringBuffer("");
		while (c != -1) {

			c = html.read();

			buffer.append((char) c);

		}
		return buffer.toString();
	}
}