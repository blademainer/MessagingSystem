/**
 * openfire_src
 */
package com.kingray.api.vo;

import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:37:30
 */
public class RemoteApiParameterMap implements VO {
	private static final long serialVersionUID = -9178115411996767910L;

	private int remoteParameterId;
	private String remoteParameterName;
	private ApiParameterMap apiParameterMap;
	private RemoteAccessApi accessApi;

	public RemoteApiParameterMap() {

	}

	public RemoteApiParameterMap(int remoteParameterId, String remoteParameterName,
			ApiParameterMap apiParameterMap, RemoteAccessApi accessApi) {
		this.remoteParameterId = remoteParameterId;
		this.remoteParameterName = remoteParameterName;
		this.apiParameterMap = apiParameterMap;
		this.accessApi = accessApi;
	}

	/**
	 * RemoteAccessApi
	 * 
	 * @return the accessApi
	 */
	public RemoteAccessApi getAccessApi() {
		return accessApi;
	}

	/**
	 * RemoteAccessApi
	 * 
	 * @param accessApi
	 *            the accessApi to set
	 */
	public void setAccessApi(RemoteAccessApi accessApi) {
		this.accessApi = accessApi;
	}

	/**
	 * int
	 * 
	 * @return the remoteParameterId
	 */
	public int getRemoteParameterId() {
		return remoteParameterId;
	}

	/**
	 * int
	 * 
	 * @param remoteParameterId
	 *            the remoteParameterId to set
	 */
	public void setRemoteParameterId(int remoteParameterId) {
		this.remoteParameterId = remoteParameterId;
	}

	/**
	 * String
	 * 
	 * @return the remoteParameterName
	 */
	public String getRemoteParameterName() {
		return remoteParameterName;
	}

	/**
	 * String
	 * 
	 * @param remoteParameterName
	 *            the remoteParameterName to set
	 */
	public void setRemoteParameterName(String remoteParameterName) {
		this.remoteParameterName = remoteParameterName;
	}

	/**
	 * ApiParameterMap
	 * 
	 * @return the apiParameterMap
	 */
	public ApiParameterMap getApiParameterMap() {
		return apiParameterMap;
	}

	/**
	 * ApiParameterMap
	 * 
	 * @param apiParameterMap
	 *            the apiParameterMap to set
	 */
	public void setApiParameterMap(ApiParameterMap apiParameterMap) {
		this.apiParameterMap = apiParameterMap;
	}
	/**
	 * <br>2013-11-19 下午6:18:58
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return remoteParameterId * 37 + 17;
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
