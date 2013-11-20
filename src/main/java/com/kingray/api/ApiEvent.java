/**
 * openfire_src
 */
package com.kingray.api;

import com.kingray.api.vo.*;

/**
 * 服务器接口事件发生，实现类查找对应的远程接口进行调用
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:55:58
 */
public interface ApiEvent {
	public void apiInvoked(AccessApi accessApi);
}
