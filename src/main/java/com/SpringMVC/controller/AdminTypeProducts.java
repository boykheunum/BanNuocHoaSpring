package com.SpringMVC.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.SpringMVC.Interface.TypeProductInterface;
import com.SpringMVC.model.TypeProduct;

@Controller
@RequestMapping(value = {"/admin"})
public class AdminTypeProducts {
  @Autowired
  TypeProductInterface interfaceTypeProduct;

  @RequestMapping(value = "detailtypeproduct", method = RequestMethod.GET)
  public ModelAndView detailtypeproduct(Model model) {
    ModelAndView mView = new ModelAndView("admin/TypeProduct/DetailTypeProduct");
    List<TypeProduct> listTypeProducts = interfaceTypeProduct.ListTypeProduct();
    model.addAttribute("listTypeProducts", listTypeProducts);
    return mView;
  }
}
