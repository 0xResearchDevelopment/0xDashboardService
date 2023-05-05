package com.gtsrd.dashboardservice.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
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
	
	public Map<String, String> saveAppDataSignal(AppDataSignal appDataSignal) {
		Map<String, String> map = new HashMap<>();
		map.put("status", "success");
		map.put("code", "SIGNAL_SUCCESS");
		return map;
		//return repository.save(appDataSignal);
	}
}
