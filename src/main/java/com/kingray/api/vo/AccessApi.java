/**
 * openfire_src
 */
package com.kingray.api.vo;

import java.util.Collection;

import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:28:46
 */
public class AccessApi implements VO {
	private static final long serialVersionUID = -4766434065147290021L;

	private int apiId;
	private String apiAddress;
	private String apiName;
	private ApiModule apiModule;
	private Collection<ApiParameterMap> apiParameterMapCollection;
	private Collection<RemoteAccessApi> remoteAccessApiCollection;

	public AccessApi() {

	}

	public AccessApi(int apiId, String apiAddress, String apiName, ApiModule apiModule,
			Collection<ApiParameterMap> apiParameterMapCollection) {
		this.apiId = apiId;
		this.apiAddress = apiAddress;
		this.apiName = apiName;
		this.apiModule = apiModule;
		this.apiParameterMapCollection = apiParameterMapCollection;
	}

	
	/**
	 * Collection<RemoteAccessApi>
	 * @return the remoteAccessApiCollection
	 */
	public Collection<RemoteAccessApi> getRemoteAccessApiCollection() {
		return remoteAccessApiCollection;
	}

	/**
	 * Collection<RemoteAccessApi>
	 * @param remoteAccessApiCollection the remoteAccessApiCollection to set
	 */
	public void setRemoteAccessApiCollection(Collection<RemoteAccessApi> remoteAccessApiCollection) {
		this.remoteAccessApiCollection = remoteAccessApiCollection;
	}

	/**
	 * int
	 * 
	 * @return the apiId
	 */
	public int getApiId() {
		return apiId;
	}

	/**
	 * int
	 * 
	 * @param apiId
	 *            the apiId to set
	 */
	public void setApiId(int apiId) {
		this.apiId = apiId;
	}

	/**
	 * String
	 * 
	 * @return the apiAddress
	 */
	public String getApiAddress() {
		return apiAddress;
	}

	/**
	 * String
	 * 
	 * @param apiAddress
	 *            the apiAddress to set
	 */
	public void setApiAddress(String apiAddress) {
		this.apiAddress = apiAddress;
	}

	/**
	 * String
	 * 
	 * @return the apiName
	 */
	public String getApiName() {
		return apiName;
	}

	/**
	 * String
	 * 
	 * @param apiName
	 *            the apiName to set
	 */
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	/**
	 * ApiModule
	 * 
	 * @return the apiModule
	 */
	public ApiModule getApiModule() {
		return apiModule;
	}

	/**
	 * ApiModule
	 * 
	 * @param apiModule
	 *            the apiModule to set
	 */
	public void setApiModule(ApiModule apiModule) {
		this.apiModule = apiModule;
	}

	/**
	 * Collection<ApiParameterMap>
	 * 
	 * @return the apiParameterMapCollection
	 */
	public Collection<ApiParameterMap> getApiParameterMapCollection() {
		return apiParameterMapCollection;
	}

	/**
	 * Collection<ApiParameterMap>
	 * 
	 * @param apiParameterMapCollection
	 *            the apiParameterMapCollection to set
	 */
	public void setApiParameterMapCollection(Collection<ApiParameterMap> apiParameterMapCollection) {
		this.apiParameterMapCollection = apiParameterMapCollection;
	}
	/**
	 * <br>2013-11-19 下午6:18:58
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return apiId * 37 + 17;
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
