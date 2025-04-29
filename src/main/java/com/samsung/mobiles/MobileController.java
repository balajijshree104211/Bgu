package com.samsung.mobiles;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin(origins = "*")
@RestController
public class MobileController {
	
	@Autowired
	private MobileService mobileService;
	
	@GetMapping("/mobilelist")
	public List<Mobile> mobilelist()
	{
	return mobileService.getMobileList();
	}
	
	@PostMapping("/addmobiles")
	public Mobile addmobiles(@RequestBody Mobile mobile) {
		//TODO: process POST request
	
		return mobileService.addmobiles(mobile);
	}
	
	@PatchMapping("/mobilesmodel/{id}")
	public String changeModel(@PathVariable Long id, @RequestBody Map<String, Object> modelChange) {
		//TODO: process PUT request
		return mobileService.changeModel(id, modelChange);
	}
	
	@PutMapping("modifymobile/{id}")
	public Mobile modifyMobile(@PathVariable Long id, @RequestBody Mobile mobileinput) {
		//TODO: process PUT request
		return mobileService.modifyMobile(id, mobileinput);
	}
	
	@DeleteMapping("/deletemobile/{id}")
	public String deleteMobile(@PathVariable Long id)
	{
		return mobileService.deleteMobile(id);                              
	}
}
