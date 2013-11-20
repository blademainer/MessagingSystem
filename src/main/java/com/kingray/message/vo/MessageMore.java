/**
 * MessagingSystem
 */
package com.kingray.message.vo;

import java.io.Serializable;

/**
 * 消息的附带信息
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午2:24:03
 */
public class MessageMore implements Serializable{
	private static final long serialVersionUID = -6231903939116288473L;
	private Object holderObject;
	
	public MessageMore(Object holderObject){
		this.holderObject = holderObject;
	}
	/**
	 * Object
	 * @return the holderObject
	 */
	public Object getHolderObject() {
		return holderObject;
	}
	/**
	 * Object
	 * @param holderObject the holderObject to set
	 */
	public void setHolderObject(Object holderObject) {
		this.holderObject = holderObject;
	}
	public static void main(String[] args) {
		MessageLevel.getMessagePriorities();
	}
	
}
