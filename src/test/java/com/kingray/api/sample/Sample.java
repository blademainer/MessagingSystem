/**
 * MessagingSystem
 */
package com.kingray.api.sample;

import java.util.ArrayList;
import java.util.Collection;

import com.kingray.api.DefaultApiAccessor;
import com.kingray.api.vo.AccessApi;
import com.kingray.api.vo.ApiModule;
import com.kingray.api.vo.ApiParameterMap;
import com.kingray.api.vo.RemoteAccessApi;
import com.kingray.api.vo.RemoteApiModule;
import com.kingray.api.vo.RemoteApiParameterMap;
import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 下午5:37:06
 */
public class Sample {
	public static void main(String[] args) {
		ApiModule apiModule = new ApiModule();
		apiModule.setModuleId(1);
		apiModule.setModuleName("user");

		AccessApi accessApi = new AccessApi();
		accessApi.setApiId(1);
		accessApi.setApiName("添加用户");
		accessApi.setApiAddress("127.0.0.1:8080/addUser");
		accessApi.setApiModule(apiModule);

		ApiParameterMap apiParameterMap1 = new ApiParameterMap(1, "userName", "用户名", accessApi, null);
		apiParameterMap1.setLocalParameterValue("admin");
		
		ApiParameterMap apiParameterMap2 = new ApiParameterMap(2, "userPassword", "密码", accessApi, null);
		apiParameterMap2.setLocalParameterValue("111");
		
		ApiParameterMap apiParameterMap3 = new ApiParameterMap(3, "userId", "用户编号", accessApi, null);
		apiParameterMap3.setLocalParameterValue(124);
		
		Collection<ApiParameterMap> apiParameterMapCollection = new ArrayList<ApiParameterMap>();
		apiParameterMapCollection.add(apiParameterMap1);
		apiParameterMapCollection.add(apiParameterMap2);
		apiParameterMapCollection.add(apiParameterMap3);
		accessApi.setApiParameterMapCollection(apiParameterMapCollection);

		RemoteApiModule remoteApiModule = new RemoteApiModule();
		remoteApiModule.setRemoteModuleId(1);
		remoteApiModule.setRemoteModuleName("user");

		RemoteAccessApi remoteAccessApi = new RemoteAccessApi();
		remoteAccessApi.setRemoteApiAddress("10.188.199.3?actionType=addUser");
		remoteAccessApi.setAccessApi(accessApi);
		remoteAccessApi.setRemoteApiModule(remoteApiModule);
		remoteAccessApi.setRemoteApiName("添加用户");

		RemoteApiParameterMap remoteApiParameterMap = new RemoteApiParameterMap(1, "name",
				apiParameterMap1, remoteAccessApi);
		RemoteApiParameterMap remoteApiParameterMap2 = new RemoteApiParameterMap(2, "password",
				apiParameterMap2, remoteAccessApi);
		RemoteApiParameterMap remoteApiParameterMap3 = new RemoteApiParameterMap(3, "id",
				apiParameterMap3, remoteAccessApi);
		Collection<RemoteApiParameterMap> remoteApiParameterMapCollection = new ArrayList<RemoteApiParameterMap>();
		remoteApiParameterMapCollection.add(remoteApiParameterMap);
		remoteApiParameterMapCollection.add(remoteApiParameterMap2);
		remoteApiParameterMapCollection.add(remoteApiParameterMap3);
		remoteAccessApi.setRemoteApiParameterMapCollection(remoteApiParameterMapCollection);
		
		Collection<RemoteAccessApi> remoteAccessApiCollection = new ArrayList<RemoteAccessApi>();
		remoteAccessApiCollection.add(remoteAccessApi);
		accessApi.setRemoteAccessApiCollection(remoteAccessApiCollection);
		
		try {
			DefaultApiAccessor apiAccessor = (DefaultApiAccessor) EntityHelper.getSingleton(DefaultApiAccessor.class);
			apiAccessor.addLocalApi(accessApi);
			apiAccessor.addRemoteApi(remoteAccessApi);
			
			apiAccessor.notifyLocalApiEvent(accessApi);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		
	}
}
