/**
 * openfire_src
 */
package com.kingray.api.vo;

import java.util.Collection;

import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:35:55
 */
public class RemoteAccessApi implements VO {
	private static final long serialVersionUID = -7196600129150871138L;

	private int remoteApiId;
	private String remoteApiAddress;
	private String remoteApiName;
	private AccessApi accessApi;
	private RemoteApiModule remoteApiModule;
	private Collection<RemoteApiParameterMap> remoteApiParameterMapCollection;

	public RemoteAccessApi() {

	}

	public RemoteAccessApi(int remoteApiId, String remoteApiAddress, String remoteApiName,
			AccessApi accessApi, RemoteApiModule remoteApiModule,
			Collection<RemoteApiParameterMap> remoteApiParameterMapCollection) {
		this.remoteApiId = remoteApiId;
		this.remoteApiAddress = remoteApiAddress;
		this.remoteApiName = remoteApiName;
		this.accessApi = accessApi;
		this.remoteApiModule = remoteApiModule;
		this.remoteApiParameterMapCollection = remoteApiParameterMapCollection;
	}

	
	/**
	 * Collection<RemoteApiParameterMap>
	 * @return the remoteApiParameterMapCollection
	 */
	public Collection<RemoteApiParameterMap> getRemoteApiParameterMapCollection() {
		return remoteApiParameterMapCollection;
	}

	/**
	 * Collection<RemoteApiParameterMap>
	 * @param remoteApiParameterMapCollection the remoteApiParameterMapCollection to set
	 */
	public void setRemoteApiParameterMapCollection(
			Collection<RemoteApiParameterMap> remoteApiParameterMapCollection) {
		this.remoteApiParameterMapCollection = remoteApiParameterMapCollection;
	}

	/**
	 * int
	 * 
	 * @return the remoteApiId
	 */
	public int getRemoteApiId() {
		return remoteApiId;
	}

	/**
	 * int
	 * 
	 * @param remoteApiId
	 *            the remoteApiId to set
	 */
	public void setRemoteApiId(int remoteApiId) {
		this.remoteApiId = remoteApiId;
	}

	/**
	 * String
	 * 
	 * @return the remoteApiAddress
	 */
	public String getRemoteApiAddress() {
		return remoteApiAddress;
	}

	/**
	 * String
	 * 
	 * @param remoteApiAddress
	 *            the remoteApiAddress to set
	 */
	public void setRemoteApiAddress(String remoteApiAddress) {
		this.remoteApiAddress = remoteApiAddress;
	}

	/**
	 * String
	 * 
	 * @return the remoteApiName
	 */
	public String getRemoteApiName() {
		return remoteApiName;
	}

	/**
	 * String
	 * 
	 * @param remoteApiName
	 *            the remoteApiName to set
	 */
	public void setRemoteApiName(String remoteApiName) {
		this.remoteApiName = remoteApiName;
	}

	/**
	 * RemoteApiModule
	 * 
	 * @return the remoteApiModule
	 */
	public RemoteApiModule getRemoteApiModule() {
		return remoteApiModule;
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
	 * RemoteApiModule
	 * 
	 * @param remoteApiModule
	 *            the remoteApiModule to set
	 */
	public void setRemoteApiModule(RemoteApiModule remoteApiModule) {
		this.remoteApiModule = remoteApiModule;
	}
	
	/**
	 * <br>2013-11-19 下午6:18:58
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return remoteApiId * 37 + 17;
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
