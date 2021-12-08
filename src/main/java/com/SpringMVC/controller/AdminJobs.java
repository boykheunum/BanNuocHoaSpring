package com.SpringMVC.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.SpringMVC.Interface.JobsInterface;
import com.SpringMVC.model.Jobs;
import com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel;

@Controller
@RequestMapping(value = "admin/")
public class AdminJobs {
  @Autowired
  public JobsInterface jobsInterface;

  @RequestMapping(value = "detailjob")
  public ModelAndView DetailJob(Model model) {
    ModelAndView mView = new ModelAndView("admin/Jobs/DetailJob");
    List<Jobs> listJobs = jobsInterface.ListJob();
    model.addAttribute("listJobs", listJobs);
    return mView;
  }

  @RequestMapping(value = "deletejob")
  public ModelAndView DeleteJob(Model model, @RequestParam(name = "id") int id) {
    jobsInterface.DeleteJob(id);
    return DetailJob(model);
  }

  @RequestMapping(value = "viewaddjob")
  public ModelAndView ViewAddJob(Model model, Jobs job) {
    job = new Jobs();
    ModelAndView mView = new ModelAndView("admin/Jobs/AddJob");
    model.addAttribute("job", job);
    return mView;
  }

  @RequestMapping(value = "addjob")
  public ModelAndView AddJob(Model model, Jobs job) {
    job = new Jobs(job.getName_job());
    jobsInterface.AddJob(job);
    return DetailJob(model);
  }

  @RequestMapping(value = "vieweditjob")
  public ModelAndView ViewEditJob(Model model, Jobs job, @RequestParam(name = "id") int id) {
    job = jobsInterface.SearhJobsById(id, job);
    ModelAndView mView = new ModelAndView("admin/Jobs/EditJob");
    model.addAttribute("job", job);
    return mView;
  }
  @RequestMapping(value = "editjob")
  public ModelAndView EditJob(Model model, Jobs job) {
    int id = job.getId_job();
    job = new Jobs(job.getName_job());
    jobsInterface.UpdateJob(id, job);
    return DetailJob(model);
  }
}
