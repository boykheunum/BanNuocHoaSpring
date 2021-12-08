package com.SpringMVC.CSDL;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.SpringMVC.Interface.JobsInterface;
import com.SpringMVC.mapper.JobMapper;
import com.SpringMVC.model.Jobs;

@Repository
public class JobDao implements JobsInterface {
  @Autowired
  public JdbcTemplate jdbcTemplate;
  public String sqlString;

  @Override
  public List<Jobs> ListJob() {
    // TODO Auto-generated method stub
    List<Jobs> listJobs = new ArrayList<Jobs>();
    sqlString = "SELECT * FROM `job`";
    listJobs = jdbcTemplate.query(sqlString, new JobMapper());
    return listJobs;
  }

  @Override
  public int DeleteJob(int idJob) {
    // TODO Auto-generated method stub
    sqlString = "DELETE FROM `job` WHERE id_job = ?";
    jdbcTemplate.update(sqlString, new Object[] {idJob});
    return 1;
  }

  @Override
  public int AddJob(Jobs job) {
    // TODO Auto-generated method stub
    sqlString = "INSERT INTO `job`(`name_job`) VALUES (?)";
    jdbcTemplate.update(sqlString, job.getName_job());
    return 1;
  }

  @Override
  public int UpdateJob(int idJob, Jobs job) {
    // TODO Auto-generated method stub
    sqlString = "UPDATE `job` SET `name_job`=? WHERE `id_job`=?";
    jdbcTemplate.update(sqlString, job.getName_job(), idJob);
    return 1;
  }

  @Override
  public Jobs SearhJobsById(int idJob, Jobs job) {
    // TODO Auto-generated method stub
    job = new Jobs();
    sqlString = "SELECT * FROM `job` WHERE `id_job`=?";
    job = jdbcTemplate.queryForObject(sqlString, new Object[] {idJob}, new JobMapper());
    return job;
  }

}
