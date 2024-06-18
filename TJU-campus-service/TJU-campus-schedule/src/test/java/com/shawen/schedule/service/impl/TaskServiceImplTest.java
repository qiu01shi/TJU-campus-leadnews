package com.shawen.schedule.service.impl;

import com.shawen.model.schedule.dtos.Task;
import com.shawen.schedule.ScheduleApplication;
import com.shawen.schedule.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@SpringBootTest(classes = ScheduleApplication.class)
@RunWith(SpringRunner.class )
public class TaskServiceImplTest {

    @Autowired
    private TaskService taskService;

    @Test
    public void addTask() {
        Task task = new Task();
        task.setTaskType(100);
        task.setPriority(50);
        task.setParameters("task test".getBytes());
        task.setExecuteTime(new Date().getTime());
//        task.setExecuteTime(new Date().getTime() + 200000);
        long taskId = taskService.addTask(task);

        System.out.println(taskId);
    }

    @Test
    public void cancelTask(){
        taskService.cancelTask(1802897913030971394L);
    }


    @Test
    public void testPoll(){
        Task task = taskService.poll(100, 50);
        System.out.println(task);
    }
}