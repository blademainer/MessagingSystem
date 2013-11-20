/**
 * MessagingSystem
 */
package com.kingray.message.gateway;

import java.util.LinkedHashMap;
import java.util.Map;

import com.kingray.message.exception.GatewayAlreadyDeployException;
import com.kingray.message.exception.NoAvailableGatewayException;
import com.kingray.message.exception.NoAvailableRoutersInstalledInGatewayException;
import com.kingray.message.exception.NoRoutersInstalledInGatewayException;
import com.kingray.message.router.MessageRouter;
import com.kingray.message.vo.MessageLevel;
import com.kingray.message.vo.Message;

/**
 * 消息传递类
 * 
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午2:33:19
 */
public abstract class AbstractMessageGateway implements MessageGateway {
	private MessageLevel messageLevel;

	private static Map<MessageLevel, MessageGateway> priorityMap;
	private static final Object LOCK = new Object();

	public AbstractMessageGateway(MessageLevel messageLevel) throws GatewayAlreadyDeployException {
		synchronized (LOCK) {
			if (priorityMap == null) {
				priorityMap = new LinkedHashMap<>();
			}
			MessageGateway gateway = priorityMap.get(messageLevel);
			if (gateway == null) {
				priorityMap.put(messageLevel, this);
			} else {
				throw new GatewayAlreadyDeployException();
			}
		}
		this.messageLevel = messageLevel;
	}

	/**
	 * 传递消息的默认实现 ，如果网关有自己的传递规则，则应当重写本方法。<br>
	 * 实现的方式是：查找路由，并将消息对象传递给路由器。<br>
	 * 如果该路由结果返回false，则继续寻找下一个路由，直到有一个路由器返回true或者遍历完成所有路由，如果返回true，则停止查找
	 * 2013-11-18 上午10:28:52
	 * 
	 * @throws NoRoutersInstalledInGatewayException
	 * @throws NoAvailableRoutersInstalledInGatewayException
	 * @see com.kingray.message.gateway.MessageGateway#deliver(com.kingray.message.vo.Message)
	 */
	@Override
	public void deliver(Message message) throws NoRoutersInstalledInGatewayException,
			NoAvailableRoutersInstalledInGatewayException {
		MessageRouter[] routers = getMessageRouters();
		if (routers == null) {
			throw new NoRoutersInstalledInGatewayException();
		}
		if (routers.length == 0) {
			throw new NoAvailableRoutersInstalledInGatewayException();
		}

		for (int i = 0; i < routers.length && !routers[i].route(message); i++) {
		}
	}

	/**
	 * 传递消息入口，根据已经注册的消息传递类进行传递 <br>
	 * 2013-11-15 下午3:12:14
	 * 
	 * @param message
	 * @throws NoAvailableGatewayException
	 *             如果没有MessageGateway的实现类，则抛出没有网关实现类的异常
	 */
	public static void deliverMessage(Message message) throws NoAvailableGatewayException {
		synchronized (LOCK) {
			if (priorityMap == null) {
				throw new NoAvailableGatewayException();
			}
		}
		if (message != null) {
			MessageLevel level = message.getMessageLevel();
			MessageGateway gateway = priorityMap.get(level);
			if (gateway == null) {
				throw new NoAvailableGatewayException("指定级别的消息没有网关实现类，请实现对应级别" + level
						+ "的MessageGateway");
			}

			try {
				gateway.deliver(message);
			} catch (NoRoutersInstalledInGatewayException e) {
				e.printStackTrace();
			} catch (NoAvailableRoutersInstalledInGatewayException e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * MessagePriority
	 * 
	 * @return the messagePriority
	 */
	public MessageLevel getMessagePriority() {
		return messageLevel;
	}

	/**
	 * MessagePriority
	 * 
	 * @param messageLevel
	 *            the messagePriority to set
	 */
	public void setMessagePriority(MessageLevel messageLevel) {
		this.messageLevel = messageLevel;
	}

	/**
	 * 获取优先级的映射表 Map<MessagePriority,MessageDeliver>
	 * 
	 * @return the priorityMap
	 */
	public static Map<MessageLevel, MessageGateway> getPriorityMap() {
		return priorityMap;
	}

}
