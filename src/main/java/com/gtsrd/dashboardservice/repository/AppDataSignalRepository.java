package com.gtsrd.dashboardservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.gtsrd.dashboardservice.entity.AppDataSignal;

public interface AppDataSignalRepository extends JpaRepository<AppDataSignal,Integer> {

}
