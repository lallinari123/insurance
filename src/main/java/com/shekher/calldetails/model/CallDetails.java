package com.shekher.calldetails.model;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data

public class CallDetails {
	private Integer Id;
	private Long fromNumber;
	private Long toNumber;
	private Integer duration;
	@JsonFormat(pattern="YYYY-MM-DD HH:MM:SS")
	private LocalDateTime calledOn;
	
}
