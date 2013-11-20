/**
 * MessagingSystem
 */
package com.kingray.message.router.impl;

import com.kingray.message.router.MessageRouter;
import com.kingray.message.vo.Message;
import com.xiongyingqi.util.EntityHelper;

/**
 * 站内短信路由
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午4:32:13
 */
public class InstationMessageRouter implements MessageRouter{

	/**
	 * <br>2013-11-15 下午4:32:26
	 * @see com.kingray.message.router.MessageRouter#route(com.kingray.message.vo.Message)
	 */
	@Override
	public boolean route(Message message) {
		EntityHelper.print(message);
		return false;
	}
	
}
