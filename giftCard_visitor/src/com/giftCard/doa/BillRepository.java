package com.giftCard.doa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giftCard.model.BillModel;
import com.giftCard.model.VisitorModel;


public interface BillRepository {

	public List<BillModel> getAllBillModel();

	public void saveBillModel(BillModel billNew);
}
