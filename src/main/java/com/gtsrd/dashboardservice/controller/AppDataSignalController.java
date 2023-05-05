package com.gtsrd.dashboardservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gtsrd.dashboardservice.entity.AppDataSignal;
import com.gtsrd.dashboardservice.service.AppDataSignalService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppDataSignalController {
	
	@Autowired
	private AppDataSignalService service;
	
    @PostMapping("/addAppDataSignal")
    public Map<String, String> addAppDataSignal(@RequestBody AppDataSignal appDataSignal) {
        return service.saveAppDataSignal(appDataSignal);
    }
}
