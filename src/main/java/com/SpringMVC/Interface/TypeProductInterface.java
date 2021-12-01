package com.SpringMVC.Interface;

import java.util.List;

import com.SpringMVC.model.TypeProduct;

public interface TypeProductInterface {
  List<TypeProduct> ListTypeProduct();

  int AddTypeProducts(TypeProduct typeProduct);

  int DeleteTypeProducts(int id);

  int EditTypeProducts(int id, TypeProduct typeProduct);

  int SearchTypeProducts(int id, TypeProduct typeProduct);

}
