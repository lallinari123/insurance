package com.shekher.plandetails.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="CALL_DETAILS")
public class CallDetailsEntity {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private Long fromNumber;
	private Long toNumber;
	private Integer duration;
	private LocalDate calledOn;
	

}
