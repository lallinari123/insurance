
package com.shekher.calldetails.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shekher.calldetails.model.CallDetails;
import com.shekher.calldetails.service1.callDetailsService;



@RestController
@RequestMapping("/api")
public class CallDetailsAPI {
	@Autowired
	callDetailsService service;
@GetMapping("/calldetails/{fromNumber}")
public ResponseEntity<?> getCallDetails(@PathVariable Long fromNumber)
{
	List<CallDetails> lst=service.fetchCallDetailsOf(fromNumber);
	if(!lst.isEmpty())
	{
		return new ResponseEntity<List<CallDetails>>(lst,HttpStatus.OK);
	}
	else
{
		return new ResponseEntity<String>("No callDetails fetched",HttpStatus.BAD_REQUEST);
		}
}
@PostMapping("/calldetails/add")
public ResponseEntity<String> addCallDetails(@RequestBody CallDetails calldetails)
{
service.addCalldetails(calldetails);
return new ResponseEntity<String>("call details are added"+calldetails.getFromNumber(),HttpStatus.CREATED);
}
}
