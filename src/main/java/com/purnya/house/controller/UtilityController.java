package com.purnya.house.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.purnya.house.service.UtilityService;
import com.purnya.house.service.UtilityServiceImpl;
import com.purnya.house.vo.UtilityVO;
	
@RestController
@RequestMapping("/utility")
public class UtilityController {
	
	static UtilityService service=new UtilityServiceImpl() ;
	@PostMapping(path = "/getUtilityDetails")
	public static UtilityVO getDetails(@RequestParam(value = "utilityName", required = true)String utilityName)
	{
		System.out.println("So you want to know about "+utilityName+ " Service object "+service);
		
		return  service.utilityDetails(utilityName);
	}
	

}
