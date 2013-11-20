/**
 * MessagingSystem
 */
package com.kingray.message.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

import com.xiongyingqi.util.EntityHelper;

/**
 * 消息等级
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午2:26:18
 */
public class MessageLevel implements Serializable{
	private static final long serialVersionUID = -6455840915968189862L;

	private static Collection<MessageLevel> messagePriorities = new LinkedHashSet<MessageLevel>();
	
	public static final MessageLevel CHAT = new MessageLevel(1, "CHAT", "聊天");
	public static final MessageLevel INSTATION_MESSAGE = new MessageLevel(2, "INSTATION_MESSAGE", "站内短信");
	public static final MessageLevel URGENCY_MESSAGE = new MessageLevel(3, "URGENCY_MESSAGE", "紧急消息");
	
	
	
	private int priority;
	private String code;
	private String name;
	
	public MessageLevel(){
		messagePriorities.add(this);
	}
	
	public MessageLevel(int priority, String code, String name){
		this();
		this.priority = priority;
		this.code = code;
		this.name = name;
	}
	/**
	 * int
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * int
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	 * String
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * String
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * String
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * String
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * <br>2013-11-15 下午3:51:05
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return EntityHelper.reflectToString(this);
	}
	/**
	 * <br>2013-11-15 下午3:51:41
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return EntityHelper.equals(this, obj);
	}
	/**
	 * <br>2013-11-15 下午3:52:46
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return priority;
	}
	
	/**
	 * 获取所有的消息级别，以升序排序
	 * Collection<MessagePriority>
	 * @return the messagePriorities
	 */
	public static Collection<MessageLevel> getMessagePriorities() {
		List<MessageLevel> messagePrioritiesLocal = new ArrayList<MessageLevel>(messagePriorities);
		
		Collections.sort(messagePrioritiesLocal, new Comparator<MessageLevel>() {
			@Override
			public int compare(MessageLevel o1, MessageLevel o2) {
				if(o1.getPriority() < o2.getPriority()){
					return -1;
				} else if(o1.getPriority() > o2.getPriority()) {
					return 1;
				}
				return 0;
			}
		});
		return messagePrioritiesLocal;
	}
}
