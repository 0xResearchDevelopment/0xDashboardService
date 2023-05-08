package com.gtsrd.dashboardservice.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gtsrd.dashboardservice.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gtsrd.dashboardservice.entity.AppDataSignal;
import com.gtsrd.dashboardservice.repository.AppDataSignalRepository;

import java.util.HashMap;
import java.util.Map;

@Service
public class AppDataSignalService {
	@Autowired
	private AppDataSignalRepository repository;
	
	public ApiResponse saveAppDataSignal(AppDataSignal appDataSignal) {
		repository.save(appDataSignal);
		ApiResponse apiResponse = new ApiResponse();
		return apiResponse;
	}
}
