package com.giftCard.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giftCard.Repository.VisitorRepository;
import com.giftCard.model.VisitorModel;



@Service
public class VisitorService {
	
	@Autowired
	private VisitorRepository repo;
	
	 
	public List<VisitorModel> listAll() {
		return (List<VisitorModel>) repo.findAll();
		
	}


	public void save(VisitorModel visitorNew) {
		repo.save(visitorNew);
		
	
	}
	

}
