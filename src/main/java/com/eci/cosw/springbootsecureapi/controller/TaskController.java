package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping( "api" )
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping( method = RequestMethod.GET )
    public List<Task> addTask(){
        return taskService.getTasks();
    }

    @RequestMapping( value = "/task", method = RequestMethod.POST )
    public void addTask(@RequestBody Task task ){
        taskService.addTask(task);
    }

}
