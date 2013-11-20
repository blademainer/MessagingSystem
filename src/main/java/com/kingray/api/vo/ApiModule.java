/**
 * openfire_src
 */
package com.kingray.api.vo;

import com.xiongyingqi.util.EntityHelper;

/**
 * @author 瑛琪 <a href="http://xiongyingqi.com">xiongyingqi.com</a>
 * @version 2013-11-19 上午10:24:47
 */
public class ApiModule implements VO{
	private static final long serialVersionUID = -7704612546743049617L;
	
	private int moduleId;
	private String moduleName;
	public ApiModule(){}
	public ApiModule(int moduleId, String moduleName){
		this.moduleId = moduleId;
		this.moduleName = moduleName;
	}
	
	/**
	 * int
	 * @return the moduleId
	 */
	public int getModuleId() {
		return moduleId;
	}
	/**
	 * int
	 * @param moduleId the moduleId to set
	 */
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	/**
	 * String
	 * @return the moduleName
	 */
	public String getModuleName() {
		return moduleName;
	}
	/**
	 * String
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	/**
	 * <br>2013-11-19 下午6:18:58
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return moduleId * 37 + 17;
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
