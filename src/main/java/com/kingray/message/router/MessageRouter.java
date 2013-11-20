/**
 * MessagingSystem
 */
package com.kingray.message.router;

import com.kingray.message.vo.Message;

/**
 * 消息路由<br>
 * 不管消息是由谁发起的，他只管自己的逻辑即可。<br>
 * 如果路由到达终点，则route方法返回true，如果需要路由到下一个路由器，则返回false
 * 
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 上午11:15:31
 */
public interface MessageRouter {
	/**
	 * 路由消息，如果消息发送出去了应当返回true，如果需要下一个路由器处理，则返回false
	 * <br>2013-11-15 下午3:30:24
	 * @param message 要发送的消息
	 * @return 如果消息发送出去了应当返回true，如果需要下一个路由器处理，则返回false
	 */
	public boolean route(Message message);
}
