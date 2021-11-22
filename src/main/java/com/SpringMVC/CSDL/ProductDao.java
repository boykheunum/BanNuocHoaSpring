package com.SpringMVC.CSDL;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.SpringMVC.Interface.ProductInterface;
import com.SpringMVC.mapper.ProductMapper;
import com.SpringMVC.model.Products;

@Repository
public class ProductDao implements ProductInterface {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	public List<Products> ListProduct() {
		List<Products> listProducts = new ArrayList<Products>();
		String sqlString = "SELECT * FROM `products`";
		listProducts = jdbcTemplate.query(sqlString, new ProductMapper());
		return listProducts;
	}

	public int UploadFile(MultipartFile file, String path) {
		// TODO Auto-generated method stub
		// Duong dan den thu muc goc
		String urlImageFileString = path;
		// Lay ten thu muc hien tai
		String name = file.getOriginalFilename();
		// Thu muc goc upload file
		File newFile = new File(urlImageFileString);
		// String urlString = newFile.getAbsolutePath();
		// Tao thu muc neu no khong ton tai
		if (!newFile.exists()) {
			newFile.mkdirs();
		}
		if (name != null && name.length() > 0) {
			try {
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(newFile.getAbsoluteFile() + File.separator + name));
				stream.write(file.getBytes());
				stream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -2;
			}
		}
		return 1;
	}

	public int AddProduct(Products productsModel) {
		// TODO Auto-generated method stub

		String sqlString = "INSERT INTO `products`(`nameproduct`, `imageproduct`, `price`, `importprice`, `quantity`, `descriotion`, `id_type_product`) VALUES (?,?,?,?,?,?,?)";
		jdbcTemplate.update(sqlString, productsModel.getNameProduct(), productsModel.getImageProduct(),
				productsModel.getPrice(), productsModel.getImportPrice(), productsModel.getQuantity(),
				productsModel.getDescriotion(), productsModel.getId_type_product());
		return 0;
	}

	public int DeleteProduct(int idProduct) {
		// TODO Auto-generated method stub
		String sqString = "DELETE FROM `products` WHERE id_product = ? ";
		jdbcTemplate.update(sqString, new Object[] { idProduct });
		return 1;
	}

	public int EditProduct(int idProduct, Products productsModel) {
		// TODO Auto-generated method stub
		String sqString = "UPDATE `products` SET `nameproduct`=?,`imageproduct`=?,`price`=?,`importprice`=?,`quantity`=?,`descriotion`=?,`id_type_product`=? WHERE `id_product`=?";
		jdbcTemplate.update(sqString, productsModel.getNameProduct(), productsModel.getImageProduct(),
				productsModel.getPrice(), productsModel.getImportPrice(), productsModel.getQuantity(),
				productsModel.getDescriotion(), productsModel.getId_type_product(),idProduct);
		
		return 1;
	}

	public Products SearchProductById(int idProduct, Products productsModel) {
		// TODO Auto-generated method stub

		String sqlString = "SELECT * FROM `products` WHERE id_product = ?";
		productsModel = jdbcTemplate.queryForObject(sqlString, new Object[] { idProduct }, new ProductMapper());
		return productsModel;

	}
}
