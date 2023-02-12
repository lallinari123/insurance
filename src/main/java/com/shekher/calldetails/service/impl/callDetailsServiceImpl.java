package com.shekher.calldetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shekher.calldetails.entity.CallDetailsEntity;
import com.shekher.calldetails.model.CallDetails;
import com.shekher.calldetails.repository.callDetailsRepo;
import com.shekher.calldetails.service1.callDetailsService;

@Service
public class callDetailsServiceImpl implements callDetailsService{
	
	@Autowired
	callDetailsRepo cdrepo;
@Override
	public List<CallDetails> fetchCallDetailsOf(Long fromNumber)
	{
	List<CallDetailsEntity> lstcallDetailsEntity=cdrepo.findByFromNumber( fromNumber);
	List<CallDetails> lstdetails=new ArrayList<>();
	for(CallDetailsEntity entity:lstcallDetailsEntity)

	{
	CallDetails calldetails=new CallDetails();
	BeanUtils.copyProperties(entity,calldetails);
	lstdetails.add(calldetails);
	}
	return lstdetails;
	}
public void addCalldetails(CallDetails calldtails)
{
	CallDetailsEntity entity=new CallDetailsEntity();
	BeanUtils.copyProperties(calldtails, entity);
cdrepo.save(entity);


}
}

