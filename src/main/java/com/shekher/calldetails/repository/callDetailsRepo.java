package com.shekher.calldetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.shekher.calldetails.entity.CallDetailsEntity;

public interface callDetailsRepo extends JpaRepositoryImplementation<CallDetailsEntity, Integer> {
	public List<CallDetailsEntity> findByFromNumber(Long fromNumber);

}
