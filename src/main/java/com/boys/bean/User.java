package com.boys.bean;

import java.io.Serializable;
/**
 * 
 *    
 * 项目名称：boys_public   
 * 类名称：User   
 * 类描述：  测试用户
 * 创建人：boys  
 * 创建时间：2017年8月16日 下午1:50:57        
 *
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 5171325707367605492L;
	
	private Integer id;
	private String name;
	private Integer age;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
