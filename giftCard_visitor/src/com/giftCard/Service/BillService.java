package com.giftCard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giftCard.doa.BillRepository;
import com.giftCard.model.BillModel;



public interface BillService {

	public List<BillModel> listAll();	

	public void save(BillModel billNew);

	}


