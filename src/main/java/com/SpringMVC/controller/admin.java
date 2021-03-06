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
@RequestMapping(value = {"/admin"})
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



}
