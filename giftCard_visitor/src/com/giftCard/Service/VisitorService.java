package com.giftCard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.giftCard.doa.VisitorRepository;
import com.giftCard.model.VisitorModel;

public interface VisitorService {

	// This method is to get All notes
	public List<VisitorModel> getAllVisitorModel();

	

	public List<VisitorModel> listAll();

	public void save(VisitorModel visitorNew);

}
