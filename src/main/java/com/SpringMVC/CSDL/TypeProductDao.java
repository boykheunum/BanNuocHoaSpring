package com.SpringMVC.CSDL;

import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SpringMVC.Interface.TypeProductInterface;
import com.SpringMVC.mapper.TypeProductMapper;
import com.SpringMVC.model.TypeProduct;

@Repository
public class TypeProductDao implements TypeProductInterface {


  @Autowired
  public JdbcTemplate jdbcTemplate;
  public String sqlString;

  public List<TypeProduct> ListTypeProduct() {
    // TODO Auto-generated method stub
    sqlString = "SELECT * FROM `typeproduct`";
    List<TypeProduct> listTypeProducts = new ArrayList<TypeProduct>();
    listTypeProducts = jdbcTemplate.query(sqlString, new TypeProductMapper());
    return listTypeProducts;
  }

  @Override
  public int AddTypeProducts(TypeProduct typeProduct) {
    // TODO Auto-generated method stub
    sqlString = "INSERT INTO `typeproduct`(typeproduct) VALUES (?)";
    jdbcTemplate.update(sqlString, typeProduct.getTypeProduct());
    return 1;
  }

  @Override
  public int DeleteTypeProducts(int id) {
    // TODO Auto-generated method stub
    sqlString = "DELETE FROM `typeproduct` WHERE id_type_product = ?";
    jdbcTemplate.update(sqlString, new Object[] {id});
    return 1;
  }

  @Override
  public int EditTypeProducts(int id, TypeProduct typeProduct) {
    // TODO Auto-generated method stub
    sqlString = "UPDATE `typeproduct` SET typeproduct = ? WHERE `id_type_product`=?";
    jdbcTemplate.update(sqlString, typeProduct.getTypeProduct(), id);
    return 1;
  }

  @Override
  public int SearchTypeProducts(int id, TypeProduct typeProduct) {
    // TODO Auto-generated method stub
    return 0;
  }

}
