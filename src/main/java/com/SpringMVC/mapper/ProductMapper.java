package com.SpringMVC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.SpringMVC.model.Products;

public class ProductMapper implements RowMapper<Products> {

	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Products productsModel = new Products();
		
		productsModel.setId_type_product(rs.getInt("id_type_product"));
		productsModel.setId_product(rs.getInt("id_product"));
		productsModel.setQuantity(rs.getInt("quantity"));
		productsModel.setDescriotion(rs.getString("descriotion"));
		productsModel.setImportPrice(rs.getInt("importprice"));
		productsModel.setPrice(rs.getInt("price"));
		productsModel.setNameProduct(rs.getString("nameproduct"));
		productsModel.setImageProduct(rs.getString("imageproduct"));
		return productsModel;
	}
	
}
