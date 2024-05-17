package com.medline.size.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medline.size.entity.Size;
import com.medline.size.repository.SizeRepository;

@Service
public class Sizeservice {
	
	@Autowired
	private  SizeRepository sizerepository;

	public Size saveSize(Size size) {
		// TODO Auto-generated method stub
		 return sizerepository.save(size); 
	}

	
	public List<Size> fetchSizeList() {
		// TODO Auto-generated method stub
		return null;
	}

}
