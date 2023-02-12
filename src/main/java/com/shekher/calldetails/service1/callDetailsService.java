package com.shekher.calldetails.service1;
import com.shekher.calldetails.model.CallDetails;
import java.util.List;

public interface callDetailsService {
	List<CallDetails> fetchCallDetailsOf(Long fromNumber);
	public void addCalldetails(CallDetails calldtails);

}
