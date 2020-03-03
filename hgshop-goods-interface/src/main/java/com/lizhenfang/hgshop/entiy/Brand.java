package com.lizhenfang.hgshop.entiy;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 * 品牌
 */
public class Brand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5200487667740475219L;
	
	private Integer id; //id
	private String name;//品牌名称
	private String firstChar;//品牌首字母
	private int deletedFlag;//伪删除标识

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

	public String getFirstChar() {
		return firstChar;
	}

	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}

	public int getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(int deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public Brand(Integer id, String name, String firstChar, int deletedFlag) {
		super();
		this.id = id;
		this.name = name;
		this.firstChar = firstChar;
		this.deletedFlag = deletedFlag;
	}

	public Brand() {
		super();
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", firstChar=" + firstChar + ", deletedFlag=" + deletedFlag + "]";
	}

}
