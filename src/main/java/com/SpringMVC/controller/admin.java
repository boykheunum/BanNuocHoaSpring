package com.SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.Interface.ProductInterface;
import com.SpringMVC.Interface.TypeProductInterface;
import com.SpringMVC.model.Products;
import com.SpringMVC.model.TypeProduct;

@Controller
@RequestMapping(value = "admin")
public class admin {

	@Autowired
	TypeProductInterface interfaceTypeProduct;
	@Autowired
	ProductInterface interfaceProduct;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mView = new ModelAndView("admin/home");
		return mView;
	}

	@RequestMapping(value = "detailproduct", method = RequestMethod.GET)
	public ModelAndView detailproduct(Model model) {
		List<Products> listProducts = new ArrayList<Products>();
		listProducts = interfaceProduct.ListProduct();
		model.addAttribute("listProducts", listProducts);
		ModelAndView mView = new ModelAndView("admin/products/DetailProducts");
		return mView;
	}

	@RequestMapping(value = "addproducts", method = RequestMethod.GET)
	public ModelAndView addproduct(Model model, Products productsModel, TypeProduct typeProductModel) {
		productsModel = new Products();
		typeProductModel = new TypeProduct();
		List<TypeProduct> listTypeProducts = interfaceTypeProduct.ListTypeProduct();
		model.addAttribute("productsModel", productsModel);
		model.addAttribute("listTypeProducts", listTypeProducts);
		ModelAndView mView = new ModelAndView("admin/products/AddProducts");
		return mView;
	}

	@RequestMapping(value = "deleteproduct", method = RequestMethod.GET)
	public ModelAndView deleteproduct(Model model, Products productModel, @RequestParam(name = "id") int id) {
		interfaceProduct.DeleteProduct(id);
		return detailproduct(model);
	}

	@RequestMapping(value = "editproduct", method = RequestMethod.GET)
	public ModelAndView editproduct(Model model, Products productModel, @RequestParam(name = "id") int id) {
		List<Products> listProducts = new ArrayList<Products>();
		Products getProductModel = interfaceProduct.SearchProductById(id, productModel);
		List<TypeProduct> listTypeProducts = interfaceTypeProduct.ListTypeProduct();
		model.addAttribute("listTypeProducts", listTypeProducts);
		model.addAttribute("getProductModel", getProductModel);
		model.addAttribute("productModel", productModel);
		ModelAndView mView = new ModelAndView("admin/products/EditProducts");
		return mView;
	}

	@RequestMapping(value = "posteditproduct", method = RequestMethod.POST)
	public ModelAndView posteditproduct(Model model, Products productsModel,
			@RequestParam(name = "file") MultipartFile file, @RequestParam(name = "idProduct") int idProduct) {
		int test = idProduct;
		productsModel.setImageProduct(file.getOriginalFilename());
		productsModel = new Products(productsModel.getNameProduct(), productsModel.getImageProduct(),
				productsModel.getPrice(), productsModel.getImportPrice(), productsModel.getQuantity(),
				productsModel.getDescriotion(), productsModel.getId_type_product());
		interfaceProduct.EditProduct(test, productsModel);
		String pathString = "C:\\Users\\Nguyen Tien Dat\\eclipse-workspace\\BanNuocHoa\\src\\main\\webapp\\image\\ImageProduct";
		int testUploadImage = interfaceProduct.UploadFile(file, pathString);
		return detailproduct(model);
	}

	@RequestMapping(value = "postproduct", method = RequestMethod.POST)
	public ModelAndView PostProduct(Model model, Products productsModel,
			@RequestParam(name = "file") MultipartFile file) {
		productsModel.setImageProduct(file.getOriginalFilename());
		productsModel = new Products(productsModel.getNameProduct(), productsModel.getImageProduct(),
				productsModel.getPrice(), productsModel.getImportPrice(), productsModel.getQuantity(),
				productsModel.getDescriotion(), productsModel.getId_type_product());
		interfaceProduct.AddProduct(productsModel);
		String pathString = "C:\\Users\\Nguyen Tien Dat\\eclipse-workspace\\BanNuocHoa\\src\\main\\webapp\\image\\ImageProduct";
		int testUploadImage = interfaceProduct.UploadFile(file, pathString);
		return detailproduct(model);
	}

	@RequestMapping(value = "detailtypeproduct", method = RequestMethod.GET)
	public ModelAndView detailtypeproduct(Model model) {
		ModelAndView mView = new ModelAndView("admin/TypeProduct/DetailTypeProduct");
		List<TypeProduct> listTypeProducts = interfaceTypeProduct.ListTypeProduct();
		model.addAttribute("listTypeProducts", listTypeProducts);
		return mView;
	}
}
