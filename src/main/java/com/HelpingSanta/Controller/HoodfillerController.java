package com.HelpingSanta.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HelpingSanta.Model.Hoodfiller;
import com.HelpingSanta.Service.HoodfillerService;

@RestController
@RequestMapping("/hoodfiller")
public class HoodfillerController {

	
	@Autowired
	HoodfillerService hoodfillerService;
	
	@PostMapping(value="/add")
	public void add(Hoodfiller hoodFiller) {
		hoodfillerService.save(hoodFiller);
		System.out.println(hoodFiller);
		
	}
	
}
