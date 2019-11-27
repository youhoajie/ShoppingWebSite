package com.yhj.dao;

import com.yhj.po.product;

import java.util.List;

/**
 * @author hua
 * @create 2019-11-21-下午3:07
 */
public interface ProductDao {

    List<product> findAll();

}
