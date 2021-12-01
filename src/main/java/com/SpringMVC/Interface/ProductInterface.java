package com.SpringMVC.Interface;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.SpringMVC.model.Products;

public interface ProductInterface {
	List<Products> ListProduct();
	int UploadFile(MultipartFile file, String path);
	int AddProduct(Products productsModel);
	int DeleteProduct(int idProduct);
	int DeleteProductByTypeId(int idTypeProduct);
	int EditProduct(int idProduct, Products productsModel);
	Products SearchProductById(int idProduct, Products productsModel);
}
