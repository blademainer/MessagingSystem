/**
 * MessagingSystem
 */
package com.kingray.message.gateway;

import com.kingray.message.exception.NoAvailableRoutersInstalledInGatewayException;
import com.kingray.message.exception.NoRoutersInstalledInGatewayException;
import com.kingray.message.router.MessageRouter;
import com.kingray.message.vo.Message;

/**
 * 消息网关，负责决定消息的路由规则
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 上午11:16:19
 */
interface MessageGateway {
	/**
	 * 传递消息
	 * <br>2013-11-15 下午4:40:13
	 * @param message
	 * @throws NoRoutersInstalledInGatewayException 
	 * @throws NoAvailableRoutersInstalledInGatewayException 
	 */
	public void deliver(Message message) throws NoRoutersInstalledInGatewayException, NoAvailableRoutersInstalledInGatewayException;
	/**
	 * 获取网关的路由线路
	 * <br>2013-11-15 下午4:39:57
	 * @return
	 */
	public MessageRouter[] getMessageRouters();
}
