package com.giftCard.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giftCard.doa.BillRepository;
import com.giftCard.model.BillModel;
import com.giftCard.model.VisitorModel;

@Service
@Transactional
public class BillServiceImp implements BillService {

	public BillServiceImp(BillRepository billDao) {
		super();
		this.billDao = billDao;
	}


	@Autowired
	private BillRepository billDao;

	@Override
	public List<BillModel> listAll() {
		// TODO Auto-generated method stub
		return billDao.getAllBillModel();
	}


	@Override
	public void save(BillModel billNew) {
		// TODO Auto-generated method stub
		billDao.saveBillModel(billNew);

	}

}
