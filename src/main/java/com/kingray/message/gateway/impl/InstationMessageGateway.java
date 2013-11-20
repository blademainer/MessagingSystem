/**
 * MessagingSystem
 */
package com.kingray.message.gateway.impl;

import com.kingray.message.exception.GatewayAlreadyDeployException;
import com.kingray.message.gateway.AbstractMessageGateway;
import com.kingray.message.router.MessageRouter;
import com.kingray.message.router.impl.InstationMessageRouter;
import com.kingray.message.router.impl.KingrayChatMessageRouter;
import com.kingray.message.vo.MessageLevel;

/**
 * 站内消息网关
 * 
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午3:06:19
 */
public class InstationMessageGateway extends AbstractMessageGateway {

	/**
	 * @param messagePriority
	 * @throws GatewayAlreadyDeployException
	 */
	public InstationMessageGateway() throws GatewayAlreadyDeployException {
		super(MessageLevel.INSTATION_MESSAGE);
	}

	/**
	 * <br>
	 * 2013-11-15 下午4:39:47
	 * 
	 * @see com.kingray.message.gateway.MessageGateway#getMessageRouters()
	 */
	@Override
	public MessageRouter[] getMessageRouters() {
		return new MessageRouter[] { new KingrayChatMessageRouter(), new InstationMessageRouter() };
	}

}
