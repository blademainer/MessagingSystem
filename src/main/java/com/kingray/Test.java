/**
 * MessagingSystem
 */
package com.kingray;

import com.kingray.message.exception.GatewayAlreadyDeployException;
import com.kingray.message.exception.NoAvailableGatewayException;
import com.kingray.message.gateway.AbstractMessageGateway;
import com.kingray.message.gateway.impl.InstationMessageGateway;
import com.kingray.message.vo.Message;
import com.kingray.message.vo.MessageLevel;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午4:22:57
 */
public class Test {
	public static void main(String[] args) {
		Message message = new Message();
		message.setFrom("admin");
		message.setTo("test");
		message.setBody("测试~");
		message.setMessageLevel(MessageLevel.INSTATION_MESSAGE);
		try {
			new InstationMessageGateway();
		} catch (GatewayAlreadyDeployException e1) {
			e1.printStackTrace();
		}
		try {
			AbstractMessageGateway.deliverMessage(message);
		} catch (NoAvailableGatewayException e) {
			e.printStackTrace();
		}
	}
}
