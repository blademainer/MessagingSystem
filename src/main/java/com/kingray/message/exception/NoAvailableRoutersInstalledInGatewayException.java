/**
 * MessagingSystem
 */
package com.kingray.message.exception;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午3:56:47
 */
public class NoAvailableRoutersInstalledInGatewayException extends Exception{

	private static final long serialVersionUID = -5466082224920112185L;

	public NoAvailableRoutersInstalledInGatewayException() {
		super("当前网关没有可用的路由！请添加路由。");
	}

	public NoAvailableRoutersInstalledInGatewayException(String message) {
		super(message);
	}

	public NoAvailableRoutersInstalledInGatewayException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public NoAvailableRoutersInstalledInGatewayException(Throwable throwable) {
		super(throwable);
	}
}
