package com.SpringMVC.Interface;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.SpringMVC.model.Infomationshop;
import com.SpringMVC.model.Products;

public interface InfomationShopInterface {
  List<Infomationshop> ListInformationShop();

  int AddInformationShop(Infomationshop infomationShop);

  int DeleteInformationShop(int idShop);

  int EditInformationShop(int idShop, Infomationshop infomationShop);

  Infomationshop SearchShopById(int idShop, Infomationshop infomationShop);
}
