package com.gtsrd.dashboardservice.controller;

import com.gtsrd.dashboardservice.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtsrd.dashboardservice.entity.AppDataSignal;
import com.gtsrd.dashboardservice.service.AppDataSignalService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/data/api/v1/signals")
public class AppDataSignalController {
	
	@Autowired
	private AppDataSignalService service;
	
    @PostMapping("/addAppDataSignal")
    public ApiResponse addAppDataSignal(@RequestBody AppDataSignal appDataSignal) {
        return service.saveAppDataSignal(appDataSignal);
    }
}
