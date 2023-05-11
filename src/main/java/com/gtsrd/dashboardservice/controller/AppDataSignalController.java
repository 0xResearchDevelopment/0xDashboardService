package com.gtsrd.dashboardservice.controller;

import com.gtsrd.dashboardservice.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gtsrd.dashboardservice.entity.AppDataSignal;
import com.gtsrd.dashboardservice.service.AppDataSignalService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/data/api/v1/signals")
public class AppDataSignalController {
	
	@Autowired
	private AppDataSignalService service;
	
    @PostMapping("/addAppDataSignal")
    public ApiResponse addAppDataSignal(@RequestBody AppDataSignal appDataSignal) {
        return service.saveAppDataSignal(appDataSignal);
    }

    @GetMapping("/appDataSignals")
    public List<AppDataSignal> fetchAppDataSignals() {
        return service.getAppDataSignals();
    }

}
