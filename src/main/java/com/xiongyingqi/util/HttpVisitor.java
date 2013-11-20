/**
 * MessagingSystem
 */
package com.xiongyingqi.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 下午9:35:46
 */
public class HttpVisitor implements CookieStore {
	public static void main(String[] args) throws URISyntaxException {
		HttpClientBuilder client = HttpClientBuilder.create();
		client.setUserAgent("YIXUN_CLIENT");
		final CloseableHttpClient closeableHttpClient = client.setDefaultCookieStore(new HttpVisitor()).build();

		//		HttpHost host = new HttpHost("http://10.188.199.4:", 8080);
		URI uri = new URIBuilder("http://10.188.199.4:8080/YIXUN_1.5_EE/login/doLogin").addParameter("userName", "hmm").addParameter("userPassword", "111").build();

		final HttpPost httpPost = new HttpPost(uri);
		try {
			ThreadPool.setPoolSize(1000);
		} catch (ThreadPoolException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < 100000; i++) {
			Thread thread = new Thread(){
				/**
				 * <br>2013-11-20 下午6:17:09
				 * @see java.lang.Thread#run()
				 */
				@Override
				public void run() {
					try {
						CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
						Header[] headers = response.getAllHeaders();
						for (int i = 0; i < headers.length; i++) {
							Header header = headers[i];
							System.out.print(header.getName() + ": ");
							System.out.print(header.getValue());
							System.out.println();
						}
						
						HttpEntity entity = response.getEntity();
						InputStream inputStream = entity.getContent();
						String rs = FileHelper.readInputStreamToString(inputStream);
					} catch (ClientProtocolException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
//			thread.start();
			ThreadPool.invoke(thread);
		}
	}

	private List<Cookie> cookies = new LinkedList<>();
	/**
	 * <br>2013-11-20 下午5:03:00
	 * @see org.apache.http.client.CookieStore#addCookie(org.apache.http.cookie.Cookie)
	 */
	@Override
	public void addCookie(Cookie cookie) {
		cookies.add(cookie);
	}

	/**
	 * <br>2013-11-20 下午5:03:00
	 * @see org.apache.http.client.CookieStore#getCookies()
	 */
	@Override
	public List<Cookie> getCookies() {
		return cookies;
	}

	/**
	 * <br>2013-11-20 下午5:03:00
	 * @see org.apache.http.client.CookieStore#clearExpired(java.util.Date)
	 */
	@Override
	public boolean clearExpired(Date date) {
		return false;
	}

	/**
	 * <br>2013-11-20 下午5:03:00
	 * @see org.apache.http.client.CookieStore#clear()
	 */
	@Override
	public void clear() {
		cookies.clear();
	}
}
