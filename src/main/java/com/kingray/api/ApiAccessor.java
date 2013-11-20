/**
 * openfire_src
 */
package com.kingray.api;

import com.kingray.api.vo.*;

/**
 * 允许
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:23:04
 */
public interface ApiAccessor {
	/**
	 * 增加本地接口
	 * <br>2013-11-19 下午2:26:10
	 * @param accessApi
	 */
	public void addLocalApi(AccessApi accessApi);
	
	/**
	 * 增加远程接口
	 * <br>2013-11-19 下午2:26:25
	 * @param remoteAccessApi
	 */
	public void addRemoteApi(RemoteAccessApi remoteAccessApi);
	
	/**
	 * 通知接口事件
	 * <br>2013-11-19 下午2:26:34
	 * @param accessApi
	 */
	public void notifyLocalApiEvent(AccessApi accessApi);
}
