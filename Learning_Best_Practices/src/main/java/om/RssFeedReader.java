/**
 * Author : Omkar
 */
package om;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RssFeedReader {

	public static void main(String[] args) throws Exception {

		URL url  = new URL("https://news.google.co.in/news?cf=all&hl=en&pz=1&ned=us&output=rss");

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String sourceCode = "";
		String line;
		while((line = in.readLine()) != null){
			if(line.contains("<title>")){
				sourceCode = line;
				System.out.println(sourceCode + "\n");
			}
		}

		in.close();

	}
}