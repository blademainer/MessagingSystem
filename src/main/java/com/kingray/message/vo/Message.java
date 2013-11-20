/**
 * MessagingSystem
 */
package com.kingray.message.vo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-15 下午2:22:46
 */
public class Message extends EntityHelper implements Serializable{
	private static final long serialVersionUID = -1706714199726840194L;
	
	private String from;
	private String to;
	private String subject;
	private String body;
	private Date dateTime;
	private MessageLevel messageLevel;
	private Collection<MessageMore> messageMores;
	
	/**
	 * 发送人
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * String
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * 接收人
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * String
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * 标题
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * String
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * 消息内容
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * String
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * 发送时间
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}
	/**
	 * Date
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	/**
	 * 消息级别
	 * MessageLevel
	 * @return the messageLevel
	 */
	public MessageLevel getMessageLevel() {
		return messageLevel;
	}
	
	/**
	 * MessageLevel
	 * @param messageLevel the messageLevel to set
	 */
	public void setMessageLevel(MessageLevel messageLevel) {
		this.messageLevel = messageLevel;
	}
	
	/**
	 * 附带内容
	 * @return the messageMores
	 */
	public Collection<MessageMore> getMessageMores() {
		return messageMores;
	}
	
	/**
	 * Collection<MessageMore>
	 * @param messageMores the messageMores to set
	 */
	public void setMessageMores(Collection<MessageMore> messageMores) {
		this.messageMores = messageMores;
	}
	
}
