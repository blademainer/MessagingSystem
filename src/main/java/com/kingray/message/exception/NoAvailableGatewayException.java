/**
 * MessagingSystem
 */
package com.kingray.message.exception;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午3:56:47
 */
public class NoAvailableGatewayException extends Exception{
	private static final long serialVersionUID = -1699021765051320830L;

	public NoAvailableGatewayException() {
		super("当前没有可用的网关使用！请确认安装了消息网关！");
	}

	public NoAvailableGatewayException(String message) {
		super(message);
	}

	public NoAvailableGatewayException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public NoAvailableGatewayException(Throwable throwable) {
		super(throwable);
	}
}
