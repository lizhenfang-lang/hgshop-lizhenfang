package com.lizhenfang.hgshop.entiy;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 * 分类
 */
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4980357867901481009L;
	
	private Integer id;
	private Integer parentId;//上一级别分类的id
	private String name;//分类的名称
	private String path;//从根 分类到到当前分类的级别
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Category(Integer id, Integer parentId, String name, String path) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.path = path;
	}
	public Category() {
		super();
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", parentId=" + parentId + ", name=" + name + ", path=" + path + "]";
	}
    
	
}