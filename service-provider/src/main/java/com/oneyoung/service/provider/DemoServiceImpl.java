package com.oneyoung.service.provider;

import com.oneyoung.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    public String demo() {
        return "hi, got you";
    }
}
