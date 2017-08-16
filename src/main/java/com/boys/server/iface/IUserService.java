package com.boys.server.iface;

import com.boys.bean.User;
/**
 * 
 * 项目名称：boys_public   
 * 类名称：IUserService   
 * 类描述： 提供Server公共接口  
 * 创建人：boys  
 * 创建时间：2017年8月16日 下午1:55:57
 */
public interface IUserService {
   
	
	public void creteUser(User user);

	public User getUserById(String userId);
	
}
