/**
 * MessagingSystem
 */
package com.kingray.message.exception;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午3:56:47
 */
public class NoRoutersInstalledInGatewayException extends Exception{

	private static final long serialVersionUID = 511594502543712779L;

	public NoRoutersInstalledInGatewayException() {
		super("当前网关没有可用的路由！请添加路由。");
	}

	public NoRoutersInstalledInGatewayException(String message) {
		super(message);
	}

	public NoRoutersInstalledInGatewayException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public NoRoutersInstalledInGatewayException(Throwable throwable) {
		super(throwable);
	}
}
