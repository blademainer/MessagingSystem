/**
 * MessagingSystem
 */
package com.kingray.message.router.impl;

import com.kingray.message.router.MessageRouter;
import com.kingray.message.vo.Message;
import com.xiongyingqi.util.EntityHelper;

/**
 * 金瑞通消息路由
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午4:38:27
 */
public class KingrayChatMessageRouter implements MessageRouter {

	/**
	 * <br>2013-11-15 下午4:38:27
	 * @see com.kingray.message.router.MessageRouter#route(com.kingray.message.vo.Message)
	 */
	@Override
	public boolean route(Message message) {
		EntityHelper.print(message);
		return false;
	}

}
