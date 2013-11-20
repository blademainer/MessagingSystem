/**
 * MessagingSystem
 */
package com.xiongyingqi.util;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-18 下午10:18:24
 */
public abstract class Encrypt {
	public static String bytesToString(byte[] byteArray, boolean toUpperCase) {
		StringBuffer md5StrBuff = new StringBuffer();

		for (int i = 0; i < byteArray.length; i++) {
			if (Integer.toHexString(0xFF & byteArray[i]).length() == 1) {
				md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
			} else {
				String hex = Integer.toHexString(0xFF & byteArray[i]);
				if (toUpperCase) {
					hex = hex.toUpperCase();
				}
				md5StrBuff.append(hex);
			}
		}
		return md5StrBuff.toString();
	}
}
