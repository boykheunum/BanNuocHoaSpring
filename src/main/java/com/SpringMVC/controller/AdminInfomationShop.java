package com.SpringMVC.controller;

import java.lang.reflect.InaccessibleObjectException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.SpringMVC.Interface.InfomationShopInterface;
import com.SpringMVC.model.Infomationshop;

@Controller
@RequestMapping(value = "admin")
public class AdminInfomationShop {
  @Autowired
  public InfomationShopInterface shopInterface;

  @RequestMapping(value = "/detailshop")
  public ModelAndView DetailShop(Model model) {
    ModelAndView mView = new ModelAndView("/admin/InfomationShop/DetailShop");
    List listShop = shopInterface.ListInformationShop();
    model.addAttribute("listShop", listShop);
    return mView;
  }

  @RequestMapping(value = "/viewaddinfomationshop")
  public ModelAndView ViewAddInfomationShop(Model model, Infomationshop infomationshop) {
    ModelAndView mView = new ModelAndView("/admin/InfomationShop/AddShop");
    infomationshop = new Infomationshop();
    model.addAttribute("infomationshop", infomationshop);
    return mView;
  }

  @RequestMapping(value = "/addshop")
  public ModelAndView AddShop(Model model, Infomationshop infomationshop) {
    infomationshop = new Infomationshop(infomationshop.getAdress(), infomationshop.getName(),
        infomationshop.getPhonenumber(), infomationshop.getLat(), infomationshop.getLng());
    shopInterface.AddInformationShop(infomationshop);
    return DetailShop(model);
  }

  @RequestMapping(value = "deleteshop")
  public ModelAndView DeleteShop(Model model, Infomationshop infomationshop,
      @RequestParam(name = "id") int idShop) {
    shopInterface.DeleteInformationShop(idShop);
    return DetailShop(model);
  }

  @RequestMapping(value = "vieweditshop")
  public ModelAndView ViewEditShop(Model model, Infomationshop infomationshop,
      @RequestParam(name = "id") int idShop) {
    ModelAndView mView = new ModelAndView("/admin/InfomationShop/EditShop");
    infomationshop = shopInterface.SearchShopById(idShop, infomationshop);
    model.addAttribute("infomationshop", infomationshop);
    return mView;
  }

  @RequestMapping(value = "editshop")
  public ModelAndView EditShop(Model model, Infomationshop infomationshop) {
    int id = infomationshop.getId_shop();
    infomationshop = new Infomationshop(infomationshop.getId_shop(),infomationshop.getAdress(), infomationshop.getName(),
        infomationshop.getPhonenumber(), infomationshop.getLat(), infomationshop.getLng());
    shopInterface.EditInformationShop(id, infomationshop);
    return DetailShop(model);
  }
}
