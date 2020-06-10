package com.giftCard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giftCard.doa.BillRepository;
import com.giftCard.model.BillModel;

@Service
public class BillService {

	@Autowired
	private BillRepository repo;

	public List<BillModel> listAll() {
		return (List<BillModel>) repo.findAll();

	}

}
