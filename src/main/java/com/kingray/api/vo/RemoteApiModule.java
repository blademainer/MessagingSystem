/**
 * openfire_src
 */
package com.kingray.api.vo;

import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:34:12
 */
public class RemoteApiModule implements VO {
	private static final long serialVersionUID = -5359194027303151598L;

	private int remoteModuleId;
	private String remoteModuleName;

	public RemoteApiModule() {

	}

	public RemoteApiModule(int remoteModuleId, String remoteModuleName) {
		this.remoteModuleId = remoteModuleId;
		this.remoteModuleName = remoteModuleName;
	}

	/**
	 * int
	 * 
	 * @return the remoteModuleId
	 */
	public int getRemoteModuleId() {
		return remoteModuleId;
	}

	/**
	 * int
	 * 
	 * @param remoteModuleId
	 *            the remoteModuleId to set
	 */
	public void setRemoteModuleId(int remoteModuleId) {
		this.remoteModuleId = remoteModuleId;
	}

	/**
	 * String
	 * 
	 * @return the remoteModuleName
	 */
	public String getRemoteModuleName() {
		return remoteModuleName;
	}

	/**
	 * String
	 * 
	 * @param remoteModuleName
	 *            the remoteModuleName to set
	 */
	public void setRemoteModuleName(String remoteModuleName) {
		this.remoteModuleName = remoteModuleName;
	}
	/**
	 * <br>2013-11-19 下午6:18:58
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return remoteModuleId * 37 + 17;
	}
	/**
	 * <br>2013-11-19 下午6:19:51
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return EntityHelper.equals(this, obj);
	}
}
