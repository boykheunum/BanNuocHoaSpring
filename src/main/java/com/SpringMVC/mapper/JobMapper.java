package com.SpringMVC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.SpringMVC.model.Jobs;


public class JobMapper implements RowMapper<Jobs> {

  @Override
  public Jobs mapRow(ResultSet rs, int rowNum) throws SQLException {
    // TODO Auto-generated method stub
    Jobs job = new Jobs();
    job.setId_job(rs.getInt("id_job"));
    job.setName_job(rs.getString("name_job"));
    return job;
  }

}
