/**
 * MessagingSystem
 */
package com.kingray.message.exception;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午3:56:47
 */
public class GatewayAlreadyDeployException extends Exception{

	private static final long serialVersionUID = -4006493852343907262L;

	public GatewayAlreadyDeployException() {
		super("当前网关已经被安装，请检查是否重复创建同一类型网关！");
	}

	public GatewayAlreadyDeployException(String message) {
		super(message);
	}

	public GatewayAlreadyDeployException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public GatewayAlreadyDeployException(Throwable throwable) {
		super(throwable);
	}
}
