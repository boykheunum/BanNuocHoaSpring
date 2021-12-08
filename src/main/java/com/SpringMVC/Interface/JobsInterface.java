package com.SpringMVC.Interface;

import java.util.List;
import com.SpringMVC.model.Jobs;

public interface JobsInterface {
  List<Jobs> ListJob();

  int DeleteJob(int idJob);

  int AddJob(Jobs job);

  int UpdateJob(int idJob, Jobs job);

  Jobs SearhJobsById(int idJob, Jobs job);

}
