package com.oneyoung.service.consumer;

import com.oneyoung.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class ServiceConsumerController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("")
    public Object demo(){

        return  demoService.demo();

    }

}
