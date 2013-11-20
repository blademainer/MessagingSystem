/**
 * openfire_src
 */
package com.kingray.api.vo;

import java.util.Collection;

import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:31:56
 */
public class ApiParameterMap implements VO {
	private static final long serialVersionUID = -7179739860862342690L;

	private int parameterId;
	private String localParameterName;
	private Object localParameterValue;
	private String localParameterExplain;
	private AccessApi accessApi;
	private Collection<RemoteApiParameterMap> remoteApiParameterMapCollection;

	public ApiParameterMap() {

	}

	public ApiParameterMap(int parameterId, String localParameterName,
			String localParameterExplain, AccessApi accessApi,
			Collection<RemoteApiParameterMap> remoteApiParameterMapCollection) {
		this.parameterId = parameterId;
		this.localParameterName = localParameterName;
		this.localParameterExplain = localParameterExplain;
		this.accessApi = accessApi;
		this.remoteApiParameterMapCollection = remoteApiParameterMapCollection;
	}
	

	/**
	 * Object
	 * @return the localParameterValue
	 */
	public Object getLocalParameterValue() {
		return localParameterValue;
	}

	/**
	 * Object
	 * @param localParameterValue the localParameterValue to set
	 */
	public void setLocalParameterValue(Object localParameterValue) {
		this.localParameterValue = localParameterValue;
	}

	/**
	 * int
	 * 
	 * @return the parameterId
	 */
	public int getParameterId() {
		return parameterId;
	}

	/**
	 * int
	 * 
	 * @param parameterId
	 *            the parameterId to set
	 */
	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}

	/**
	 * String
	 * 
	 * @return the localParameterName
	 */
	public String getLocalParameterName() {
		return localParameterName;
	}

	/**
	 * String
	 * 
	 * @param localParameterName
	 *            the localParameterName to set
	 */
	public void setLocalParameterName(String localParameterName) {
		this.localParameterName = localParameterName;
	}

	/**
	 * String
	 * 
	 * @return the localParameterExplain
	 */
	public String getLocalParameterExplain() {
		return localParameterExplain;
	}

	/**
	 * String
	 * 
	 * @param localParameterExplain
	 *            the localParameterExplain to set
	 */
	public void setLocalParameterExplain(String localParameterExplain) {
		this.localParameterExplain = localParameterExplain;
	}

	/**
	 * AccessApi
	 * 
	 * @return the accessApi
	 */
	public AccessApi getAccessApi() {
		return accessApi;
	}

	/**
	 * AccessApi
	 * 
	 * @param accessApi
	 *            the accessApi to set
	 */
	public void setAccessApi(AccessApi accessApi) {
		this.accessApi = accessApi;
	}

	/**
	 * Collection<RemoteApiParameterMap>
	 * 
	 * @return the remoteApiParameterMapCollection
	 */
	public Collection<RemoteApiParameterMap> getRemoteApiParameterMapCollection() {
		return remoteApiParameterMapCollection;
	}

	/**
	 * Collection<RemoteApiParameterMap>
	 * 
	 * @param remoteApiParameterMapCollection
	 *            the remoteApiParameterMapCollection to set
	 */
	public void setRemoteApiParameterMapCollection(
			Collection<RemoteApiParameterMap> remoteApiParameterMapCollection) {
		this.remoteApiParameterMapCollection = remoteApiParameterMapCollection;
	}
	/**
	 * <br>2013-11-19 下午6:18:58
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return parameterId * 37 + 17;
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
