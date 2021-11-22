package com.SpringMVC.CSDL;

import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SpringMVC.Interface.TypeProductInterface;
import com.SpringMVC.mapper.TypeProductMapper;
import com.SpringMVC.model.TypeProduct;
@Repository
public class TypeProductDao implements TypeProductInterface {

	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<TypeProduct> ListTypeProduct() {
		// TODO Auto-generated method stub
		String sqlString ="SELECT * FROM `type_products`";
		List<TypeProduct>listTypeProducts = new ArrayList<TypeProduct>();
		listTypeProducts = jdbcTemplate.query(sqlString, new TypeProductMapper());
		return listTypeProducts;
	}
	
}
