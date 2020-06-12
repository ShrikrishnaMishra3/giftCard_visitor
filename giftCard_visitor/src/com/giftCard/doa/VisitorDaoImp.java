package com.giftCard.doa;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import java.util.List;
	import com.giftCard.model.*;

	@Repository
	public class VisitorDaoImp implements VisitorRepository {
	
		
		@Autowired
	    private SessionFactory sessionFactory;

		@Override
		public List<VisitorModel> getAllVisitorModels() {
			// TODO Auto-generated method stub
			return sessionFactory.getCurrentSession().createQuery("from visitorNew").getResultList();
		}

		@Override
		public void saveVisitorModel(long id) {
			// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().save(id);
		}

		@Override
		public Object saveVisitorModel(VisitorModel visitorNew) {
			// TODO Auto-generated method stub
			return sessionFactory.getCurrentSession().save(visitorNew);
		}

	
	}


