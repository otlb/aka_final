package com.aka.app.hrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aka.app.util.Pager;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/hrm/*")
@Slf4j
public class HrmController {
	
	@Autowired
	private HrmService hrmService;
	
	
	public void getHrmList(Pager pager)throws Exception{
		
		
	}
	
	
}
