package com.SpringMVC.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.SpringMVC.Interface.ProductInterface;
import com.SpringMVC.Interface.TypeProductInterface;
import com.SpringMVC.model.TypeProduct;

@Controller
@RequestMapping(value = {"/admin"})
public class AdminTypeProducts {
  @Autowired
  TypeProductInterface interfaceTypeProduct;
  @Autowired
  ProductInterface interfaceProduct;

  @RequestMapping(value = "detailtypeproduct", method = RequestMethod.GET)
  public ModelAndView detailtypeproduct(Model model) {
    ModelAndView mView = new ModelAndView("admin/TypeProduct/DetailTypeProduct");
    List<TypeProduct> listTypeProducts = interfaceTypeProduct.ListTypeProduct();
    model.addAttribute("listTypeProducts", listTypeProducts);
    return mView;
  }

  @RequestMapping(value = "addtypeproduct", method = RequestMethod.GET)
  public ModelAndView AddTypeProduct(Model model, TypeProduct typeProduct) {
    ModelAndView mView = new ModelAndView("admin/TypeProduct/AddTypeProduct");
    model.addAttribute("typeProduct", typeProduct);
    return mView;
  }

  @RequestMapping(value = "postaddtypeproduct", method = RequestMethod.POST)
  public ModelAndView PostAddTypeProduct(Model model, TypeProduct typeProduct) {
    typeProduct = new TypeProduct(typeProduct.getTypeProduct());
    interfaceTypeProduct.AddTypeProducts(typeProduct);
    return detailtypeproduct(model);
  }

  @RequestMapping(value = "deletetypeproduct", method = RequestMethod.GET)
  public ModelAndView DeleteTypeProduct(Model model, @RequestParam(name = "id") int id) {
    interfaceProduct.DeleteProductByTypeId(id);
    interfaceTypeProduct.DeleteTypeProducts(id);
    return detailtypeproduct(model);
  }

  @RequestMapping(value = "viewedittypeproduct", method = RequestMethod.GET)
  public ModelAndView ViewEditTypeProduct(Model model, TypeProduct typeProduct,
      @RequestParam(value = "id") int id) {
    ModelAndView mView = new ModelAndView("admin/TypeProduct/EditTypeProduct");
    typeProduct = new TypeProduct(id, typeProduct.getTypeProduct());
    model.addAttribute("typeProduct", typeProduct);
    return mView;
  }
  
  @RequestMapping(value = "edittypeproduct", method = RequestMethod.POST)
  public ModelAndView EditTypeProduct(Model model, TypeProduct typeProduct) {
    typeProduct = new TypeProduct(typeProduct.getId_type_product(), typeProduct.getTypeProduct());
    interfaceTypeProduct.EditTypeProducts(typeProduct.getId_type_product(), typeProduct);
    return detailtypeproduct(model);
  }
  
}
