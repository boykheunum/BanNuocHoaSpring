package com.SpringMVC.CSDL;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.SpringMVC.Interface.InfomationShopInterface;
import com.SpringMVC.mapper.InfomationShopMapper;
import com.SpringMVC.model.Infomationshop;

@Repository
public class InformationShopDao implements InfomationShopInterface {

  @Autowired
  public JdbcTemplate jdbcTemplate;
  public String sqlString;

  @Override
  public List<Infomationshop> ListInformationShop() {
    // TODO Auto-generated method stub
    List<Infomationshop> listShop = new ArrayList<Infomationshop>();
    sqlString = "SELECT * FROM `infomationshop`";
    listShop = jdbcTemplate.query(sqlString, new InfomationShopMapper());
    return listShop;
  }

  @Override
  public int AddInformationShop(Infomationshop infomationShop) {
    // TODO Auto-generated method stub
    sqlString =
        "INSERT INTO `infomationshop`(`adress`, `name`, `phonenumber`, `lat`, `lng`) VALUES (?,?,?,?,?)";
    jdbcTemplate.update(sqlString, infomationShop.getAdress(), infomationShop.getName(),
        infomationShop.getPhonenumber(), infomationShop.getLat(), infomationShop.getLng());
    return 1;
  }

  @Override
  public int DeleteInformationShop(int idShop) {
    // TODO Auto-generated method stub
    sqlString = "DELETE FROM `infomationshop` WHERE id_shop = ?";
    jdbcTemplate.update(sqlString, new Object[] {idShop});
    return 1;
  }

  @Override
  public int EditInformationShop(int idShop, Infomationshop infomationShop) {
    // TODO Auto-generated method stub
    sqlString =
        "UPDATE `infomationshop` SET `adress`= ?,`name`= ?,`phonenumber`= ?,`lat`= ?,`lng`= ? WHERE `id_shop`=? ";
    jdbcTemplate.update(sqlString, infomationShop.getAdress(), infomationShop.getName(),
        infomationShop.getPhonenumber(), infomationShop.getLat(), infomationShop.getLng(), idShop);
    return 1;
  }

  @Override
  public Infomationshop SearchShopById(int idShop, Infomationshop infomationShop) {
    // TODO Auto-generated method stub
    sqlString = "SELECT * FROM `infomationshop` WHERE id_shop = ? ";
    infomationShop =
        jdbcTemplate.queryForObject(sqlString, new Object[] {idShop}, new InfomationShopMapper());
    return infomationShop;
  }

}
