package com.gtsrd.dashboardservice.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "app_data_signals")
public class AppDataSignal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int data_id;
	private String client_id;
	private String symbol;
	private String timeframe;
	private Float price;
	private String currency;
	private String base_currency;
	private String updated_time;
	private String comments;
}
