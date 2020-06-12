package com.giftCard.doa;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.giftCard.model.BillModel;
@Repository
public class BillDaoimp implements BillRepository {

	@Autowired
	private SessionFactory sessionFactory;

	

	@Override
	public List<BillModel> getAllBillModel() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Bill").getResultList();
	}

	@Override
	public void saveBillModel(BillModel billNew) {
		sessionFactory.getCurrentSession().save(billNew);
		
	}
}