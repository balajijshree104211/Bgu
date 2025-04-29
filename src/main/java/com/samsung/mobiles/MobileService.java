package com.samsung.mobiles;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
@Autowired
	private MobileRepository mobileRepository;

public List<Mobile> getMobileList() {
	// TODO Auto-generated method stub
	
	return mobileRepository.findAll();
}

public Mobile addmobiles(Mobile mobile) {
	// TODO Auto-generated method stub
	return mobileRepository.save(mobile);
}

public String changeModel(Long id, Map<String, Object> modelChange) {
	// TODO Auto-generated method stub
	Optional<Mobile> optionalmobile = mobileRepository.findById(id);
	if (optionalmobile.isPresent())
	{
		Mobile mobile = optionalmobile.get();
		 if(modelChange.containsKey("model"))
		 {
			 mobile.setModel((String) modelChange.get("model"));
			 mobileRepository.save(mobile);
			 return "Model changed";
		 }
		 else
		 {
			 return "Model not available";
		 }
			 
		 }
	else
	{
		return "Given id doesn't exist";
	}
}

public Mobile modifyMobile(Long id, Mobile mobileinput) {
	// TODO Auto-generated method stub
	Optional<Mobile> optionalmobile = mobileRepository.findById(id);
	if (optionalmobile.isPresent())
	{
		Mobile mobile = optionalmobile.get();
		mobile.setBrand((String) mobileinput.getBrand());
		mobile.setModel((String) mobileinput.getModel());
		mobile.setPrice((Integer) mobileinput.getPrice());
		return mobileRepository.save(mobile);
	}
	else
	{
		throw new RuntimeException("Id doesn't exist :" + id);
	}
}

public String deleteMobile(Long id) {
	// TODO Auto-generated method 
	mobileRepository.deleteById(id);
	return " Mobile deleted :" + id;
}
}