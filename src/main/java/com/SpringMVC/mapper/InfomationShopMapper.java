package com.SpringMVC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.SpringMVC.CSDL.InformationShopDao;
import com.SpringMVC.model.Infomationshop;

public class InfomationShopMapper<T> implements RowMapper<Infomationshop> {

  @Override
  public Infomationshop mapRow(ResultSet rs, int rowNum) throws SQLException {
    // TODO Auto-generated method stub
    Infomationshop infomationShop = new Infomationshop();
    infomationShop.setId_shop(rs.getInt("id_shop"));
    infomationShop.setAdress(rs.getString("adress"));
    infomationShop.setName(rs.getString("name"));
    infomationShop.setPhonenumber(rs.getString("phonenumber"));
    infomationShop.setLat(rs.getFloat("lat"));
    infomationShop.setLng(rs.getFloat("lng"));
    return infomationShop;
  }

}
