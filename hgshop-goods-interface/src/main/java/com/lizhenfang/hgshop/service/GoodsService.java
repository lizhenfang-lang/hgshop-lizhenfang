package com.lizhenfang.hgshop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lizhenfang.hgshop.entiy.Brand;
import com.lizhenfang.hgshop.entiy.Category;
/**
 * 
 * @author Administrator
 *Dubbo的服务接口函数必须要有非void的返回值***
 */
public interface GoodsService {
	
    int addBrand(Brand brand);
    int updateBrand(Brand brand);
    int deleteBrand(Integer id);
    
    PageInfo<Brand> listBrand (String firstChar,int page);
    
    int addCategory(Category category);
    int updateCategory(Category Category);
    int deleteCategory(Integer id);
    
    PageInfo<Category> listCategory (String firstChar,int page);
    
    List<Category> treeCategory ();


}
