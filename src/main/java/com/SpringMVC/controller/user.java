package com.SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.Interface.ProductInterface;
import com.SpringMVC.model.Products;

@Controller
@RequestMapping(value = "home")
public class user {

  @Autowired
  ProductInterface interfaceProduct;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public ModelAndView home(Model model, Products productsModel) {
    List<Products> listProducts = new ArrayList<Products>();
    listProducts = interfaceProduct.ListProduct();
    model.addAttribute("listProducts", listProducts);
    ModelAndView mView = new ModelAndView("user/home");
    return mView;
  }


}
