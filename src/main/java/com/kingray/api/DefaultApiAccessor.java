/**
 * openfire_src
 */
package com.kingray.api;

import java.util.Collection;
import java.util.HashSet;

import com.kingray.api.vo.*;
import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 下午2:27:19
 */
public class DefaultApiAccessor implements ApiAccessor {
	private Collection<AccessApi> accessApis;
	private Collection<RemoteAccessApi> remoteAccessApis;
	public static final Object LOCK = new Object();

	/**
	 * <br>
	 * 2013-11-19 下午2:28:32
	 * 
	 * @see com.kingray.openfire.plugin.api.ApiAccessor#addLocalApi(com.kingray.openfire.plugin.api.vo.AccessApi)
	 */
	@Override
	public void addLocalApi(AccessApi accessApi) {
		synchronized (LOCK) {
			if (accessApis == null) {
				accessApis = new HashSet<AccessApi>();
			}
		}
		accessApis.add(accessApi);
	}

	/**
	 * <br>
	 * 2013-11-19 下午2:28:32
	 * 
	 * @see com.kingray.openfire.plugin.api.ApiAccessor#addRemoteApi(com.kingray.openfire.plugin.api.vo.RemoteAccessApi)
	 */
	@Override
	public void addRemoteApi(RemoteAccessApi remoteAccessApi) {
		synchronized (LOCK) {
			if (remoteAccessApis == null) {
				remoteAccessApis = new HashSet<RemoteAccessApi>();
			}
		}
		remoteAccessApis.add(remoteAccessApi);
	}

	/**
	 * <br>
	 * 2013-11-19 下午2:28:32
	 * 
	 * @see com.kingray.openfire.plugin.api.ApiAccessor#notifyLocalApiEvent(com.kingray.openfire.plugin.api.vo.AccessApi)
	 */
	@Override
	public void notifyLocalApiEvent(AccessApi accessApi) {
		Collection<RemoteAccessApi> remoteAccessApiCollection = accessApi
				.getRemoteAccessApiCollection();
		for (RemoteAccessApi remoteAccessApi : remoteAccessApiCollection) {
			StringBuilder builder = new StringBuilder();

			String address = remoteAccessApi.getRemoteApiAddress();
			builder.append(address);

			if (!address.contains("?")) {
				builder.append("?type=api");
			}

			Collection<RemoteApiParameterMap> remoteApiParameterMapCollection = remoteAccessApi
					.getRemoteApiParameterMapCollection();
			for (RemoteApiParameterMap remoteApiParameterMap : remoteApiParameterMapCollection) {
				ApiParameterMap apiParameterMap = remoteApiParameterMap.getApiParameterMap();
				Object value = apiParameterMap.getLocalParameterValue();

				builder.append("&");
				builder.append(remoteApiParameterMap.getRemoteParameterName());
				builder.append("=");
				builder.append(value);
			}

			EntityHelper.print(builder.toString());// result
		}
	}
	
	
}
