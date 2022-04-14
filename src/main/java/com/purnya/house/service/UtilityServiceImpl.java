package com.purnya.house.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.purnya.house.util.Constants;
import com.purnya.house.vo.UtilityVO;

public class  UtilityServiceImpl implements UtilityService {
	
	UtilityVO vo=new UtilityVO();
	@Override
	public UtilityVO utilityDetails(String name) {
		// TODO Auto-generated method stub
		if (name.equalsIgnoreCase(Constants.UTILITY_MICROWAVE))
		{
			vo.setBrand(Constants.BRAND_SAMSUNG);
			vo.setStatus(Constants.STATUS_RUNNING);
			vo.setColor(Constants.COLOR_BLACK);
			vo.setWatt(Constants.WATT_1100);
			vo.setName(Constants.UTILITY_MICROWAVE);
		}
		
		
		return vo;
	}

}
