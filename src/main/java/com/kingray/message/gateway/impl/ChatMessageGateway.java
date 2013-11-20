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
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午4:48:44
 */
public class ChatMessageGateway extends AbstractMessageGateway {

	/**
	 * @param messagePriority
	 * @throws GatewayAlreadyDeployException
	 */
	public ChatMessageGateway() throws GatewayAlreadyDeployException {
		super(MessageLevel.CHAT);
	}

	/**
	 * <br>
	 * 2013-11-15 下午4:48:44
	 * 
	 * @see com.kingray.message.gateway.MessageGateway#getMessageRouters()
	 */
	@Override
	public MessageRouter[] getMessageRouters() {
		return new MessageRouter[] { new InstationMessageRouter(), new KingrayChatMessageRouter() };
	}

}
