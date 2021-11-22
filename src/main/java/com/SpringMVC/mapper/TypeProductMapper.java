package com.SpringMVC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringMVC.model.TypeProduct;

public class TypeProductMapper implements RowMapper<TypeProduct> {

	public TypeProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		TypeProduct typeProductModel = new TypeProduct();
		typeProductModel.setId_type_product(rs.getInt("id_type_product"));
		typeProductModel.setTypeProduct(rs.getString("typeproduct"));
		return typeProductModel;
	}

}
