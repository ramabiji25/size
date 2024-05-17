package com.medline.size.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medline.size.entity.Size;
import com.medline.size.service.Sizeservice;
@RestController
public class SizeController {
	
	@Autowired
	private Sizeservice sizeservice;
	
	@PostMapping("/savesize")
		public Size savesize(@RequestBody Size size) {
		return sizeservice.saveSize(size);
	}
	
	@GetMapping("/getallsize")
public List<Size> fetchSizeList(){
		
		return sizeservice.fetchSizeList();
	}
	
}


